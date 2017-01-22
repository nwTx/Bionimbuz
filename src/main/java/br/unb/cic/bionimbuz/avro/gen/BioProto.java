/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.unb.cic.bionimbuz.avro.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface BioProto {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"BioProto\",\"namespace\":\"br.unb.cic.bionimbuz.avro.gen\",\"types\":[{\"type\":\"enum\",\"name\":\"NodeState\",\"symbols\":[\"STARTING\",\"ACTIVE\",\"CLOSING\",\"IDLE\",\"ERROR\",\"DECOMMISSIONED\"]},{\"type\":\"enum\",\"name\":\"WorkflowStatus\",\"symbols\":[\"PENDING\",\"EXECUTING\",\"FINALIZED_WITH_SUCCESS\",\"FINALIZED_WITH_WARNINGS\",\"FINALIZED_WITH_ERRORS\",\"PAUSED\",\"STOPPED_WITH_ERROR\"]},{\"type\":\"record\",\"name\":\"JobCancel\",\"fields\":[{\"name\":\"jobID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"files\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},{\"type\":\"record\",\"name\":\"FileInfo\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"long\"},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"uploadTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Instance\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"costPerHour\",\"type\":\"double\"},{\"name\":\"locality\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"memoryTotal\",\"type\":\"double\"},{\"name\":\"cpuHtz\",\"type\":\"double\"},{\"name\":\"cpuType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numCores\",\"type\":\"int\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"provider\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"idProgramas\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"creationTimer\",\"type\":\"long\"},{\"name\":\"delay\",\"type\":\"int\"},{\"name\":\"timetocreate\",\"type\":\"long\"},{\"name\":\"idUser\",\"type\":\"long\"},{\"name\":\"ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Prediction\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"idService\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeService\",\"type\":\"long\"},{\"name\":\"instance\",\"type\":\"Instance\"},{\"name\":\"custoService\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"login\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cpf\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"celphone\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"instances\",\"type\":{\"type\":\"array\",\"items\":\"Instance\"}}]},{\"type\":\"record\",\"name\":\"Pair\",\"fields\":[{\"name\":\"first\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"second\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Sla\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"workflowid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"provider\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"objective\",\"type\":\"int\"},{\"name\":\"period\",\"type\":\"long\"},{\"name\":\"value\",\"type\":\"double\"},{\"name\":\"time\",\"type\":\"long\"},{\"name\":\"limitationType\",\"type\":\"int\"},{\"name\":\"limitationValueExecutionTime\",\"type\":\"long\"},{\"name\":\"limitationValueExecutionCost\",\"type\":\"double\"},{\"name\":\"prediction\",\"type\":\"boolean\"},{\"name\":\"solutions\",\"type\":{\"type\":\"array\",\"items\":\"Prediction\"}},{\"name\":\"limitationExecution\",\"type\":\"boolean\"}]},{\"type\":\"record\",\"name\":\"Job\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"localId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"serviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"args\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputFiles\",\"type\":{\"type\":\"array\",\"items\":\"FileInfo\"}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"dependencies\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"referenceFile\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipjob\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},{\"type\":\"record\",\"name\":\"Workflow\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"jobs\",\"type\":{\"type\":\"array\",\"items\":\"Job\"}},{\"name\":\"intancesWorkflow\",\"type\":{\"type\":\"array\",\"items\":\"Instance\"}},{\"name\":\"sla\",\"type\":\"Sla\"},{\"name\":\"userWorkflow\",\"type\":\"User\"},{\"name\":\"creationDatestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":[\"WorkflowStatus\",\"null\"]}]},{\"type\":\"record\",\"name\":\"PluginFile\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"path\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"long\"},{\"name\":\"pluginId\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]},{\"type\":\"record\",\"name\":\"NodeInfo\",\"fields\":[{\"name\":\"peerId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"freesize\",\"type\":\"float\"},{\"name\":\"latency\",\"type\":\"double\"},{\"name\":\"bandwidth\",\"type\":\"double\"}]}],\"messages\":{\"ping\":{\"doc\":\"Pings a node, e.g. to measure latency\",\"request\":[],\"response\":\"boolean\"},\"listFilesName\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},\"getIpFile\":{\"doc\":\"Procurar em qual Ip está o arquivo file\",\"request\":[{\"name\":\"file\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"listServices\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},\"listFiles\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":\"PluginFile\"}},\"listFilesPlugin\":{\"request\":[{\"name\":\"pluginId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"PluginFile\"}},\"getFileHash\":{\"request\":[{\"name\":\"fileName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"startJobName\":{\"request\":[{\"name\":\"jobID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"startWorkflow\":{\"request\":[{\"name\":\"workflow\",\"type\":\"Workflow\"}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"schedPolicy\":{\"request\":[{\"name\":\"numPolicy\",\"type\":\"int\"}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"statusJob\":{\"request\":[{\"name\":\"pipelineId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"jobId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"statusAllJob\":{\"request\":[],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"cancelJob\":{\"request\":[{\"name\":\"jobID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"setFileInfo\":{\"request\":[{\"name\":\"file\",\"type\":\"FileInfo\"},{\"name\":\"kindService\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"null\",\"one-way\":true},\"getPeersNode\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":\"NodeInfo\"}},\"fileSent\":{\"request\":[{\"name\":\"fileSucess\",\"type\":\"FileInfo\"},{\"name\":\"dest\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"callStorage\":{\"request\":[{\"name\":\"list\",\"type\":{\"type\":\"array\",\"items\":\"NodeInfo\"}}],\"response\":{\"type\":\"array\",\"items\":\"NodeInfo\"}},\"notifyReply\":{\"request\":[{\"name\":\"filename\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"null\",\"one-way\":true},\"decryptPluginFile\":{\"request\":[{\"name\":\"filename\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"null\",\"one-way\":true},\"verifyFile\":{\"request\":[{\"name\":\"fileSucess\",\"type\":\"FileInfo\"},{\"name\":\"dest\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}],\"response\":\"boolean\"},\"setWatcher\":{\"request\":[{\"name\":\"idPlugin\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"null\",\"one-way\":true},\"checkFileSize\":{\"request\":[{\"name\":\"file\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"long\"},\"uploadFile\":{\"request\":[{\"name\":\"path\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"file\",\"type\":\"FileInfo\"}],\"response\":\"boolean\"},\"getFileFromPeers\":{\"request\":[{\"name\":\"filename\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"PluginFile\"}}}");
  /** Pings a node, e.g. to measure latency */
  boolean ping() throws org.apache.avro.AvroRemoteException;
  java.util.List<java.lang.String> listFilesName() throws org.apache.avro.AvroRemoteException;
  /** Procurar em qual Ip está o arquivo file */
  java.lang.String getIpFile(java.lang.String file) throws org.apache.avro.AvroRemoteException;
  java.util.List<java.lang.String> listServices() throws org.apache.avro.AvroRemoteException;
  java.util.List<br.unb.cic.bionimbuz.avro.gen.PluginFile> listFiles() throws org.apache.avro.AvroRemoteException;
  java.util.List<br.unb.cic.bionimbuz.avro.gen.PluginFile> listFilesPlugin(java.lang.String pluginId) throws org.apache.avro.AvroRemoteException;
  java.lang.String getFileHash(java.lang.String fileName) throws org.apache.avro.AvroRemoteException;
  java.lang.String startJobName(java.lang.String jobID, java.lang.String ip) throws org.apache.avro.AvroRemoteException;
  java.lang.String startWorkflow(br.unb.cic.bionimbuz.avro.gen.Workflow workflow) throws org.apache.avro.AvroRemoteException;
  java.lang.String schedPolicy(int numPolicy) throws org.apache.avro.AvroRemoteException;
  java.lang.String statusJob(java.lang.String pipelineId, java.lang.String jobId) throws org.apache.avro.AvroRemoteException;
  java.lang.String statusAllJob() throws org.apache.avro.AvroRemoteException;
  java.lang.String cancelJob(java.lang.String jobID) throws org.apache.avro.AvroRemoteException;
  void setFileInfo(br.unb.cic.bionimbuz.avro.gen.FileInfo file, java.lang.String kindService);
  java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo> getPeersNode() throws org.apache.avro.AvroRemoteException;
  java.lang.String fileSent(br.unb.cic.bionimbuz.avro.gen.FileInfo fileSucess, java.util.List<java.lang.String> dest) throws org.apache.avro.AvroRemoteException;
  java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo> callStorage(java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo> list) throws org.apache.avro.AvroRemoteException;
  void notifyReply(java.lang.String filename, java.lang.String address);
  void decryptPluginFile(java.lang.String filename);
  boolean verifyFile(br.unb.cic.bionimbuz.avro.gen.FileInfo fileSucess, java.util.List<java.lang.String> dest) throws org.apache.avro.AvroRemoteException;
  void setWatcher(java.lang.String idPlugin);
  long checkFileSize(java.lang.String file) throws org.apache.avro.AvroRemoteException;
  boolean uploadFile(java.lang.String path, br.unb.cic.bionimbuz.avro.gen.FileInfo file) throws org.apache.avro.AvroRemoteException;
  br.unb.cic.bionimbuz.avro.gen.PluginFile getFileFromPeers(java.lang.String filename) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends BioProto {
    public static final org.apache.avro.Protocol PROTOCOL = br.unb.cic.bionimbuz.avro.gen.BioProto.PROTOCOL;
    /** Pings a node, e.g. to measure latency */
    void ping(org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void listFilesName(org.apache.avro.ipc.Callback<java.util.List<java.lang.String>> callback) throws java.io.IOException;
    /** Procurar em qual Ip está o arquivo file */
    void getIpFile(java.lang.String file, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void listServices(org.apache.avro.ipc.Callback<java.util.List<java.lang.String>> callback) throws java.io.IOException;
    void listFiles(org.apache.avro.ipc.Callback<java.util.List<br.unb.cic.bionimbuz.avro.gen.PluginFile>> callback) throws java.io.IOException;
    void listFilesPlugin(java.lang.String pluginId, org.apache.avro.ipc.Callback<java.util.List<br.unb.cic.bionimbuz.avro.gen.PluginFile>> callback) throws java.io.IOException;
    void getFileHash(java.lang.String fileName, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void startJobName(java.lang.String jobID, java.lang.String ip, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void startWorkflow(br.unb.cic.bionimbuz.avro.gen.Workflow workflow, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void schedPolicy(int numPolicy, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void statusJob(java.lang.String pipelineId, java.lang.String jobId, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void statusAllJob(org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void cancelJob(java.lang.String jobID, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void getPeersNode(org.apache.avro.ipc.Callback<java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo>> callback) throws java.io.IOException;
    void fileSent(br.unb.cic.bionimbuz.avro.gen.FileInfo fileSucess, java.util.List<java.lang.String> dest, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
    void callStorage(java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo> list, org.apache.avro.ipc.Callback<java.util.List<br.unb.cic.bionimbuz.avro.gen.NodeInfo>> callback) throws java.io.IOException;
    void verifyFile(br.unb.cic.bionimbuz.avro.gen.FileInfo fileSucess, java.util.List<java.lang.String> dest, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void checkFileSize(java.lang.String file, org.apache.avro.ipc.Callback<java.lang.Long> callback) throws java.io.IOException;
    void uploadFile(java.lang.String path, br.unb.cic.bionimbuz.avro.gen.FileInfo file, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getFileFromPeers(java.lang.String filename, org.apache.avro.ipc.Callback<br.unb.cic.bionimbuz.avro.gen.PluginFile> callback) throws java.io.IOException;
  }
}