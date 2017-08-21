Bionimbuz
=========
#### Universidade de Brasília
#### Departamento de Ciência da Computação
#### Introdução
O software computacional BioNimbuZ é desenvolvido e mantido por alunos de Graduação e Mestrado da Universidade de Brasília. Seu objetivo é criar uma plataforma de execução de workflows em Bioinformática que utiliza a infraestrutura provida por uma Federação de Nuvens.  Uma Federação de Nuvens Computacionais possibilita a utilização simultânea das diversas infraestruturas existentes nas várias instituições provedoras destes serviços (Microsoft Azure, Amazon EC2 entre outras), além de permitir a utilização dos recursos oferecidos pelas nuvens públicas. Este trabalho tem como objetivo propor uma arquitetura de federação de nuvens computacionais híbrida, denominada BioNimbuZ, capaz de executar aplicações e workflows de bioinformática de maneira transparente, flexível, eficiente e tolerante a falhas, com grande capacidade de processamento e de armazenamento. 

#### Instalação
Para compilar, realizar o build e executar o ambiente do BioNimbuZ, seguir o passo-a-passo descrito abaixo.

##### 1. Máquina virtual
Configurar uma máquina virtual Linux com usuário 'bionimbuz'. Utilizamos a distribuição Linux em sua versão 14.04.
No caminho /home/bionimbuz crie a pasta Bionimbuz (caminho completo: /home/bionimbuz/Bionimbuz/)
----------------------------------------------------------------------------------------------------------------------
mkdir /home/bionimbuz/Bionimbuz/
----------------------------------------------------------------------------------------------------------------------
##### 2. Java
Instalar e configurar o Java:
----------------------------------------------------------------------------------------------------------------------
sudo add-apt-repository ppa:webupd8team/java	
sudo apt-get update
sudo apt-get install oracle-java8-installer
----------------------------------------------------------------------------------------------------------------------
##### 3. Zookeeper
Apache ZooKeeper é um serviço centralizado para gerenciar e sincronizar informações de configuração em um ambiente computacional distribuído.
----------------------------------------------------------------------------------------------------------------------
3.1 Realizar o download do ZooKeeper: http://ftp.unicamp.br/pub/apache/zookeeper/zookeeper-3.4.8/zookeeper-3.4.8.tar.gz
3.2 Descompacte na pasta opt/zookeeper/
3.3 Configure o arquivo /opt/zookeeper/conf/zoo.cfg
3.4 Altere a linha  dataDir=/opt/zookeeper/ 
3.5 Salve e feche o arquivo
3.6 Inicie o zookeeper com o comando sudo /opt/zookeeper/bin/./zkServer.sh start
3.7 Pronto! O servidor ZooKeeper está executando, mais detalhes na documentação: https://zookeeper.apache.org/doc/r3.4.6/zookeeperStarted.html#sc_InstallingSingleMode
----------------------------------------------------------------------------------------------------------------------
##### 4. IDE de desenvolvimento Java
Utilizamos o Netbeans 8.1 para desenvolvimento.
Download:
----------------------------------------------------------------------------------------------------------------------
http://download.netbeans.org/netbeans/8.1/final/bundles/netbeans-8.1-javaee-linux.sh
----------------------------------------------------------------------------------------------------------------------
##### 5. Maven
Apache Maven é um software de gerenciamento de projetos.
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install maven2
----------------------------------------------------------------------------------------------------------------------
##### 6. GCC
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install gcc
----------------------------------------------------------------------------------------------------------------------
##### 7. dstat
Dstat possibilita a visualização de recursos do sistema instantaneamente. 
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install dstat
----------------------------------------------------------------------------------------------------------------------
##### 8. Bowtie
"Bowtie is an ultrafast, memory-efficient short read aligner"
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install bowtie
----------------------------------------------------------------------------------------------------------------------
##### 9. BedTools
"Bedtools utilities are a swiss-army knife of tools for a wide-range of genomics analysis tasks"
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install bedtools
----------------------------------------------------------------------------------------------------------------------
##### 10. unzip
Descompactador de arquivos
----------------------------------------------------------------------------------------------------------------------
sudo apt-get install unzip
----------------------------------------------------------------------------------------------------------------------
##### 11. mysql
Banco de Dados MySQL para persistir dados da aplicação web
----------------------------------------------------------------------------------------------------------------------
apt-get install mysql-server-5.6

