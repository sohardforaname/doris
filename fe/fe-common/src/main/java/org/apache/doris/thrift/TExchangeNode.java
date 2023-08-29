/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TExchangeNode implements org.apache.thrift.TBase<TExchangeNode, TExchangeNode._Fields>, java.io.Serializable, Cloneable, Comparable<TExchangeNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExchangeNode");

  private static final org.apache.thrift.protocol.TField INPUT_ROW_TUPLES_FIELD_DESC = new org.apache.thrift.protocol.TField("input_row_tuples", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SORT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("sort_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TExchangeNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TExchangeNodeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> input_row_tuples; // required
  public @org.apache.thrift.annotation.Nullable TSortInfo sort_info; // optional
  public long offset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INPUT_ROW_TUPLES((short)1, "input_row_tuples"),
    SORT_INFO((short)2, "sort_info"),
    OFFSET((short)3, "offset");

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
        case 1: // INPUT_ROW_TUPLES
          return INPUT_ROW_TUPLES;
        case 2: // SORT_INFO
          return SORT_INFO;
        case 3: // OFFSET
          return OFFSET;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SORT_INFO,_Fields.OFFSET};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INPUT_ROW_TUPLES, new org.apache.thrift.meta_data.FieldMetaData("input_row_tuples", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "TTupleId"))));
    tmpMap.put(_Fields.SORT_INFO, new org.apache.thrift.meta_data.FieldMetaData("sort_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSortInfo.class)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExchangeNode.class, metaDataMap);
  }

  public TExchangeNode() {
  }

  public TExchangeNode(
    java.util.List<java.lang.Integer> input_row_tuples)
  {
    this();
    this.input_row_tuples = input_row_tuples;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExchangeNode(TExchangeNode other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetInputRowTuples()) {
      java.util.List<java.lang.Integer> __this__input_row_tuples = new java.util.ArrayList<java.lang.Integer>(other.input_row_tuples.size());
      for (java.lang.Integer other_element : other.input_row_tuples) {
        __this__input_row_tuples.add(other_element);
      }
      this.input_row_tuples = __this__input_row_tuples;
    }
    if (other.isSetSortInfo()) {
      this.sort_info = new TSortInfo(other.sort_info);
    }
    this.offset = other.offset;
  }

  @Override
  public TExchangeNode deepCopy() {
    return new TExchangeNode(this);
  }

  @Override
  public void clear() {
    this.input_row_tuples = null;
    this.sort_info = null;
    setOffsetIsSet(false);
    this.offset = 0;
  }

  public int getInputRowTuplesSize() {
    return (this.input_row_tuples == null) ? 0 : this.input_row_tuples.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getInputRowTuplesIterator() {
    return (this.input_row_tuples == null) ? null : this.input_row_tuples.iterator();
  }

  public void addToInputRowTuples(int elem) {
    if (this.input_row_tuples == null) {
      this.input_row_tuples = new java.util.ArrayList<java.lang.Integer>();
    }
    this.input_row_tuples.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getInputRowTuples() {
    return this.input_row_tuples;
  }

  public TExchangeNode setInputRowTuples(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> input_row_tuples) {
    this.input_row_tuples = input_row_tuples;
    return this;
  }

  public void unsetInputRowTuples() {
    this.input_row_tuples = null;
  }

  /** Returns true if field input_row_tuples is set (has been assigned a value) and false otherwise */
  public boolean isSetInputRowTuples() {
    return this.input_row_tuples != null;
  }

  public void setInputRowTuplesIsSet(boolean value) {
    if (!value) {
      this.input_row_tuples = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TSortInfo getSortInfo() {
    return this.sort_info;
  }

  public TExchangeNode setSortInfo(@org.apache.thrift.annotation.Nullable TSortInfo sort_info) {
    this.sort_info = sort_info;
    return this;
  }

  public void unsetSortInfo() {
    this.sort_info = null;
  }

  /** Returns true if field sort_info is set (has been assigned a value) and false otherwise */
  public boolean isSetSortInfo() {
    return this.sort_info != null;
  }

  public void setSortInfoIsSet(boolean value) {
    if (!value) {
      this.sort_info = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public TExchangeNode setOffset(long offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INPUT_ROW_TUPLES:
      if (value == null) {
        unsetInputRowTuples();
      } else {
        setInputRowTuples((java.util.List<java.lang.Integer>)value);
      }
      break;

    case SORT_INFO:
      if (value == null) {
        unsetSortInfo();
      } else {
        setSortInfo((TSortInfo)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INPUT_ROW_TUPLES:
      return getInputRowTuples();

    case SORT_INFO:
      return getSortInfo();

    case OFFSET:
      return getOffset();

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
    case INPUT_ROW_TUPLES:
      return isSetInputRowTuples();
    case SORT_INFO:
      return isSetSortInfo();
    case OFFSET:
      return isSetOffset();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TExchangeNode)
      return this.equals((TExchangeNode)that);
    return false;
  }

  public boolean equals(TExchangeNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_input_row_tuples = true && this.isSetInputRowTuples();
    boolean that_present_input_row_tuples = true && that.isSetInputRowTuples();
    if (this_present_input_row_tuples || that_present_input_row_tuples) {
      if (!(this_present_input_row_tuples && that_present_input_row_tuples))
        return false;
      if (!this.input_row_tuples.equals(that.input_row_tuples))
        return false;
    }

    boolean this_present_sort_info = true && this.isSetSortInfo();
    boolean that_present_sort_info = true && that.isSetSortInfo();
    if (this_present_sort_info || that_present_sort_info) {
      if (!(this_present_sort_info && that_present_sort_info))
        return false;
      if (!this.sort_info.equals(that.sort_info))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInputRowTuples()) ? 131071 : 524287);
    if (isSetInputRowTuples())
      hashCode = hashCode * 8191 + input_row_tuples.hashCode();

    hashCode = hashCode * 8191 + ((isSetSortInfo()) ? 131071 : 524287);
    if (isSetSortInfo())
      hashCode = hashCode * 8191 + sort_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(offset);

    return hashCode;
  }

  @Override
  public int compareTo(TExchangeNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetInputRowTuples(), other.isSetInputRowTuples());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputRowTuples()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input_row_tuples, other.input_row_tuples);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSortInfo(), other.isSetSortInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sort_info, other.sort_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOffset(), other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TExchangeNode(");
    boolean first = true;

    sb.append("input_row_tuples:");
    if (this.input_row_tuples == null) {
      sb.append("null");
    } else {
      sb.append(this.input_row_tuples);
    }
    first = false;
    if (isSetSortInfo()) {
      if (!first) sb.append(", ");
      sb.append("sort_info:");
      if (this.sort_info == null) {
        sb.append("null");
      } else {
        sb.append(this.sort_info);
      }
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (input_row_tuples == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'input_row_tuples' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (sort_info != null) {
      sort_info.validate();
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

  private static class TExchangeNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TExchangeNodeStandardScheme getScheme() {
      return new TExchangeNodeStandardScheme();
    }
  }

  private static class TExchangeNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TExchangeNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TExchangeNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INPUT_ROW_TUPLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list844 = iprot.readListBegin();
                struct.input_row_tuples = new java.util.ArrayList<java.lang.Integer>(_list844.size);
                int _elem845;
                for (int _i846 = 0; _i846 < _list844.size; ++_i846)
                {
                  _elem845 = iprot.readI32();
                  struct.input_row_tuples.add(_elem845);
                }
                iprot.readListEnd();
              }
              struct.setInputRowTuplesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SORT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sort_info = new TSortInfo();
              struct.sort_info.read(iprot);
              struct.setSortInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.offset = iprot.readI64();
              struct.setOffsetIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TExchangeNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.input_row_tuples != null) {
        oprot.writeFieldBegin(INPUT_ROW_TUPLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.input_row_tuples.size()));
          for (int _iter847 : struct.input_row_tuples)
          {
            oprot.writeI32(_iter847);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sort_info != null) {
        if (struct.isSetSortInfo()) {
          oprot.writeFieldBegin(SORT_INFO_FIELD_DESC);
          struct.sort_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI64(struct.offset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExchangeNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TExchangeNodeTupleScheme getScheme() {
      return new TExchangeNodeTupleScheme();
    }
  }

  private static class TExchangeNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TExchangeNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExchangeNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.input_row_tuples.size());
        for (int _iter848 : struct.input_row_tuples)
        {
          oprot.writeI32(_iter848);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSortInfo()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSortInfo()) {
        struct.sort_info.write(oprot);
      }
      if (struct.isSetOffset()) {
        oprot.writeI64(struct.offset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExchangeNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list849 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
        struct.input_row_tuples = new java.util.ArrayList<java.lang.Integer>(_list849.size);
        int _elem850;
        for (int _i851 = 0; _i851 < _list849.size; ++_i851)
        {
          _elem850 = iprot.readI32();
          struct.input_row_tuples.add(_elem850);
        }
      }
      struct.setInputRowTuplesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sort_info = new TSortInfo();
        struct.sort_info.read(iprot);
        struct.setSortInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.offset = iprot.readI64();
        struct.setOffsetIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

