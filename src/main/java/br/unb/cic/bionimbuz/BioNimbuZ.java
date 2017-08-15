/*
 * BioNimbuZ is a federated cloud platform.
 * Copyright (C) 2012-2015 Laboratory of Bioinformatics and Data (LaBiD),
 * Department of Computer Science, University of Brasilia, Brazil
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package br.unb.cic.bionimbuz;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.unb.cic.bionimbuz.config.BioNimbusConfig;
import br.unb.cic.bionimbuz.config.BioNimbusConfigLoader;
import br.unb.cic.bionimbuz.controller.ControllerManager;
import br.unb.cic.bionimbuz.controller.ControllerModule;
import br.unb.cic.bionimbuz.model.User;
import br.unb.cic.bionimbuz.persistence.dao.UserDao;
import br.unb.cic.bionimbuz.plugin.Plugin;
import br.unb.cic.bionimbuz.plugin.PluginFactory;
import br.unb.cic.bionimbuz.plugin.PluginInfo;
import br.unb.cic.bionimbuz.plugin.linux.LinuxGetInfo;
import br.unb.cic.bionimbuz.plugin.linux.LinuxPlugin;
import br.unb.cic.bionimbuz.services.ServiceManager;
import br.unb.cic.bionimbuz.services.ServiceModule;
import br.unb.cic.bionimbuz.services.tarification.Amazon.AmazonIndex;
import br.unb.cic.bionimbuz.services.tarification.Google.GoogleCloud;
import br.unb.cic.bionimbuz.toSort.Listeners;
import br.unb.cic.bionimbuz.utils.PBKDF2;
import br.unb.cic.bionimbuz.utils.ZookeeperUtil;

public final class BioNimbuZ {

    public static final Injector serviceInjector = Guice.createInjector(new ServiceModule());
    public static final Injector controllerInjector = Guice.createInjector(new ControllerModule());

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Constructors.
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private BioNimbuZ() {
        super();
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Statics methods.
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {

        final String configFile = System.getProperty("config.file", "conf/node.yaml");
        BioNimbusConfig config = BioNimbusConfigLoader.loadHostConfig(configFile);
        if (!config.isRemotehost()) {
            ZookeeperUtil.startZookeeper();
            addShutdownHook();
        }

        // medida paleativa para criar o arquivo das instancias da google e da amazon precisa por no serviço
        new AmazonIndex();
        new GoogleCloud();

        BioNimbuZ system = new BioNimbuZ();
        system.saveRootUser();
        system.start(config);
    }

    private static void addShutdownHook() {

        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                ZookeeperUtil.stopZookeeper();
            }
        });
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Instances methods.
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private void start(BioNimbusConfig config) throws IOException {

        config.setId(UUID.randomUUID().toString());
        if (!config.isClient()) {

            LinuxGetInfo linuxGetInfo = new LinuxGetInfo();

            PluginInfo infopc = linuxGetInfo.call();
            infopc.setId(config.getId());
            infopc.setHost(config.getHost());
            infopc.setPrivateCloud(config.getPrivateCloud());

            final Plugin plugin = PluginFactory.getPlugin(config.getInfra(), config);
            if (plugin instanceof LinuxPlugin) {
                ((LinuxPlugin) plugin).setMyInfo(infopc);
            }
            plugin.start();
        }

        // Instantiates ServiceManager and Controller
        ServiceManager serviceManager = serviceInjector.getInstance(ServiceManager.class);
        ControllerManager controllerManager = controllerInjector.getInstance(ControllerManager.class);

        // Starts all Services
        List<Listeners> listeners = new CopyOnWriteArrayList<>();
        serviceManager.startAll(config, listeners);

        // Starts all Controllers
        controllerManager.startAll(config);
    }

    private void saveRootUser() throws NoSuchAlgorithmException, InvalidKeySpecException {
        UserDao dao = new UserDao();
        String rootLogin = "root";
        if (!dao.exists(rootLogin)) {
            User object = bindRootUser();
            dao.persist(object);
        }
    }

    private User bindRootUser() throws NoSuchAlgorithmException, InvalidKeySpecException {
        User object = new User();
        object.setLogin("root");
        object.setPassword(PBKDF2.generatePassword("root"));
        object.setCpf("00000000000");
        object.setCelphone("(61) 9 0000-0000");
        object.setEmail("root@bionimbuz.com");
        object.setNome("Usuário Administrador");
        object.setStorageUsage(0l);
        return object;
    }
}