Após instalar criar o banco de dados chamado bionimbuz_db

Acesse o Banco de dados e execute o seguinte comando, para permitir acesso de forma remota:
GRANT ALL PRIVILEGES ON bionimbuz_db.* TO 'user'@'%' IDENTIFIED BY 'password';

Execute o commando nano /etc/mysql/my.cnf
Comente bind-address = 127.0.0.1 using the # symbol

Se não achar o bind-address no arquivo my.cnf file, olhe em /etc/mysql/mysql.conf.d/mysqld.cnf

Reinicie a máquina ou execute o comando:
sudo service mysql restart.
----------------------------------------------------------------------------------------------------------------------
#### 12. Configurar o persistence.xml
----------------------------------------------------------------------------------------------------------------------
Abra o arquivo persistence.xml e altere o usuário e senha, arquivo localizado em /src/main/resources/META-INF/persistence.xml

<property name="javax.persistence.jdbc.url" value="jdbc:mysql://ipdamaquinacommysql:3306/bionimbuz_db" />
----------------------------------------------------------------------------------------------------------------------
#### 13. Configurar o arquivo de credencial localizado em /home/bionimbuz/.bionimbuz/credentials.yaml
----------------------------------------------------------------------------------------------------------------------
13.1 Crie a pasta .bionimbuz mkdir /home/bionimbuz/.bionimbuz
13.2 Crie o arquivo credential.yaml touch /home/bionimbuz/.bionimbuz/credentials.yaml
13.3 Edite o arquivo, adicionando os seguintes paramêtros: 
user: "seulogin"
password: "suasenha"
ssh-port: "portadossh"
13.4 Salve e feche o arquivo
PS: Importante que esse arquivo possua a mesma senha e login para todas as máquinas;
----------------------------------------------------------------------------------------------------------------------
#### Passo-a-passo para execução em instâncias na nuvem (Amazon, Azure, Google, ...)
Primeiramente é necessário configurar a máquina conforme os passos acima (não sendo necessária a instalação do Netbeans, pois não haverá desenvolvimento nas instâncias na nuvem). Criar a mesma estrutura de diretórios 
----------------------------------------------------------------------------------------------------------------------
/home/bionimbuz/Bionimbuz/
                        |
   			+ src
   			+ target
   			+ conf
   			+ exported-folders
   			+ ...
----------------------------------------------------------------------------------------------------------------------
Com tudo instalado, realizar os seguintes passos:

##### Liberar portas
Na configuração do provedor de serviço, liberar as portas: 2181,9999,80,8080,9191,22

##### Compacte os arquivos do projeto e os envie utilizando scp para máquina do provedor
----------------------------------------------------------------------------------------------------------------------
scp zoonimbus@<ip_nuvem>:/path/to/file localfile
----------------------------------------------------------------------------------------------------------------------

##### Arquivos à serem enviados:
-------------------------------------------------------------------------------------------------------------
enviar as pastas exported-folders
enviar as pastas data-folder
enviar as pastas pipeline
enviar as pastas services
enviar as pastas programs
enviar as pastas conf
enviar bionimbus-1.0-SNAPSHOT-bundle.jar gerado na target
-------------------------------------------------------------------------------------------------------------

##### Executando o BioNimbuZ na nuvem
Para iniciar a execução o servidor zookeeper deve ser iniciado.
-------------------------------------------------------------------------------------------------------------
1 - Alterar conf/node.yaml com as configurações de ip do servidor zookeeper, ip e os caminhos das pastas 
    necessárias para a execução, etc..
2 - Entrar na pasta zoonimbusProject/
3 - Servidor: executar o comando "sh exported-folders/bin/server.sh"
4 - Cliente: executar o comando "sh exported-folders/bin/client.sh" (** migrando para aplicação Web)
5 - Pipeline: executar o comando "sh exported-folders/bin/client-pipeline.sh" (** migrando para aplicação Web)
-------------------------------------------------------------------------------------------------------------

