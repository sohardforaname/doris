/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TTableIndexQueryStats implements org.apache.thrift.TBase<TTableIndexQueryStats, TTableIndexQueryStats._Fields>, java.io.Serializable, Cloneable, Comparable<TTableIndexQueryStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTableIndexQueryStats");

  private static final org.apache.thrift.protocol.TField INDEX_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("index_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("table_stats", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTableIndexQueryStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTableIndexQueryStatsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String index_name; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TTableQueryStats> table_stats; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX_NAME((short)1, "index_name"),
    TABLE_STATS((short)2, "table_stats");

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
        case 2: // TABLE_STATS
          return TABLE_STATS;
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
  private static final _Fields optionals[] = {_Fields.INDEX_NAME,_Fields.TABLE_STATS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX_NAME, new org.apache.thrift.meta_data.FieldMetaData("index_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_STATS, new org.apache.thrift.meta_data.FieldMetaData("table_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableQueryStats.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTableIndexQueryStats.class, metaDataMap);
  }

  public TTableIndexQueryStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTableIndexQueryStats(TTableIndexQueryStats other) {
    if (other.isSetIndexName()) {
      this.index_name = other.index_name;
    }
    if (other.isSetTableStats()) {
      java.util.List<TTableQueryStats> __this__table_stats = new java.util.ArrayList<TTableQueryStats>(other.table_stats.size());
      for (TTableQueryStats other_element : other.table_stats) {
        __this__table_stats.add(new TTableQueryStats(other_element));
      }
      this.table_stats = __this__table_stats;
    }
  }

  @Override
  public TTableIndexQueryStats deepCopy() {
    return new TTableIndexQueryStats(this);
  }

  @Override
  public void clear() {
    this.index_name = null;
    this.table_stats = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIndexName() {
    return this.index_name;
  }

  public TTableIndexQueryStats setIndexName(@org.apache.thrift.annotation.Nullable java.lang.String index_name) {
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

  public int getTableStatsSize() {
    return (this.table_stats == null) ? 0 : this.table_stats.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTableQueryStats> getTableStatsIterator() {
    return (this.table_stats == null) ? null : this.table_stats.iterator();
  }

  public void addToTableStats(TTableQueryStats elem) {
    if (this.table_stats == null) {
      this.table_stats = new java.util.ArrayList<TTableQueryStats>();
    }
    this.table_stats.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTableQueryStats> getTableStats() {
    return this.table_stats;
  }

  public TTableIndexQueryStats setTableStats(@org.apache.thrift.annotation.Nullable java.util.List<TTableQueryStats> table_stats) {
    this.table_stats = table_stats;
    return this;
  }

  public void unsetTableStats() {
    this.table_stats = null;
  }

  /** Returns true if field table_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetTableStats() {
    return this.table_stats != null;
  }

  public void setTableStatsIsSet(boolean value) {
    if (!value) {
      this.table_stats = null;
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

    case TABLE_STATS:
      if (value == null) {
        unsetTableStats();
      } else {
        setTableStats((java.util.List<TTableQueryStats>)value);
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

    case TABLE_STATS:
      return getTableStats();

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
    case TABLE_STATS:
      return isSetTableStats();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTableIndexQueryStats)
      return this.equals((TTableIndexQueryStats)that);
    return false;
  }

  public boolean equals(TTableIndexQueryStats that) {
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

    boolean this_present_table_stats = true && this.isSetTableStats();
    boolean that_present_table_stats = true && that.isSetTableStats();
    if (this_present_table_stats || that_present_table_stats) {
      if (!(this_present_table_stats && that_present_table_stats))
        return false;
      if (!this.table_stats.equals(that.table_stats))
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

    hashCode = hashCode * 8191 + ((isSetTableStats()) ? 131071 : 524287);
    if (isSetTableStats())
      hashCode = hashCode * 8191 + table_stats.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTableIndexQueryStats other) {
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
    lastComparison = java.lang.Boolean.compare(isSetTableStats(), other.isSetTableStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_stats, other.table_stats);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTableIndexQueryStats(");
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
    if (isSetTableStats()) {
      if (!first) sb.append(", ");
      sb.append("table_stats:");
      if (this.table_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.table_stats);
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

  private static class TTableIndexQueryStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTableIndexQueryStatsStandardScheme getScheme() {
      return new TTableIndexQueryStatsStandardScheme();
    }
  }

  private static class TTableIndexQueryStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTableIndexQueryStats> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTableIndexQueryStats struct) throws org.apache.thrift.TException {
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
          case 2: // TABLE_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list372 = iprot.readListBegin();
                struct.table_stats = new java.util.ArrayList<TTableQueryStats>(_list372.size);
                @org.apache.thrift.annotation.Nullable TTableQueryStats _elem373;
                for (int _i374 = 0; _i374 < _list372.size; ++_i374)
                {
                  _elem373 = new TTableQueryStats();
                  _elem373.read(iprot);
                  struct.table_stats.add(_elem373);
                }
                iprot.readListEnd();
              }
              struct.setTableStatsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTableIndexQueryStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.index_name != null) {
        if (struct.isSetIndexName()) {
          oprot.writeFieldBegin(INDEX_NAME_FIELD_DESC);
          oprot.writeString(struct.index_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table_stats != null) {
        if (struct.isSetTableStats()) {
          oprot.writeFieldBegin(TABLE_STATS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.table_stats.size()));
            for (TTableQueryStats _iter375 : struct.table_stats)
            {
              _iter375.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTableIndexQueryStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTableIndexQueryStatsTupleScheme getScheme() {
      return new TTableIndexQueryStatsTupleScheme();
    }
  }

  private static class TTableIndexQueryStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTableIndexQueryStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTableIndexQueryStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIndexName()) {
        optionals.set(0);
      }
      if (struct.isSetTableStats()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIndexName()) {
        oprot.writeString(struct.index_name);
      }
      if (struct.isSetTableStats()) {
        {
          oprot.writeI32(struct.table_stats.size());
          for (TTableQueryStats _iter376 : struct.table_stats)
          {
            _iter376.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTableIndexQueryStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.index_name = iprot.readString();
        struct.setIndexNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list377 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.table_stats = new java.util.ArrayList<TTableQueryStats>(_list377.size);
          @org.apache.thrift.annotation.Nullable TTableQueryStats _elem378;
          for (int _i379 = 0; _i379 < _list377.size; ++_i379)
          {
            _elem378 = new TTableQueryStats();
            _elem378.read(iprot);
            struct.table_stats.add(_elem378);
          }
        }
        struct.setTableStatsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

