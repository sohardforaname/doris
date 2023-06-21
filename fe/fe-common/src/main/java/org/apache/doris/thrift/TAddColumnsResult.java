/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TAddColumnsResult implements org.apache.thrift.TBase<TAddColumnsResult, TAddColumnsResult._Fields>, java.io.Serializable, Cloneable, Comparable<TAddColumnsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAddColumnsResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("table_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ALL_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("allColumns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField SCHEMA_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("schema_version", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAddColumnsResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAddColumnsResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public long table_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumn> allColumns; // optional
  public int schema_version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    TABLE_ID((short)2, "table_id"),
    ALL_COLUMNS((short)3, "allColumns"),
    SCHEMA_VERSION((short)4, "schema_version");

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
        case 1: // STATUS
          return STATUS;
        case 2: // TABLE_ID
          return TABLE_ID;
        case 3: // ALL_COLUMNS
          return ALL_COLUMNS;
        case 4: // SCHEMA_VERSION
          return SCHEMA_VERSION;
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
  private static final int __TABLE_ID_ISSET_ID = 0;
  private static final int __SCHEMA_VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.TABLE_ID,_Fields.ALL_COLUMNS,_Fields.SCHEMA_VERSION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("table_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ALL_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("allColumns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TColumn.class))));
    tmpMap.put(_Fields.SCHEMA_VERSION, new org.apache.thrift.meta_data.FieldMetaData("schema_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAddColumnsResult.class, metaDataMap);
  }

  public TAddColumnsResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAddColumnsResult(TAddColumnsResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    this.table_id = other.table_id;
    if (other.isSetAllColumns()) {
      java.util.List<org.apache.doris.thrift.TColumn> __this__allColumns = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(other.allColumns.size());
      for (org.apache.doris.thrift.TColumn other_element : other.allColumns) {
        __this__allColumns.add(new org.apache.doris.thrift.TColumn(other_element));
      }
      this.allColumns = __this__allColumns;
    }
    this.schema_version = other.schema_version;
  }

  @Override
  public TAddColumnsResult deepCopy() {
    return new TAddColumnsResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setTableIdIsSet(false);
    this.table_id = 0;
    this.allColumns = null;
    setSchemaVersionIsSet(false);
    this.schema_version = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TAddColumnsResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getTableId() {
    return this.table_id;
  }

  public TAddColumnsResult setTableId(long table_id) {
    this.table_id = table_id;
    setTableIdIsSet(true);
    return this;
  }

  public void unsetTableId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  /** Returns true if field table_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  public void setTableIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLE_ID_ISSET_ID, value);
  }

  public int getAllColumnsSize() {
    return (this.allColumns == null) ? 0 : this.allColumns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TColumn> getAllColumnsIterator() {
    return (this.allColumns == null) ? null : this.allColumns.iterator();
  }

  public void addToAllColumns(org.apache.doris.thrift.TColumn elem) {
    if (this.allColumns == null) {
      this.allColumns = new java.util.ArrayList<org.apache.doris.thrift.TColumn>();
    }
    this.allColumns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TColumn> getAllColumns() {
    return this.allColumns;
  }

  public TAddColumnsResult setAllColumns(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumn> allColumns) {
    this.allColumns = allColumns;
    return this;
  }

  public void unsetAllColumns() {
    this.allColumns = null;
  }

  /** Returns true if field allColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetAllColumns() {
    return this.allColumns != null;
  }

  public void setAllColumnsIsSet(boolean value) {
    if (!value) {
      this.allColumns = null;
    }
  }

  public int getSchemaVersion() {
    return this.schema_version;
  }

  public TAddColumnsResult setSchemaVersion(int schema_version) {
    this.schema_version = schema_version;
    setSchemaVersionIsSet(true);
    return this;
  }

  public void unsetSchemaVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCHEMA_VERSION_ISSET_ID);
  }

  /** Returns true if field schema_version is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCHEMA_VERSION_ISSET_ID);
  }

  public void setSchemaVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCHEMA_VERSION_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((java.lang.Long)value);
      }
      break;

    case ALL_COLUMNS:
      if (value == null) {
        unsetAllColumns();
      } else {
        setAllColumns((java.util.List<org.apache.doris.thrift.TColumn>)value);
      }
      break;

    case SCHEMA_VERSION:
      if (value == null) {
        unsetSchemaVersion();
      } else {
        setSchemaVersion((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TABLE_ID:
      return getTableId();

    case ALL_COLUMNS:
      return getAllColumns();

    case SCHEMA_VERSION:
      return getSchemaVersion();

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
    case STATUS:
      return isSetStatus();
    case TABLE_ID:
      return isSetTableId();
    case ALL_COLUMNS:
      return isSetAllColumns();
    case SCHEMA_VERSION:
      return isSetSchemaVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAddColumnsResult)
      return this.equals((TAddColumnsResult)that);
    return false;
  }

  public boolean equals(TAddColumnsResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_table_id = true && this.isSetTableId();
    boolean that_present_table_id = true && that.isSetTableId();
    if (this_present_table_id || that_present_table_id) {
      if (!(this_present_table_id && that_present_table_id))
        return false;
      if (this.table_id != that.table_id)
        return false;
    }

    boolean this_present_allColumns = true && this.isSetAllColumns();
    boolean that_present_allColumns = true && that.isSetAllColumns();
    if (this_present_allColumns || that_present_allColumns) {
      if (!(this_present_allColumns && that_present_allColumns))
        return false;
      if (!this.allColumns.equals(that.allColumns))
        return false;
    }

    boolean this_present_schema_version = true && this.isSetSchemaVersion();
    boolean that_present_schema_version = true && that.isSetSchemaVersion();
    if (this_present_schema_version || that_present_schema_version) {
      if (!(this_present_schema_version && that_present_schema_version))
        return false;
      if (this.schema_version != that.schema_version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableId()) ? 131071 : 524287);
    if (isSetTableId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(table_id);

    hashCode = hashCode * 8191 + ((isSetAllColumns()) ? 131071 : 524287);
    if (isSetAllColumns())
      hashCode = hashCode * 8191 + allColumns.hashCode();

    hashCode = hashCode * 8191 + ((isSetSchemaVersion()) ? 131071 : 524287);
    if (isSetSchemaVersion())
      hashCode = hashCode * 8191 + schema_version;

    return hashCode;
  }

  @Override
  public int compareTo(TAddColumnsResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableId(), other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_id, other.table_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAllColumns(), other.isSetAllColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allColumns, other.allColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchemaVersion(), other.isSetSchemaVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema_version, other.schema_version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAddColumnsResult(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetTableId()) {
      if (!first) sb.append(", ");
      sb.append("table_id:");
      sb.append(this.table_id);
      first = false;
    }
    if (isSetAllColumns()) {
      if (!first) sb.append(", ");
      sb.append("allColumns:");
      if (this.allColumns == null) {
        sb.append("null");
      } else {
        sb.append(this.allColumns);
      }
      first = false;
    }
    if (isSetSchemaVersion()) {
      if (!first) sb.append(", ");
      sb.append("schema_version:");
      sb.append(this.schema_version);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAddColumnsResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAddColumnsResultStandardScheme getScheme() {
      return new TAddColumnsResultStandardScheme();
    }
  }

  private static class TAddColumnsResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAddColumnsResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TAddColumnsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.table_id = iprot.readI64();
              struct.setTableIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALL_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list332 = iprot.readListBegin();
                struct.allColumns = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(_list332.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumn _elem333;
                for (int _i334 = 0; _i334 < _list332.size; ++_i334)
                {
                  _elem333 = new org.apache.doris.thrift.TColumn();
                  _elem333.read(iprot);
                  struct.allColumns.add(_elem333);
                }
                iprot.readListEnd();
              }
              struct.setAllColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCHEMA_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schema_version = iprot.readI32();
              struct.setSchemaVersionIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TAddColumnsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTableId()) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeI64(struct.table_id);
        oprot.writeFieldEnd();
      }
      if (struct.allColumns != null) {
        if (struct.isSetAllColumns()) {
          oprot.writeFieldBegin(ALL_COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.allColumns.size()));
            for (org.apache.doris.thrift.TColumn _iter335 : struct.allColumns)
            {
              _iter335.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSchemaVersion()) {
        oprot.writeFieldBegin(SCHEMA_VERSION_FIELD_DESC);
        oprot.writeI32(struct.schema_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAddColumnsResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAddColumnsResultTupleScheme getScheme() {
      return new TAddColumnsResultTupleScheme();
    }
  }

  private static class TAddColumnsResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAddColumnsResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAddColumnsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetTableId()) {
        optionals.set(1);
      }
      if (struct.isSetAllColumns()) {
        optionals.set(2);
      }
      if (struct.isSetSchemaVersion()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetTableId()) {
        oprot.writeI64(struct.table_id);
      }
      if (struct.isSetAllColumns()) {
        {
          oprot.writeI32(struct.allColumns.size());
          for (org.apache.doris.thrift.TColumn _iter336 : struct.allColumns)
          {
            _iter336.write(oprot);
          }
        }
      }
      if (struct.isSetSchemaVersion()) {
        oprot.writeI32(struct.schema_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAddColumnsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_id = iprot.readI64();
        struct.setTableIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list337 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.allColumns = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(_list337.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumn _elem338;
          for (int _i339 = 0; _i339 < _list337.size; ++_i339)
          {
            _elem338 = new org.apache.doris.thrift.TColumn();
            _elem338.read(iprot);
            struct.allColumns.add(_elem338);
          }
        }
        struct.setAllColumnsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.schema_version = iprot.readI32();
        struct.setSchemaVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