#### Configurar a amazon para acessar ssh sem a o arquivo de chaves privadas (pem)

##### 1. Acessar a maquina na amazon
-------------------------------------------------------------------------------------------------------------
ssh -i zoonimbuskey.pem ubuntu@<ip_nuvem>:~/
-------------------------------------------------------------------------------------------------------------

##### 2. Alterar arquivo sshd_conf
Acesse o arquivo:
-------------------------------------------------------------------------------------------------------------
sudo nano /etc/ssh/sshd_config 
-------------------------------------------------------------------------------------------------------------
e adicione a linha na parte de Authentification 
-------------------------------------------------------------------------------------------------------------
PasswordAuthentication yes
comentar as linhas
#RSAAuthentication yes
#PubkeyAuthentication yes

ctrl+o, enter, ctrl+x
-------------------------------------------------------------------------------------------------------------
##### 3. Reinicie o serviço SSH
-------------------------------------------------------------------------------------------------------------
sudo /etc/init.d/ssh restart
-------------------------------------------------------------------------------------------------------------


##### Configurações para executar o novo serviço de armazenamento (buckets)

###### 1. Dependências
https://github.com/s3fs-fuse/s3fs-fuse
Instale o s3fs-fuse:
-------------------------------------------------------------------------------------------------------------
sudo apt-get install build-essential git libfuse-dev libcurl4-openssl-dev libxml2-dev mime-support automake libtool
sudo apt-get install pkg-config libssl-dev
git clone https://github.com/s3fs-fuse/s3fs-fuse
cd s3fs-fuse/
./autogen.sh
./configure --prefix=/usr --with-openssl
make
sudo make install
-------------------------------------------------------------------------------------------------------------

Instale o gcs-fuse e o gcloud:
-------------------------------------------------------------------------------------------------------------
export GCSFUSE_REPO=gcsfuse-`lsb_release -c -s`
echo "deb http://packages.cloud.google.com/apt $GCSFUSE_REPO main" | sudo tee /etc/apt/sources.list.d/gcsfuse.list
curl https://packages.cloud.google.com/apt/doc/apt-key.gpg | sudo apt-key add -
sudo apt-get update
sudo apt-get install gcsfuse
sudo apt-get install google-cloud-sdk
-------------------------------------------------------------------------------------------------------------

###### 2. Arquivos de credenciais

###### 2.1. Amazon

Acesse o AWS, clique sobre o nome do usuário e vá em "Security Credentials".
Em seguida vá em "Access Keys (Access Key ID and Secret Access Key)" e depois "Create New Access Key".
Veja o conteúdo da nova key em "Show Access Key".
Crie um novo arquivo (/-/-/Auth/accesskey.txt) com o seguinte conteúdo:
-------------------------------------------------------------------------------------------------------------
accessKeyId:secretAccessKey
-------------------------------------------------------------------------------------------------------------
Altere as permissões para esse arquivo:
-------------------------------------------------------------------------------------------------------------
chmod 600 /*/*/Auth/accesskey.txt
-------------------------------------------------------------------------------------------------------------

###### 2.2. Google

Acesse a página de credenciais (https://console.developers.google.com/project/_/apis/credentials) e selecione o projeto.
Clique em "Create credentials" e selecione "Service account key".
Selecione a Service account "Compute Engine default service account" e crie um JSON.
Salve esse JSON em (/-/-/Auth/cred.json).

###### 3. Arquivos de configuração

Configure os arquivos de configuração do BioNimbuz Core (conf/node.yaml) e BioNimbuZ Client (conf/conf.yaml):

-------------------------------------------------------------------------------------------------------------
 # Path to the folder whre the Buckets will be mounted
buckets-folder: /*/*/buckets/

 # Path containing the files used to authenticate the Storage Services (Bucket)
buckets-auth-folder: /*/*/Auth/

 # Path to de binary of gcloud/gsutil line-command ($ which gcloud)
gcloud-folder: /*/*/bin/

 # Coloque 1 para o novo serviço 
storage-mode: 1
-------------------------------------------------------------------------------------------------------------