/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package br.unb.cic.bionimbuz.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Workflow extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Workflow\",\"namespace\":\"br.unb.cic.bionimbuz.avro.gen\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"jobs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Job\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"localId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"serviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"args\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputFiles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FileInfo\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"long\"},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"uploadTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"dependencies\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"referenceFile\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ipjob\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}}},{\"name\":\"intancesWorkflow\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Instance\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"costPerHour\",\"type\":\"double\"},{\"name\":\"locality\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"memoryTotal\",\"type\":\"double\"},{\"name\":\"cpuHtz\",\"type\":\"double\"},{\"name\":\"cpuType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numCores\",\"type\":\"int\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"provider\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"idProgramas\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"creationTimer\",\"type\":\"long\"},{\"name\":\"delay\",\"type\":\"int\"},{\"name\":\"timetocreate\",\"type\":\"long\"},{\"name\":\"idUser\",\"type\":\"long\"},{\"name\":\"ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}},{\"name\":\"sla\",\"type\":{\"type\":\"record\",\"name\":\"Sla\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"idWorkflow\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"provider\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"objective\",\"type\":\"int\"},{\"name\":\"period\",\"type\":\"long\"},{\"name\":\"value\",\"type\":\"double\"},{\"name\":\"limitationType\",\"type\":\"int\"},{\"name\":\"limitationValueExecutionTime\",\"type\":\"long\"},{\"name\":\"limitationValueExecutionCost\",\"type\":\"double\"},{\"name\":\"execeedValueExecutionCost\",\"type\":\"double\"},{\"name\":\"prediction\",\"type\":\"boolean\"},{\"name\":\"solutions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Prediction\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"idService\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeService\",\"type\":\"long\"},{\"name\":\"instance\",\"type\":\"Instance\"},{\"name\":\"custoService\",\"type\":\"double\"}]}}},{\"name\":\"limitationExecution\",\"type\":\"boolean\"}]}},{\"name\":\"userWorkflow\",\"type\":{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"login\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cpf\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"celphone\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"instances\",\"type\":{\"type\":\"array\",\"items\":\"Instance\"}}]}},{\"name\":\"creationDatestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":[{\"type\":\"enum\",\"name\":\"WorkflowStatus\",\"symbols\":[\"PENDING\",\"EXECUTING\",\"FINALIZED_WITH_SUCCESS\",\"FINALIZED_WITH_WARNINGS\",\"FINALIZED_WITH_ERRORS\",\"PAUSED\",\"STOPPED_WITH_ERROR\"]},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> jobs;
  @Deprecated public java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> intancesWorkflow;
  @Deprecated public br.unb.cic.bionimbuz.avro.gen.Sla sla;
  @Deprecated public br.unb.cic.bionimbuz.avro.gen.User userWorkflow;
  @Deprecated public java.lang.String creationDatestamp;
  @Deprecated public long userId;
  @Deprecated public java.lang.String description;
  @Deprecated public br.unb.cic.bionimbuz.avro.gen.WorkflowStatus status;

  /**
   * Default constructor.
   */
  public Workflow() {}

  /**
   * All-args constructor.
   */
  public Workflow(java.lang.String id, java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> jobs, java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> intancesWorkflow, br.unb.cic.bionimbuz.avro.gen.Sla sla, br.unb.cic.bionimbuz.avro.gen.User userWorkflow, java.lang.String creationDatestamp, java.lang.Long userId, java.lang.String description, br.unb.cic.bionimbuz.avro.gen.WorkflowStatus status) {
    this.id = id;
    this.jobs = jobs;
    this.intancesWorkflow = intancesWorkflow;
    this.sla = sla;
    this.userWorkflow = userWorkflow;
    this.creationDatestamp = creationDatestamp;
    this.userId = userId;
    this.description = description;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return jobs;
    case 2: return intancesWorkflow;
    case 3: return sla;
    case 4: return userWorkflow;
    case 5: return creationDatestamp;
    case 6: return userId;
    case 7: return description;
    case 8: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: jobs = (java.util.List<br.unb.cic.bionimbuz.avro.gen.Job>)value$; break;
    case 2: intancesWorkflow = (java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance>)value$; break;
    case 3: sla = (br.unb.cic.bionimbuz.avro.gen.Sla)value$; break;
    case 4: userWorkflow = (br.unb.cic.bionimbuz.avro.gen.User)value$; break;
    case 5: creationDatestamp = (java.lang.String)value$; break;
    case 6: userId = (java.lang.Long)value$; break;
    case 7: description = (java.lang.String)value$; break;
    case 8: status = (br.unb.cic.bionimbuz.avro.gen.WorkflowStatus)value$; break;
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
   * Gets the value of the 'jobs' field.
   */
  public java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> getJobs() {
    return jobs;
  }

  /**
   * Sets the value of the 'jobs' field.
   * @param value the value to set.
   */
  public void setJobs(java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> value) {
    this.jobs = value;
  }

  /**
   * Gets the value of the 'intancesWorkflow' field.
   */
  public java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> getIntancesWorkflow() {
    return intancesWorkflow;
  }

  /**
   * Sets the value of the 'intancesWorkflow' field.
   * @param value the value to set.
   */
  public void setIntancesWorkflow(java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> value) {
    this.intancesWorkflow = value;
  }

  /**
   * Gets the value of the 'sla' field.
   */
  public br.unb.cic.bionimbuz.avro.gen.Sla getSla() {
    return sla;
  }

  /**
   * Sets the value of the 'sla' field.
   * @param value the value to set.
   */
  public void setSla(br.unb.cic.bionimbuz.avro.gen.Sla value) {
    this.sla = value;
  }

  /**
   * Gets the value of the 'userWorkflow' field.
   */
  public br.unb.cic.bionimbuz.avro.gen.User getUserWorkflow() {
    return userWorkflow;
  }

  /**
   * Sets the value of the 'userWorkflow' field.
   * @param value the value to set.
   */
  public void setUserWorkflow(br.unb.cic.bionimbuz.avro.gen.User value) {
    this.userWorkflow = value;
  }

  /**
   * Gets the value of the 'creationDatestamp' field.
   */
  public java.lang.String getCreationDatestamp() {
    return creationDatestamp;
  }

  /**
   * Sets the value of the 'creationDatestamp' field.
   * @param value the value to set.
   */
  public void setCreationDatestamp(java.lang.String value) {
    this.creationDatestamp = value;
  }

  /**
   * Gets the value of the 'userId' field.
   */
  public java.lang.Long getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.Long value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'status' field.
   */
  public br.unb.cic.bionimbuz.avro.gen.WorkflowStatus getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(br.unb.cic.bionimbuz.avro.gen.WorkflowStatus value) {
    this.status = value;
  }

  /** Creates a new Workflow RecordBuilder */
  public static br.unb.cic.bionimbuz.avro.gen.Workflow.Builder newBuilder() {
    return new br.unb.cic.bionimbuz.avro.gen.Workflow.Builder();
  }
  
  /** Creates a new Workflow RecordBuilder by copying an existing Builder */
  public static br.unb.cic.bionimbuz.avro.gen.Workflow.Builder newBuilder(br.unb.cic.bionimbuz.avro.gen.Workflow.Builder other) {
    return new br.unb.cic.bionimbuz.avro.gen.Workflow.Builder(other);
  }
  
  /** Creates a new Workflow RecordBuilder by copying an existing Workflow instance */
  public static br.unb.cic.bionimbuz.avro.gen.Workflow.Builder newBuilder(br.unb.cic.bionimbuz.avro.gen.Workflow other) {
    return new br.unb.cic.bionimbuz.avro.gen.Workflow.Builder(other);
  }
  
  /**
   * RecordBuilder for Workflow instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Workflow>
    implements org.apache.avro.data.RecordBuilder<Workflow> {

    private java.lang.String id;
    private java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> jobs;
    private java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> intancesWorkflow;
    private br.unb.cic.bionimbuz.avro.gen.Sla sla;
    private br.unb.cic.bionimbuz.avro.gen.User userWorkflow;
    private java.lang.String creationDatestamp;
    private long userId;
    private java.lang.String description;
    private br.unb.cic.bionimbuz.avro.gen.WorkflowStatus status;

    /** Creates a new Builder */
    private Builder() {
      super(br.unb.cic.bionimbuz.avro.gen.Workflow.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(br.unb.cic.bionimbuz.avro.gen.Workflow.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Workflow instance */
    private Builder(br.unb.cic.bionimbuz.avro.gen.Workflow other) {
            super(br.unb.cic.bionimbuz.avro.gen.Workflow.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.jobs)) {
        this.jobs = data().deepCopy(fields()[1].schema(), other.jobs);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.intancesWorkflow)) {
        this.intancesWorkflow = data().deepCopy(fields()[2].schema(), other.intancesWorkflow);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sla)) {
        this.sla = data().deepCopy(fields()[3].schema(), other.sla);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.userWorkflow)) {
        this.userWorkflow = data().deepCopy(fields()[4].schema(), other.userWorkflow);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.creationDatestamp)) {
        this.creationDatestamp = data().deepCopy(fields()[5].schema(), other.creationDatestamp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.userId)) {
        this.userId = data().deepCopy(fields()[6].schema(), other.userId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.description)) {
        this.description = data().deepCopy(fields()[7].schema(), other.description);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.status)) {
        this.status = data().deepCopy(fields()[8].schema(), other.status);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setId(java.lang.String value) {
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
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'jobs' field */
    public java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> getJobs() {
      return jobs;
    }
    
    /** Sets the value of the 'jobs' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setJobs(java.util.List<br.unb.cic.bionimbuz.avro.gen.Job> value) {
      validate(fields()[1], value);
      this.jobs = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'jobs' field has been set */
    public boolean hasJobs() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'jobs' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearJobs() {
      jobs = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'intancesWorkflow' field */
    public java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> getIntancesWorkflow() {
      return intancesWorkflow;
    }
    
    /** Sets the value of the 'intancesWorkflow' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setIntancesWorkflow(java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance> value) {
      validate(fields()[2], value);
      this.intancesWorkflow = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'intancesWorkflow' field has been set */
    public boolean hasIntancesWorkflow() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'intancesWorkflow' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearIntancesWorkflow() {
      intancesWorkflow = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'sla' field */
    public br.unb.cic.bionimbuz.avro.gen.Sla getSla() {
      return sla;
    }
    
    /** Sets the value of the 'sla' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setSla(br.unb.cic.bionimbuz.avro.gen.Sla value) {
      validate(fields()[3], value);
      this.sla = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'sla' field has been set */
    public boolean hasSla() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'sla' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearSla() {
      sla = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'userWorkflow' field */
    public br.unb.cic.bionimbuz.avro.gen.User getUserWorkflow() {
      return userWorkflow;
    }
    
    /** Sets the value of the 'userWorkflow' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setUserWorkflow(br.unb.cic.bionimbuz.avro.gen.User value) {
      validate(fields()[4], value);
      this.userWorkflow = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'userWorkflow' field has been set */
    public boolean hasUserWorkflow() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'userWorkflow' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearUserWorkflow() {
      userWorkflow = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'creationDatestamp' field */
    public java.lang.String getCreationDatestamp() {
      return creationDatestamp;
    }
    
    /** Sets the value of the 'creationDatestamp' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setCreationDatestamp(java.lang.String value) {
      validate(fields()[5], value);
      this.creationDatestamp = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'creationDatestamp' field has been set */
    public boolean hasCreationDatestamp() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'creationDatestamp' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearCreationDatestamp() {
      creationDatestamp = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'userId' field */
    public java.lang.Long getUserId() {
      return userId;
    }
    
    /** Sets the value of the 'userId' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setUserId(long value) {
      validate(fields()[6], value);
      this.userId = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'userId' field has been set */
    public boolean hasUserId() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'userId' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearUserId() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setDescription(java.lang.String value) {
      validate(fields()[7], value);
      this.description = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'description' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearDescription() {
      description = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'status' field */
    public br.unb.cic.bionimbuz.avro.gen.WorkflowStatus getStatus() {
      return status;
    }
    
    /** Sets the value of the 'status' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder setStatus(br.unb.cic.bionimbuz.avro.gen.WorkflowStatus value) {
      validate(fields()[8], value);
      this.status = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'status' field has been set */
    public boolean hasStatus() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'status' field */
    public br.unb.cic.bionimbuz.avro.gen.Workflow.Builder clearStatus() {
      status = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public Workflow build() {
      try {
        Workflow record = new Workflow();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.jobs = fieldSetFlags()[1] ? this.jobs : (java.util.List<br.unb.cic.bionimbuz.avro.gen.Job>) defaultValue(fields()[1]);
        record.intancesWorkflow = fieldSetFlags()[2] ? this.intancesWorkflow : (java.util.List<br.unb.cic.bionimbuz.avro.gen.Instance>) defaultValue(fields()[2]);
        record.sla = fieldSetFlags()[3] ? this.sla : (br.unb.cic.bionimbuz.avro.gen.Sla) defaultValue(fields()[3]);
        record.userWorkflow = fieldSetFlags()[4] ? this.userWorkflow : (br.unb.cic.bionimbuz.avro.gen.User) defaultValue(fields()[4]);
        record.creationDatestamp = fieldSetFlags()[5] ? this.creationDatestamp : (java.lang.String) defaultValue(fields()[5]);
        record.userId = fieldSetFlags()[6] ? this.userId : (java.lang.Long) defaultValue(fields()[6]);
        record.description = fieldSetFlags()[7] ? this.description : (java.lang.String) defaultValue(fields()[7]);
        record.status = fieldSetFlags()[8] ? this.status : (br.unb.cic.bionimbuz.avro.gen.WorkflowStatus) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
