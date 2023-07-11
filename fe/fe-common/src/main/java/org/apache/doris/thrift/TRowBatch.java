/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TRowBatch implements org.apache.thrift.TBase<TRowBatch, TRowBatch._Fields>, java.io.Serializable, Cloneable, Comparable<TRowBatch> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRowBatch");

  private static final org.apache.thrift.protocol.TField NUM_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_rows", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ROW_TUPLES_FIELD_DESC = new org.apache.thrift.protocol.TField("row_tuples", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TUPLE_OFFSETS_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_offsets", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField TUPLE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_data", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IS_COMPRESSED_FIELD_DESC = new org.apache.thrift.protocol.TField("is_compressed", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField BE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("be_number", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField PACKET_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("packet_seq", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRowBatchStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRowBatchTupleSchemeFactory();

  public int num_rows; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> row_tuples; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tuple_offsets; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String tuple_data; // required
  public boolean is_compressed; // required
  public int be_number; // required
  public long packet_seq; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_ROWS((short)1, "num_rows"),
    ROW_TUPLES((short)2, "row_tuples"),
    TUPLE_OFFSETS((short)3, "tuple_offsets"),
    TUPLE_DATA((short)4, "tuple_data"),
    IS_COMPRESSED((short)5, "is_compressed"),
    BE_NUMBER((short)6, "be_number"),
    PACKET_SEQ((short)7, "packet_seq");

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
        case 1: // NUM_ROWS
          return NUM_ROWS;
        case 2: // ROW_TUPLES
          return ROW_TUPLES;
        case 3: // TUPLE_OFFSETS
          return TUPLE_OFFSETS;
        case 4: // TUPLE_DATA
          return TUPLE_DATA;
        case 5: // IS_COMPRESSED
          return IS_COMPRESSED;
        case 6: // BE_NUMBER
          return BE_NUMBER;
        case 7: // PACKET_SEQ
          return PACKET_SEQ;
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
  private static final int __NUM_ROWS_ISSET_ID = 0;
  private static final int __IS_COMPRESSED_ISSET_ID = 1;
  private static final int __BE_NUMBER_ISSET_ID = 2;
  private static final int __PACKET_SEQ_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_ROWS, new org.apache.thrift.meta_data.FieldMetaData("num_rows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ROW_TUPLES, new org.apache.thrift.meta_data.FieldMetaData("row_tuples", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "TTupleId"))));
    tmpMap.put(_Fields.TUPLE_OFFSETS, new org.apache.thrift.meta_data.FieldMetaData("tuple_offsets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.TUPLE_DATA, new org.apache.thrift.meta_data.FieldMetaData("tuple_data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_COMPRESSED, new org.apache.thrift.meta_data.FieldMetaData("is_compressed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("be_number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PACKET_SEQ, new org.apache.thrift.meta_data.FieldMetaData("packet_seq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRowBatch.class, metaDataMap);
  }

  public TRowBatch() {
  }

  public TRowBatch(
    int num_rows,
    java.util.List<java.lang.Integer> row_tuples,
    java.util.List<java.lang.Integer> tuple_offsets,
    java.lang.String tuple_data,
    boolean is_compressed,
    int be_number,
    long packet_seq)
  {
    this();
    this.num_rows = num_rows;
    setNumRowsIsSet(true);
    this.row_tuples = row_tuples;
    this.tuple_offsets = tuple_offsets;
    this.tuple_data = tuple_data;
    this.is_compressed = is_compressed;
    setIsCompressedIsSet(true);
    this.be_number = be_number;
    setBeNumberIsSet(true);
    this.packet_seq = packet_seq;
    setPacketSeqIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRowBatch(TRowBatch other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_rows = other.num_rows;
    if (other.isSetRowTuples()) {
      java.util.List<java.lang.Integer> __this__row_tuples = new java.util.ArrayList<java.lang.Integer>(other.row_tuples.size());
      for (java.lang.Integer other_element : other.row_tuples) {
        __this__row_tuples.add(other_element);
      }
      this.row_tuples = __this__row_tuples;
    }
    if (other.isSetTupleOffsets()) {
      java.util.List<java.lang.Integer> __this__tuple_offsets = new java.util.ArrayList<java.lang.Integer>(other.tuple_offsets);
      this.tuple_offsets = __this__tuple_offsets;
    }
    if (other.isSetTupleData()) {
      this.tuple_data = other.tuple_data;
    }
    this.is_compressed = other.is_compressed;
    this.be_number = other.be_number;
    this.packet_seq = other.packet_seq;
  }

  @Override
  public TRowBatch deepCopy() {
    return new TRowBatch(this);
  }

  @Override
  public void clear() {
    setNumRowsIsSet(false);
    this.num_rows = 0;
    this.row_tuples = null;
    this.tuple_offsets = null;
    this.tuple_data = null;
    setIsCompressedIsSet(false);
    this.is_compressed = false;
    setBeNumberIsSet(false);
    this.be_number = 0;
    setPacketSeqIsSet(false);
    this.packet_seq = 0;
  }

  public int getNumRows() {
    return this.num_rows;
  }

  public TRowBatch setNumRows(int num_rows) {
    this.num_rows = num_rows;
    setNumRowsIsSet(true);
    return this;
  }

  public void unsetNumRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_ROWS_ISSET_ID);
  }

  /** Returns true if field num_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetNumRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_ROWS_ISSET_ID);
  }

  public void setNumRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_ROWS_ISSET_ID, value);
  }

  public int getRowTuplesSize() {
    return (this.row_tuples == null) ? 0 : this.row_tuples.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getRowTuplesIterator() {
    return (this.row_tuples == null) ? null : this.row_tuples.iterator();
  }

  public void addToRowTuples(int elem) {
    if (this.row_tuples == null) {
      this.row_tuples = new java.util.ArrayList<java.lang.Integer>();
    }
    this.row_tuples.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getRowTuples() {
    return this.row_tuples;
  }

  public TRowBatch setRowTuples(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> row_tuples) {
    this.row_tuples = row_tuples;
    return this;
  }

  public void unsetRowTuples() {
    this.row_tuples = null;
  }

  /** Returns true if field row_tuples is set (has been assigned a value) and false otherwise */
  public boolean isSetRowTuples() {
    return this.row_tuples != null;
  }

  public void setRowTuplesIsSet(boolean value) {
    if (!value) {
      this.row_tuples = null;
    }
  }

  public int getTupleOffsetsSize() {
    return (this.tuple_offsets == null) ? 0 : this.tuple_offsets.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getTupleOffsetsIterator() {
    return (this.tuple_offsets == null) ? null : this.tuple_offsets.iterator();
  }

  public void addToTupleOffsets(int elem) {
    if (this.tuple_offsets == null) {
      this.tuple_offsets = new java.util.ArrayList<java.lang.Integer>();
    }
    this.tuple_offsets.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getTupleOffsets() {
    return this.tuple_offsets;
  }

  public TRowBatch setTupleOffsets(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tuple_offsets) {
    this.tuple_offsets = tuple_offsets;
    return this;
  }

  public void unsetTupleOffsets() {
    this.tuple_offsets = null;
  }

  /** Returns true if field tuple_offsets is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleOffsets() {
    return this.tuple_offsets != null;
  }

  public void setTupleOffsetsIsSet(boolean value) {
    if (!value) {
      this.tuple_offsets = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTupleData() {
    return this.tuple_data;
  }

  public TRowBatch setTupleData(@org.apache.thrift.annotation.Nullable java.lang.String tuple_data) {
    this.tuple_data = tuple_data;
    return this;
  }

  public void unsetTupleData() {
    this.tuple_data = null;
  }

  /** Returns true if field tuple_data is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleData() {
    return this.tuple_data != null;
  }

  public void setTupleDataIsSet(boolean value) {
    if (!value) {
      this.tuple_data = null;
    }
  }

  public boolean isIsCompressed() {
    return this.is_compressed;
  }

  public TRowBatch setIsCompressed(boolean is_compressed) {
    this.is_compressed = is_compressed;
    setIsCompressedIsSet(true);
    return this;
  }

  public void unsetIsCompressed() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_COMPRESSED_ISSET_ID);
  }

  /** Returns true if field is_compressed is set (has been assigned a value) and false otherwise */
  public boolean isSetIsCompressed() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_COMPRESSED_ISSET_ID);
  }

  public void setIsCompressedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_COMPRESSED_ISSET_ID, value);
  }

  public int getBeNumber() {
    return this.be_number;
  }

  public TRowBatch setBeNumber(int be_number) {
    this.be_number = be_number;
    setBeNumberIsSet(true);
    return this;
  }

  public void unsetBeNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BE_NUMBER_ISSET_ID);
  }

  /** Returns true if field be_number is set (has been assigned a value) and false otherwise */
  public boolean isSetBeNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BE_NUMBER_ISSET_ID);
  }

  public void setBeNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BE_NUMBER_ISSET_ID, value);
  }

  public long getPacketSeq() {
    return this.packet_seq;
  }

  public TRowBatch setPacketSeq(long packet_seq) {
    this.packet_seq = packet_seq;
    setPacketSeqIsSet(true);
    return this;
  }

  public void unsetPacketSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  /** Returns true if field packet_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetPacketSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  public void setPacketSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUM_ROWS:
      if (value == null) {
        unsetNumRows();
      } else {
        setNumRows((java.lang.Integer)value);
      }
      break;

    case ROW_TUPLES:
      if (value == null) {
        unsetRowTuples();
      } else {
        setRowTuples((java.util.List<java.lang.Integer>)value);
      }
      break;

    case TUPLE_OFFSETS:
      if (value == null) {
        unsetTupleOffsets();
      } else {
        setTupleOffsets((java.util.List<java.lang.Integer>)value);
      }
      break;

    case TUPLE_DATA:
      if (value == null) {
        unsetTupleData();
      } else {
        setTupleData((java.lang.String)value);
      }
      break;

    case IS_COMPRESSED:
      if (value == null) {
        unsetIsCompressed();
      } else {
        setIsCompressed((java.lang.Boolean)value);
      }
      break;

    case BE_NUMBER:
      if (value == null) {
        unsetBeNumber();
      } else {
        setBeNumber((java.lang.Integer)value);
      }
      break;

    case PACKET_SEQ:
      if (value == null) {
        unsetPacketSeq();
      } else {
        setPacketSeq((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_ROWS:
      return getNumRows();

    case ROW_TUPLES:
      return getRowTuples();

    case TUPLE_OFFSETS:
      return getTupleOffsets();

    case TUPLE_DATA:
      return getTupleData();

    case IS_COMPRESSED:
      return isIsCompressed();

    case BE_NUMBER:
      return getBeNumber();

    case PACKET_SEQ:
      return getPacketSeq();

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
    case NUM_ROWS:
      return isSetNumRows();
    case ROW_TUPLES:
      return isSetRowTuples();
    case TUPLE_OFFSETS:
      return isSetTupleOffsets();
    case TUPLE_DATA:
      return isSetTupleData();
    case IS_COMPRESSED:
      return isSetIsCompressed();
    case BE_NUMBER:
      return isSetBeNumber();
    case PACKET_SEQ:
      return isSetPacketSeq();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRowBatch)
      return this.equals((TRowBatch)that);
    return false;
  }

  public boolean equals(TRowBatch that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_num_rows = true;
    boolean that_present_num_rows = true;
    if (this_present_num_rows || that_present_num_rows) {
      if (!(this_present_num_rows && that_present_num_rows))
        return false;
      if (this.num_rows != that.num_rows)
        return false;
    }

    boolean this_present_row_tuples = true && this.isSetRowTuples();
    boolean that_present_row_tuples = true && that.isSetRowTuples();
    if (this_present_row_tuples || that_present_row_tuples) {
      if (!(this_present_row_tuples && that_present_row_tuples))
        return false;
      if (!this.row_tuples.equals(that.row_tuples))
        return false;
    }

    boolean this_present_tuple_offsets = true && this.isSetTupleOffsets();
    boolean that_present_tuple_offsets = true && that.isSetTupleOffsets();
    if (this_present_tuple_offsets || that_present_tuple_offsets) {
      if (!(this_present_tuple_offsets && that_present_tuple_offsets))
        return false;
      if (!this.tuple_offsets.equals(that.tuple_offsets))
        return false;
    }

    boolean this_present_tuple_data = true && this.isSetTupleData();
    boolean that_present_tuple_data = true && that.isSetTupleData();
    if (this_present_tuple_data || that_present_tuple_data) {
      if (!(this_present_tuple_data && that_present_tuple_data))
        return false;
      if (!this.tuple_data.equals(that.tuple_data))
        return false;
    }

    boolean this_present_is_compressed = true;
    boolean that_present_is_compressed = true;
    if (this_present_is_compressed || that_present_is_compressed) {
      if (!(this_present_is_compressed && that_present_is_compressed))
        return false;
      if (this.is_compressed != that.is_compressed)
        return false;
    }

    boolean this_present_be_number = true;
    boolean that_present_be_number = true;
    if (this_present_be_number || that_present_be_number) {
      if (!(this_present_be_number && that_present_be_number))
        return false;
      if (this.be_number != that.be_number)
        return false;
    }

    boolean this_present_packet_seq = true;
    boolean that_present_packet_seq = true;
    if (this_present_packet_seq || that_present_packet_seq) {
      if (!(this_present_packet_seq && that_present_packet_seq))
        return false;
      if (this.packet_seq != that.packet_seq)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + num_rows;

    hashCode = hashCode * 8191 + ((isSetRowTuples()) ? 131071 : 524287);
    if (isSetRowTuples())
      hashCode = hashCode * 8191 + row_tuples.hashCode();

    hashCode = hashCode * 8191 + ((isSetTupleOffsets()) ? 131071 : 524287);
    if (isSetTupleOffsets())
      hashCode = hashCode * 8191 + tuple_offsets.hashCode();

    hashCode = hashCode * 8191 + ((isSetTupleData()) ? 131071 : 524287);
    if (isSetTupleData())
      hashCode = hashCode * 8191 + tuple_data.hashCode();

    hashCode = hashCode * 8191 + ((is_compressed) ? 131071 : 524287);

    hashCode = hashCode * 8191 + be_number;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(packet_seq);

    return hashCode;
  }

  @Override
  public int compareTo(TRowBatch other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNumRows(), other.isSetNumRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_rows, other.num_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRowTuples(), other.isSetRowTuples());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowTuples()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row_tuples, other.row_tuples);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTupleOffsets(), other.isSetTupleOffsets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleOffsets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_offsets, other.tuple_offsets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTupleData(), other.isSetTupleData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_data, other.tuple_data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsCompressed(), other.isSetIsCompressed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsCompressed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_compressed, other.is_compressed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBeNumber(), other.isSetBeNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_number, other.be_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPacketSeq(), other.isSetPacketSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPacketSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packet_seq, other.packet_seq);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRowBatch(");
    boolean first = true;

    sb.append("num_rows:");
    sb.append(this.num_rows);
    first = false;
    if (!first) sb.append(", ");
    sb.append("row_tuples:");
    if (this.row_tuples == null) {
      sb.append("null");
    } else {
      sb.append(this.row_tuples);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tuple_offsets:");
    if (this.tuple_offsets == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple_offsets);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tuple_data:");
    if (this.tuple_data == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple_data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_compressed:");
    sb.append(this.is_compressed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("be_number:");
    sb.append(this.be_number);
    first = false;
    if (!first) sb.append(", ");
    sb.append("packet_seq:");
    sb.append(this.packet_seq);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_rows' because it's a primitive and you chose the non-beans generator.
    if (row_tuples == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row_tuples' was not present! Struct: " + toString());
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

  private static class TRowBatchStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TRowBatchStandardScheme getScheme() {
      return new TRowBatchStandardScheme();
    }
  }

  private static class TRowBatchStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRowBatch> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TRowBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_rows = iprot.readI32();
              struct.setNumRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROW_TUPLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.row_tuples = new java.util.ArrayList<java.lang.Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.row_tuples.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRowTuplesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TUPLE_OFFSETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.tuple_offsets = new java.util.ArrayList<java.lang.Integer>(_list3.size);
                int _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readI32();
                  struct.tuple_offsets.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setTupleOffsetsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TUPLE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tuple_data = iprot.readString();
              struct.setTupleDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_COMPRESSED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_compressed = iprot.readBool();
              struct.setIsCompressedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.be_number = iprot.readI32();
              struct.setBeNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PACKET_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.packet_seq = iprot.readI64();
              struct.setPacketSeqIsSet(true);
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
      if (!struct.isSetNumRows()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_rows' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TRowBatch struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_ROWS_FIELD_DESC);
      oprot.writeI32(struct.num_rows);
      oprot.writeFieldEnd();
      if (struct.row_tuples != null) {
        oprot.writeFieldBegin(ROW_TUPLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.row_tuples.size()));
          for (int _iter6 : struct.row_tuples)
          {
            oprot.writeI32(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tuple_offsets != null) {
        oprot.writeFieldBegin(TUPLE_OFFSETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tuple_offsets.size()));
          for (int _iter7 : struct.tuple_offsets)
          {
            oprot.writeI32(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tuple_data != null) {
        oprot.writeFieldBegin(TUPLE_DATA_FIELD_DESC);
        oprot.writeString(struct.tuple_data);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_COMPRESSED_FIELD_DESC);
      oprot.writeBool(struct.is_compressed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BE_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.be_number);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PACKET_SEQ_FIELD_DESC);
      oprot.writeI64(struct.packet_seq);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRowBatchTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TRowBatchTupleScheme getScheme() {
      return new TRowBatchTupleScheme();
    }
  }

  private static class TRowBatchTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRowBatch> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRowBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_rows);
      {
        oprot.writeI32(struct.row_tuples.size());
        for (int _iter8 : struct.row_tuples)
        {
          oprot.writeI32(_iter8);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTupleOffsets()) {
        optionals.set(0);
      }
      if (struct.isSetTupleData()) {
        optionals.set(1);
      }
      if (struct.isSetIsCompressed()) {
        optionals.set(2);
      }
      if (struct.isSetBeNumber()) {
        optionals.set(3);
      }
      if (struct.isSetPacketSeq()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTupleOffsets()) {
        {
          oprot.writeI32(struct.tuple_offsets.size());
          for (int _iter9 : struct.tuple_offsets)
          {
            oprot.writeI32(_iter9);
          }
        }
      }
      if (struct.isSetTupleData()) {
        oprot.writeString(struct.tuple_data);
      }
      if (struct.isSetIsCompressed()) {
        oprot.writeBool(struct.is_compressed);
      }
      if (struct.isSetBeNumber()) {
        oprot.writeI32(struct.be_number);
      }
      if (struct.isSetPacketSeq()) {
        oprot.writeI64(struct.packet_seq);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRowBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_rows = iprot.readI32();
      struct.setNumRowsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list10 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
        struct.row_tuples = new java.util.ArrayList<java.lang.Integer>(_list10.size);
        int _elem11;
        for (int _i12 = 0; _i12 < _list10.size; ++_i12)
        {
          _elem11 = iprot.readI32();
          struct.row_tuples.add(_elem11);
        }
      }
      struct.setRowTuplesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.tuple_offsets = new java.util.ArrayList<java.lang.Integer>(_list13.size);
          int _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readI32();
            struct.tuple_offsets.add(_elem14);
          }
        }
        struct.setTupleOffsetsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tuple_data = iprot.readString();
        struct.setTupleDataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.is_compressed = iprot.readBool();
        struct.setIsCompressedIsSet(true);
      }
      if (incoming.get(3)) {
        struct.be_number = iprot.readI32();
        struct.setBeNumberIsSet(true);
      }
      if (incoming.get(4)) {
        struct.packet_seq = iprot.readI64();
        struct.setPacketSeqIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

