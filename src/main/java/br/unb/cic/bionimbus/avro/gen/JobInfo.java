/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.unb.cic.bionimbus.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobInfo\",\"namespace\":\"br.unb.cic.bionimbus.avro.gen\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"localId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"serviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"args\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Pair\",\"fields\":[{\"name\":\"first\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"second\",\"type\":\"long\"}]}}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"dependencies\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String localId;
  @Deprecated public java.lang.String serviceId;
  @Deprecated public java.lang.String args;
  @Deprecated public java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> inputs;
  @Deprecated public java.util.List<java.lang.String> outputs;
  @Deprecated public long timestamp;
  @Deprecated public java.util.List<java.lang.String> dependencies;

  /**
   * Default constructor.
   */
  public JobInfo() {}

  /**
   * All-args constructor.
   */
  public JobInfo(java.lang.String id, java.lang.String localId, java.lang.String serviceId, java.lang.String args, java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> inputs, java.util.List<java.lang.String> outputs, java.lang.Long timestamp, java.util.List<java.lang.String> dependencies) {
    this.id = id;
    this.localId = localId;
    this.serviceId = serviceId;
    this.args = args;
    this.inputs = inputs;
    this.outputs = outputs;
    this.timestamp = timestamp;
    this.dependencies = dependencies;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return localId;
    case 2: return serviceId;
    case 3: return args;
    case 4: return inputs;
    case 5: return outputs;
    case 6: return timestamp;
    case 7: return dependencies;
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
    case 4: inputs = (java.util.List<br.unb.cic.bionimbus.avro.gen.Pair>)value$; break;
    case 5: outputs = (java.util.List<java.lang.String>)value$; break;
    case 6: timestamp = (java.lang.Long)value$; break;
    case 7: dependencies = (java.util.List<java.lang.String>)value$; break;
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
   * Gets the value of the 'inputs' field.
   */
  public java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> getInputs() {
    return inputs;
  }

  /**
   * Sets the value of the 'inputs' field.
   * @param value the value to set.
   */
  public void setInputs(java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> value) {
    this.inputs = value;
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

  /** Creates a new JobInfo RecordBuilder */
  public static br.unb.cic.bionimbus.avro.gen.JobInfo.Builder newBuilder() {
    return new br.unb.cic.bionimbus.avro.gen.JobInfo.Builder();
  }
  
  /** Creates a new JobInfo RecordBuilder by copying an existing Builder */
  public static br.unb.cic.bionimbus.avro.gen.JobInfo.Builder newBuilder(br.unb.cic.bionimbus.avro.gen.JobInfo.Builder other) {
    return new br.unb.cic.bionimbus.avro.gen.JobInfo.Builder(other);
  }
  
  /** Creates a new JobInfo RecordBuilder by copying an existing JobInfo instance */
  public static br.unb.cic.bionimbus.avro.gen.JobInfo.Builder newBuilder(br.unb.cic.bionimbus.avro.gen.JobInfo other) {
    return new br.unb.cic.bionimbus.avro.gen.JobInfo.Builder(other);
  }
  
  /**
   * RecordBuilder for JobInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobInfo>
    implements org.apache.avro.data.RecordBuilder<JobInfo> {

    private java.lang.String id;
    private java.lang.String localId;
    private java.lang.String serviceId;
    private java.lang.String args;
    private java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> inputs;
    private java.util.List<java.lang.String> outputs;
    private long timestamp;
    private java.util.List<java.lang.String> dependencies;

    /** Creates a new Builder */
    private Builder() {
      super(br.unb.cic.bionimbus.avro.gen.JobInfo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.unb.cic.bionimbus.avro.gen.JobInfo.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing JobInfo instance */
    private Builder(br.unb.cic.bionimbus.avro.gen.JobInfo other) {
            super(br.unb.cic.bionimbus.avro.gen.JobInfo.SCHEMA$);
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
      if (isValidValue(fields()[4], other.inputs)) {
        this.inputs = data().deepCopy(fields()[4].schema(), other.inputs);
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
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setId(java.lang.String value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'localId' field */
    public java.lang.String getLocalId() {
      return localId;
    }
    
    /** Sets the value of the 'localId' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setLocalId(java.lang.String value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearLocalId() {
      localId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'serviceId' field */
    public java.lang.String getServiceId() {
      return serviceId;
    }
    
    /** Sets the value of the 'serviceId' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setServiceId(java.lang.String value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearServiceId() {
      serviceId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'args' field */
    public java.lang.String getArgs() {
      return args;
    }
    
    /** Sets the value of the 'args' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setArgs(java.lang.String value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearArgs() {
      args = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'inputs' field */
    public java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> getInputs() {
      return inputs;
    }
    
    /** Sets the value of the 'inputs' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setInputs(java.util.List<br.unb.cic.bionimbus.avro.gen.Pair> value) {
      validate(fields()[4], value);
      this.inputs = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'inputs' field has been set */
    public boolean hasInputs() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'inputs' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearInputs() {
      inputs = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'outputs' field */
    public java.util.List<java.lang.String> getOutputs() {
      return outputs;
    }
    
    /** Sets the value of the 'outputs' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setOutputs(java.util.List<java.lang.String> value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearOutputs() {
      outputs = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setTimestamp(long value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearTimestamp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'dependencies' field */
    public java.util.List<java.lang.String> getDependencies() {
      return dependencies;
    }
    
    /** Sets the value of the 'dependencies' field */
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder setDependencies(java.util.List<java.lang.String> value) {
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
    public br.unb.cic.bionimbus.avro.gen.JobInfo.Builder clearDependencies() {
      dependencies = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public JobInfo build() {
      try {
        JobInfo record = new JobInfo();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.localId = fieldSetFlags()[1] ? this.localId : (java.lang.String) defaultValue(fields()[1]);
        record.serviceId = fieldSetFlags()[2] ? this.serviceId : (java.lang.String) defaultValue(fields()[2]);
        record.args = fieldSetFlags()[3] ? this.args : (java.lang.String) defaultValue(fields()[3]);
        record.inputs = fieldSetFlags()[4] ? this.inputs : (java.util.List<br.unb.cic.bionimbus.avro.gen.Pair>) defaultValue(fields()[4]);
        record.outputs = fieldSetFlags()[5] ? this.outputs : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.timestamp = fieldSetFlags()[6] ? this.timestamp : (java.lang.Long) defaultValue(fields()[6]);
        record.dependencies = fieldSetFlags()[7] ? this.dependencies : (java.util.List<java.lang.String>) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
