/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TUniqueId implements org.apache.thrift.TBase<TUniqueId, TUniqueId._Fields>, java.io.Serializable, Cloneable, Comparable<TUniqueId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUniqueId");

  private static final org.apache.thrift.protocol.TField HI_FIELD_DESC = new org.apache.thrift.protocol.TField("hi", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LO_FIELD_DESC = new org.apache.thrift.protocol.TField("lo", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUniqueIdStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUniqueIdTupleSchemeFactory();

  public long hi; // required
  public long lo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HI((short)1, "hi"),
    LO((short)2, "lo");

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
        case 1: // HI
          return HI;
        case 2: // LO
          return LO;
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
  private static final int __HI_ISSET_ID = 0;
  private static final int __LO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HI, new org.apache.thrift.meta_data.FieldMetaData("hi", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LO, new org.apache.thrift.meta_data.FieldMetaData("lo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUniqueId.class, metaDataMap);
  }

  public TUniqueId() {
  }

  public TUniqueId(
    long hi,
    long lo)
  {
    this();
    this.hi = hi;
    setHiIsSet(true);
    this.lo = lo;
    setLoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUniqueId(TUniqueId other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hi = other.hi;
    this.lo = other.lo;
  }

  @Override
  public TUniqueId deepCopy() {
    return new TUniqueId(this);
  }

  @Override
  public void clear() {
    setHiIsSet(false);
    this.hi = 0;
    setLoIsSet(false);
    this.lo = 0;
  }

  public long getHi() {
    return this.hi;
  }

  public TUniqueId setHi(long hi) {
    this.hi = hi;
    setHiIsSet(true);
    return this;
  }

  public void unsetHi() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HI_ISSET_ID);
  }

  /** Returns true if field hi is set (has been assigned a value) and false otherwise */
  public boolean isSetHi() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HI_ISSET_ID);
  }

  public void setHiIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HI_ISSET_ID, value);
  }

  public long getLo() {
    return this.lo;
  }

  public TUniqueId setLo(long lo) {
    this.lo = lo;
    setLoIsSet(true);
    return this;
  }

  public void unsetLo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LO_ISSET_ID);
  }

  /** Returns true if field lo is set (has been assigned a value) and false otherwise */
  public boolean isSetLo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LO_ISSET_ID);
  }

  public void setLoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LO_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HI:
      if (value == null) {
        unsetHi();
      } else {
        setHi((java.lang.Long)value);
      }
      break;

    case LO:
      if (value == null) {
        unsetLo();
      } else {
        setLo((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HI:
      return getHi();

    case LO:
      return getLo();

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
    case HI:
      return isSetHi();
    case LO:
      return isSetLo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUniqueId)
      return this.equals((TUniqueId)that);
    return false;
  }

  public boolean equals(TUniqueId that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hi = true;
    boolean that_present_hi = true;
    if (this_present_hi || that_present_hi) {
      if (!(this_present_hi && that_present_hi))
        return false;
      if (this.hi != that.hi)
        return false;
    }

    boolean this_present_lo = true;
    boolean that_present_lo = true;
    if (this_present_lo || that_present_lo) {
      if (!(this_present_lo && that_present_lo))
        return false;
      if (this.lo != that.lo)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(hi);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lo);

    return hashCode;
  }

  @Override
  public int compareTo(TUniqueId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHi(), other.isSetHi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hi, other.hi);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLo(), other.isSetLo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lo, other.lo);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUniqueId(");
    boolean first = true;

    sb.append("hi:");
    sb.append(this.hi);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lo:");
    sb.append(this.lo);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'hi' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lo' because it's a primitive and you chose the non-beans generator.
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

  private static class TUniqueIdStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUniqueIdStandardScheme getScheme() {
      return new TUniqueIdStandardScheme();
    }
  }

  private static class TUniqueIdStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUniqueId> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUniqueId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HI
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.hi = iprot.readI64();
              struct.setHiIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lo = iprot.readI64();
              struct.setLoIsSet(true);
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
      if (!struct.isSetHi()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hi' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'lo' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUniqueId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HI_FIELD_DESC);
      oprot.writeI64(struct.hi);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LO_FIELD_DESC);
      oprot.writeI64(struct.lo);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUniqueIdTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUniqueIdTupleScheme getScheme() {
      return new TUniqueIdTupleScheme();
    }
  }

  private static class TUniqueIdTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUniqueId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUniqueId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.hi);
      oprot.writeI64(struct.lo);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUniqueId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.hi = iprot.readI64();
      struct.setHiIsSet(true);
      struct.lo = iprot.readI64();
      struct.setLoIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

