/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TUpdateExportTaskStatusRequest implements org.apache.thrift.TBase<TUpdateExportTaskStatusRequest, TUpdateExportTaskStatusRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateExportTaskStatusRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateExportTaskStatusRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocolVersion", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TASK_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("taskStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUpdateExportTaskStatusRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUpdateExportTaskStatusRequestTupleSchemeFactory();

  /**
   * 
   * @see FrontendServiceVersion
   */
  public @org.apache.thrift.annotation.Nullable FrontendServiceVersion protocolVersion; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId taskId; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExportStatusResult taskStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FrontendServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocolVersion"),
    TASK_ID((short)2, "taskId"),
    TASK_STATUS((short)3, "taskStatus");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // TASK_ID
          return TASK_ID;
        case 3: // TASK_STATUS
          return TASK_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocolVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FrontendServiceVersion.class)));
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.TASK_STATUS, new org.apache.thrift.meta_data.FieldMetaData("taskStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExportStatusResult.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateExportTaskStatusRequest.class, metaDataMap);
  }

  public TUpdateExportTaskStatusRequest() {
  }

  public TUpdateExportTaskStatusRequest(
    FrontendServiceVersion protocolVersion,
    org.apache.doris.thrift.TUniqueId taskId,
    org.apache.doris.thrift.TExportStatusResult taskStatus)
  {
    this();
    this.protocolVersion = protocolVersion;
    this.taskId = taskId;
    this.taskStatus = taskStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateExportTaskStatusRequest(TUpdateExportTaskStatusRequest other) {
    if (other.isSetProtocolVersion()) {
      this.protocolVersion = other.protocolVersion;
    }
    if (other.isSetTaskId()) {
      this.taskId = new org.apache.doris.thrift.TUniqueId(other.taskId);
    }
    if (other.isSetTaskStatus()) {
      this.taskStatus = new org.apache.doris.thrift.TExportStatusResult(other.taskStatus);
    }
  }

  @Override
  public TUpdateExportTaskStatusRequest deepCopy() {
    return new TUpdateExportTaskStatusRequest(this);
  }

  @Override
  public void clear() {
    this.protocolVersion = null;
    this.taskId = null;
    this.taskStatus = null;
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  @org.apache.thrift.annotation.Nullable
  public FrontendServiceVersion getProtocolVersion() {
    return this.protocolVersion;
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  public TUpdateExportTaskStatusRequest setProtocolVersion(@org.apache.thrift.annotation.Nullable FrontendServiceVersion protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

  public void unsetProtocolVersion() {
    this.protocolVersion = null;
  }

  /** Returns true if field protocolVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocolVersion() {
    return this.protocolVersion != null;
  }

  public void setProtocolVersionIsSet(boolean value) {
    if (!value) {
      this.protocolVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getTaskId() {
    return this.taskId;
  }

  public TUpdateExportTaskStatusRequest setTaskId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TExportStatusResult getTaskStatus() {
    return this.taskStatus;
  }

  public TUpdateExportTaskStatusRequest setTaskStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExportStatusResult taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  public void unsetTaskStatus() {
    this.taskStatus = null;
  }

  /** Returns true if field taskStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskStatus() {
    return this.taskStatus != null;
  }

  public void setTaskStatusIsSet(boolean value) {
    if (!value) {
      this.taskStatus = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocolVersion();
      } else {
        setProtocolVersion((FrontendServiceVersion)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case TASK_STATUS:
      if (value == null) {
        unsetTaskStatus();
      } else {
        setTaskStatus((org.apache.doris.thrift.TExportStatusResult)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocolVersion();

    case TASK_ID:
      return getTaskId();

    case TASK_STATUS:
      return getTaskStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocolVersion();
    case TASK_ID:
      return isSetTaskId();
    case TASK_STATUS:
      return isSetTaskStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUpdateExportTaskStatusRequest)
      return this.equals((TUpdateExportTaskStatusRequest)that);
    return false;
  }

  public boolean equals(TUpdateExportTaskStatusRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_protocolVersion = true && this.isSetProtocolVersion();
    boolean that_present_protocolVersion = true && that.isSetProtocolVersion();
    if (this_present_protocolVersion || that_present_protocolVersion) {
      if (!(this_present_protocolVersion && that_present_protocolVersion))
        return false;
      if (!this.protocolVersion.equals(that.protocolVersion))
        return false;
    }

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_taskStatus = true && this.isSetTaskStatus();
    boolean that_present_taskStatus = true && that.isSetTaskStatus();
    if (this_present_taskStatus || that_present_taskStatus) {
      if (!(this_present_taskStatus && that_present_taskStatus))
        return false;
      if (!this.taskStatus.equals(that.taskStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProtocolVersion()) ? 131071 : 524287);
    if (isSetProtocolVersion())
      hashCode = hashCode * 8191 + protocolVersion.getValue();

    hashCode = hashCode * 8191 + ((isSetTaskId()) ? 131071 : 524287);
    if (isSetTaskId())
      hashCode = hashCode * 8191 + taskId.hashCode();

    hashCode = hashCode * 8191 + ((isSetTaskStatus()) ? 131071 : 524287);
    if (isSetTaskStatus())
      hashCode = hashCode * 8191 + taskStatus.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUpdateExportTaskStatusRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProtocolVersion(), other.isSetProtocolVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocolVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocolVersion, other.protocolVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTaskId(), other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTaskStatus(), other.isSetTaskStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskStatus, other.taskStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUpdateExportTaskStatusRequest(");
    boolean first = true;

    sb.append("protocolVersion:");
    if (this.protocolVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.protocolVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskStatus:");
    if (this.taskStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.taskStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocolVersion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocolVersion' was not present! Struct: " + toString());
    }
    if (taskId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskId' was not present! Struct: " + toString());
    }
    if (taskStatus == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskStatus' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (taskId != null) {
      taskId.validate();
    }
    if (taskStatus != null) {
      taskStatus.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUpdateExportTaskStatusRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUpdateExportTaskStatusRequestStandardScheme getScheme() {
      return new TUpdateExportTaskStatusRequestStandardScheme();
    }
  }

  private static class TUpdateExportTaskStatusRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUpdateExportTaskStatusRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocolVersion = org.apache.doris.thrift.FrontendServiceVersion.findByValue(iprot.readI32());
              struct.setProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskId = new org.apache.doris.thrift.TUniqueId();
              struct.taskId.read(iprot);
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASK_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskStatus = new org.apache.doris.thrift.TExportStatusResult();
              struct.taskStatus.read(iprot);
              struct.setTaskStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocolVersion != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocolVersion.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        struct.taskId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskStatus != null) {
        oprot.writeFieldBegin(TASK_STATUS_FIELD_DESC);
        struct.taskStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateExportTaskStatusRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUpdateExportTaskStatusRequestTupleScheme getScheme() {
      return new TUpdateExportTaskStatusRequestTupleScheme();
    }
  }

  private static class TUpdateExportTaskStatusRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUpdateExportTaskStatusRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.protocolVersion.getValue());
      struct.taskId.write(oprot);
      struct.taskStatus.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.protocolVersion = org.apache.doris.thrift.FrontendServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      struct.taskId = new org.apache.doris.thrift.TUniqueId();
      struct.taskId.read(iprot);
      struct.setTaskIdIsSet(true);
      struct.taskStatus = new org.apache.doris.thrift.TExportStatusResult();
      struct.taskStatus.read(iprot);
      struct.setTaskStatusIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

