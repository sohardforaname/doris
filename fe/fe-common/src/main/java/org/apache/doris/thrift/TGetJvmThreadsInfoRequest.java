/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TGetJvmThreadsInfoRequest implements org.apache.thrift.TBase<TGetJvmThreadsInfoRequest, TGetJvmThreadsInfoRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJvmThreadsInfoRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJvmThreadsInfoRequest");

  private static final org.apache.thrift.protocol.TField GET_COMPLETE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("get_complete_info", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetJvmThreadsInfoRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetJvmThreadsInfoRequestTupleSchemeFactory();

  public boolean get_complete_info; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GET_COMPLETE_INFO((short)1, "get_complete_info");

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
        case 1: // GET_COMPLETE_INFO
          return GET_COMPLETE_INFO;
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
  private static final int __GET_COMPLETE_INFO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GET_COMPLETE_INFO, new org.apache.thrift.meta_data.FieldMetaData("get_complete_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJvmThreadsInfoRequest.class, metaDataMap);
  }

  public TGetJvmThreadsInfoRequest() {
  }

  public TGetJvmThreadsInfoRequest(
    boolean get_complete_info)
  {
    this();
    this.get_complete_info = get_complete_info;
    setGetCompleteInfoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJvmThreadsInfoRequest(TGetJvmThreadsInfoRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.get_complete_info = other.get_complete_info;
  }

  @Override
  public TGetJvmThreadsInfoRequest deepCopy() {
    return new TGetJvmThreadsInfoRequest(this);
  }

  @Override
  public void clear() {
    setGetCompleteInfoIsSet(false);
    this.get_complete_info = false;
  }

  public boolean isGetCompleteInfo() {
    return this.get_complete_info;
  }

  public TGetJvmThreadsInfoRequest setGetCompleteInfo(boolean get_complete_info) {
    this.get_complete_info = get_complete_info;
    setGetCompleteInfoIsSet(true);
    return this;
  }

  public void unsetGetCompleteInfo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID);
  }

  /** Returns true if field get_complete_info is set (has been assigned a value) and false otherwise */
  public boolean isSetGetCompleteInfo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID);
  }

  public void setGetCompleteInfoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GET_COMPLETE_INFO_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case GET_COMPLETE_INFO:
      if (value == null) {
        unsetGetCompleteInfo();
      } else {
        setGetCompleteInfo((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GET_COMPLETE_INFO:
      return isGetCompleteInfo();

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
    case GET_COMPLETE_INFO:
      return isSetGetCompleteInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetJvmThreadsInfoRequest)
      return this.equals((TGetJvmThreadsInfoRequest)that);
    return false;
  }

  public boolean equals(TGetJvmThreadsInfoRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_get_complete_info = true;
    boolean that_present_get_complete_info = true;
    if (this_present_get_complete_info || that_present_get_complete_info) {
      if (!(this_present_get_complete_info && that_present_get_complete_info))
        return false;
      if (this.get_complete_info != that.get_complete_info)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((get_complete_info) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TGetJvmThreadsInfoRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetGetCompleteInfo(), other.isSetGetCompleteInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetCompleteInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.get_complete_info, other.get_complete_info);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetJvmThreadsInfoRequest(");
    boolean first = true;

    sb.append("get_complete_info:");
    sb.append(this.get_complete_info);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'get_complete_info' because it's a primitive and you chose the non-beans generator.
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

  private static class TGetJvmThreadsInfoRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetJvmThreadsInfoRequestStandardScheme getScheme() {
      return new TGetJvmThreadsInfoRequestStandardScheme();
    }
  }

  private static class TGetJvmThreadsInfoRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetJvmThreadsInfoRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GET_COMPLETE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.get_complete_info = iprot.readBool();
              struct.setGetCompleteInfoIsSet(true);
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
      if (!struct.isSetGetCompleteInfo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'get_complete_info' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GET_COMPLETE_INFO_FIELD_DESC);
      oprot.writeBool(struct.get_complete_info);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJvmThreadsInfoRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetJvmThreadsInfoRequestTupleScheme getScheme() {
      return new TGetJvmThreadsInfoRequestTupleScheme();
    }
  }

  private static class TGetJvmThreadsInfoRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetJvmThreadsInfoRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.get_complete_info);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJvmThreadsInfoRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.get_complete_info = iprot.readBool();
      struct.setGetCompleteInfoIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

