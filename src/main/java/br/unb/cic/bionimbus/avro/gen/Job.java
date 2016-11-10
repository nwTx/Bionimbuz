/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.unb.cic.bionimbus.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Job extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Job\",\"namespace\":\"br.unb.cic.bionimbus.avro.gen\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"localId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"serviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"args\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FileInfo\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"long\"},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"uploadTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"dependencies\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"referenceFile\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String localId;
  @Deprecated public java.lang.String serviceId;
  @Deprecated public java.lang.String args;
  @Deprecated public java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> inputFiles;
  @Deprecated public java.util.List<java.lang.String> outputs;
  @Deprecated public long timestamp;
  @Deprecated public java.util.List<java.lang.String> dependencies;
  @Deprecated public java.lang.String referenceFile;

  /**
   * Default constructor.
   */
  public Job() {}

  /**
   * All-args constructor.
   */
  public Job(java.lang.String id, java.lang.String localId, java.lang.String serviceId, java.lang.String args, java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> inputFiles, java.util.List<java.lang.String> outputs, java.lang.Long timestamp, java.util.List<java.lang.String> dependencies, java.lang.String referenceFile) {
    this.id = id;
    this.localId = localId;
    this.serviceId = serviceId;
    this.args = args;
    this.inputFiles = inputFiles;
    this.outputs = outputs;
    this.timestamp = timestamp;
    this.dependencies = dependencies;
    this.referenceFile = referenceFile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return localId;
    case 2: return serviceId;
    case 3: return args;
    case 4: return inputFiles;
    case 5: return outputs;
    case 6: return timestamp;
    case 7: return dependencies;
    case 8: return referenceFile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: localId = (java.lang.String)value$; break;
    case 2: serviceId = (java.lang.String)value$; break;
    case 3: args = (java.lang.String)value$; break;
    case 4: inputFiles = (java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo>)value$; break;
    case 5: outputs = (java.util.List<java.lang.String>)value$; break;
    case 6: timestamp = (java.lang.Long)value$; break;
    case 7: dependencies = (java.util.List<java.lang.String>)value$; break;
    case 8: referenceFile = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'localId' field.
   */
  public java.lang.String getLocalId() {
    return localId;
  }

  /**
   * Sets the value of the 'localId' field.
   * @param value the value to set.
   */
  public void setLocalId(java.lang.String value) {
    this.localId = value;
  }

  /**
   * Gets the value of the 'serviceId' field.
   */
  public java.lang.String getServiceId() {
    return serviceId;
  }

  /**
   * Sets the value of the 'serviceId' field.
   * @param value the value to set.
   */
  public void setServiceId(java.lang.String value) {
    this.serviceId = value;
  }

  /**
   * Gets the value of the 'args' field.
   */
  public java.lang.String getArgs() {
    return args;
  }

  /**
   * Sets the value of the 'args' field.
   * @param value the value to set.
   */
  public void setArgs(java.lang.String value) {
    this.args = value;
  }

  /**
   * Gets the value of the 'inputFiles' field.
   */
  public java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> getInputFiles() {
    return inputFiles;
  }

  /**
   * Sets the value of the 'inputFiles' field.
   * @param value the value to set.
   */
  public void setInputFiles(java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> value) {
    this.inputFiles = value;
  }

  /**
   * Gets the value of the 'outputs' field.
   */
  public java.util.List<java.lang.String> getOutputs() {
    return outputs;
  }

  /**
   * Sets the value of the 'outputs' field.
   * @param value the value to set.
   */
  public void setOutputs(java.util.List<java.lang.String> value) {
    this.outputs = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'dependencies' field.
   */
  public java.util.List<java.lang.String> getDependencies() {
    return dependencies;
  }

  /**
   * Sets the value of the 'dependencies' field.
   * @param value the value to set.
   */
  public void setDependencies(java.util.List<java.lang.String> value) {
    this.dependencies = value;
  }

  /**
   * Gets the value of the 'referenceFile' field.
   */
  public java.lang.String getReferenceFile() {
    return referenceFile;
  }

  /**
   * Sets the value of the 'referenceFile' field.
   * @param value the value to set.
   */
  public void setReferenceFile(java.lang.String value) {
    this.referenceFile = value;
  }

  /** Creates a new Job RecordBuilder */
  public static br.unb.cic.bionimbus.avro.gen.Job.Builder newBuilder() {
    return new br.unb.cic.bionimbus.avro.gen.Job.Builder();
  }
  
  /** Creates a new Job RecordBuilder by copying an existing Builder */
  public static br.unb.cic.bionimbus.avro.gen.Job.Builder newBuilder(br.unb.cic.bionimbus.avro.gen.Job.Builder other) {
    return new br.unb.cic.bionimbus.avro.gen.Job.Builder(other);
  }
  
  /** Creates a new Job RecordBuilder by copying an existing Job instance */
  public static br.unb.cic.bionimbus.avro.gen.Job.Builder newBuilder(br.unb.cic.bionimbus.avro.gen.Job other) {
    return new br.unb.cic.bionimbus.avro.gen.Job.Builder(other);
  }
  
  /**
   * RecordBuilder for Job instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Job>
    implements org.apache.avro.data.RecordBuilder<Job> {

    private java.lang.String id;
    private java.lang.String localId;
    private java.lang.String serviceId;
    private java.lang.String args;
    private java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> inputFiles;
    private java.util.List<java.lang.String> outputs;
    private long timestamp;
    private java.util.List<java.lang.String> dependencies;
    private java.lang.String referenceFile;

    /** Creates a new Builder */
    private Builder() {
      super(br.unb.cic.bionimbus.avro.gen.Job.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.unb.cic.bionimbus.avro.gen.Job.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Job instance */
    private Builder(br.unb.cic.bionimbus.avro.gen.Job other) {
            super(br.unb.cic.bionimbus.avro.gen.Job.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.localId)) {
        this.localId = data().deepCopy(fields()[1].schema(), other.localId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.serviceId)) {
        this.serviceId = data().deepCopy(fields()[2].schema(), other.serviceId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.args)) {
        this.args = data().deepCopy(fields()[3].schema(), other.args);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.inputFiles)) {
        this.inputFiles = data().deepCopy(fields()[4].schema(), other.inputFiles);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.outputs)) {
        this.outputs = data().deepCopy(fields()[5].schema(), other.outputs);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[6].schema(), other.timestamp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dependencies)) {
        this.dependencies = data().deepCopy(fields()[7].schema(), other.dependencies);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.referenceFile)) {
        this.referenceFile = data().deepCopy(fields()[8].schema(), other.referenceFile);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'localId' field */
    public java.lang.String getLocalId() {
      return localId;
    }
    
    /** Sets the value of the 'localId' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setLocalId(java.lang.String value) {
      validate(fields()[1], value);
      this.localId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'localId' field has been set */
    public boolean hasLocalId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'localId' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearLocalId() {
      localId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'serviceId' field */
    public java.lang.String getServiceId() {
      return serviceId;
    }
    
    /** Sets the value of the 'serviceId' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setServiceId(java.lang.String value) {
      validate(fields()[2], value);
      this.serviceId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'serviceId' field has been set */
    public boolean hasServiceId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'serviceId' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearServiceId() {
      serviceId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'args' field */
    public java.lang.String getArgs() {
      return args;
    }
    
    /** Sets the value of the 'args' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setArgs(java.lang.String value) {
      validate(fields()[3], value);
      this.args = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'args' field has been set */
    public boolean hasArgs() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'args' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearArgs() {
      args = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'inputFiles' field */
    public java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> getInputFiles() {
      return inputFiles;
    }
    
    /** Sets the value of the 'inputFiles' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setInputFiles(java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo> value) {
      validate(fields()[4], value);
      this.inputFiles = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'inputFiles' field has been set */
    public boolean hasInputFiles() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'inputFiles' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearInputFiles() {
      inputFiles = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'outputs' field */
    public java.util.List<java.lang.String> getOutputs() {
      return outputs;
    }
    
    /** Sets the value of the 'outputs' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setOutputs(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.outputs = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'outputs' field has been set */
    public boolean hasOutputs() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'outputs' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearOutputs() {
      outputs = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setTimestamp(long value) {
      validate(fields()[6], value);
      this.timestamp = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'timestamp' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearTimestamp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'dependencies' field */
    public java.util.List<java.lang.String> getDependencies() {
      return dependencies;
    }
    
    /** Sets the value of the 'dependencies' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setDependencies(java.util.List<java.lang.String> value) {
      validate(fields()[7], value);
      this.dependencies = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'dependencies' field has been set */
    public boolean hasDependencies() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'dependencies' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearDependencies() {
      dependencies = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'referenceFile' field */
    public java.lang.String getReferenceFile() {
      return referenceFile;
    }
    
    /** Sets the value of the 'referenceFile' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder setReferenceFile(java.lang.String value) {
      validate(fields()[8], value);
      this.referenceFile = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceFile' field has been set */
    public boolean hasReferenceFile() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'referenceFile' field */
    public br.unb.cic.bionimbus.avro.gen.Job.Builder clearReferenceFile() {
      referenceFile = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public Job build() {
      try {
        Job record = new Job();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.localId = fieldSetFlags()[1] ? this.localId : (java.lang.String) defaultValue(fields()[1]);
        record.serviceId = fieldSetFlags()[2] ? this.serviceId : (java.lang.String) defaultValue(fields()[2]);
        record.args = fieldSetFlags()[3] ? this.args : (java.lang.String) defaultValue(fields()[3]);
        record.inputFiles = fieldSetFlags()[4] ? this.inputFiles : (java.util.List<br.unb.cic.bionimbus.avro.gen.FileInfo>) defaultValue(fields()[4]);
        record.outputs = fieldSetFlags()[5] ? this.outputs : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.timestamp = fieldSetFlags()[6] ? this.timestamp : (java.lang.Long) defaultValue(fields()[6]);
        record.dependencies = fieldSetFlags()[7] ? this.dependencies : (java.util.List<java.lang.String>) defaultValue(fields()[7]);
        record.referenceFile = fieldSetFlags()[8] ? this.referenceFile : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
