/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TOlapTableIndex implements org.apache.thrift.TBase<TOlapTableIndex, TOlapTableIndex._Fields>, java.io.Serializable, Cloneable, Comparable<TOlapTableIndex> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOlapTableIndex");

  private static final org.apache.thrift.protocol.TField INDEX_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("index_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField INDEX_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("index_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField INDEX_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("index_id", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TOlapTableIndexStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TOlapTableIndexTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String index_name; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns; // optional
  /**
   * 
   * @see TIndexType
   */
  public @org.apache.thrift.annotation.Nullable TIndexType index_type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String comment; // optional
  public long index_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX_NAME((short)1, "index_name"),
    COLUMNS((short)2, "columns"),
    /**
     * 
     * @see TIndexType
     */
    INDEX_TYPE((short)3, "index_type"),
    COMMENT((short)4, "comment"),
    INDEX_ID((short)5, "index_id"),
    PROPERTIES((short)6, "properties");

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
        case 1: // INDEX_NAME
          return INDEX_NAME;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // INDEX_TYPE
          return INDEX_TYPE;
        case 4: // COMMENT
          return COMMENT;
        case 5: // INDEX_ID
          return INDEX_ID;
        case 6: // PROPERTIES
          return PROPERTIES;
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
  private static final int __INDEX_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INDEX_NAME,_Fields.COLUMNS,_Fields.INDEX_TYPE,_Fields.COMMENT,_Fields.INDEX_ID,_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX_NAME, new org.apache.thrift.meta_data.FieldMetaData("index_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.INDEX_TYPE, new org.apache.thrift.meta_data.FieldMetaData("index_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TIndexType.class)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEX_ID, new org.apache.thrift.meta_data.FieldMetaData("index_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOlapTableIndex.class, metaDataMap);
  }

  public TOlapTableIndex() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOlapTableIndex(TOlapTableIndex other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIndexName()) {
      this.index_name = other.index_name;
    }
    if (other.isSetColumns()) {
      java.util.List<java.lang.String> __this__columns = new java.util.ArrayList<java.lang.String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetIndexType()) {
      this.index_type = other.index_type;
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
    this.index_id = other.index_id;
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  @Override
  public TOlapTableIndex deepCopy() {
    return new TOlapTableIndex(this);
  }

  @Override
  public void clear() {
    this.index_name = null;
    this.columns = null;
    this.index_type = null;
    this.comment = null;
    setIndexIdIsSet(false);
    this.index_id = 0;
    this.properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIndexName() {
    return this.index_name;
  }

  public TOlapTableIndex setIndexName(@org.apache.thrift.annotation.Nullable java.lang.String index_name) {
    this.index_name = index_name;
    return this;
  }

  public void unsetIndexName() {
    this.index_name = null;
  }

  /** Returns true if field index_name is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexName() {
    return this.index_name != null;
  }

  public void setIndexNameIsSet(boolean value) {
    if (!value) {
      this.index_name = null;
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

  public TOlapTableIndex setColumns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns) {
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

  /**
   * 
   * @see TIndexType
   */
  @org.apache.thrift.annotation.Nullable
  public TIndexType getIndexType() {
    return this.index_type;
  }

  /**
   * 
   * @see TIndexType
   */
  public TOlapTableIndex setIndexType(@org.apache.thrift.annotation.Nullable TIndexType index_type) {
    this.index_type = index_type;
    return this;
  }

  public void unsetIndexType() {
    this.index_type = null;
  }

  /** Returns true if field index_type is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexType() {
    return this.index_type != null;
  }

  public void setIndexTypeIsSet(boolean value) {
    if (!value) {
      this.index_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getComment() {
    return this.comment;
  }

  public TOlapTableIndex setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public long getIndexId() {
    return this.index_id;
  }

  public TOlapTableIndex setIndexId(long index_id) {
    this.index_id = index_id;
    setIndexIdIsSet(true);
    return this;
  }

  public void unsetIndexId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  /** Returns true if field index_id is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  public void setIndexIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_ID_ISSET_ID, value);
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.properties == null) {
      this.properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.properties;
  }

  public TOlapTableIndex setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INDEX_NAME:
      if (value == null) {
        unsetIndexName();
      } else {
        setIndexName((java.lang.String)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<java.lang.String>)value);
      }
      break;

    case INDEX_TYPE:
      if (value == null) {
        unsetIndexType();
      } else {
        setIndexType((TIndexType)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((java.lang.String)value);
      }
      break;

    case INDEX_ID:
      if (value == null) {
        unsetIndexId();
      } else {
        setIndexId((java.lang.Long)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX_NAME:
      return getIndexName();

    case COLUMNS:
      return getColumns();

    case INDEX_TYPE:
      return getIndexType();

    case COMMENT:
      return getComment();

    case INDEX_ID:
      return getIndexId();

    case PROPERTIES:
      return getProperties();

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
    case INDEX_NAME:
      return isSetIndexName();
    case COLUMNS:
      return isSetColumns();
    case INDEX_TYPE:
      return isSetIndexType();
    case COMMENT:
      return isSetComment();
    case INDEX_ID:
      return isSetIndexId();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TOlapTableIndex)
      return this.equals((TOlapTableIndex)that);
    return false;
  }

  public boolean equals(TOlapTableIndex that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_index_name = true && this.isSetIndexName();
    boolean that_present_index_name = true && that.isSetIndexName();
    if (this_present_index_name || that_present_index_name) {
      if (!(this_present_index_name && that_present_index_name))
        return false;
      if (!this.index_name.equals(that.index_name))
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

    boolean this_present_index_type = true && this.isSetIndexType();
    boolean that_present_index_type = true && that.isSetIndexType();
    if (this_present_index_type || that_present_index_type) {
      if (!(this_present_index_type && that_present_index_type))
        return false;
      if (!this.index_type.equals(that.index_type))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    boolean this_present_index_id = true && this.isSetIndexId();
    boolean that_present_index_id = true && that.isSetIndexId();
    if (this_present_index_id || that_present_index_id) {
      if (!(this_present_index_id && that_present_index_id))
        return false;
      if (this.index_id != that.index_id)
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetIndexName()) ? 131071 : 524287);
    if (isSetIndexName())
      hashCode = hashCode * 8191 + index_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetIndexType()) ? 131071 : 524287);
    if (isSetIndexType())
      hashCode = hashCode * 8191 + index_type.getValue();

    hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
    if (isSetComment())
      hashCode = hashCode * 8191 + comment.hashCode();

    hashCode = hashCode * 8191 + ((isSetIndexId()) ? 131071 : 524287);
    if (isSetIndexId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(index_id);

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TOlapTableIndex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIndexName(), other.isSetIndexName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_name, other.index_name);
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
    lastComparison = java.lang.Boolean.compare(isSetIndexType(), other.isSetIndexType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_type, other.index_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetComment(), other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIndexId(), other.isSetIndexId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_id, other.index_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProperties(), other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TOlapTableIndex(");
    boolean first = true;

    if (isSetIndexName()) {
      sb.append("index_name:");
      if (this.index_name == null) {
        sb.append("null");
      } else {
        sb.append(this.index_name);
      }
      first = false;
    }
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetIndexType()) {
      if (!first) sb.append(", ");
      sb.append("index_type:");
      if (this.index_type == null) {
        sb.append("null");
      } else {
        sb.append(this.index_type);
      }
      first = false;
    }
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    if (isSetIndexId()) {
      if (!first) sb.append(", ");
      sb.append("index_id:");
      sb.append(this.index_id);
      first = false;
    }
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TOlapTableIndexStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TOlapTableIndexStandardScheme getScheme() {
      return new TOlapTableIndexStandardScheme();
    }
  }

  private static class TOlapTableIndexStandardScheme extends org.apache.thrift.scheme.StandardScheme<TOlapTableIndex> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TOlapTableIndex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INDEX_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.index_name = iprot.readString();
              struct.setIndexNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<java.lang.String>(_list80.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = iprot.readString();
                  struct.columns.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INDEX_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index_type = org.apache.doris.thrift.TIndexType.findByValue(iprot.readI32());
              struct.setIndexTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INDEX_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.index_id = iprot.readI64();
              struct.setIndexIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map83 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map83.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key84;
                @org.apache.thrift.annotation.Nullable java.lang.String _val85;
                for (int _i86 = 0; _i86 < _map83.size; ++_i86)
                {
                  _key84 = iprot.readString();
                  _val85 = iprot.readString();
                  struct.properties.put(_key84, _val85);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TOlapTableIndex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.index_name != null) {
        if (struct.isSetIndexName()) {
          oprot.writeFieldBegin(INDEX_NAME_FIELD_DESC);
          oprot.writeString(struct.index_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
            for (java.lang.String _iter87 : struct.columns)
            {
              oprot.writeString(_iter87);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.index_type != null) {
        if (struct.isSetIndexType()) {
          oprot.writeFieldBegin(INDEX_TYPE_FIELD_DESC);
          oprot.writeI32(struct.index_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.comment != null) {
        if (struct.isSetComment()) {
          oprot.writeFieldBegin(COMMENT_FIELD_DESC);
          oprot.writeString(struct.comment);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIndexId()) {
        oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
        oprot.writeI64(struct.index_id);
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter88 : struct.properties.entrySet())
            {
              oprot.writeString(_iter88.getKey());
              oprot.writeString(_iter88.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOlapTableIndexTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TOlapTableIndexTupleScheme getScheme() {
      return new TOlapTableIndexTupleScheme();
    }
  }

  private static class TOlapTableIndexTupleScheme extends org.apache.thrift.scheme.TupleScheme<TOlapTableIndex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOlapTableIndex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIndexName()) {
        optionals.set(0);
      }
      if (struct.isSetColumns()) {
        optionals.set(1);
      }
      if (struct.isSetIndexType()) {
        optionals.set(2);
      }
      if (struct.isSetComment()) {
        optionals.set(3);
      }
      if (struct.isSetIndexId()) {
        optionals.set(4);
      }
      if (struct.isSetProperties()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetIndexName()) {
        oprot.writeString(struct.index_name);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (java.lang.String _iter89 : struct.columns)
          {
            oprot.writeString(_iter89);
          }
        }
      }
      if (struct.isSetIndexType()) {
        oprot.writeI32(struct.index_type.getValue());
      }
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
      if (struct.isSetIndexId()) {
        oprot.writeI64(struct.index_id);
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter90 : struct.properties.entrySet())
          {
            oprot.writeString(_iter90.getKey());
            oprot.writeString(_iter90.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOlapTableIndex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.index_name = iprot.readString();
        struct.setIndexNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list91 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.columns = new java.util.ArrayList<java.lang.String>(_list91.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem92;
          for (int _i93 = 0; _i93 < _list91.size; ++_i93)
          {
            _elem92 = iprot.readString();
            struct.columns.add(_elem92);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.index_type = org.apache.doris.thrift.TIndexType.findByValue(iprot.readI32());
        struct.setIndexTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
      if (incoming.get(4)) {
        struct.index_id = iprot.readI64();
        struct.setIndexIdIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map94 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map94.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key95;
          @org.apache.thrift.annotation.Nullable java.lang.String _val96;
          for (int _i97 = 0; _i97 < _map94.size; ++_i97)
          {
            _key95 = iprot.readString();
            _val96 = iprot.readString();
            struct.properties.put(_key95, _val96);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

