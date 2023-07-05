/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TLiteralPredicate implements org.apache.thrift.TBase<TLiteralPredicate, TLiteralPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TLiteralPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLiteralPredicate");

  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField IS_NULL_FIELD_DESC = new org.apache.thrift.protocol.TField("is_null", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLiteralPredicateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLiteralPredicateTupleSchemeFactory();

  public boolean value; // required
  public boolean is_null; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE((short)1, "value"),
    IS_NULL((short)2, "is_null");

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
        case 1: // VALUE
          return VALUE;
        case 2: // IS_NULL
          return IS_NULL;
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
  private static final int __VALUE_ISSET_ID = 0;
  private static final int __IS_NULL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_NULL, new org.apache.thrift.meta_data.FieldMetaData("is_null", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLiteralPredicate.class, metaDataMap);
  }

  public TLiteralPredicate() {
  }

  public TLiteralPredicate(
    boolean value,
    boolean is_null)
  {
    this();
    this.value = value;
    setValueIsSet(true);
    this.is_null = is_null;
    setIsNullIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLiteralPredicate(TLiteralPredicate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.value = other.value;
    this.is_null = other.is_null;
  }

  @Override
  public TLiteralPredicate deepCopy() {
    return new TLiteralPredicate(this);
  }

  @Override
  public void clear() {
    setValueIsSet(false);
    this.value = false;
    setIsNullIsSet(false);
    this.is_null = false;
  }

  public boolean isValue() {
    return this.value;
  }

  public TLiteralPredicate setValue(boolean value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  public boolean isIsNull() {
    return this.is_null;
  }

  public TLiteralPredicate setIsNull(boolean is_null) {
    this.is_null = is_null;
    setIsNullIsSet(true);
    return this;
  }

  public void unsetIsNull() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_NULL_ISSET_ID);
  }

  /** Returns true if field is_null is set (has been assigned a value) and false otherwise */
  public boolean isSetIsNull() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_NULL_ISSET_ID);
  }

  public void setIsNullIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_NULL_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Boolean)value);
      }
      break;

    case IS_NULL:
      if (value == null) {
        unsetIsNull();
      } else {
        setIsNull((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE:
      return isValue();

    case IS_NULL:
      return isIsNull();

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
    case VALUE:
      return isSetValue();
    case IS_NULL:
      return isSetIsNull();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLiteralPredicate)
      return this.equals((TLiteralPredicate)that);
    return false;
  }

  public boolean equals(TLiteralPredicate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_is_null = true;
    boolean that_present_is_null = true;
    if (this_present_is_null || that_present_is_null) {
      if (!(this_present_is_null && that_present_is_null))
        return false;
      if (this.is_null != that.is_null)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((value) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((is_null) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TLiteralPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetValue(), other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsNull(), other.isSetIsNull());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsNull()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_null, other.is_null);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLiteralPredicate(");
    boolean first = true;

    sb.append("value:");
    sb.append(this.value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_null:");
    sb.append(this.is_null);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'value' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'is_null' because it's a primitive and you chose the non-beans generator.
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

  private static class TLiteralPredicateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLiteralPredicateStandardScheme getScheme() {
      return new TLiteralPredicateStandardScheme();
    }
  }

  private static class TLiteralPredicateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLiteralPredicate> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.value = iprot.readBool();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_NULL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_null = iprot.readBool();
              struct.setIsNullIsSet(true);
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
      if (!struct.isSetValue()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIsNull()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_null' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBool(struct.value);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_NULL_FIELD_DESC);
      oprot.writeBool(struct.is_null);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLiteralPredicateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLiteralPredicateTupleScheme getScheme() {
      return new TLiteralPredicateTupleScheme();
    }
  }

  private static class TLiteralPredicateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLiteralPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.value);
      oprot.writeBool(struct.is_null);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLiteralPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.value = iprot.readBool();
      struct.setValueIsSet(true);
      struct.is_null = iprot.readBool();
      struct.setIsNullIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

