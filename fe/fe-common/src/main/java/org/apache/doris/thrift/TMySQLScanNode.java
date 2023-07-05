/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TMySQLScanNode implements org.apache.thrift.TBase<TMySQLScanNode, TMySQLScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TMySQLScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMySQLScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FILTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("filters", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMySQLScanNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMySQLScanNodeTupleSchemeFactory();

  public int tuple_id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String table_name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> filters; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    TABLE_NAME((short)2, "table_name"),
    COLUMNS((short)3, "columns"),
    FILTERS((short)4, "filters");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // COLUMNS
          return COLUMNS;
        case 4: // FILTERS
          return FILTERS;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.FILTERS, new org.apache.thrift.meta_data.FieldMetaData("filters", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMySQLScanNode.class, metaDataMap);
  }

  public TMySQLScanNode() {
  }

  public TMySQLScanNode(
    int tuple_id,
    java.lang.String table_name,
    java.util.List<java.lang.String> columns,
    java.util.List<java.lang.String> filters)
  {
    this();
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    this.table_name = table_name;
    this.columns = columns;
    this.filters = filters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMySQLScanNode(TMySQLScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetTableName()) {
      this.table_name = other.table_name;
    }
    if (other.isSetColumns()) {
      java.util.List<java.lang.String> __this__columns = new java.util.ArrayList<java.lang.String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetFilters()) {
      java.util.List<java.lang.String> __this__filters = new java.util.ArrayList<java.lang.String>(other.filters);
      this.filters = __this__filters;
    }
  }

  @Override
  public TMySQLScanNode deepCopy() {
    return new TMySQLScanNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.table_name = null;
    this.columns = null;
    this.filters = null;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TMySQLScanNode setTupleId(int tuple_id) {
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    return this;
  }

  public void unsetTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.table_name;
  }

  public TMySQLScanNode setTableName(@org.apache.thrift.annotation.Nullable java.lang.String table_name) {
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

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(java.lang.String elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<java.lang.String>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumns() {
    return this.columns;
  }

  public TMySQLScanNode setColumns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns) {
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

  public int getFiltersSize() {
    return (this.filters == null) ? 0 : this.filters.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getFiltersIterator() {
    return (this.filters == null) ? null : this.filters.iterator();
  }

  public void addToFilters(java.lang.String elem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<java.lang.String>();
    }
    this.filters.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getFilters() {
    return this.filters;
  }

  public TMySQLScanNode setFilters(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> filters) {
    this.filters = filters;
    return this;
  }

  public void unsetFilters() {
    this.filters = null;
  }

  /** Returns true if field filters is set (has been assigned a value) and false otherwise */
  public boolean isSetFilters() {
    return this.filters != null;
  }

  public void setFiltersIsSet(boolean value) {
    if (!value) {
      this.filters = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<java.lang.String>)value);
      }
      break;

    case FILTERS:
      if (value == null) {
        unsetFilters();
      } else {
        setFilters((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case TABLE_NAME:
      return getTableName();

    case COLUMNS:
      return getColumns();

    case FILTERS:
      return getFilters();

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
    case TUPLE_ID:
      return isSetTupleId();
    case TABLE_NAME:
      return isSetTableName();
    case COLUMNS:
      return isSetColumns();
    case FILTERS:
      return isSetFilters();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMySQLScanNode)
      return this.equals((TMySQLScanNode)that);
    return false;
  }

  public boolean equals(TMySQLScanNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_filters = true && this.isSetFilters();
    boolean that_present_filters = true && that.isSetFilters();
    if (this_present_filters || that_present_filters) {
      if (!(this_present_filters && that_present_filters))
        return false;
      if (!this.filters.equals(that.filters))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetFilters()) ? 131071 : 524287);
    if (isSetFilters())
      hashCode = hashCode * 8191 + filters.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMySQLScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTupleId(), other.isSetTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.compare(isSetFilters(), other.isSetFilters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filters, other.filters);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMySQLScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("filters:");
    if (this.filters == null) {
      sb.append("null");
    } else {
      sb.append(this.filters);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
    if (table_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' was not present! Struct: " + toString());
    }
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    if (filters == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'filters' was not present! Struct: " + toString());
    }
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

  private static class TMySQLScanNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMySQLScanNodeStandardScheme getScheme() {
      return new TMySQLScanNodeStandardScheme();
    }
  }

  private static class TMySQLScanNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMySQLScanNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMySQLScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list272 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<java.lang.String>(_list272.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem273;
                for (int _i274 = 0; _i274 < _list272.size; ++_i274)
                {
                  _elem273 = iprot.readString();
                  struct.columns.add(_elem273);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FILTERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list275 = iprot.readListBegin();
                struct.filters = new java.util.ArrayList<java.lang.String>(_list275.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem276;
                for (int _i277 = 0; _i277 < _list275.size; ++_i277)
                {
                  _elem276 = iprot.readString();
                  struct.filters.add(_elem276);
                }
                iprot.readListEnd();
              }
              struct.setFiltersIsSet(true);
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
      if (!struct.isSetTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMySQLScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (java.lang.String _iter278 : struct.columns)
          {
            oprot.writeString(_iter278);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.filters != null) {
        oprot.writeFieldBegin(FILTERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.filters.size()));
          for (java.lang.String _iter279 : struct.filters)
          {
            oprot.writeString(_iter279);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMySQLScanNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMySQLScanNodeTupleScheme getScheme() {
      return new TMySQLScanNodeTupleScheme();
    }
  }

  private static class TMySQLScanNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMySQLScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMySQLScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      oprot.writeString(struct.table_name);
      {
        oprot.writeI32(struct.columns.size());
        for (java.lang.String _iter280 : struct.columns)
        {
          oprot.writeString(_iter280);
        }
      }
      {
        oprot.writeI32(struct.filters.size());
        for (java.lang.String _iter281 : struct.filters)
        {
          oprot.writeString(_iter281);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMySQLScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTupleIdIsSet(true);
      struct.table_name = iprot.readString();
      struct.setTableNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list282 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.columns = new java.util.ArrayList<java.lang.String>(_list282.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem283;
        for (int _i284 = 0; _i284 < _list282.size; ++_i284)
        {
          _elem283 = iprot.readString();
          struct.columns.add(_elem283);
        }
      }
      struct.setColumnsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list285 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.filters = new java.util.ArrayList<java.lang.String>(_list285.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem286;
        for (int _i287 = 0; _i287 < _list285.size; ++_i287)
        {
          _elem286 = iprot.readString();
          struct.filters.add(_elem286);
        }
      }
      struct.setFiltersIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

