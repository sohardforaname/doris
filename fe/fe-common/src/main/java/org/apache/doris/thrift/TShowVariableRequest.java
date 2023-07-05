/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TShowVariableRequest implements org.apache.thrift.TBase<TShowVariableRequest, TShowVariableRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TShowVariableRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowVariableRequest");

  private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VAR_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("varType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TShowVariableRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TShowVariableRequestTupleSchemeFactory();

  public long threadId; // required
  /**
   * 
   * @see org.apache.doris.thrift.TVarType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TVarType varType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_ID((short)1, "threadId"),
    /**
     * 
     * @see org.apache.doris.thrift.TVarType
     */
    VAR_TYPE((short)2, "varType");

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
        case 1: // THREAD_ID
          return THREAD_ID;
        case 2: // VAR_TYPE
          return VAR_TYPE;
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
  private static final int __THREADID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VAR_TYPE, new org.apache.thrift.meta_data.FieldMetaData("varType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TVarType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowVariableRequest.class, metaDataMap);
  }

  public TShowVariableRequest() {
  }

  public TShowVariableRequest(
    long threadId,
    org.apache.doris.thrift.TVarType varType)
  {
    this();
    this.threadId = threadId;
    setThreadIdIsSet(true);
    this.varType = varType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowVariableRequest(TShowVariableRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.threadId = other.threadId;
    if (other.isSetVarType()) {
      this.varType = other.varType;
    }
  }

  @Override
  public TShowVariableRequest deepCopy() {
    return new TShowVariableRequest(this);
  }

  @Override
  public void clear() {
    setThreadIdIsSet(false);
    this.threadId = 0;
    this.varType = null;
  }

  public long getThreadId() {
    return this.threadId;
  }

  public TShowVariableRequest setThreadId(long threadId) {
    this.threadId = threadId;
    setThreadIdIsSet(true);
    return this;
  }

  public void unsetThreadId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __THREADID_ISSET_ID);
  }

  /** Returns true if field threadId is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __THREADID_ISSET_ID);
  }

  public void setThreadIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __THREADID_ISSET_ID, value);
  }

  /**
   * 
   * @see org.apache.doris.thrift.TVarType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TVarType getVarType() {
    return this.varType;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TVarType
   */
  public TShowVariableRequest setVarType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TVarType varType) {
    this.varType = varType;
    return this;
  }

  public void unsetVarType() {
    this.varType = null;
  }

  /** Returns true if field varType is set (has been assigned a value) and false otherwise */
  public boolean isSetVarType() {
    return this.varType != null;
  }

  public void setVarTypeIsSet(boolean value) {
    if (!value) {
      this.varType = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case THREAD_ID:
      if (value == null) {
        unsetThreadId();
      } else {
        setThreadId((java.lang.Long)value);
      }
      break;

    case VAR_TYPE:
      if (value == null) {
        unsetVarType();
      } else {
        setVarType((org.apache.doris.thrift.TVarType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_ID:
      return getThreadId();

    case VAR_TYPE:
      return getVarType();

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
    case THREAD_ID:
      return isSetThreadId();
    case VAR_TYPE:
      return isSetVarType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TShowVariableRequest)
      return this.equals((TShowVariableRequest)that);
    return false;
  }

  public boolean equals(TShowVariableRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_threadId = true;
    boolean that_present_threadId = true;
    if (this_present_threadId || that_present_threadId) {
      if (!(this_present_threadId && that_present_threadId))
        return false;
      if (this.threadId != that.threadId)
        return false;
    }

    boolean this_present_varType = true && this.isSetVarType();
    boolean that_present_varType = true && that.isSetVarType();
    if (this_present_varType || that_present_varType) {
      if (!(this_present_varType && that_present_varType))
        return false;
      if (!this.varType.equals(that.varType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(threadId);

    hashCode = hashCode * 8191 + ((isSetVarType()) ? 131071 : 524287);
    if (isSetVarType())
      hashCode = hashCode * 8191 + varType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TShowVariableRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetThreadId(), other.isSetThreadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadId, other.threadId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVarType(), other.isSetVarType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVarType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.varType, other.varType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TShowVariableRequest(");
    boolean first = true;

    sb.append("threadId:");
    sb.append(this.threadId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("varType:");
    if (this.varType == null) {
      sb.append("null");
    } else {
      sb.append(this.varType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'threadId' because it's a primitive and you chose the non-beans generator.
    if (varType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'varType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TShowVariableRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TShowVariableRequestStandardScheme getScheme() {
      return new TShowVariableRequestStandardScheme();
    }
  }

  private static class TShowVariableRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TShowVariableRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.threadId = iprot.readI64();
              struct.setThreadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VAR_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.varType = org.apache.doris.thrift.TVarType.findByValue(iprot.readI32());
              struct.setVarTypeIsSet(true);
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
      if (!struct.isSetThreadId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'threadId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
      oprot.writeI64(struct.threadId);
      oprot.writeFieldEnd();
      if (struct.varType != null) {
        oprot.writeFieldBegin(VAR_TYPE_FIELD_DESC);
        oprot.writeI32(struct.varType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowVariableRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TShowVariableRequestTupleScheme getScheme() {
      return new TShowVariableRequestTupleScheme();
    }
  }

  private static class TShowVariableRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TShowVariableRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.threadId);
      oprot.writeI32(struct.varType.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.threadId = iprot.readI64();
      struct.setThreadIdIsSet(true);
      struct.varType = org.apache.doris.thrift.TVarType.findByValue(iprot.readI32());
      struct.setVarTypeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

