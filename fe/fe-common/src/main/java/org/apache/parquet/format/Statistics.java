/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

/**
 * Statistics per row group and per page
 * All fields are optional.
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class Statistics implements org.apache.thrift.TBase<Statistics, Statistics._Fields>, java.io.Serializable, Cloneable, Comparable<Statistics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Statistics");

  private static final org.apache.thrift.protocol.TField MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("max", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MIN_FIELD_DESC = new org.apache.thrift.protocol.TField("min", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NULL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("null_count", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DISTINCT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("distinct_count", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField MAX_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("max_value", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MIN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("min_value", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StatisticsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StatisticsTupleSchemeFactory();

  /**
   * DEPRECATED: min and max value of the column. Use min_value and max_value.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   * 
   * These fields encode min and max values determined by signed comparison
   * only. New files should use the correct order for a column's logical type
   * and store the values in the min_value and max_value fields.
   * 
   * To support older readers, these may be set when the column order is
   * signed.
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer max; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer min; // optional
  /**
   * count of null value in the column
   */
  public long null_count; // optional
  /**
   * count of distinct values occurring
   */
  public long distinct_count; // optional
  /**
   * Min and max values for the column, determined by its ColumnOrder.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer max_value; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer min_value; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * DEPRECATED: min and max value of the column. Use min_value and max_value.
     * 
     * Values are encoded using PLAIN encoding, except that variable-length byte
     * arrays do not include a length prefix.
     * 
     * These fields encode min and max values determined by signed comparison
     * only. New files should use the correct order for a column's logical type
     * and store the values in the min_value and max_value fields.
     * 
     * To support older readers, these may be set when the column order is
     * signed.
     */
    MAX((short)1, "max"),
    MIN((short)2, "min"),
    /**
     * count of null value in the column
     */
    NULL_COUNT((short)3, "null_count"),
    /**
     * count of distinct values occurring
     */
    DISTINCT_COUNT((short)4, "distinct_count"),
    /**
     * Min and max values for the column, determined by its ColumnOrder.
     * 
     * Values are encoded using PLAIN encoding, except that variable-length byte
     * arrays do not include a length prefix.
     */
    MAX_VALUE((short)5, "max_value"),
    MIN_VALUE((short)6, "min_value");

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
        case 1: // MAX
          return MAX;
        case 2: // MIN
          return MIN;
        case 3: // NULL_COUNT
          return NULL_COUNT;
        case 4: // DISTINCT_COUNT
          return DISTINCT_COUNT;
        case 5: // MAX_VALUE
          return MAX_VALUE;
        case 6: // MIN_VALUE
          return MIN_VALUE;
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
  private static final int __NULL_COUNT_ISSET_ID = 0;
  private static final int __DISTINCT_COUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX,_Fields.MIN,_Fields.NULL_COUNT,_Fields.DISTINCT_COUNT,_Fields.MAX_VALUE,_Fields.MIN_VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX, new org.apache.thrift.meta_data.FieldMetaData("max", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MIN, new org.apache.thrift.meta_data.FieldMetaData("min", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.NULL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("null_count", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DISTINCT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("distinct_count", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_VALUE, new org.apache.thrift.meta_data.FieldMetaData("max_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MIN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("min_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Statistics.class, metaDataMap);
  }

  public Statistics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Statistics(Statistics other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMax()) {
      this.max = org.apache.thrift.TBaseHelper.copyBinary(other.max);
    }
    if (other.isSetMin()) {
      this.min = org.apache.thrift.TBaseHelper.copyBinary(other.min);
    }
    this.null_count = other.null_count;
    this.distinct_count = other.distinct_count;
    if (other.isSetMaxValue()) {
      this.max_value = org.apache.thrift.TBaseHelper.copyBinary(other.max_value);
    }
    if (other.isSetMinValue()) {
      this.min_value = org.apache.thrift.TBaseHelper.copyBinary(other.min_value);
    }
  }

  @Override
  public Statistics deepCopy() {
    return new Statistics(this);
  }

  @Override
  public void clear() {
    this.max = null;
    this.min = null;
    setNullCountIsSet(false);
    this.null_count = 0;
    setDistinctCountIsSet(false);
    this.distinct_count = 0;
    this.max_value = null;
    this.min_value = null;
  }

  /**
   * DEPRECATED: min and max value of the column. Use min_value and max_value.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   * 
   * These fields encode min and max values determined by signed comparison
   * only. New files should use the correct order for a column's logical type
   * and store the values in the min_value and max_value fields.
   * 
   * To support older readers, these may be set when the column order is
   * signed.
   */
  public byte[] getMax() {
    setMax(org.apache.thrift.TBaseHelper.rightSize(max));
    return max == null ? null : max.array();
  }

  public java.nio.ByteBuffer bufferForMax() {
    return org.apache.thrift.TBaseHelper.copyBinary(max);
  }

  /**
   * DEPRECATED: min and max value of the column. Use min_value and max_value.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   * 
   * These fields encode min and max values determined by signed comparison
   * only. New files should use the correct order for a column's logical type
   * and store the values in the min_value and max_value fields.
   * 
   * To support older readers, these may be set when the column order is
   * signed.
   */
  public Statistics setMax(byte[] max) {
    this.max = max == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(max.clone());
    return this;
  }

  public Statistics setMax(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer max) {
    this.max = org.apache.thrift.TBaseHelper.copyBinary(max);
    return this;
  }

  public void unsetMax() {
    this.max = null;
  }

  /** Returns true if field max is set (has been assigned a value) and false otherwise */
  public boolean isSetMax() {
    return this.max != null;
  }

  public void setMaxIsSet(boolean value) {
    if (!value) {
      this.max = null;
    }
  }

  public byte[] getMin() {
    setMin(org.apache.thrift.TBaseHelper.rightSize(min));
    return min == null ? null : min.array();
  }

  public java.nio.ByteBuffer bufferForMin() {
    return org.apache.thrift.TBaseHelper.copyBinary(min);
  }

  public Statistics setMin(byte[] min) {
    this.min = min == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(min.clone());
    return this;
  }

  public Statistics setMin(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer min) {
    this.min = org.apache.thrift.TBaseHelper.copyBinary(min);
    return this;
  }

  public void unsetMin() {
    this.min = null;
  }

  /** Returns true if field min is set (has been assigned a value) and false otherwise */
  public boolean isSetMin() {
    return this.min != null;
  }

  public void setMinIsSet(boolean value) {
    if (!value) {
      this.min = null;
    }
  }

  /**
   * count of null value in the column
   */
  public long getNullCount() {
    return this.null_count;
  }

  /**
   * count of null value in the column
   */
  public Statistics setNullCount(long null_count) {
    this.null_count = null_count;
    setNullCountIsSet(true);
    return this;
  }

  public void unsetNullCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NULL_COUNT_ISSET_ID);
  }

  /** Returns true if field null_count is set (has been assigned a value) and false otherwise */
  public boolean isSetNullCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NULL_COUNT_ISSET_ID);
  }

  public void setNullCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NULL_COUNT_ISSET_ID, value);
  }

  /**
   * count of distinct values occurring
   */
  public long getDistinctCount() {
    return this.distinct_count;
  }

  /**
   * count of distinct values occurring
   */
  public Statistics setDistinctCount(long distinct_count) {
    this.distinct_count = distinct_count;
    setDistinctCountIsSet(true);
    return this;
  }

  public void unsetDistinctCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISTINCT_COUNT_ISSET_ID);
  }

  /** Returns true if field distinct_count is set (has been assigned a value) and false otherwise */
  public boolean isSetDistinctCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISTINCT_COUNT_ISSET_ID);
  }

  public void setDistinctCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISTINCT_COUNT_ISSET_ID, value);
  }

  /**
   * Min and max values for the column, determined by its ColumnOrder.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   */
  public byte[] getMaxValue() {
    setMaxValue(org.apache.thrift.TBaseHelper.rightSize(max_value));
    return max_value == null ? null : max_value.array();
  }

  public java.nio.ByteBuffer bufferForMaxValue() {
    return org.apache.thrift.TBaseHelper.copyBinary(max_value);
  }

  /**
   * Min and max values for the column, determined by its ColumnOrder.
   * 
   * Values are encoded using PLAIN encoding, except that variable-length byte
   * arrays do not include a length prefix.
   */
  public Statistics setMaxValue(byte[] max_value) {
    this.max_value = max_value == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(max_value.clone());
    return this;
  }

  public Statistics setMaxValue(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer max_value) {
    this.max_value = org.apache.thrift.TBaseHelper.copyBinary(max_value);
    return this;
  }

  public void unsetMaxValue() {
    this.max_value = null;
  }

  /** Returns true if field max_value is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxValue() {
    return this.max_value != null;
  }

  public void setMaxValueIsSet(boolean value) {
    if (!value) {
      this.max_value = null;
    }
  }

  public byte[] getMinValue() {
    setMinValue(org.apache.thrift.TBaseHelper.rightSize(min_value));
    return min_value == null ? null : min_value.array();
  }

  public java.nio.ByteBuffer bufferForMinValue() {
    return org.apache.thrift.TBaseHelper.copyBinary(min_value);
  }

  public Statistics setMinValue(byte[] min_value) {
    this.min_value = min_value == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(min_value.clone());
    return this;
  }

  public Statistics setMinValue(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer min_value) {
    this.min_value = org.apache.thrift.TBaseHelper.copyBinary(min_value);
    return this;
  }

  public void unsetMinValue() {
    this.min_value = null;
  }

  /** Returns true if field min_value is set (has been assigned a value) and false otherwise */
  public boolean isSetMinValue() {
    return this.min_value != null;
  }

  public void setMinValueIsSet(boolean value) {
    if (!value) {
      this.min_value = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAX:
      if (value == null) {
        unsetMax();
      } else {
        if (value instanceof byte[]) {
          setMax((byte[])value);
        } else {
          setMax((java.nio.ByteBuffer)value);
        }
      }
      break;

    case MIN:
      if (value == null) {
        unsetMin();
      } else {
        if (value instanceof byte[]) {
          setMin((byte[])value);
        } else {
          setMin((java.nio.ByteBuffer)value);
        }
      }
      break;

    case NULL_COUNT:
      if (value == null) {
        unsetNullCount();
      } else {
        setNullCount((java.lang.Long)value);
      }
      break;

    case DISTINCT_COUNT:
      if (value == null) {
        unsetDistinctCount();
      } else {
        setDistinctCount((java.lang.Long)value);
      }
      break;

    case MAX_VALUE:
      if (value == null) {
        unsetMaxValue();
      } else {
        if (value instanceof byte[]) {
          setMaxValue((byte[])value);
        } else {
          setMaxValue((java.nio.ByteBuffer)value);
        }
      }
      break;

    case MIN_VALUE:
      if (value == null) {
        unsetMinValue();
      } else {
        if (value instanceof byte[]) {
          setMinValue((byte[])value);
        } else {
          setMinValue((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX:
      return getMax();

    case MIN:
      return getMin();

    case NULL_COUNT:
      return getNullCount();

    case DISTINCT_COUNT:
      return getDistinctCount();

    case MAX_VALUE:
      return getMaxValue();

    case MIN_VALUE:
      return getMinValue();

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
    case MAX:
      return isSetMax();
    case MIN:
      return isSetMin();
    case NULL_COUNT:
      return isSetNullCount();
    case DISTINCT_COUNT:
      return isSetDistinctCount();
    case MAX_VALUE:
      return isSetMaxValue();
    case MIN_VALUE:
      return isSetMinValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Statistics)
      return this.equals((Statistics)that);
    return false;
  }

  public boolean equals(Statistics that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_max = true && this.isSetMax();
    boolean that_present_max = true && that.isSetMax();
    if (this_present_max || that_present_max) {
      if (!(this_present_max && that_present_max))
        return false;
      if (!this.max.equals(that.max))
        return false;
    }

    boolean this_present_min = true && this.isSetMin();
    boolean that_present_min = true && that.isSetMin();
    if (this_present_min || that_present_min) {
      if (!(this_present_min && that_present_min))
        return false;
      if (!this.min.equals(that.min))
        return false;
    }

    boolean this_present_null_count = true && this.isSetNullCount();
    boolean that_present_null_count = true && that.isSetNullCount();
    if (this_present_null_count || that_present_null_count) {
      if (!(this_present_null_count && that_present_null_count))
        return false;
      if (this.null_count != that.null_count)
        return false;
    }

    boolean this_present_distinct_count = true && this.isSetDistinctCount();
    boolean that_present_distinct_count = true && that.isSetDistinctCount();
    if (this_present_distinct_count || that_present_distinct_count) {
      if (!(this_present_distinct_count && that_present_distinct_count))
        return false;
      if (this.distinct_count != that.distinct_count)
        return false;
    }

    boolean this_present_max_value = true && this.isSetMaxValue();
    boolean that_present_max_value = true && that.isSetMaxValue();
    if (this_present_max_value || that_present_max_value) {
      if (!(this_present_max_value && that_present_max_value))
        return false;
      if (!this.max_value.equals(that.max_value))
        return false;
    }

    boolean this_present_min_value = true && this.isSetMinValue();
    boolean that_present_min_value = true && that.isSetMinValue();
    if (this_present_min_value || that_present_min_value) {
      if (!(this_present_min_value && that_present_min_value))
        return false;
      if (!this.min_value.equals(that.min_value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMax()) ? 131071 : 524287);
    if (isSetMax())
      hashCode = hashCode * 8191 + max.hashCode();

    hashCode = hashCode * 8191 + ((isSetMin()) ? 131071 : 524287);
    if (isSetMin())
      hashCode = hashCode * 8191 + min.hashCode();

    hashCode = hashCode * 8191 + ((isSetNullCount()) ? 131071 : 524287);
    if (isSetNullCount())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(null_count);

    hashCode = hashCode * 8191 + ((isSetDistinctCount()) ? 131071 : 524287);
    if (isSetDistinctCount())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(distinct_count);

    hashCode = hashCode * 8191 + ((isSetMaxValue()) ? 131071 : 524287);
    if (isSetMaxValue())
      hashCode = hashCode * 8191 + max_value.hashCode();

    hashCode = hashCode * 8191 + ((isSetMinValue()) ? 131071 : 524287);
    if (isSetMinValue())
      hashCode = hashCode * 8191 + min_value.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Statistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMax(), other.isSetMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max, other.max);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMin(), other.isSetMin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min, other.min);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNullCount(), other.isSetNullCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.null_count, other.null_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDistinctCount(), other.isSetDistinctCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistinctCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.distinct_count, other.distinct_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMaxValue(), other.isSetMaxValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_value, other.max_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMinValue(), other.isSetMinValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min_value, other.min_value);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Statistics(");
    boolean first = true;

    if (isSetMax()) {
      sb.append("max:");
      if (this.max == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.max, sb);
      }
      first = false;
    }
    if (isSetMin()) {
      if (!first) sb.append(", ");
      sb.append("min:");
      if (this.min == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.min, sb);
      }
      first = false;
    }
    if (isSetNullCount()) {
      if (!first) sb.append(", ");
      sb.append("null_count:");
      sb.append(this.null_count);
      first = false;
    }
    if (isSetDistinctCount()) {
      if (!first) sb.append(", ");
      sb.append("distinct_count:");
      sb.append(this.distinct_count);
      first = false;
    }
    if (isSetMaxValue()) {
      if (!first) sb.append(", ");
      sb.append("max_value:");
      if (this.max_value == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.max_value, sb);
      }
      first = false;
    }
    if (isSetMinValue()) {
      if (!first) sb.append(", ");
      sb.append("min_value:");
      if (this.min_value == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.min_value, sb);
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

  private static class StatisticsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public StatisticsStandardScheme getScheme() {
      return new StatisticsStandardScheme();
    }
  }

  private static class StatisticsStandardScheme extends org.apache.thrift.scheme.StandardScheme<Statistics> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.max = iprot.readBinary();
              struct.setMaxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.min = iprot.readBinary();
              struct.setMinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NULL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.null_count = iprot.readI64();
              struct.setNullCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISTINCT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.distinct_count = iprot.readI64();
              struct.setDistinctCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.max_value = iprot.readBinary();
              struct.setMaxValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MIN_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.min_value = iprot.readBinary();
              struct.setMinValueIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, Statistics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.max != null) {
        if (struct.isSetMax()) {
          oprot.writeFieldBegin(MAX_FIELD_DESC);
          oprot.writeBinary(struct.max);
          oprot.writeFieldEnd();
        }
      }
      if (struct.min != null) {
        if (struct.isSetMin()) {
          oprot.writeFieldBegin(MIN_FIELD_DESC);
          oprot.writeBinary(struct.min);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNullCount()) {
        oprot.writeFieldBegin(NULL_COUNT_FIELD_DESC);
        oprot.writeI64(struct.null_count);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDistinctCount()) {
        oprot.writeFieldBegin(DISTINCT_COUNT_FIELD_DESC);
        oprot.writeI64(struct.distinct_count);
        oprot.writeFieldEnd();
      }
      if (struct.max_value != null) {
        if (struct.isSetMaxValue()) {
          oprot.writeFieldBegin(MAX_VALUE_FIELD_DESC);
          oprot.writeBinary(struct.max_value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.min_value != null) {
        if (struct.isSetMinValue()) {
          oprot.writeFieldBegin(MIN_VALUE_FIELD_DESC);
          oprot.writeBinary(struct.min_value);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatisticsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public StatisticsTupleScheme getScheme() {
      return new StatisticsTupleScheme();
    }
  }

  private static class StatisticsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Statistics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMax()) {
        optionals.set(0);
      }
      if (struct.isSetMin()) {
        optionals.set(1);
      }
      if (struct.isSetNullCount()) {
        optionals.set(2);
      }
      if (struct.isSetDistinctCount()) {
        optionals.set(3);
      }
      if (struct.isSetMaxValue()) {
        optionals.set(4);
      }
      if (struct.isSetMinValue()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMax()) {
        oprot.writeBinary(struct.max);
      }
      if (struct.isSetMin()) {
        oprot.writeBinary(struct.min);
      }
      if (struct.isSetNullCount()) {
        oprot.writeI64(struct.null_count);
      }
      if (struct.isSetDistinctCount()) {
        oprot.writeI64(struct.distinct_count);
      }
      if (struct.isSetMaxValue()) {
        oprot.writeBinary(struct.max_value);
      }
      if (struct.isSetMinValue()) {
        oprot.writeBinary(struct.min_value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Statistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.max = iprot.readBinary();
        struct.setMaxIsSet(true);
      }
      if (incoming.get(1)) {
        struct.min = iprot.readBinary();
        struct.setMinIsSet(true);
      }
      if (incoming.get(2)) {
        struct.null_count = iprot.readI64();
        struct.setNullCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.distinct_count = iprot.readI64();
        struct.setDistinctCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.max_value = iprot.readBinary();
        struct.setMaxValueIsSet(true);
      }
      if (incoming.get(5)) {
        struct.min_value = iprot.readBinary();
        struct.setMinValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

