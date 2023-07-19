/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TIcebergMetadataParams implements org.apache.thrift.TBase<TIcebergMetadataParams, TIcebergMetadataParams._Fields>, java.io.Serializable, Cloneable, Comparable<TIcebergMetadataParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TIcebergMetadataParams");

  private static final org.apache.thrift.protocol.TField ICEBERG_QUERY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("iceberg_query_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TIcebergMetadataParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TIcebergMetadataParamsTupleSchemeFactory();

  /**
   * 
   * @see org.apache.doris.thrift.TIcebergQueryType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TIcebergQueryType iceberg_query_type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String catalog; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String database; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String table; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.doris.thrift.TIcebergQueryType
     */
    ICEBERG_QUERY_TYPE((short)1, "iceberg_query_type"),
    CATALOG((short)2, "catalog"),
    DATABASE((short)3, "database"),
    TABLE((short)4, "table");

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
        case 1: // ICEBERG_QUERY_TYPE
          return ICEBERG_QUERY_TYPE;
        case 2: // CATALOG
          return CATALOG;
        case 3: // DATABASE
          return DATABASE;
        case 4: // TABLE
          return TABLE;
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
  private static final _Fields optionals[] = {_Fields.ICEBERG_QUERY_TYPE,_Fields.CATALOG,_Fields.DATABASE,_Fields.TABLE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ICEBERG_QUERY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("iceberg_query_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TIcebergQueryType.class)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TIcebergMetadataParams.class, metaDataMap);
  }

  public TIcebergMetadataParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TIcebergMetadataParams(TIcebergMetadataParams other) {
    if (other.isSetIcebergQueryType()) {
      this.iceberg_query_type = other.iceberg_query_type;
    }
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    if (other.isSetTable()) {
      this.table = other.table;
    }
  }

  @Override
  public TIcebergMetadataParams deepCopy() {
    return new TIcebergMetadataParams(this);
  }

  @Override
  public void clear() {
    this.iceberg_query_type = null;
    this.catalog = null;
    this.database = null;
    this.table = null;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TIcebergQueryType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TIcebergQueryType getIcebergQueryType() {
    return this.iceberg_query_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TIcebergQueryType
   */
  public TIcebergMetadataParams setIcebergQueryType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TIcebergQueryType iceberg_query_type) {
    this.iceberg_query_type = iceberg_query_type;
    return this;
  }

  public void unsetIcebergQueryType() {
    this.iceberg_query_type = null;
  }

  /** Returns true if field iceberg_query_type is set (has been assigned a value) and false otherwise */
  public boolean isSetIcebergQueryType() {
    return this.iceberg_query_type != null;
  }

  public void setIcebergQueryTypeIsSet(boolean value) {
    if (!value) {
      this.iceberg_query_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalog() {
    return this.catalog;
  }

  public TIcebergMetadataParams setCatalog(@org.apache.thrift.annotation.Nullable java.lang.String catalog) {
    this.catalog = catalog;
    return this;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDatabase() {
    return this.database;
  }

  public TIcebergMetadataParams setDatabase(@org.apache.thrift.annotation.Nullable java.lang.String database) {
    this.database = database;
    return this;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable() {
    return this.table;
  }

  public TIcebergMetadataParams setTable(@org.apache.thrift.annotation.Nullable java.lang.String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ICEBERG_QUERY_TYPE:
      if (value == null) {
        unsetIcebergQueryType();
      } else {
        setIcebergQueryType((org.apache.doris.thrift.TIcebergQueryType)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((java.lang.String)value);
      }
      break;

    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((java.lang.String)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ICEBERG_QUERY_TYPE:
      return getIcebergQueryType();

    case CATALOG:
      return getCatalog();

    case DATABASE:
      return getDatabase();

    case TABLE:
      return getTable();

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
    case ICEBERG_QUERY_TYPE:
      return isSetIcebergQueryType();
    case CATALOG:
      return isSetCatalog();
    case DATABASE:
      return isSetDatabase();
    case TABLE:
      return isSetTable();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TIcebergMetadataParams)
      return this.equals((TIcebergMetadataParams)that);
    return false;
  }

  public boolean equals(TIcebergMetadataParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_iceberg_query_type = true && this.isSetIcebergQueryType();
    boolean that_present_iceberg_query_type = true && that.isSetIcebergQueryType();
    if (this_present_iceberg_query_type || that_present_iceberg_query_type) {
      if (!(this_present_iceberg_query_type && that_present_iceberg_query_type))
        return false;
      if (!this.iceberg_query_type.equals(that.iceberg_query_type))
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetIcebergQueryType()) ? 131071 : 524287);
    if (isSetIcebergQueryType())
      hashCode = hashCode * 8191 + iceberg_query_type.getValue();

    hashCode = hashCode * 8191 + ((isSetCatalog()) ? 131071 : 524287);
    if (isSetCatalog())
      hashCode = hashCode * 8191 + catalog.hashCode();

    hashCode = hashCode * 8191 + ((isSetDatabase()) ? 131071 : 524287);
    if (isSetDatabase())
      hashCode = hashCode * 8191 + database.hashCode();

    hashCode = hashCode * 8191 + ((isSetTable()) ? 131071 : 524287);
    if (isSetTable())
      hashCode = hashCode * 8191 + table.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TIcebergMetadataParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIcebergQueryType(), other.isSetIcebergQueryType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcebergQueryType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iceberg_query_type, other.iceberg_query_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalog(), other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDatabase(), other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable(), other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TIcebergMetadataParams(");
    boolean first = true;

    if (isSetIcebergQueryType()) {
      sb.append("iceberg_query_type:");
      if (this.iceberg_query_type == null) {
        sb.append("null");
      } else {
        sb.append(this.iceberg_query_type);
      }
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
      }
      first = false;
    }
    if (isSetDatabase()) {
      if (!first) sb.append(", ");
      sb.append("database:");
      if (this.database == null) {
        sb.append("null");
      } else {
        sb.append(this.database);
      }
      first = false;
    }
    if (isSetTable()) {
      if (!first) sb.append(", ");
      sb.append("table:");
      if (this.table == null) {
        sb.append("null");
      } else {
        sb.append(this.table);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TIcebergMetadataParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TIcebergMetadataParamsStandardScheme getScheme() {
      return new TIcebergMetadataParamsStandardScheme();
    }
  }

  private static class TIcebergMetadataParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TIcebergMetadataParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TIcebergMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ICEBERG_QUERY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.iceberg_query_type = org.apache.doris.thrift.TIcebergQueryType.findByValue(iprot.readI32());
              struct.setIcebergQueryTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TIcebergMetadataParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.iceberg_query_type != null) {
        if (struct.isSetIcebergQueryType()) {
          oprot.writeFieldBegin(ICEBERG_QUERY_TYPE_FIELD_DESC);
          oprot.writeI32(struct.iceberg_query_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeString(struct.catalog);
          oprot.writeFieldEnd();
        }
      }
      if (struct.database != null) {
        if (struct.isSetDatabase()) {
          oprot.writeFieldBegin(DATABASE_FIELD_DESC);
          oprot.writeString(struct.database);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table != null) {
        if (struct.isSetTable()) {
          oprot.writeFieldBegin(TABLE_FIELD_DESC);
          oprot.writeString(struct.table);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TIcebergMetadataParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TIcebergMetadataParamsTupleScheme getScheme() {
      return new TIcebergMetadataParamsTupleScheme();
    }
  }

  private static class TIcebergMetadataParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TIcebergMetadataParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TIcebergMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIcebergQueryType()) {
        optionals.set(0);
      }
      if (struct.isSetCatalog()) {
        optionals.set(1);
      }
      if (struct.isSetDatabase()) {
        optionals.set(2);
      }
      if (struct.isSetTable()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIcebergQueryType()) {
        oprot.writeI32(struct.iceberg_query_type.getValue());
      }
      if (struct.isSetCatalog()) {
        oprot.writeString(struct.catalog);
      }
      if (struct.isSetDatabase()) {
        oprot.writeString(struct.database);
      }
      if (struct.isSetTable()) {
        oprot.writeString(struct.table);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TIcebergMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.iceberg_query_type = org.apache.doris.thrift.TIcebergQueryType.findByValue(iprot.readI32());
        struct.setIcebergQueryTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.catalog = iprot.readString();
        struct.setCatalogIsSet(true);
      }
      if (incoming.get(2)) {
        struct.database = iprot.readString();
        struct.setDatabaseIsSet(true);
      }
      if (incoming.get(3)) {
        struct.table = iprot.readString();
        struct.setTableIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

