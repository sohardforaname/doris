/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TGetJvmMemoryMetricsResponse implements org.apache.thrift.TBase<TGetJvmMemoryMetricsResponse, TGetJvmMemoryMetricsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetJvmMemoryMetricsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJvmMemoryMetricsResponse");

  private static final org.apache.thrift.protocol.TField MEMORY_POOLS_FIELD_DESC = new org.apache.thrift.protocol.TField("memory_pools", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField GC_NUM_WARN_THRESHOLD_EXCEEDED_FIELD_DESC = new org.apache.thrift.protocol.TField("gc_num_warn_threshold_exceeded", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField GC_NUM_INFO_THRESHOLD_EXCEEDED_FIELD_DESC = new org.apache.thrift.protocol.TField("gc_num_info_threshold_exceeded", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_FIELD_DESC = new org.apache.thrift.protocol.TField("gc_total_extra_sleep_time_millis", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField GC_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("gc_count", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField GC_TIME_MILLIS_FIELD_DESC = new org.apache.thrift.protocol.TField("gc_time_millis", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetJvmMemoryMetricsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetJvmMemoryMetricsResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TJvmMemoryPool> memory_pools; // required
  public long gc_num_warn_threshold_exceeded; // required
  public long gc_num_info_threshold_exceeded; // required
  public long gc_total_extra_sleep_time_millis; // required
  public long gc_count; // required
  public long gc_time_millis; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MEMORY_POOLS((short)1, "memory_pools"),
    GC_NUM_WARN_THRESHOLD_EXCEEDED((short)2, "gc_num_warn_threshold_exceeded"),
    GC_NUM_INFO_THRESHOLD_EXCEEDED((short)3, "gc_num_info_threshold_exceeded"),
    GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS((short)4, "gc_total_extra_sleep_time_millis"),
    GC_COUNT((short)5, "gc_count"),
    GC_TIME_MILLIS((short)6, "gc_time_millis");

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
        case 1: // MEMORY_POOLS
          return MEMORY_POOLS;
        case 2: // GC_NUM_WARN_THRESHOLD_EXCEEDED
          return GC_NUM_WARN_THRESHOLD_EXCEEDED;
        case 3: // GC_NUM_INFO_THRESHOLD_EXCEEDED
          return GC_NUM_INFO_THRESHOLD_EXCEEDED;
        case 4: // GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS
          return GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS;
        case 5: // GC_COUNT
          return GC_COUNT;
        case 6: // GC_TIME_MILLIS
          return GC_TIME_MILLIS;
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
  private static final int __GC_NUM_WARN_THRESHOLD_EXCEEDED_ISSET_ID = 0;
  private static final int __GC_NUM_INFO_THRESHOLD_EXCEEDED_ISSET_ID = 1;
  private static final int __GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_ISSET_ID = 2;
  private static final int __GC_COUNT_ISSET_ID = 3;
  private static final int __GC_TIME_MILLIS_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MEMORY_POOLS, new org.apache.thrift.meta_data.FieldMetaData("memory_pools", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TJvmMemoryPool.class))));
    tmpMap.put(_Fields.GC_NUM_WARN_THRESHOLD_EXCEEDED, new org.apache.thrift.meta_data.FieldMetaData("gc_num_warn_threshold_exceeded", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_NUM_INFO_THRESHOLD_EXCEEDED, new org.apache.thrift.meta_data.FieldMetaData("gc_num_info_threshold_exceeded", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS, new org.apache.thrift.meta_data.FieldMetaData("gc_total_extra_sleep_time_millis", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_COUNT, new org.apache.thrift.meta_data.FieldMetaData("gc_count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_TIME_MILLIS, new org.apache.thrift.meta_data.FieldMetaData("gc_time_millis", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJvmMemoryMetricsResponse.class, metaDataMap);
  }

  public TGetJvmMemoryMetricsResponse() {
  }

  public TGetJvmMemoryMetricsResponse(
    java.util.List<TJvmMemoryPool> memory_pools,
    long gc_num_warn_threshold_exceeded,
    long gc_num_info_threshold_exceeded,
    long gc_total_extra_sleep_time_millis,
    long gc_count,
    long gc_time_millis)
  {
    this();
    this.memory_pools = memory_pools;
    this.gc_num_warn_threshold_exceeded = gc_num_warn_threshold_exceeded;
    setGcNumWarnThresholdExceededIsSet(true);
    this.gc_num_info_threshold_exceeded = gc_num_info_threshold_exceeded;
    setGcNumInfoThresholdExceededIsSet(true);
    this.gc_total_extra_sleep_time_millis = gc_total_extra_sleep_time_millis;
    setGcTotalExtraSleepTimeMillisIsSet(true);
    this.gc_count = gc_count;
    setGcCountIsSet(true);
    this.gc_time_millis = gc_time_millis;
    setGcTimeMillisIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJvmMemoryMetricsResponse(TGetJvmMemoryMetricsResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMemoryPools()) {
      java.util.List<TJvmMemoryPool> __this__memory_pools = new java.util.ArrayList<TJvmMemoryPool>(other.memory_pools.size());
      for (TJvmMemoryPool other_element : other.memory_pools) {
        __this__memory_pools.add(new TJvmMemoryPool(other_element));
      }
      this.memory_pools = __this__memory_pools;
    }
    this.gc_num_warn_threshold_exceeded = other.gc_num_warn_threshold_exceeded;
    this.gc_num_info_threshold_exceeded = other.gc_num_info_threshold_exceeded;
    this.gc_total_extra_sleep_time_millis = other.gc_total_extra_sleep_time_millis;
    this.gc_count = other.gc_count;
    this.gc_time_millis = other.gc_time_millis;
  }

  @Override
  public TGetJvmMemoryMetricsResponse deepCopy() {
    return new TGetJvmMemoryMetricsResponse(this);
  }

  @Override
  public void clear() {
    this.memory_pools = null;
    setGcNumWarnThresholdExceededIsSet(false);
    this.gc_num_warn_threshold_exceeded = 0;
    setGcNumInfoThresholdExceededIsSet(false);
    this.gc_num_info_threshold_exceeded = 0;
    setGcTotalExtraSleepTimeMillisIsSet(false);
    this.gc_total_extra_sleep_time_millis = 0;
    setGcCountIsSet(false);
    this.gc_count = 0;
    setGcTimeMillisIsSet(false);
    this.gc_time_millis = 0;
  }

  public int getMemoryPoolsSize() {
    return (this.memory_pools == null) ? 0 : this.memory_pools.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TJvmMemoryPool> getMemoryPoolsIterator() {
    return (this.memory_pools == null) ? null : this.memory_pools.iterator();
  }

  public void addToMemoryPools(TJvmMemoryPool elem) {
    if (this.memory_pools == null) {
      this.memory_pools = new java.util.ArrayList<TJvmMemoryPool>();
    }
    this.memory_pools.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TJvmMemoryPool> getMemoryPools() {
    return this.memory_pools;
  }

  public TGetJvmMemoryMetricsResponse setMemoryPools(@org.apache.thrift.annotation.Nullable java.util.List<TJvmMemoryPool> memory_pools) {
    this.memory_pools = memory_pools;
    return this;
  }

  public void unsetMemoryPools() {
    this.memory_pools = null;
  }

  /** Returns true if field memory_pools is set (has been assigned a value) and false otherwise */
  public boolean isSetMemoryPools() {
    return this.memory_pools != null;
  }

  public void setMemoryPoolsIsSet(boolean value) {
    if (!value) {
      this.memory_pools = null;
    }
  }

  public long getGcNumWarnThresholdExceeded() {
    return this.gc_num_warn_threshold_exceeded;
  }

  public TGetJvmMemoryMetricsResponse setGcNumWarnThresholdExceeded(long gc_num_warn_threshold_exceeded) {
    this.gc_num_warn_threshold_exceeded = gc_num_warn_threshold_exceeded;
    setGcNumWarnThresholdExceededIsSet(true);
    return this;
  }

  public void unsetGcNumWarnThresholdExceeded() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GC_NUM_WARN_THRESHOLD_EXCEEDED_ISSET_ID);
  }

  /** Returns true if field gc_num_warn_threshold_exceeded is set (has been assigned a value) and false otherwise */
  public boolean isSetGcNumWarnThresholdExceeded() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GC_NUM_WARN_THRESHOLD_EXCEEDED_ISSET_ID);
  }

  public void setGcNumWarnThresholdExceededIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GC_NUM_WARN_THRESHOLD_EXCEEDED_ISSET_ID, value);
  }

  public long getGcNumInfoThresholdExceeded() {
    return this.gc_num_info_threshold_exceeded;
  }

  public TGetJvmMemoryMetricsResponse setGcNumInfoThresholdExceeded(long gc_num_info_threshold_exceeded) {
    this.gc_num_info_threshold_exceeded = gc_num_info_threshold_exceeded;
    setGcNumInfoThresholdExceededIsSet(true);
    return this;
  }

  public void unsetGcNumInfoThresholdExceeded() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GC_NUM_INFO_THRESHOLD_EXCEEDED_ISSET_ID);
  }

  /** Returns true if field gc_num_info_threshold_exceeded is set (has been assigned a value) and false otherwise */
  public boolean isSetGcNumInfoThresholdExceeded() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GC_NUM_INFO_THRESHOLD_EXCEEDED_ISSET_ID);
  }

  public void setGcNumInfoThresholdExceededIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GC_NUM_INFO_THRESHOLD_EXCEEDED_ISSET_ID, value);
  }

  public long getGcTotalExtraSleepTimeMillis() {
    return this.gc_total_extra_sleep_time_millis;
  }

  public TGetJvmMemoryMetricsResponse setGcTotalExtraSleepTimeMillis(long gc_total_extra_sleep_time_millis) {
    this.gc_total_extra_sleep_time_millis = gc_total_extra_sleep_time_millis;
    setGcTotalExtraSleepTimeMillisIsSet(true);
    return this;
  }

  public void unsetGcTotalExtraSleepTimeMillis() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_ISSET_ID);
  }

  /** Returns true if field gc_total_extra_sleep_time_millis is set (has been assigned a value) and false otherwise */
  public boolean isSetGcTotalExtraSleepTimeMillis() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_ISSET_ID);
  }

  public void setGcTotalExtraSleepTimeMillisIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_ISSET_ID, value);
  }

  public long getGcCount() {
    return this.gc_count;
  }

  public TGetJvmMemoryMetricsResponse setGcCount(long gc_count) {
    this.gc_count = gc_count;
    setGcCountIsSet(true);
    return this;
  }

  public void unsetGcCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GC_COUNT_ISSET_ID);
  }

  /** Returns true if field gc_count is set (has been assigned a value) and false otherwise */
  public boolean isSetGcCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GC_COUNT_ISSET_ID);
  }

  public void setGcCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GC_COUNT_ISSET_ID, value);
  }

  public long getGcTimeMillis() {
    return this.gc_time_millis;
  }

  public TGetJvmMemoryMetricsResponse setGcTimeMillis(long gc_time_millis) {
    this.gc_time_millis = gc_time_millis;
    setGcTimeMillisIsSet(true);
    return this;
  }

  public void unsetGcTimeMillis() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GC_TIME_MILLIS_ISSET_ID);
  }

  /** Returns true if field gc_time_millis is set (has been assigned a value) and false otherwise */
  public boolean isSetGcTimeMillis() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GC_TIME_MILLIS_ISSET_ID);
  }

  public void setGcTimeMillisIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GC_TIME_MILLIS_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MEMORY_POOLS:
      if (value == null) {
        unsetMemoryPools();
      } else {
        setMemoryPools((java.util.List<TJvmMemoryPool>)value);
      }
      break;

    case GC_NUM_WARN_THRESHOLD_EXCEEDED:
      if (value == null) {
        unsetGcNumWarnThresholdExceeded();
      } else {
        setGcNumWarnThresholdExceeded((java.lang.Long)value);
      }
      break;

    case GC_NUM_INFO_THRESHOLD_EXCEEDED:
      if (value == null) {
        unsetGcNumInfoThresholdExceeded();
      } else {
        setGcNumInfoThresholdExceeded((java.lang.Long)value);
      }
      break;

    case GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS:
      if (value == null) {
        unsetGcTotalExtraSleepTimeMillis();
      } else {
        setGcTotalExtraSleepTimeMillis((java.lang.Long)value);
      }
      break;

    case GC_COUNT:
      if (value == null) {
        unsetGcCount();
      } else {
        setGcCount((java.lang.Long)value);
      }
      break;

    case GC_TIME_MILLIS:
      if (value == null) {
        unsetGcTimeMillis();
      } else {
        setGcTimeMillis((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MEMORY_POOLS:
      return getMemoryPools();

    case GC_NUM_WARN_THRESHOLD_EXCEEDED:
      return getGcNumWarnThresholdExceeded();

    case GC_NUM_INFO_THRESHOLD_EXCEEDED:
      return getGcNumInfoThresholdExceeded();

    case GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS:
      return getGcTotalExtraSleepTimeMillis();

    case GC_COUNT:
      return getGcCount();

    case GC_TIME_MILLIS:
      return getGcTimeMillis();

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
    case MEMORY_POOLS:
      return isSetMemoryPools();
    case GC_NUM_WARN_THRESHOLD_EXCEEDED:
      return isSetGcNumWarnThresholdExceeded();
    case GC_NUM_INFO_THRESHOLD_EXCEEDED:
      return isSetGcNumInfoThresholdExceeded();
    case GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS:
      return isSetGcTotalExtraSleepTimeMillis();
    case GC_COUNT:
      return isSetGcCount();
    case GC_TIME_MILLIS:
      return isSetGcTimeMillis();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetJvmMemoryMetricsResponse)
      return this.equals((TGetJvmMemoryMetricsResponse)that);
    return false;
  }

  public boolean equals(TGetJvmMemoryMetricsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_memory_pools = true && this.isSetMemoryPools();
    boolean that_present_memory_pools = true && that.isSetMemoryPools();
    if (this_present_memory_pools || that_present_memory_pools) {
      if (!(this_present_memory_pools && that_present_memory_pools))
        return false;
      if (!this.memory_pools.equals(that.memory_pools))
        return false;
    }

    boolean this_present_gc_num_warn_threshold_exceeded = true;
    boolean that_present_gc_num_warn_threshold_exceeded = true;
    if (this_present_gc_num_warn_threshold_exceeded || that_present_gc_num_warn_threshold_exceeded) {
      if (!(this_present_gc_num_warn_threshold_exceeded && that_present_gc_num_warn_threshold_exceeded))
        return false;
      if (this.gc_num_warn_threshold_exceeded != that.gc_num_warn_threshold_exceeded)
        return false;
    }

    boolean this_present_gc_num_info_threshold_exceeded = true;
    boolean that_present_gc_num_info_threshold_exceeded = true;
    if (this_present_gc_num_info_threshold_exceeded || that_present_gc_num_info_threshold_exceeded) {
      if (!(this_present_gc_num_info_threshold_exceeded && that_present_gc_num_info_threshold_exceeded))
        return false;
      if (this.gc_num_info_threshold_exceeded != that.gc_num_info_threshold_exceeded)
        return false;
    }

    boolean this_present_gc_total_extra_sleep_time_millis = true;
    boolean that_present_gc_total_extra_sleep_time_millis = true;
    if (this_present_gc_total_extra_sleep_time_millis || that_present_gc_total_extra_sleep_time_millis) {
      if (!(this_present_gc_total_extra_sleep_time_millis && that_present_gc_total_extra_sleep_time_millis))
        return false;
      if (this.gc_total_extra_sleep_time_millis != that.gc_total_extra_sleep_time_millis)
        return false;
    }

    boolean this_present_gc_count = true;
    boolean that_present_gc_count = true;
    if (this_present_gc_count || that_present_gc_count) {
      if (!(this_present_gc_count && that_present_gc_count))
        return false;
      if (this.gc_count != that.gc_count)
        return false;
    }

    boolean this_present_gc_time_millis = true;
    boolean that_present_gc_time_millis = true;
    if (this_present_gc_time_millis || that_present_gc_time_millis) {
      if (!(this_present_gc_time_millis && that_present_gc_time_millis))
        return false;
      if (this.gc_time_millis != that.gc_time_millis)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMemoryPools()) ? 131071 : 524287);
    if (isSetMemoryPools())
      hashCode = hashCode * 8191 + memory_pools.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gc_num_warn_threshold_exceeded);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gc_num_info_threshold_exceeded);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gc_total_extra_sleep_time_millis);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gc_count);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gc_time_millis);

    return hashCode;
  }

  @Override
  public int compareTo(TGetJvmMemoryMetricsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMemoryPools(), other.isSetMemoryPools());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemoryPools()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memory_pools, other.memory_pools);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcNumWarnThresholdExceeded(), other.isSetGcNumWarnThresholdExceeded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcNumWarnThresholdExceeded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gc_num_warn_threshold_exceeded, other.gc_num_warn_threshold_exceeded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcNumInfoThresholdExceeded(), other.isSetGcNumInfoThresholdExceeded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcNumInfoThresholdExceeded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gc_num_info_threshold_exceeded, other.gc_num_info_threshold_exceeded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcTotalExtraSleepTimeMillis(), other.isSetGcTotalExtraSleepTimeMillis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcTotalExtraSleepTimeMillis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gc_total_extra_sleep_time_millis, other.gc_total_extra_sleep_time_millis);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcCount(), other.isSetGcCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gc_count, other.gc_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGcTimeMillis(), other.isSetGcTimeMillis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcTimeMillis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gc_time_millis, other.gc_time_millis);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetJvmMemoryMetricsResponse(");
    boolean first = true;

    sb.append("memory_pools:");
    if (this.memory_pools == null) {
      sb.append("null");
    } else {
      sb.append(this.memory_pools);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gc_num_warn_threshold_exceeded:");
    sb.append(this.gc_num_warn_threshold_exceeded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gc_num_info_threshold_exceeded:");
    sb.append(this.gc_num_info_threshold_exceeded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gc_total_extra_sleep_time_millis:");
    sb.append(this.gc_total_extra_sleep_time_millis);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gc_count:");
    sb.append(this.gc_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gc_time_millis:");
    sb.append(this.gc_time_millis);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (memory_pools == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'memory_pools' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'gc_num_warn_threshold_exceeded' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'gc_num_info_threshold_exceeded' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'gc_total_extra_sleep_time_millis' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'gc_count' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'gc_time_millis' because it's a primitive and you chose the non-beans generator.
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

  private static class TGetJvmMemoryMetricsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetJvmMemoryMetricsResponseStandardScheme getScheme() {
      return new TGetJvmMemoryMetricsResponseStandardScheme();
    }
  }

  private static class TGetJvmMemoryMetricsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetJvmMemoryMetricsResponse> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJvmMemoryMetricsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MEMORY_POOLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.memory_pools = new java.util.ArrayList<TJvmMemoryPool>(_list40.size);
                @org.apache.thrift.annotation.Nullable TJvmMemoryPool _elem41;
                for (int _i42 = 0; _i42 < _list40.size; ++_i42)
                {
                  _elem41 = new TJvmMemoryPool();
                  _elem41.read(iprot);
                  struct.memory_pools.add(_elem41);
                }
                iprot.readListEnd();
              }
              struct.setMemoryPoolsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GC_NUM_WARN_THRESHOLD_EXCEEDED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gc_num_warn_threshold_exceeded = iprot.readI64();
              struct.setGcNumWarnThresholdExceededIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GC_NUM_INFO_THRESHOLD_EXCEEDED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gc_num_info_threshold_exceeded = iprot.readI64();
              struct.setGcNumInfoThresholdExceededIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gc_total_extra_sleep_time_millis = iprot.readI64();
              struct.setGcTotalExtraSleepTimeMillisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GC_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gc_count = iprot.readI64();
              struct.setGcCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GC_TIME_MILLIS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gc_time_millis = iprot.readI64();
              struct.setGcTimeMillisIsSet(true);
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
      if (!struct.isSetGcNumWarnThresholdExceeded()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gc_num_warn_threshold_exceeded' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGcNumInfoThresholdExceeded()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gc_num_info_threshold_exceeded' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGcTotalExtraSleepTimeMillis()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gc_total_extra_sleep_time_millis' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGcCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gc_count' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGcTimeMillis()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gc_time_millis' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJvmMemoryMetricsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.memory_pools != null) {
        oprot.writeFieldBegin(MEMORY_POOLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.memory_pools.size()));
          for (TJvmMemoryPool _iter43 : struct.memory_pools)
          {
            _iter43.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GC_NUM_WARN_THRESHOLD_EXCEEDED_FIELD_DESC);
      oprot.writeI64(struct.gc_num_warn_threshold_exceeded);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_NUM_INFO_THRESHOLD_EXCEEDED_FIELD_DESC);
      oprot.writeI64(struct.gc_num_info_threshold_exceeded);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_TOTAL_EXTRA_SLEEP_TIME_MILLIS_FIELD_DESC);
      oprot.writeI64(struct.gc_total_extra_sleep_time_millis);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_COUNT_FIELD_DESC);
      oprot.writeI64(struct.gc_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_TIME_MILLIS_FIELD_DESC);
      oprot.writeI64(struct.gc_time_millis);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJvmMemoryMetricsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetJvmMemoryMetricsResponseTupleScheme getScheme() {
      return new TGetJvmMemoryMetricsResponseTupleScheme();
    }
  }

  private static class TGetJvmMemoryMetricsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetJvmMemoryMetricsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJvmMemoryMetricsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.memory_pools.size());
        for (TJvmMemoryPool _iter44 : struct.memory_pools)
        {
          _iter44.write(oprot);
        }
      }
      oprot.writeI64(struct.gc_num_warn_threshold_exceeded);
      oprot.writeI64(struct.gc_num_info_threshold_exceeded);
      oprot.writeI64(struct.gc_total_extra_sleep_time_millis);
      oprot.writeI64(struct.gc_count);
      oprot.writeI64(struct.gc_time_millis);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJvmMemoryMetricsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list45 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.memory_pools = new java.util.ArrayList<TJvmMemoryPool>(_list45.size);
        @org.apache.thrift.annotation.Nullable TJvmMemoryPool _elem46;
        for (int _i47 = 0; _i47 < _list45.size; ++_i47)
        {
          _elem46 = new TJvmMemoryPool();
          _elem46.read(iprot);
          struct.memory_pools.add(_elem46);
        }
      }
      struct.setMemoryPoolsIsSet(true);
      struct.gc_num_warn_threshold_exceeded = iprot.readI64();
      struct.setGcNumWarnThresholdExceededIsSet(true);
      struct.gc_num_info_threshold_exceeded = iprot.readI64();
      struct.setGcNumInfoThresholdExceededIsSet(true);
      struct.gc_total_extra_sleep_time_millis = iprot.readI64();
      struct.setGcTotalExtraSleepTimeMillisIsSet(true);
      struct.gc_count = iprot.readI64();
      struct.setGcCountIsSet(true);
      struct.gc_time_millis = iprot.readI64();
      struct.setGcTimeMillisIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

