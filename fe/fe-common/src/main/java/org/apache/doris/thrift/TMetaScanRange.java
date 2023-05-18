/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TMetaScanRange implements org.apache.thrift.TBase<TMetaScanRange, TMetaScanRange._Fields>, java.io.Serializable, Cloneable, Comparable<TMetaScanRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMetaScanRange");

  private static final org.apache.thrift.protocol.TField METADATA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ICEBERG_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("iceberg_params", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BACKENDS_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("backends_params", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMetaScanRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMetaScanRangeTupleSchemeFactory();

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type; // optional
  public @org.apache.thrift.annotation.Nullable TIcebergMetadataParams iceberg_params; // optional
  public @org.apache.thrift.annotation.Nullable TBackendsMetadataParams backends_params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.doris.thrift.TMetadataType
     */
    METADATA_TYPE((short)1, "metadata_type"),
    ICEBERG_PARAMS((short)2, "iceberg_params"),
    BACKENDS_PARAMS((short)3, "backends_params");

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
        case 1: // METADATA_TYPE
          return METADATA_TYPE;
        case 2: // ICEBERG_PARAMS
          return ICEBERG_PARAMS;
        case 3: // BACKENDS_PARAMS
          return BACKENDS_PARAMS;
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
  private static final _Fields optionals[] = {_Fields.METADATA_TYPE,_Fields.ICEBERG_PARAMS,_Fields.BACKENDS_PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("metadata_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TMetadataType.class)));
    tmpMap.put(_Fields.ICEBERG_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("iceberg_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TIcebergMetadataParams.class)));
    tmpMap.put(_Fields.BACKENDS_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("backends_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBackendsMetadataParams.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMetaScanRange.class, metaDataMap);
  }

  public TMetaScanRange() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMetaScanRange(TMetaScanRange other) {
    if (other.isSetMetadataType()) {
      this.metadata_type = other.metadata_type;
    }
    if (other.isSetIcebergParams()) {
      this.iceberg_params = new TIcebergMetadataParams(other.iceberg_params);
    }
    if (other.isSetBackendsParams()) {
      this.backends_params = new TBackendsMetadataParams(other.backends_params);
    }
  }

  @Override
  public TMetaScanRange deepCopy() {
    return new TMetaScanRange(this);
  }

  @Override
  public void clear() {
    this.metadata_type = null;
    this.iceberg_params = null;
    this.backends_params = null;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TMetadataType getMetadataType() {
    return this.metadata_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public TMetaScanRange setMetadataType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type) {
    this.metadata_type = metadata_type;
    return this;
  }

  public void unsetMetadataType() {
    this.metadata_type = null;
  }

  /** Returns true if field metadata_type is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataType() {
    return this.metadata_type != null;
  }

  public void setMetadataTypeIsSet(boolean value) {
    if (!value) {
      this.metadata_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TIcebergMetadataParams getIcebergParams() {
    return this.iceberg_params;
  }

  public TMetaScanRange setIcebergParams(@org.apache.thrift.annotation.Nullable TIcebergMetadataParams iceberg_params) {
    this.iceberg_params = iceberg_params;
    return this;
  }

  public void unsetIcebergParams() {
    this.iceberg_params = null;
  }

  /** Returns true if field iceberg_params is set (has been assigned a value) and false otherwise */
  public boolean isSetIcebergParams() {
    return this.iceberg_params != null;
  }

  public void setIcebergParamsIsSet(boolean value) {
    if (!value) {
      this.iceberg_params = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBackendsMetadataParams getBackendsParams() {
    return this.backends_params;
  }

  public TMetaScanRange setBackendsParams(@org.apache.thrift.annotation.Nullable TBackendsMetadataParams backends_params) {
    this.backends_params = backends_params;
    return this;
  }

  public void unsetBackendsParams() {
    this.backends_params = null;
  }

  /** Returns true if field backends_params is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendsParams() {
    return this.backends_params != null;
  }

  public void setBackendsParamsIsSet(boolean value) {
    if (!value) {
      this.backends_params = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case METADATA_TYPE:
      if (value == null) {
        unsetMetadataType();
      } else {
        setMetadataType((org.apache.doris.thrift.TMetadataType)value);
      }
      break;

    case ICEBERG_PARAMS:
      if (value == null) {
        unsetIcebergParams();
      } else {
        setIcebergParams((TIcebergMetadataParams)value);
      }
      break;

    case BACKENDS_PARAMS:
      if (value == null) {
        unsetBackendsParams();
      } else {
        setBackendsParams((TBackendsMetadataParams)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_TYPE:
      return getMetadataType();

    case ICEBERG_PARAMS:
      return getIcebergParams();

    case BACKENDS_PARAMS:
      return getBackendsParams();

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
    case METADATA_TYPE:
      return isSetMetadataType();
    case ICEBERG_PARAMS:
      return isSetIcebergParams();
    case BACKENDS_PARAMS:
      return isSetBackendsParams();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMetaScanRange)
      return this.equals((TMetaScanRange)that);
    return false;
  }

  public boolean equals(TMetaScanRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metadata_type = true && this.isSetMetadataType();
    boolean that_present_metadata_type = true && that.isSetMetadataType();
    if (this_present_metadata_type || that_present_metadata_type) {
      if (!(this_present_metadata_type && that_present_metadata_type))
        return false;
      if (!this.metadata_type.equals(that.metadata_type))
        return false;
    }

    boolean this_present_iceberg_params = true && this.isSetIcebergParams();
    boolean that_present_iceberg_params = true && that.isSetIcebergParams();
    if (this_present_iceberg_params || that_present_iceberg_params) {
      if (!(this_present_iceberg_params && that_present_iceberg_params))
        return false;
      if (!this.iceberg_params.equals(that.iceberg_params))
        return false;
    }

    boolean this_present_backends_params = true && this.isSetBackendsParams();
    boolean that_present_backends_params = true && that.isSetBackendsParams();
    if (this_present_backends_params || that_present_backends_params) {
      if (!(this_present_backends_params && that_present_backends_params))
        return false;
      if (!this.backends_params.equals(that.backends_params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetadataType()) ? 131071 : 524287);
    if (isSetMetadataType())
      hashCode = hashCode * 8191 + metadata_type.getValue();

    hashCode = hashCode * 8191 + ((isSetIcebergParams()) ? 131071 : 524287);
    if (isSetIcebergParams())
      hashCode = hashCode * 8191 + iceberg_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetBackendsParams()) ? 131071 : 524287);
    if (isSetBackendsParams())
      hashCode = hashCode * 8191 + backends_params.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMetaScanRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMetadataType(), other.isSetMetadataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata_type, other.metadata_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIcebergParams(), other.isSetIcebergParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcebergParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iceberg_params, other.iceberg_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBackendsParams(), other.isSetBackendsParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendsParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backends_params, other.backends_params);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMetaScanRange(");
    boolean first = true;

    if (isSetMetadataType()) {
      sb.append("metadata_type:");
      if (this.metadata_type == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata_type);
      }
      first = false;
    }
    if (isSetIcebergParams()) {
      if (!first) sb.append(", ");
      sb.append("iceberg_params:");
      if (this.iceberg_params == null) {
        sb.append("null");
      } else {
        sb.append(this.iceberg_params);
      }
      first = false;
    }
    if (isSetBackendsParams()) {
      if (!first) sb.append(", ");
      sb.append("backends_params:");
      if (this.backends_params == null) {
        sb.append("null");
      } else {
        sb.append(this.backends_params);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (iceberg_params != null) {
      iceberg_params.validate();
    }
    if (backends_params != null) {
      backends_params.validate();
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

  private static class TMetaScanRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetaScanRangeStandardScheme getScheme() {
      return new TMetaScanRangeStandardScheme();
    }
  }

  private static class TMetaScanRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMetaScanRange> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMetaScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
              struct.setMetadataTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ICEBERG_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.iceberg_params = new TIcebergMetadataParams();
              struct.iceberg_params.read(iprot);
              struct.setIcebergParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BACKENDS_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.backends_params = new TBackendsMetadataParams();
              struct.backends_params.read(iprot);
              struct.setBackendsParamsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMetaScanRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata_type != null) {
        if (struct.isSetMetadataType()) {
          oprot.writeFieldBegin(METADATA_TYPE_FIELD_DESC);
          oprot.writeI32(struct.metadata_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.iceberg_params != null) {
        if (struct.isSetIcebergParams()) {
          oprot.writeFieldBegin(ICEBERG_PARAMS_FIELD_DESC);
          struct.iceberg_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.backends_params != null) {
        if (struct.isSetBackendsParams()) {
          oprot.writeFieldBegin(BACKENDS_PARAMS_FIELD_DESC);
          struct.backends_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMetaScanRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetaScanRangeTupleScheme getScheme() {
      return new TMetaScanRangeTupleScheme();
    }
  }

  private static class TMetaScanRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMetaScanRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMetaScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetadataType()) {
        optionals.set(0);
      }
      if (struct.isSetIcebergParams()) {
        optionals.set(1);
      }
      if (struct.isSetBackendsParams()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMetadataType()) {
        oprot.writeI32(struct.metadata_type.getValue());
      }
      if (struct.isSetIcebergParams()) {
        struct.iceberg_params.write(oprot);
      }
      if (struct.isSetBackendsParams()) {
        struct.backends_params.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMetaScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
        struct.setMetadataTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.iceberg_params = new TIcebergMetadataParams();
        struct.iceberg_params.read(iprot);
        struct.setIcebergParamsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.backends_params = new TBackendsMetadataParams();
        struct.backends_params.read(iprot);
        struct.setBackendsParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

