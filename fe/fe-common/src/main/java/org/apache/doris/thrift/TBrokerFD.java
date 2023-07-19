/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TBrokerFD implements org.apache.thrift.TBase<TBrokerFD, TBrokerFD._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerFD> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerFD");

  private static final org.apache.thrift.protocol.TField HIGH_FIELD_DESC = new org.apache.thrift.protocol.TField("high", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOW_FIELD_DESC = new org.apache.thrift.protocol.TField("low", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerFDStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerFDTupleSchemeFactory();

  public long high; // required
  public long low; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HIGH((short)1, "high"),
    LOW((short)2, "low");

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
        case 1: // HIGH
          return HIGH;
        case 2: // LOW
          return LOW;
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
  private static final int __HIGH_ISSET_ID = 0;
  private static final int __LOW_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HIGH, new org.apache.thrift.meta_data.FieldMetaData("high", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOW, new org.apache.thrift.meta_data.FieldMetaData("low", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerFD.class, metaDataMap);
  }

  public TBrokerFD() {
  }

  public TBrokerFD(
    long high,
    long low)
  {
    this();
    this.high = high;
    setHighIsSet(true);
    this.low = low;
    setLowIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerFD(TBrokerFD other) {
    __isset_bitfield = other.__isset_bitfield;
    this.high = other.high;
    this.low = other.low;
  }

  @Override
  public TBrokerFD deepCopy() {
    return new TBrokerFD(this);
  }

  @Override
  public void clear() {
    setHighIsSet(false);
    this.high = 0;
    setLowIsSet(false);
    this.low = 0;
  }

  public long getHigh() {
    return this.high;
  }

  public TBrokerFD setHigh(long high) {
    this.high = high;
    setHighIsSet(true);
    return this;
  }

  public void unsetHigh() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HIGH_ISSET_ID);
  }

  /** Returns true if field high is set (has been assigned a value) and false otherwise */
  public boolean isSetHigh() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HIGH_ISSET_ID);
  }

  public void setHighIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HIGH_ISSET_ID, value);
  }

  public long getLow() {
    return this.low;
  }

  public TBrokerFD setLow(long low) {
    this.low = low;
    setLowIsSet(true);
    return this;
  }

  public void unsetLow() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOW_ISSET_ID);
  }

  /** Returns true if field low is set (has been assigned a value) and false otherwise */
  public boolean isSetLow() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOW_ISSET_ID);
  }

  public void setLowIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOW_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HIGH:
      if (value == null) {
        unsetHigh();
      } else {
        setHigh((java.lang.Long)value);
      }
      break;

    case LOW:
      if (value == null) {
        unsetLow();
      } else {
        setLow((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HIGH:
      return getHigh();

    case LOW:
      return getLow();

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
    case HIGH:
      return isSetHigh();
    case LOW:
      return isSetLow();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerFD)
      return this.equals((TBrokerFD)that);
    return false;
  }

  public boolean equals(TBrokerFD that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_high = true;
    boolean that_present_high = true;
    if (this_present_high || that_present_high) {
      if (!(this_present_high && that_present_high))
        return false;
      if (this.high != that.high)
        return false;
    }

    boolean this_present_low = true;
    boolean that_present_low = true;
    if (this_present_low || that_present_low) {
      if (!(this_present_low && that_present_low))
        return false;
      if (this.low != that.low)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(high);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(low);

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerFD other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHigh(), other.isSetHigh());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHigh()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.high, other.high);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLow(), other.isSetLow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.low, other.low);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerFD(");
    boolean first = true;

    sb.append("high:");
    sb.append(this.high);
    first = false;
    if (!first) sb.append(", ");
    sb.append("low:");
    sb.append(this.low);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'high' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'low' because it's a primitive and you chose the non-beans generator.
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

  private static class TBrokerFDStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerFDStandardScheme getScheme() {
      return new TBrokerFDStandardScheme();
    }
  }

  private static class TBrokerFDStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerFD> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerFD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HIGH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.high = iprot.readI64();
              struct.setHighIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOW
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.low = iprot.readI64();
              struct.setLowIsSet(true);
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
      if (!struct.isSetHigh()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'high' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLow()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'low' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerFD struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HIGH_FIELD_DESC);
      oprot.writeI64(struct.high);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOW_FIELD_DESC);
      oprot.writeI64(struct.low);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerFDTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerFDTupleScheme getScheme() {
      return new TBrokerFDTupleScheme();
    }
  }

  private static class TBrokerFDTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerFD> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerFD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.high);
      oprot.writeI64(struct.low);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerFD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.high = iprot.readI64();
      struct.setHighIsSet(true);
      struct.low = iprot.readI64();
      struct.setLowIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

