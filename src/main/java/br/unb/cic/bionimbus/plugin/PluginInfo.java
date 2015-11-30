package br.unb.cic.bionimbus.plugin;

import br.unb.cic.bionimbus.p2p.Host;
import br.unb.cic.bionimbus.services.messaging.CuratorMessageService.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class PluginInfo implements PluginOps {

    private String id;
    
    private String InstanceName;
    
    private String path_zk;
    
    private int privateCloud;
    
    private Host host;

    private long uptime;

    private Double latency = 0d;
    
    private double costpergiga;

    private long timestamp;

    private Integer numCores;

    private Integer numNodes;

    private Integer numOccupied;
    
    private Double ranking = 0d;

    private Float fsSize;

    private double storagecost;
    
    private Float fsFreeSize;

    private Double memoryTotal;

    private Double memoryFree;

    private Double currentFrequencyCore;
    
    // frequency in Hz
    private Double factoryFrequencyCore;

    private List<PluginService> services;
    
    private double costPerHour = Double.MAX_VALUE;

    public PluginInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getInstanceName() {
        return InstanceName;
    }

    public void setInstanceName(String instanceName) {
        this.InstanceName = instanceName;
    }

    /**
     * Endereço do plugin(peer) no zookeeper.
     * @return o endereço do plugin(peer) no zk de acordo com seu id 
     */
    public String getPath_zk() {
         return Path.NODE_PEER.getFullPath(id);
    }
    public void setPath_zk(String path_zk) {
        this.path_zk =path_zk;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }
    
    public double getCostPerGiga() {
        return costpergiga;
    }

    public void setCostPerGiga(double costpergiga) {
        this.costpergiga = costpergiga;
    }

    public long getUptime() {
        return System.currentTimeMillis() - uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
            
    }
   
    public Double getLatency() {
        return latency;
    }

    public void setLatency(Double latency) {
        this.latency = latency;
            
    }

    public double getStorageCost() {
        return storagecost;
    }

    public void setStorageCost(double storagecost) {
        this.storagecost = storagecost;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Float getFsFreeSize() {
        return fsFreeSize;
    }

    public void setFsFreeSize(Float fsFreeSize) {
        this.fsFreeSize = fsFreeSize;
    }

    public Integer getNumCores() {
        return numCores;
    }

    public void setNumCores(Integer numCores) {
        this.numCores = numCores;
    }

    public Integer getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    public Float getFsSize() {
        return fsSize;
    }

    public void setFsSize(Float fsSize) {
        this.fsSize = fsSize;
    }

    public Integer getNumOccupied() {
        return numOccupied;
    }

    public void setNumOccupied(Integer numOccupied) {
        this.numOccupied = numOccupied;
    }

    public List<PluginService> getServices() {
        return services;
    }

    public void setServices(List<PluginService> services) {
        this.services = services;
    }

    public PluginService getService(String serviceId) {
        for (PluginService service : getServices())
            if (service.getId().equals(serviceId))
                return service;
        return null;
    }


    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }

    public Double getCurrentFrequencyCore() {
        return currentFrequencyCore;
    }

    public void setCurrentFrequencyCore(Double frequencyCore) {
        this.currentFrequencyCore = frequencyCore;
    }
    
    public Double getFactoryFrequencyCore() {
        return factoryFrequencyCore;
    }

    public void setFactoryFrequencyCore(Double frequencyCore) {
        this.factoryFrequencyCore = frequencyCore;
    }

    public Double getMemoryFree() {
        return memoryFree;
    }

    public void setMemoryFree(Double memoryFree) {
        this.memoryFree = memoryFree;
    }

    public Double getMemoryTotal() {
        return memoryTotal;
    }

    public void setMemoryTotal(Double memoryTotal) {
        this.memoryTotal = memoryTotal;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (!(object instanceof PluginInfo)) {
            return false;
        }

        PluginInfo other = (PluginInfo) object;

        return this.id.equals(other.id);
    }

    public int getPrivateCloud() {
        return privateCloud;
    }

    public void setPrivateCloud(int privateCloud) {
        this.privateCloud = privateCloud;
    }
    
    public void setCostPerHour (double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public double getCostPerHour () {
        return costPerHour;
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    //Alterado para retornar os valores que serão gravados no znode peer old: id
    @Override
    public String toString() {  
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (Exception ex) {
            Logger.getLogger(PluginInfo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
