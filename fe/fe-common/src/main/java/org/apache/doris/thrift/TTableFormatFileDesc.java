/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TTableFormatFileDesc implements org.apache.thrift.TBase<TTableFormatFileDesc, TTableFormatFileDesc._Fields>, java.io.Serializable, Cloneable, Comparable<TTableFormatFileDesc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTableFormatFileDesc");

  private static final org.apache.thrift.protocol.TField TABLE_FORMAT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("table_format_type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ICEBERG_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("iceberg_params", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTableFormatFileDescStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTableFormatFileDescTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String table_format_type; // optional
  public @org.apache.thrift.annotation.Nullable TIcebergFileDesc iceberg_params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_FORMAT_TYPE((short)1, "table_format_type"),
    ICEBERG_PARAMS((short)2, "iceberg_params");

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
        case 1: // TABLE_FORMAT_TYPE
          return TABLE_FORMAT_TYPE;
        case 2: // ICEBERG_PARAMS
          return ICEBERG_PARAMS;
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
  private static final _Fields optionals[] = {_Fields.TABLE_FORMAT_TYPE,_Fields.ICEBERG_PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_FORMAT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("table_format_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ICEBERG_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("iceberg_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TIcebergFileDesc.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTableFormatFileDesc.class, metaDataMap);
  }

  public TTableFormatFileDesc() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTableFormatFileDesc(TTableFormatFileDesc other) {
    if (other.isSetTableFormatType()) {
      this.table_format_type = other.table_format_type;
    }
    if (other.isSetIcebergParams()) {
      this.iceberg_params = new TIcebergFileDesc(other.iceberg_params);
    }
  }

  @Override
  public TTableFormatFileDesc deepCopy() {
    return new TTableFormatFileDesc(this);
  }

  @Override
  public void clear() {
    this.table_format_type = null;
    this.iceberg_params = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableFormatType() {
    return this.table_format_type;
  }

  public TTableFormatFileDesc setTableFormatType(@org.apache.thrift.annotation.Nullable java.lang.String table_format_type) {
    this.table_format_type = table_format_type;
    return this;
  }

  public void unsetTableFormatType() {
    this.table_format_type = null;
  }

  /** Returns true if field table_format_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTableFormatType() {
    return this.table_format_type != null;
  }

  public void setTableFormatTypeIsSet(boolean value) {
    if (!value) {
      this.table_format_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TIcebergFileDesc getIcebergParams() {
    return this.iceberg_params;
  }

  public TTableFormatFileDesc setIcebergParams(@org.apache.thrift.annotation.Nullable TIcebergFileDesc iceberg_params) {
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

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_FORMAT_TYPE:
      if (value == null) {
        unsetTableFormatType();
      } else {
        setTableFormatType((java.lang.String)value);
      }
      break;

    case ICEBERG_PARAMS:
      if (value == null) {
        unsetIcebergParams();
      } else {
        setIcebergParams((TIcebergFileDesc)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_FORMAT_TYPE:
      return getTableFormatType();

    case ICEBERG_PARAMS:
      return getIcebergParams();

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
    case TABLE_FORMAT_TYPE:
      return isSetTableFormatType();
    case ICEBERG_PARAMS:
      return isSetIcebergParams();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTableFormatFileDesc)
      return this.equals((TTableFormatFileDesc)that);
    return false;
  }

  public boolean equals(TTableFormatFileDesc that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_table_format_type = true && this.isSetTableFormatType();
    boolean that_present_table_format_type = true && that.isSetTableFormatType();
    if (this_present_table_format_type || that_present_table_format_type) {
      if (!(this_present_table_format_type && that_present_table_format_type))
        return false;
      if (!this.table_format_type.equals(that.table_format_type))
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableFormatType()) ? 131071 : 524287);
    if (isSetTableFormatType())
      hashCode = hashCode * 8191 + table_format_type.hashCode();

    hashCode = hashCode * 8191 + ((isSetIcebergParams()) ? 131071 : 524287);
    if (isSetIcebergParams())
      hashCode = hashCode * 8191 + iceberg_params.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTableFormatFileDesc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTableFormatType(), other.isSetTableFormatType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableFormatType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_format_type, other.table_format_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTableFormatFileDesc(");
    boolean first = true;

    if (isSetTableFormatType()) {
      sb.append("table_format_type:");
      if (this.table_format_type == null) {
        sb.append("null");
      } else {
        sb.append(this.table_format_type);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (iceberg_params != null) {
      iceberg_params.validate();
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

  private static class TTableFormatFileDescStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTableFormatFileDescStandardScheme getScheme() {
      return new TTableFormatFileDescStandardScheme();
    }
  }

  private static class TTableFormatFileDescStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTableFormatFileDesc> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTableFormatFileDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_FORMAT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_format_type = iprot.readString();
              struct.setTableFormatTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ICEBERG_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.iceberg_params = new TIcebergFileDesc();
              struct.iceberg_params.read(iprot);
              struct.setIcebergParamsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTableFormatFileDesc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_format_type != null) {
        if (struct.isSetTableFormatType()) {
          oprot.writeFieldBegin(TABLE_FORMAT_TYPE_FIELD_DESC);
          oprot.writeString(struct.table_format_type);
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTableFormatFileDescTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTableFormatFileDescTupleScheme getScheme() {
      return new TTableFormatFileDescTupleScheme();
    }
  }

  private static class TTableFormatFileDescTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTableFormatFileDesc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTableFormatFileDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTableFormatType()) {
        optionals.set(0);
      }
      if (struct.isSetIcebergParams()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTableFormatType()) {
        oprot.writeString(struct.table_format_type);
      }
      if (struct.isSetIcebergParams()) {
        struct.iceberg_params.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTableFormatFileDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.table_format_type = iprot.readString();
        struct.setTableFormatTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.iceberg_params = new TIcebergFileDesc();
        struct.iceberg_params.read(iprot);
        struct.setIcebergParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

