/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

/**
 * Decimal logical type annotation
 * 
 * To maintain forward-compatibility in v1, implementations using this logical
 * type must also set scale and precision on the annotated SchemaElement.
 * 
 * Allowed for physical types: INT32, INT64, FIXED, and BINARY
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class DecimalType implements org.apache.thrift.TBase<DecimalType, DecimalType._Fields>, java.io.Serializable, Cloneable, Comparable<DecimalType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DecimalType");

  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PRECISION_FIELD_DESC = new org.apache.thrift.protocol.TField("precision", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DecimalTypeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DecimalTypeTupleSchemeFactory();

  public int scale; // required
  public int precision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCALE((short)1, "scale"),
    PRECISION((short)2, "precision");

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
        case 1: // SCALE
          return SCALE;
        case 2: // PRECISION
          return PRECISION;
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
  private static final int __SCALE_ISSET_ID = 0;
  private static final int __PRECISION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRECISION, new org.apache.thrift.meta_data.FieldMetaData("precision", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DecimalType.class, metaDataMap);
  }

  public DecimalType() {
  }

  public DecimalType(
    int scale,
    int precision)
  {
    this();
    this.scale = scale;
    setScaleIsSet(true);
    this.precision = precision;
    setPrecisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DecimalType(DecimalType other) {
    __isset_bitfield = other.__isset_bitfield;
    this.scale = other.scale;
    this.precision = other.precision;
  }

  @Override
  public DecimalType deepCopy() {
    return new DecimalType(this);
  }

  @Override
  public void clear() {
    setScaleIsSet(false);
    this.scale = 0;
    setPrecisionIsSet(false);
    this.precision = 0;
  }

  public int getScale() {
    return this.scale;
  }

  public DecimalType setScale(int scale) {
    this.scale = scale;
    setScaleIsSet(true);
    return this;
  }

  public void unsetScale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public int getPrecision() {
    return this.precision;
  }

  public DecimalType setPrecision(int precision) {
    this.precision = precision;
    setPrecisionIsSet(true);
    return this;
  }

  public void unsetPrecision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  /** Returns true if field precision is set (has been assigned a value) and false otherwise */
  public boolean isSetPrecision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  public void setPrecisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRECISION_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((java.lang.Integer)value);
      }
      break;

    case PRECISION:
      if (value == null) {
        unsetPrecision();
      } else {
        setPrecision((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCALE:
      return getScale();

    case PRECISION:
      return getPrecision();

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
    case SCALE:
      return isSetScale();
    case PRECISION:
      return isSetPrecision();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DecimalType)
      return this.equals((DecimalType)that);
    return false;
  }

  public boolean equals(DecimalType that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scale = true;
    boolean that_present_scale = true;
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    boolean this_present_precision = true;
    boolean that_present_precision = true;
    if (this_present_precision || that_present_precision) {
      if (!(this_present_precision && that_present_precision))
        return false;
      if (this.precision != that.precision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + scale;

    hashCode = hashCode * 8191 + precision;

    return hashCode;
  }

  @Override
  public int compareTo(DecimalType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScale(), other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPrecision(), other.isSetPrecision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrecision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.precision, other.precision);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DecimalType(");
    boolean first = true;

    sb.append("scale:");
    sb.append(this.scale);
    first = false;
    if (!first) sb.append(", ");
    sb.append("precision:");
    sb.append(this.precision);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'scale' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'precision' because it's a primitive and you chose the non-beans generator.
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

  private static class DecimalTypeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DecimalTypeStandardScheme getScheme() {
      return new DecimalTypeStandardScheme();
    }
  }

  private static class DecimalTypeStandardScheme extends org.apache.thrift.scheme.StandardScheme<DecimalType> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, DecimalType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.scale = iprot.readI32();
              struct.setScaleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRECISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.precision = iprot.readI32();
              struct.setPrecisionIsSet(true);
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
      if (!struct.isSetScale()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'scale' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPrecision()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'precision' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, DecimalType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SCALE_FIELD_DESC);
      oprot.writeI32(struct.scale);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRECISION_FIELD_DESC);
      oprot.writeI32(struct.precision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DecimalTypeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DecimalTypeTupleScheme getScheme() {
      return new DecimalTypeTupleScheme();
    }
  }

  private static class DecimalTypeTupleScheme extends org.apache.thrift.scheme.TupleScheme<DecimalType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DecimalType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.scale);
      oprot.writeI32(struct.precision);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DecimalType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scale = iprot.readI32();
      struct.setScaleIsSet(true);
      struct.precision = iprot.readI32();
      struct.setPrecisionIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

