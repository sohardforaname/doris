/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TSortNode implements org.apache.thrift.TBase<TSortNode, TSortNode._Fields>, java.io.Serializable, Cloneable, Comparable<TSortNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSortNode");

  private static final org.apache.thrift.protocol.TField SORT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("sort_info", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USE_TOP_N_FIELD_DESC = new org.apache.thrift.protocol.TField("use_top_n", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField IS_DEFAULT_LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("is_default_limit", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField USE_TOPN_OPT_FIELD_DESC = new org.apache.thrift.protocol.TField("use_topn_opt", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSortNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSortNodeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TSortInfo sort_info; // required
  public boolean use_top_n; // required
  public long offset; // optional
  public boolean is_default_limit; // optional
  public boolean use_topn_opt; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SORT_INFO((short)1, "sort_info"),
    USE_TOP_N((short)2, "use_top_n"),
    OFFSET((short)3, "offset"),
    IS_DEFAULT_LIMIT((short)6, "is_default_limit"),
    USE_TOPN_OPT((short)7, "use_topn_opt");

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
        case 1: // SORT_INFO
          return SORT_INFO;
        case 2: // USE_TOP_N
          return USE_TOP_N;
        case 3: // OFFSET
          return OFFSET;
        case 6: // IS_DEFAULT_LIMIT
          return IS_DEFAULT_LIMIT;
        case 7: // USE_TOPN_OPT
          return USE_TOPN_OPT;
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
  private static final int __USE_TOP_N_ISSET_ID = 0;
  private static final int __OFFSET_ISSET_ID = 1;
  private static final int __IS_DEFAULT_LIMIT_ISSET_ID = 2;
  private static final int __USE_TOPN_OPT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OFFSET,_Fields.IS_DEFAULT_LIMIT,_Fields.USE_TOPN_OPT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SORT_INFO, new org.apache.thrift.meta_data.FieldMetaData("sort_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSortInfo.class)));
    tmpMap.put(_Fields.USE_TOP_N, new org.apache.thrift.meta_data.FieldMetaData("use_top_n", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_DEFAULT_LIMIT, new org.apache.thrift.meta_data.FieldMetaData("is_default_limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.USE_TOPN_OPT, new org.apache.thrift.meta_data.FieldMetaData("use_topn_opt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSortNode.class, metaDataMap);
  }

  public TSortNode() {
  }

  public TSortNode(
    TSortInfo sort_info,
    boolean use_top_n)
  {
    this();
    this.sort_info = sort_info;
    this.use_top_n = use_top_n;
    setUseTopNIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSortNode(TSortNode other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSortInfo()) {
      this.sort_info = new TSortInfo(other.sort_info);
    }
    this.use_top_n = other.use_top_n;
    this.offset = other.offset;
    this.is_default_limit = other.is_default_limit;
    this.use_topn_opt = other.use_topn_opt;
  }

  @Override
  public TSortNode deepCopy() {
    return new TSortNode(this);
  }

  @Override
  public void clear() {
    this.sort_info = null;
    setUseTopNIsSet(false);
    this.use_top_n = false;
    setOffsetIsSet(false);
    this.offset = 0;
    setIsDefaultLimitIsSet(false);
    this.is_default_limit = false;
    setUseTopnOptIsSet(false);
    this.use_topn_opt = false;
  }

  @org.apache.thrift.annotation.Nullable
  public TSortInfo getSortInfo() {
    return this.sort_info;
  }

  public TSortNode setSortInfo(@org.apache.thrift.annotation.Nullable TSortInfo sort_info) {
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

  public boolean isUseTopN() {
    return this.use_top_n;
  }

  public TSortNode setUseTopN(boolean use_top_n) {
    this.use_top_n = use_top_n;
    setUseTopNIsSet(true);
    return this;
  }

  public void unsetUseTopN() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_TOP_N_ISSET_ID);
  }

  /** Returns true if field use_top_n is set (has been assigned a value) and false otherwise */
  public boolean isSetUseTopN() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_TOP_N_ISSET_ID);
  }

  public void setUseTopNIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_TOP_N_ISSET_ID, value);
  }

  public long getOffset() {
    return this.offset;
  }

  public TSortNode setOffset(long offset) {
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

  public boolean isIsDefaultLimit() {
    return this.is_default_limit;
  }

  public TSortNode setIsDefaultLimit(boolean is_default_limit) {
    this.is_default_limit = is_default_limit;
    setIsDefaultLimitIsSet(true);
    return this;
  }

  public void unsetIsDefaultLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_DEFAULT_LIMIT_ISSET_ID);
  }

  /** Returns true if field is_default_limit is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDefaultLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_DEFAULT_LIMIT_ISSET_ID);
  }

  public void setIsDefaultLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_DEFAULT_LIMIT_ISSET_ID, value);
  }

  public boolean isUseTopnOpt() {
    return this.use_topn_opt;
  }

  public TSortNode setUseTopnOpt(boolean use_topn_opt) {
    this.use_topn_opt = use_topn_opt;
    setUseTopnOptIsSet(true);
    return this;
  }

  public void unsetUseTopnOpt() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_TOPN_OPT_ISSET_ID);
  }

  /** Returns true if field use_topn_opt is set (has been assigned a value) and false otherwise */
  public boolean isSetUseTopnOpt() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_TOPN_OPT_ISSET_ID);
  }

  public void setUseTopnOptIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_TOPN_OPT_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SORT_INFO:
      if (value == null) {
        unsetSortInfo();
      } else {
        setSortInfo((TSortInfo)value);
      }
      break;

    case USE_TOP_N:
      if (value == null) {
        unsetUseTopN();
      } else {
        setUseTopN((java.lang.Boolean)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Long)value);
      }
      break;

    case IS_DEFAULT_LIMIT:
      if (value == null) {
        unsetIsDefaultLimit();
      } else {
        setIsDefaultLimit((java.lang.Boolean)value);
      }
      break;

    case USE_TOPN_OPT:
      if (value == null) {
        unsetUseTopnOpt();
      } else {
        setUseTopnOpt((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SORT_INFO:
      return getSortInfo();

    case USE_TOP_N:
      return isUseTopN();

    case OFFSET:
      return getOffset();

    case IS_DEFAULT_LIMIT:
      return isIsDefaultLimit();

    case USE_TOPN_OPT:
      return isUseTopnOpt();

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
    case SORT_INFO:
      return isSetSortInfo();
    case USE_TOP_N:
      return isSetUseTopN();
    case OFFSET:
      return isSetOffset();
    case IS_DEFAULT_LIMIT:
      return isSetIsDefaultLimit();
    case USE_TOPN_OPT:
      return isSetUseTopnOpt();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSortNode)
      return this.equals((TSortNode)that);
    return false;
  }

  public boolean equals(TSortNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sort_info = true && this.isSetSortInfo();
    boolean that_present_sort_info = true && that.isSetSortInfo();
    if (this_present_sort_info || that_present_sort_info) {
      if (!(this_present_sort_info && that_present_sort_info))
        return false;
      if (!this.sort_info.equals(that.sort_info))
        return false;
    }

    boolean this_present_use_top_n = true;
    boolean that_present_use_top_n = true;
    if (this_present_use_top_n || that_present_use_top_n) {
      if (!(this_present_use_top_n && that_present_use_top_n))
        return false;
      if (this.use_top_n != that.use_top_n)
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

    boolean this_present_is_default_limit = true && this.isSetIsDefaultLimit();
    boolean that_present_is_default_limit = true && that.isSetIsDefaultLimit();
    if (this_present_is_default_limit || that_present_is_default_limit) {
      if (!(this_present_is_default_limit && that_present_is_default_limit))
        return false;
      if (this.is_default_limit != that.is_default_limit)
        return false;
    }

    boolean this_present_use_topn_opt = true && this.isSetUseTopnOpt();
    boolean that_present_use_topn_opt = true && that.isSetUseTopnOpt();
    if (this_present_use_topn_opt || that_present_use_topn_opt) {
      if (!(this_present_use_topn_opt && that_present_use_topn_opt))
        return false;
      if (this.use_topn_opt != that.use_topn_opt)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSortInfo()) ? 131071 : 524287);
    if (isSetSortInfo())
      hashCode = hashCode * 8191 + sort_info.hashCode();

    hashCode = hashCode * 8191 + ((use_top_n) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(offset);

    hashCode = hashCode * 8191 + ((isSetIsDefaultLimit()) ? 131071 : 524287);
    if (isSetIsDefaultLimit())
      hashCode = hashCode * 8191 + ((is_default_limit) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetUseTopnOpt()) ? 131071 : 524287);
    if (isSetUseTopnOpt())
      hashCode = hashCode * 8191 + ((use_topn_opt) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TSortNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetUseTopN(), other.isSetUseTopN());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseTopN()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_top_n, other.use_top_n);
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
    lastComparison = java.lang.Boolean.compare(isSetIsDefaultLimit(), other.isSetIsDefaultLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDefaultLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_default_limit, other.is_default_limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUseTopnOpt(), other.isSetUseTopnOpt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseTopnOpt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_topn_opt, other.use_topn_opt);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSortNode(");
    boolean first = true;

    sb.append("sort_info:");
    if (this.sort_info == null) {
      sb.append("null");
    } else {
      sb.append(this.sort_info);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("use_top_n:");
    sb.append(this.use_top_n);
    first = false;
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetIsDefaultLimit()) {
      if (!first) sb.append(", ");
      sb.append("is_default_limit:");
      sb.append(this.is_default_limit);
      first = false;
    }
    if (isSetUseTopnOpt()) {
      if (!first) sb.append(", ");
      sb.append("use_topn_opt:");
      sb.append(this.use_topn_opt);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (sort_info == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sort_info' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'use_top_n' because it's a primitive and you chose the non-beans generator.
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

  private static class TSortNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSortNodeStandardScheme getScheme() {
      return new TSortNodeStandardScheme();
    }
  }

  private static class TSortNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSortNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SORT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sort_info = new TSortInfo();
              struct.sort_info.read(iprot);
              struct.setSortInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USE_TOP_N
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_top_n = iprot.readBool();
              struct.setUseTopNIsSet(true);
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
          case 6: // IS_DEFAULT_LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_default_limit = iprot.readBool();
              struct.setIsDefaultLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // USE_TOPN_OPT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_topn_opt = iprot.readBool();
              struct.setUseTopnOptIsSet(true);
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
      if (!struct.isSetUseTopN()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'use_top_n' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TSortNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sort_info != null) {
        oprot.writeFieldBegin(SORT_INFO_FIELD_DESC);
        struct.sort_info.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USE_TOP_N_FIELD_DESC);
      oprot.writeBool(struct.use_top_n);
      oprot.writeFieldEnd();
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI64(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsDefaultLimit()) {
        oprot.writeFieldBegin(IS_DEFAULT_LIMIT_FIELD_DESC);
        oprot.writeBool(struct.is_default_limit);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUseTopnOpt()) {
        oprot.writeFieldBegin(USE_TOPN_OPT_FIELD_DESC);
        oprot.writeBool(struct.use_topn_opt);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSortNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSortNodeTupleScheme getScheme() {
      return new TSortNodeTupleScheme();
    }
  }

  private static class TSortNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSortNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sort_info.write(oprot);
      oprot.writeBool(struct.use_top_n);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOffset()) {
        optionals.set(0);
      }
      if (struct.isSetIsDefaultLimit()) {
        optionals.set(1);
      }
      if (struct.isSetUseTopnOpt()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOffset()) {
        oprot.writeI64(struct.offset);
      }
      if (struct.isSetIsDefaultLimit()) {
        oprot.writeBool(struct.is_default_limit);
      }
      if (struct.isSetUseTopnOpt()) {
        oprot.writeBool(struct.use_topn_opt);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sort_info = new TSortInfo();
      struct.sort_info.read(iprot);
      struct.setSortInfoIsSet(true);
      struct.use_top_n = iprot.readBool();
      struct.setUseTopNIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.offset = iprot.readI64();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.is_default_limit = iprot.readBool();
        struct.setIsDefaultLimitIsSet(true);
      }
      if (incoming.get(2)) {
        struct.use_topn_opt = iprot.readBool();
        struct.setUseTopnOptIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

