/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TDropRollupParams implements org.apache.thrift.TBase<TDropRollupParams, TDropRollupParams._Fields>, java.io.Serializable, Cloneable, Comparable<TDropRollupParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDropRollupParams");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ROLLUP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("rollup_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDropRollupParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDropRollupParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TTableName table_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String rollup_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
    ROLLUP_NAME((short)2, "rollup_name");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // ROLLUP_NAME
          return ROLLUP_NAME;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableName.class)));
    tmpMap.put(_Fields.ROLLUP_NAME, new org.apache.thrift.meta_data.FieldMetaData("rollup_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDropRollupParams.class, metaDataMap);
  }

  public TDropRollupParams() {
  }

  public TDropRollupParams(
    TTableName table_name,
    java.lang.String rollup_name)
  {
    this();
    this.table_name = table_name;
    this.rollup_name = rollup_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDropRollupParams(TDropRollupParams other) {
    if (other.isSetTableName()) {
      this.table_name = new TTableName(other.table_name);
    }
    if (other.isSetRollupName()) {
      this.rollup_name = other.rollup_name;
    }
  }

  @Override
  public TDropRollupParams deepCopy() {
    return new TDropRollupParams(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.rollup_name = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TTableName getTableName() {
    return this.table_name;
  }

  public TDropRollupParams setTableName(@org.apache.thrift.annotation.Nullable TTableName table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTableName() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.table_name != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRollupName() {
    return this.rollup_name;
  }

  public TDropRollupParams setRollupName(@org.apache.thrift.annotation.Nullable java.lang.String rollup_name) {
    this.rollup_name = rollup_name;
    return this;
  }

  public void unsetRollupName() {
    this.rollup_name = null;
  }

  /** Returns true if field rollup_name is set (has been assigned a value) and false otherwise */
  public boolean isSetRollupName() {
    return this.rollup_name != null;
  }

  public void setRollupNameIsSet(boolean value) {
    if (!value) {
      this.rollup_name = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((TTableName)value);
      }
      break;

    case ROLLUP_NAME:
      if (value == null) {
        unsetRollupName();
      } else {
        setRollupName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case ROLLUP_NAME:
      return getRollupName();

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
    case TABLE_NAME:
      return isSetTableName();
    case ROLLUP_NAME:
      return isSetRollupName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDropRollupParams)
      return this.equals((TDropRollupParams)that);
    return false;
  }

  public boolean equals(TDropRollupParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_rollup_name = true && this.isSetRollupName();
    boolean that_present_rollup_name = true && that.isSetRollupName();
    if (this_present_rollup_name || that_present_rollup_name) {
      if (!(this_present_rollup_name && that_present_rollup_name))
        return false;
      if (!this.rollup_name.equals(that.rollup_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetRollupName()) ? 131071 : 524287);
    if (isSetRollupName())
      hashCode = hashCode * 8191 + rollup_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDropRollupParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRollupName(), other.isSetRollupName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRollupName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rollup_name, other.rollup_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDropRollupParams(");
    boolean first = true;

    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rollup_name:");
    if (this.rollup_name == null) {
      sb.append("null");
    } else {
      sb.append(this.rollup_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (table_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' was not present! Struct: " + toString());
    }
    if (rollup_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rollup_name' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (table_name != null) {
      table_name.validate();
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

  private static class TDropRollupParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TDropRollupParamsStandardScheme getScheme() {
      return new TDropRollupParamsStandardScheme();
    }
  }

  private static class TDropRollupParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDropRollupParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TDropRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_name = new TTableName();
              struct.table_name.read(iprot);
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLLUP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rollup_name = iprot.readString();
              struct.setRollupNameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TDropRollupParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        struct.table_name.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.rollup_name != null) {
        oprot.writeFieldBegin(ROLLUP_NAME_FIELD_DESC);
        oprot.writeString(struct.rollup_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDropRollupParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TDropRollupParamsTupleScheme getScheme() {
      return new TDropRollupParamsTupleScheme();
    }
  }

  private static class TDropRollupParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDropRollupParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDropRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.table_name.write(oprot);
      oprot.writeString(struct.rollup_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDropRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.table_name = new TTableName();
      struct.table_name.read(iprot);
      struct.setTableNameIsSet(true);
      struct.rollup_name = iprot.readString();
      struct.setRollupNameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

