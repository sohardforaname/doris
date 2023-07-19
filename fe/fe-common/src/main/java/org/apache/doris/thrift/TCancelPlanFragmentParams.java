/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TCancelPlanFragmentParams implements org.apache.thrift.TBase<TCancelPlanFragmentParams, TCancelPlanFragmentParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCancelPlanFragmentParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCancelPlanFragmentParams");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCancelPlanFragmentParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCancelPlanFragmentParamsTupleSchemeFactory();

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  public @org.apache.thrift.annotation.Nullable PaloInternalServiceVersion protocol_version; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId fragment_instance_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PaloInternalServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    FRAGMENT_INSTANCE_ID((short)2, "fragment_instance_id");

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
        case 2: // FRAGMENT_INSTANCE_ID
          return FRAGMENT_INSTANCE_ID;
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
  private static final _Fields optionals[] = {_Fields.FRAGMENT_INSTANCE_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PaloInternalServiceVersion.class)));
    tmpMap.put(_Fields.FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("fragment_instance_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCancelPlanFragmentParams.class, metaDataMap);
  }

  public TCancelPlanFragmentParams() {
  }

  public TCancelPlanFragmentParams(
    PaloInternalServiceVersion protocol_version)
  {
    this();
    this.protocol_version = protocol_version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCancelPlanFragmentParams(TCancelPlanFragmentParams other) {
    if (other.isSetProtocolVersion()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetFragmentInstanceId()) {
      this.fragment_instance_id = new org.apache.doris.thrift.TUniqueId(other.fragment_instance_id);
    }
  }

  @Override
  public TCancelPlanFragmentParams deepCopy() {
    return new TCancelPlanFragmentParams(this);
  }

  @Override
  public void clear() {
    this.protocol_version = null;
    this.fragment_instance_id = null;
  }

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  @org.apache.thrift.annotation.Nullable
  public PaloInternalServiceVersion getProtocolVersion() {
    return this.protocol_version;
  }

  /**
   * 
   * @see PaloInternalServiceVersion
   */
  public TCancelPlanFragmentParams setProtocolVersion(@org.apache.thrift.annotation.Nullable PaloInternalServiceVersion protocol_version) {
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

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getFragmentInstanceId() {
    return this.fragment_instance_id;
  }

  public TCancelPlanFragmentParams setFragmentInstanceId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId fragment_instance_id) {
    this.fragment_instance_id = fragment_instance_id;
    return this;
  }

  public void unsetFragmentInstanceId() {
    this.fragment_instance_id = null;
  }

  /** Returns true if field fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetFragmentInstanceId() {
    return this.fragment_instance_id != null;
  }

  public void setFragmentInstanceIdIsSet(boolean value) {
    if (!value) {
      this.fragment_instance_id = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocolVersion();
      } else {
        setProtocolVersion((PaloInternalServiceVersion)value);
      }
      break;

    case FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetFragmentInstanceId();
      } else {
        setFragmentInstanceId((org.apache.doris.thrift.TUniqueId)value);
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

    case FRAGMENT_INSTANCE_ID:
      return getFragmentInstanceId();

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
    case FRAGMENT_INSTANCE_ID:
      return isSetFragmentInstanceId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCancelPlanFragmentParams)
      return this.equals((TCancelPlanFragmentParams)that);
    return false;
  }

  public boolean equals(TCancelPlanFragmentParams that) {
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

    boolean this_present_fragment_instance_id = true && this.isSetFragmentInstanceId();
    boolean that_present_fragment_instance_id = true && that.isSetFragmentInstanceId();
    if (this_present_fragment_instance_id || that_present_fragment_instance_id) {
      if (!(this_present_fragment_instance_id && that_present_fragment_instance_id))
        return false;
      if (!this.fragment_instance_id.equals(that.fragment_instance_id))
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

    hashCode = hashCode * 8191 + ((isSetFragmentInstanceId()) ? 131071 : 524287);
    if (isSetFragmentInstanceId())
      hashCode = hashCode * 8191 + fragment_instance_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCancelPlanFragmentParams other) {
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
    lastComparison = java.lang.Boolean.compare(isSetFragmentInstanceId(), other.isSetFragmentInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFragmentInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fragment_instance_id, other.fragment_instance_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCancelPlanFragmentParams(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (isSetFragmentInstanceId()) {
      if (!first) sb.append(", ");
      sb.append("fragment_instance_id:");
      if (this.fragment_instance_id == null) {
        sb.append("null");
      } else {
        sb.append(this.fragment_instance_id);
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
    // check for sub-struct validity
    if (fragment_instance_id != null) {
      fragment_instance_id.validate();
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

  private static class TCancelPlanFragmentParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCancelPlanFragmentParamsStandardScheme getScheme() {
      return new TCancelPlanFragmentParamsStandardScheme();
    }
  }

  private static class TCancelPlanFragmentParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCancelPlanFragmentParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TCancelPlanFragmentParams struct) throws org.apache.thrift.TException {
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
              struct.protocol_version = org.apache.doris.thrift.PaloInternalServiceVersion.findByValue(iprot.readI32());
              struct.setProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
              struct.fragment_instance_id.read(iprot);
              struct.setFragmentInstanceIdIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TCancelPlanFragmentParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.fragment_instance_id != null) {
        if (struct.isSetFragmentInstanceId()) {
          oprot.writeFieldBegin(FRAGMENT_INSTANCE_ID_FIELD_DESC);
          struct.fragment_instance_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCancelPlanFragmentParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCancelPlanFragmentParamsTupleScheme getScheme() {
      return new TCancelPlanFragmentParamsTupleScheme();
    }
  }

  private static class TCancelPlanFragmentParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCancelPlanFragmentParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCancelPlanFragmentParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFragmentInstanceId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFragmentInstanceId()) {
        struct.fragment_instance_id.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCancelPlanFragmentParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.protocol_version = org.apache.doris.thrift.PaloInternalServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
        struct.fragment_instance_id.read(iprot);
        struct.setFragmentInstanceIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

