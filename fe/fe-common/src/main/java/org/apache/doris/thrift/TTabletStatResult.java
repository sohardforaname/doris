/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TTabletStatResult implements org.apache.thrift.TBase<TTabletStatResult, TTabletStatResult._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletStatResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletStatResult");

  private static final org.apache.thrift.protocol.TField TABLETS_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("tablets_stats", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField TABLET_STAT_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_stat_list", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletStatResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletStatResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Long,TTabletStat> tablets_stats; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TTabletStat> tablet_stat_list; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLETS_STATS((short)1, "tablets_stats"),
    TABLET_STAT_LIST((short)2, "tablet_stat_list");

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
        case 1: // TABLETS_STATS
          return TABLETS_STATS;
        case 2: // TABLET_STAT_LIST
          return TABLET_STAT_LIST;
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
  private static final _Fields optionals[] = {_Fields.TABLET_STAT_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLETS_STATS, new org.apache.thrift.meta_data.FieldMetaData("tablets_stats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletStat.class))));
    tmpMap.put(_Fields.TABLET_STAT_LIST, new org.apache.thrift.meta_data.FieldMetaData("tablet_stat_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletStat.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletStatResult.class, metaDataMap);
  }

  public TTabletStatResult() {
  }

  public TTabletStatResult(
    java.util.Map<java.lang.Long,TTabletStat> tablets_stats)
  {
    this();
    this.tablets_stats = tablets_stats;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletStatResult(TTabletStatResult other) {
    if (other.isSetTabletsStats()) {
      java.util.Map<java.lang.Long,TTabletStat> __this__tablets_stats = new java.util.HashMap<java.lang.Long,TTabletStat>(other.tablets_stats.size());
      for (java.util.Map.Entry<java.lang.Long, TTabletStat> other_element : other.tablets_stats.entrySet()) {

        java.lang.Long other_element_key = other_element.getKey();
        TTabletStat other_element_value = other_element.getValue();

        java.lang.Long __this__tablets_stats_copy_key = other_element_key;

        TTabletStat __this__tablets_stats_copy_value = new TTabletStat(other_element_value);

        __this__tablets_stats.put(__this__tablets_stats_copy_key, __this__tablets_stats_copy_value);
      }
      this.tablets_stats = __this__tablets_stats;
    }
    if (other.isSetTabletStatList()) {
      java.util.List<TTabletStat> __this__tablet_stat_list = new java.util.ArrayList<TTabletStat>(other.tablet_stat_list.size());
      for (TTabletStat other_element : other.tablet_stat_list) {
        __this__tablet_stat_list.add(new TTabletStat(other_element));
      }
      this.tablet_stat_list = __this__tablet_stat_list;
    }
  }

  @Override
  public TTabletStatResult deepCopy() {
    return new TTabletStatResult(this);
  }

  @Override
  public void clear() {
    this.tablets_stats = null;
    this.tablet_stat_list = null;
  }

  public int getTabletsStatsSize() {
    return (this.tablets_stats == null) ? 0 : this.tablets_stats.size();
  }

  public void putToTabletsStats(long key, TTabletStat val) {
    if (this.tablets_stats == null) {
      this.tablets_stats = new java.util.HashMap<java.lang.Long,TTabletStat>();
    }
    this.tablets_stats.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Long,TTabletStat> getTabletsStats() {
    return this.tablets_stats;
  }

  public TTabletStatResult setTabletsStats(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Long,TTabletStat> tablets_stats) {
    this.tablets_stats = tablets_stats;
    return this;
  }

  public void unsetTabletsStats() {
    this.tablets_stats = null;
  }

  /** Returns true if field tablets_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletsStats() {
    return this.tablets_stats != null;
  }

  public void setTabletsStatsIsSet(boolean value) {
    if (!value) {
      this.tablets_stats = null;
    }
  }

  public int getTabletStatListSize() {
    return (this.tablet_stat_list == null) ? 0 : this.tablet_stat_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTabletStat> getTabletStatListIterator() {
    return (this.tablet_stat_list == null) ? null : this.tablet_stat_list.iterator();
  }

  public void addToTabletStatList(TTabletStat elem) {
    if (this.tablet_stat_list == null) {
      this.tablet_stat_list = new java.util.ArrayList<TTabletStat>();
    }
    this.tablet_stat_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTabletStat> getTabletStatList() {
    return this.tablet_stat_list;
  }

  public TTabletStatResult setTabletStatList(@org.apache.thrift.annotation.Nullable java.util.List<TTabletStat> tablet_stat_list) {
    this.tablet_stat_list = tablet_stat_list;
    return this;
  }

  public void unsetTabletStatList() {
    this.tablet_stat_list = null;
  }

  /** Returns true if field tablet_stat_list is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletStatList() {
    return this.tablet_stat_list != null;
  }

  public void setTabletStatListIsSet(boolean value) {
    if (!value) {
      this.tablet_stat_list = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLETS_STATS:
      if (value == null) {
        unsetTabletsStats();
      } else {
        setTabletsStats((java.util.Map<java.lang.Long,TTabletStat>)value);
      }
      break;

    case TABLET_STAT_LIST:
      if (value == null) {
        unsetTabletStatList();
      } else {
        setTabletStatList((java.util.List<TTabletStat>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLETS_STATS:
      return getTabletsStats();

    case TABLET_STAT_LIST:
      return getTabletStatList();

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
    case TABLETS_STATS:
      return isSetTabletsStats();
    case TABLET_STAT_LIST:
      return isSetTabletStatList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletStatResult)
      return this.equals((TTabletStatResult)that);
    return false;
  }

  public boolean equals(TTabletStatResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tablets_stats = true && this.isSetTabletsStats();
    boolean that_present_tablets_stats = true && that.isSetTabletsStats();
    if (this_present_tablets_stats || that_present_tablets_stats) {
      if (!(this_present_tablets_stats && that_present_tablets_stats))
        return false;
      if (!this.tablets_stats.equals(that.tablets_stats))
        return false;
    }

    boolean this_present_tablet_stat_list = true && this.isSetTabletStatList();
    boolean that_present_tablet_stat_list = true && that.isSetTabletStatList();
    if (this_present_tablet_stat_list || that_present_tablet_stat_list) {
      if (!(this_present_tablet_stat_list && that_present_tablet_stat_list))
        return false;
      if (!this.tablet_stat_list.equals(that.tablet_stat_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTabletsStats()) ? 131071 : 524287);
    if (isSetTabletsStats())
      hashCode = hashCode * 8191 + tablets_stats.hashCode();

    hashCode = hashCode * 8191 + ((isSetTabletStatList()) ? 131071 : 524287);
    if (isSetTabletStatList())
      hashCode = hashCode * 8191 + tablet_stat_list.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTabletStatResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletsStats(), other.isSetTabletsStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletsStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablets_stats, other.tablets_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTabletStatList(), other.isSetTabletStatList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletStatList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_stat_list, other.tablet_stat_list);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletStatResult(");
    boolean first = true;

    sb.append("tablets_stats:");
    if (this.tablets_stats == null) {
      sb.append("null");
    } else {
      sb.append(this.tablets_stats);
    }
    first = false;
    if (isSetTabletStatList()) {
      if (!first) sb.append(", ");
      sb.append("tablet_stat_list:");
      if (this.tablet_stat_list == null) {
        sb.append("null");
      } else {
        sb.append(this.tablet_stat_list);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tablets_stats == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablets_stats' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTabletStatResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletStatResultStandardScheme getScheme() {
      return new TTabletStatResultStandardScheme();
    }
  }

  private static class TTabletStatResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletStatResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletStatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLETS_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.tablets_stats = new java.util.HashMap<java.lang.Long,TTabletStat>(2*_map0.size);
                long _key1;
                @org.apache.thrift.annotation.Nullable TTabletStat _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readI64();
                  _val2 = new TTabletStat();
                  _val2.read(iprot);
                  struct.tablets_stats.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setTabletsStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLET_STAT_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                struct.tablet_stat_list = new java.util.ArrayList<TTabletStat>(_list4.size);
                @org.apache.thrift.annotation.Nullable TTabletStat _elem5;
                for (int _i6 = 0; _i6 < _list4.size; ++_i6)
                {
                  _elem5 = new TTabletStat();
                  _elem5.read(iprot);
                  struct.tablet_stat_list.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setTabletStatListIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletStatResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tablets_stats != null) {
        oprot.writeFieldBegin(TABLETS_STATS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, struct.tablets_stats.size()));
          for (java.util.Map.Entry<java.lang.Long, TTabletStat> _iter7 : struct.tablets_stats.entrySet())
          {
            oprot.writeI64(_iter7.getKey());
            _iter7.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tablet_stat_list != null) {
        if (struct.isSetTabletStatList()) {
          oprot.writeFieldBegin(TABLET_STAT_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tablet_stat_list.size()));
            for (TTabletStat _iter8 : struct.tablet_stat_list)
            {
              _iter8.write(oprot);
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

  private static class TTabletStatResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletStatResultTupleScheme getScheme() {
      return new TTabletStatResultTupleScheme();
    }
  }

  private static class TTabletStatResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletStatResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletStatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tablets_stats.size());
        for (java.util.Map.Entry<java.lang.Long, TTabletStat> _iter9 : struct.tablets_stats.entrySet())
        {
          oprot.writeI64(_iter9.getKey());
          _iter9.getValue().write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTabletStatList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTabletStatList()) {
        {
          oprot.writeI32(struct.tablet_stat_list.size());
          for (TTabletStat _iter10 : struct.tablet_stat_list)
          {
            _iter10.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletStatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map11 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT); 
        struct.tablets_stats = new java.util.HashMap<java.lang.Long,TTabletStat>(2*_map11.size);
        long _key12;
        @org.apache.thrift.annotation.Nullable TTabletStat _val13;
        for (int _i14 = 0; _i14 < _map11.size; ++_i14)
        {
          _key12 = iprot.readI64();
          _val13 = new TTabletStat();
          _val13.read(iprot);
          struct.tablets_stats.put(_key12, _val13);
        }
      }
      struct.setTabletsStatsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list15 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.tablet_stat_list = new java.util.ArrayList<TTabletStat>(_list15.size);
          @org.apache.thrift.annotation.Nullable TTabletStat _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = new TTabletStat();
            _elem16.read(iprot);
            struct.tablet_stat_list.add(_elem16);
          }
        }
        struct.setTabletStatListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

