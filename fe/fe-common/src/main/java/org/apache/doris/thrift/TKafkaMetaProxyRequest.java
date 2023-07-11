/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TKafkaMetaProxyRequest implements org.apache.thrift.TBase<TKafkaMetaProxyRequest, TKafkaMetaProxyRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TKafkaMetaProxyRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKafkaMetaProxyRequest");

  private static final org.apache.thrift.protocol.TField KAFKA_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("kafka_info", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TKafkaMetaProxyRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TKafkaMetaProxyRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TKafkaLoadInfo kafka_info; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KAFKA_INFO((short)1, "kafka_info");

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
        case 1: // KAFKA_INFO
          return KAFKA_INFO;
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
  private static final _Fields optionals[] = {_Fields.KAFKA_INFO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KAFKA_INFO, new org.apache.thrift.meta_data.FieldMetaData("kafka_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKafkaLoadInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKafkaMetaProxyRequest.class, metaDataMap);
  }

  public TKafkaMetaProxyRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKafkaMetaProxyRequest(TKafkaMetaProxyRequest other) {
    if (other.isSetKafkaInfo()) {
      this.kafka_info = new TKafkaLoadInfo(other.kafka_info);
    }
  }

  @Override
  public TKafkaMetaProxyRequest deepCopy() {
    return new TKafkaMetaProxyRequest(this);
  }

  @Override
  public void clear() {
    this.kafka_info = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TKafkaLoadInfo getKafkaInfo() {
    return this.kafka_info;
  }

  public TKafkaMetaProxyRequest setKafkaInfo(@org.apache.thrift.annotation.Nullable TKafkaLoadInfo kafka_info) {
    this.kafka_info = kafka_info;
    return this;
  }

  public void unsetKafkaInfo() {
    this.kafka_info = null;
  }

  /** Returns true if field kafka_info is set (has been assigned a value) and false otherwise */
  public boolean isSetKafkaInfo() {
    return this.kafka_info != null;
  }

  public void setKafkaInfoIsSet(boolean value) {
    if (!value) {
      this.kafka_info = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KAFKA_INFO:
      if (value == null) {
        unsetKafkaInfo();
      } else {
        setKafkaInfo((TKafkaLoadInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KAFKA_INFO:
      return getKafkaInfo();

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
    case KAFKA_INFO:
      return isSetKafkaInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TKafkaMetaProxyRequest)
      return this.equals((TKafkaMetaProxyRequest)that);
    return false;
  }

  public boolean equals(TKafkaMetaProxyRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_kafka_info = true && this.isSetKafkaInfo();
    boolean that_present_kafka_info = true && that.isSetKafkaInfo();
    if (this_present_kafka_info || that_present_kafka_info) {
      if (!(this_present_kafka_info && that_present_kafka_info))
        return false;
      if (!this.kafka_info.equals(that.kafka_info))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKafkaInfo()) ? 131071 : 524287);
    if (isSetKafkaInfo())
      hashCode = hashCode * 8191 + kafka_info.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TKafkaMetaProxyRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetKafkaInfo(), other.isSetKafkaInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKafkaInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kafka_info, other.kafka_info);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TKafkaMetaProxyRequest(");
    boolean first = true;

    if (isSetKafkaInfo()) {
      sb.append("kafka_info:");
      if (this.kafka_info == null) {
        sb.append("null");
      } else {
        sb.append(this.kafka_info);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (kafka_info != null) {
      kafka_info.validate();
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

  private static class TKafkaMetaProxyRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TKafkaMetaProxyRequestStandardScheme getScheme() {
      return new TKafkaMetaProxyRequestStandardScheme();
    }
  }

  private static class TKafkaMetaProxyRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TKafkaMetaProxyRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TKafkaMetaProxyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KAFKA_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.kafka_info = new TKafkaLoadInfo();
              struct.kafka_info.read(iprot);
              struct.setKafkaInfoIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TKafkaMetaProxyRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.kafka_info != null) {
        if (struct.isSetKafkaInfo()) {
          oprot.writeFieldBegin(KAFKA_INFO_FIELD_DESC);
          struct.kafka_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TKafkaMetaProxyRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TKafkaMetaProxyRequestTupleScheme getScheme() {
      return new TKafkaMetaProxyRequestTupleScheme();
    }
  }

  private static class TKafkaMetaProxyRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TKafkaMetaProxyRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKafkaMetaProxyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKafkaInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetKafkaInfo()) {
        struct.kafka_info.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKafkaMetaProxyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.kafka_info = new TKafkaLoadInfo();
        struct.kafka_info.read(iprot);
        struct.setKafkaInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

