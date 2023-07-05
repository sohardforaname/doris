/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TOlapRewriteNode implements org.apache.thrift.TBase<TOlapRewriteNode, TOlapRewriteNode._Fields>, java.io.Serializable, Cloneable, Comparable<TOlapRewriteNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOlapRewriteNode");

  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("column_types", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OUTPUT_TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("output_tuple_id", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TOlapRewriteNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TOlapRewriteNodeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> columns; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumnType> column_types; // required
  public int output_tuple_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMNS((short)1, "columns"),
    COLUMN_TYPES((short)2, "column_types"),
    OUTPUT_TUPLE_ID((short)3, "output_tuple_id");

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
        case 1: // COLUMNS
          return COLUMNS;
        case 2: // COLUMN_TYPES
          return COLUMN_TYPES;
        case 3: // OUTPUT_TUPLE_ID
          return OUTPUT_TUPLE_ID;
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
  private static final int __OUTPUT_TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    tmpMap.put(_Fields.COLUMN_TYPES, new org.apache.thrift.meta_data.FieldMetaData("column_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TColumnType.class))));
    tmpMap.put(_Fields.OUTPUT_TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("output_tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOlapRewriteNode.class, metaDataMap);
  }

  public TOlapRewriteNode() {
  }

  public TOlapRewriteNode(
    java.util.List<org.apache.doris.thrift.TExpr> columns,
    java.util.List<org.apache.doris.thrift.TColumnType> column_types,
    int output_tuple_id)
  {
    this();
    this.columns = columns;
    this.column_types = column_types;
    this.output_tuple_id = output_tuple_id;
    setOutputTupleIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOlapRewriteNode(TOlapRewriteNode other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumns()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__columns = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.columns.size());
      for (org.apache.doris.thrift.TExpr other_element : other.columns) {
        __this__columns.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetColumnTypes()) {
      java.util.List<org.apache.doris.thrift.TColumnType> __this__column_types = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(other.column_types.size());
      for (org.apache.doris.thrift.TColumnType other_element : other.column_types) {
        __this__column_types.add(new org.apache.doris.thrift.TColumnType(other_element));
      }
      this.column_types = __this__column_types;
    }
    this.output_tuple_id = other.output_tuple_id;
  }

  @Override
  public TOlapRewriteNode deepCopy() {
    return new TOlapRewriteNode(this);
  }

  @Override
  public void clear() {
    this.columns = null;
    this.column_types = null;
    setOutputTupleIdIsSet(false);
    this.output_tuple_id = 0;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(org.apache.doris.thrift.TExpr elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getColumns() {
    return this.columns;
  }

  public TOlapRewriteNode setColumns(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getColumnTypesSize() {
    return (this.column_types == null) ? 0 : this.column_types.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TColumnType> getColumnTypesIterator() {
    return (this.column_types == null) ? null : this.column_types.iterator();
  }

  public void addToColumnTypes(org.apache.doris.thrift.TColumnType elem) {
    if (this.column_types == null) {
      this.column_types = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>();
    }
    this.column_types.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TColumnType> getColumnTypes() {
    return this.column_types;
  }

  public TOlapRewriteNode setColumnTypes(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumnType> column_types) {
    this.column_types = column_types;
    return this;
  }

  public void unsetColumnTypes() {
    this.column_types = null;
  }

  /** Returns true if field column_types is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnTypes() {
    return this.column_types != null;
  }

  public void setColumnTypesIsSet(boolean value) {
    if (!value) {
      this.column_types = null;
    }
  }

  public int getOutputTupleId() {
    return this.output_tuple_id;
  }

  public TOlapRewriteNode setOutputTupleId(int output_tuple_id) {
    this.output_tuple_id = output_tuple_id;
    setOutputTupleIdIsSet(true);
    return this;
  }

  public void unsetOutputTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OUTPUT_TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field output_tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OUTPUT_TUPLE_ID_ISSET_ID);
  }

  public void setOutputTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OUTPUT_TUPLE_ID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    case COLUMN_TYPES:
      if (value == null) {
        unsetColumnTypes();
      } else {
        setColumnTypes((java.util.List<org.apache.doris.thrift.TColumnType>)value);
      }
      break;

    case OUTPUT_TUPLE_ID:
      if (value == null) {
        unsetOutputTupleId();
      } else {
        setOutputTupleId((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMNS:
      return getColumns();

    case COLUMN_TYPES:
      return getColumnTypes();

    case OUTPUT_TUPLE_ID:
      return getOutputTupleId();

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
    case COLUMNS:
      return isSetColumns();
    case COLUMN_TYPES:
      return isSetColumnTypes();
    case OUTPUT_TUPLE_ID:
      return isSetOutputTupleId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TOlapRewriteNode)
      return this.equals((TOlapRewriteNode)that);
    return false;
  }

  public boolean equals(TOlapRewriteNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_column_types = true && this.isSetColumnTypes();
    boolean that_present_column_types = true && that.isSetColumnTypes();
    if (this_present_column_types || that_present_column_types) {
      if (!(this_present_column_types && that_present_column_types))
        return false;
      if (!this.column_types.equals(that.column_types))
        return false;
    }

    boolean this_present_output_tuple_id = true;
    boolean that_present_output_tuple_id = true;
    if (this_present_output_tuple_id || that_present_output_tuple_id) {
      if (!(this_present_output_tuple_id && that_present_output_tuple_id))
        return false;
      if (this.output_tuple_id != that.output_tuple_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumnTypes()) ? 131071 : 524287);
    if (isSetColumnTypes())
      hashCode = hashCode * 8191 + column_types.hashCode();

    hashCode = hashCode * 8191 + output_tuple_id;

    return hashCode;
  }

  @Override
  public int compareTo(TOlapRewriteNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumns(), other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnTypes(), other.isSetColumnTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_types, other.column_types);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOutputTupleId(), other.isSetOutputTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_tuple_id, other.output_tuple_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TOlapRewriteNode(");
    boolean first = true;

    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("column_types:");
    if (this.column_types == null) {
      sb.append("null");
    } else {
      sb.append(this.column_types);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("output_tuple_id:");
    sb.append(this.output_tuple_id);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    if (column_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'column_types' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'output_tuple_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TOlapRewriteNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TOlapRewriteNodeStandardScheme getScheme() {
      return new TOlapRewriteNodeStandardScheme();
    }
  }

  private static class TOlapRewriteNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TOlapRewriteNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TOlapRewriteNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list842 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list842.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem843;
                for (int _i844 = 0; _i844 < _list842.size; ++_i844)
                {
                  _elem843 = new org.apache.doris.thrift.TExpr();
                  _elem843.read(iprot);
                  struct.columns.add(_elem843);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list845 = iprot.readListBegin();
                struct.column_types = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(_list845.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType _elem846;
                for (int _i847 = 0; _i847 < _list845.size; ++_i847)
                {
                  _elem846 = new org.apache.doris.thrift.TColumnType();
                  _elem846.read(iprot);
                  struct.column_types.add(_elem846);
                }
                iprot.readListEnd();
              }
              struct.setColumnTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTPUT_TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.output_tuple_id = iprot.readI32();
              struct.setOutputTupleIdIsSet(true);
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
      if (!struct.isSetOutputTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'output_tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TOlapRewriteNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (org.apache.doris.thrift.TExpr _iter848 : struct.columns)
          {
            _iter848.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.column_types != null) {
        oprot.writeFieldBegin(COLUMN_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.column_types.size()));
          for (org.apache.doris.thrift.TColumnType _iter849 : struct.column_types)
          {
            _iter849.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(OUTPUT_TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.output_tuple_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOlapRewriteNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TOlapRewriteNodeTupleScheme getScheme() {
      return new TOlapRewriteNodeTupleScheme();
    }
  }

  private static class TOlapRewriteNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TOlapRewriteNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOlapRewriteNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.columns.size());
        for (org.apache.doris.thrift.TExpr _iter850 : struct.columns)
        {
          _iter850.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.column_types.size());
        for (org.apache.doris.thrift.TColumnType _iter851 : struct.column_types)
        {
          _iter851.write(oprot);
        }
      }
      oprot.writeI32(struct.output_tuple_id);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOlapRewriteNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list852 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.columns = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list852.size);
        @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem853;
        for (int _i854 = 0; _i854 < _list852.size; ++_i854)
        {
          _elem853 = new org.apache.doris.thrift.TExpr();
          _elem853.read(iprot);
          struct.columns.add(_elem853);
        }
      }
      struct.setColumnsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list855 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.column_types = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(_list855.size);
        @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType _elem856;
        for (int _i857 = 0; _i857 < _list855.size; ++_i857)
        {
          _elem856 = new org.apache.doris.thrift.TColumnType();
          _elem856.read(iprot);
          struct.column_types.add(_elem856);
        }
      }
      struct.setColumnTypesIsSet(true);
      struct.output_tuple_id = iprot.readI32();
      struct.setOutputTupleIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

