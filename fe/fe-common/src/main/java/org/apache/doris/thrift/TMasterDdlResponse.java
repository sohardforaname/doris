/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TMasterDdlResponse implements org.apache.thrift.TBase<TMasterDdlResponse, TMasterDdlResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TMasterDdlResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMasterDdlResponse");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DDL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ddl_type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMasterDdlResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMasterDdlResponseTupleSchemeFactory();

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  public @org.apache.thrift.annotation.Nullable TPaloInternalServiceVersion protocol_version; // required
  /**
   * 
   * @see TCommonDdlType
   */
  public @org.apache.thrift.annotation.Nullable TCommonDdlType ddl_type; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPaloInternalServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    /**
     * 
     * @see TCommonDdlType
     */
    DDL_TYPE((short)2, "ddl_type"),
    STATUS((short)3, "status");

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
        case 2: // DDL_TYPE
          return DDL_TYPE;
        case 3: // STATUS
          return STATUS;
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
  private static final _Fields optionals[] = {_Fields.STATUS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPaloInternalServiceVersion.class)));
    tmpMap.put(_Fields.DDL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ddl_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TCommonDdlType.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMasterDdlResponse.class, metaDataMap);
  }

  public TMasterDdlResponse() {
  }

  public TMasterDdlResponse(
    TPaloInternalServiceVersion protocol_version,
    TCommonDdlType ddl_type)
  {
    this();
    this.protocol_version = protocol_version;
    this.ddl_type = ddl_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMasterDdlResponse(TMasterDdlResponse other) {
    if (other.isSetProtocolVersion()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetDdlType()) {
      this.ddl_type = other.ddl_type;
    }
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
  }

  @Override
  public TMasterDdlResponse deepCopy() {
    return new TMasterDdlResponse(this);
  }

  @Override
  public void clear() {
    this.protocol_version = null;
    this.ddl_type = null;
    this.status = null;
  }

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  @org.apache.thrift.annotation.Nullable
  public TPaloInternalServiceVersion getProtocolVersion() {
    return this.protocol_version;
  }

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  public TMasterDdlResponse setProtocolVersion(@org.apache.thrift.annotation.Nullable TPaloInternalServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocolVersion() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocolVersion() {
    return this.protocol_version != null;
  }

  public void setProtocolVersionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  /**
   * 
   * @see TCommonDdlType
   */
  @org.apache.thrift.annotation.Nullable
  public TCommonDdlType getDdlType() {
    return this.ddl_type;
  }

  /**
   * 
   * @see TCommonDdlType
   */
  public TMasterDdlResponse setDdlType(@org.apache.thrift.annotation.Nullable TCommonDdlType ddl_type) {
    this.ddl_type = ddl_type;
    return this;
  }

  public void unsetDdlType() {
    this.ddl_type = null;
  }

  /** Returns true if field ddl_type is set (has been assigned a value) and false otherwise */
  public boolean isSetDdlType() {
    return this.ddl_type != null;
  }

  public void setDdlTypeIsSet(boolean value) {
    if (!value) {
      this.ddl_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TMasterDdlResponse setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocolVersion();
      } else {
        setProtocolVersion((TPaloInternalServiceVersion)value);
      }
      break;

    case DDL_TYPE:
      if (value == null) {
        unsetDdlType();
      } else {
        setDdlType((TCommonDdlType)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
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

    case DDL_TYPE:
      return getDdlType();

    case STATUS:
      return getStatus();

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
    case DDL_TYPE:
      return isSetDdlType();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMasterDdlResponse)
      return this.equals((TMasterDdlResponse)that);
    return false;
  }

  public boolean equals(TMasterDdlResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_protocol_version = true && this.isSetProtocolVersion();
    boolean that_present_protocol_version = true && that.isSetProtocolVersion();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_ddl_type = true && this.isSetDdlType();
    boolean that_present_ddl_type = true && that.isSetDdlType();
    if (this_present_ddl_type || that_present_ddl_type) {
      if (!(this_present_ddl_type && that_present_ddl_type))
        return false;
      if (!this.ddl_type.equals(that.ddl_type))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProtocolVersion()) ? 131071 : 524287);
    if (isSetProtocolVersion())
      hashCode = hashCode * 8191 + protocol_version.getValue();

    hashCode = hashCode * 8191 + ((isSetDdlType()) ? 131071 : 524287);
    if (isSetDdlType())
      hashCode = hashCode * 8191 + ddl_type.getValue();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMasterDdlResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProtocolVersion(), other.isSetProtocolVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocolVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDdlType(), other.isSetDdlType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDdlType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ddl_type, other.ddl_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMasterDdlResponse(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ddl_type:");
    if (this.ddl_type == null) {
      sb.append("null");
    } else {
      sb.append(this.ddl_type);
    }
    first = false;
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    if (ddl_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ddl_type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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

  private static class TMasterDdlResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMasterDdlResponseStandardScheme getScheme() {
      return new TMasterDdlResponseStandardScheme();
    }
  }

  private static class TMasterDdlResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMasterDdlResponse> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
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
              struct.protocol_version = org.apache.doris.thrift.TPaloInternalServiceVersion.findByValue(iprot.readI32());
              struct.setProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DDL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ddl_type = org.apache.doris.thrift.TCommonDdlType.findByValue(iprot.readI32());
              struct.setDdlTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.ddl_type != null) {
        oprot.writeFieldBegin(DDL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.ddl_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMasterDdlResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMasterDdlResponseTupleScheme getScheme() {
      return new TMasterDdlResponseTupleScheme();
    }
  }

  private static class TMasterDdlResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMasterDdlResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      oprot.writeI32(struct.ddl_type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.protocol_version = org.apache.doris.thrift.TPaloInternalServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      struct.ddl_type = org.apache.doris.thrift.TCommonDdlType.findByValue(iprot.readI32());
      struct.setDdlTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

