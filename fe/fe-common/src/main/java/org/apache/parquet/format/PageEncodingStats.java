/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

/**
 * statistics of a given page type and encoding
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class PageEncodingStats implements org.apache.thrift.TBase<PageEncodingStats, PageEncodingStats._Fields>, java.io.Serializable, Cloneable, Comparable<PageEncodingStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PageEncodingStats");

  private static final org.apache.thrift.protocol.TField PAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("page_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("encoding", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PageEncodingStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PageEncodingStatsTupleSchemeFactory();

  /**
   * the page type (data/dic/...) *
   * 
   * @see PageType
   */
  public @org.apache.thrift.annotation.Nullable PageType page_type; // required
  /**
   * encoding of the page *
   * 
   * @see Encoding
   */
  public @org.apache.thrift.annotation.Nullable Encoding encoding; // required
  /**
   * number of pages of this type with this encoding *
   */
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the page type (data/dic/...) *
     * 
     * @see PageType
     */
    PAGE_TYPE((short)1, "page_type"),
    /**
     * encoding of the page *
     * 
     * @see Encoding
     */
    ENCODING((short)2, "encoding"),
    /**
     * number of pages of this type with this encoding *
     */
    COUNT((short)3, "count");

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
        case 1: // PAGE_TYPE
          return PAGE_TYPE;
        case 2: // ENCODING
          return ENCODING;
        case 3: // COUNT
          return COUNT;
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
  private static final int __COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("page_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PageType.class)));
    tmpMap.put(_Fields.ENCODING, new org.apache.thrift.meta_data.FieldMetaData("encoding", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Encoding.class)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PageEncodingStats.class, metaDataMap);
  }

  public PageEncodingStats() {
  }

  public PageEncodingStats(
    PageType page_type,
    Encoding encoding,
    int count)
  {
    this();
    this.page_type = page_type;
    this.encoding = encoding;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageEncodingStats(PageEncodingStats other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPageType()) {
      this.page_type = other.page_type;
    }
    if (other.isSetEncoding()) {
      this.encoding = other.encoding;
    }
    this.count = other.count;
  }

  @Override
  public PageEncodingStats deepCopy() {
    return new PageEncodingStats(this);
  }

  @Override
  public void clear() {
    this.page_type = null;
    this.encoding = null;
    setCountIsSet(false);
    this.count = 0;
  }

  /**
   * the page type (data/dic/...) *
   * 
   * @see PageType
   */
  @org.apache.thrift.annotation.Nullable
  public PageType getPageType() {
    return this.page_type;
  }

  /**
   * the page type (data/dic/...) *
   * 
   * @see PageType
   */
  public PageEncodingStats setPageType(@org.apache.thrift.annotation.Nullable PageType page_type) {
    this.page_type = page_type;
    return this;
  }

  public void unsetPageType() {
    this.page_type = null;
  }

  /** Returns true if field page_type is set (has been assigned a value) and false otherwise */
  public boolean isSetPageType() {
    return this.page_type != null;
  }

  public void setPageTypeIsSet(boolean value) {
    if (!value) {
      this.page_type = null;
    }
  }

  /**
   * encoding of the page *
   * 
   * @see Encoding
   */
  @org.apache.thrift.annotation.Nullable
  public Encoding getEncoding() {
    return this.encoding;
  }

  /**
   * encoding of the page *
   * 
   * @see Encoding
   */
  public PageEncodingStats setEncoding(@org.apache.thrift.annotation.Nullable Encoding encoding) {
    this.encoding = encoding;
    return this;
  }

  public void unsetEncoding() {
    this.encoding = null;
  }

  /** Returns true if field encoding is set (has been assigned a value) and false otherwise */
  public boolean isSetEncoding() {
    return this.encoding != null;
  }

  public void setEncodingIsSet(boolean value) {
    if (!value) {
      this.encoding = null;
    }
  }

  /**
   * number of pages of this type with this encoding *
   */
  public int getCount() {
    return this.count;
  }

  /**
   * number of pages of this type with this encoding *
   */
  public PageEncodingStats setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PAGE_TYPE:
      if (value == null) {
        unsetPageType();
      } else {
        setPageType((PageType)value);
      }
      break;

    case ENCODING:
      if (value == null) {
        unsetEncoding();
      } else {
        setEncoding((Encoding)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_TYPE:
      return getPageType();

    case ENCODING:
      return getEncoding();

    case COUNT:
      return getCount();

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
    case PAGE_TYPE:
      return isSetPageType();
    case ENCODING:
      return isSetEncoding();
    case COUNT:
      return isSetCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PageEncodingStats)
      return this.equals((PageEncodingStats)that);
    return false;
  }

  public boolean equals(PageEncodingStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_page_type = true && this.isSetPageType();
    boolean that_present_page_type = true && that.isSetPageType();
    if (this_present_page_type || that_present_page_type) {
      if (!(this_present_page_type && that_present_page_type))
        return false;
      if (!this.page_type.equals(that.page_type))
        return false;
    }

    boolean this_present_encoding = true && this.isSetEncoding();
    boolean that_present_encoding = true && that.isSetEncoding();
    if (this_present_encoding || that_present_encoding) {
      if (!(this_present_encoding && that_present_encoding))
        return false;
      if (!this.encoding.equals(that.encoding))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPageType()) ? 131071 : 524287);
    if (isSetPageType())
      hashCode = hashCode * 8191 + page_type.getValue();

    hashCode = hashCode * 8191 + ((isSetEncoding()) ? 131071 : 524287);
    if (isSetEncoding())
      hashCode = hashCode * 8191 + encoding.getValue();

    hashCode = hashCode * 8191 + count;

    return hashCode;
  }

  @Override
  public int compareTo(PageEncodingStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPageType(), other.isSetPageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page_type, other.page_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEncoding(), other.isSetEncoding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncoding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encoding, other.encoding);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCount(), other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PageEncodingStats(");
    boolean first = true;

    sb.append("page_type:");
    if (this.page_type == null) {
      sb.append("null");
    } else {
      sb.append(this.page_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("encoding:");
    if (this.encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.encoding);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (page_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'page_type' was not present! Struct: " + toString());
    }
    if (encoding == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'encoding' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'count' because it's a primitive and you chose the non-beans generator.
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

  private static class PageEncodingStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PageEncodingStatsStandardScheme getScheme() {
      return new PageEncodingStatsStandardScheme();
    }
  }

  private static class PageEncodingStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<PageEncodingStats> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PageEncodingStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_type = org.apache.parquet.format.PageType.findByValue(iprot.readI32());
              struct.setPageTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENCODING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
              struct.setEncodingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
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
      if (!struct.isSetCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, PageEncodingStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.page_type != null) {
        oprot.writeFieldBegin(PAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.page_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.encoding != null) {
        oprot.writeFieldBegin(ENCODING_FIELD_DESC);
        oprot.writeI32(struct.encoding.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PageEncodingStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PageEncodingStatsTupleScheme getScheme() {
      return new PageEncodingStatsTupleScheme();
    }
  }

  private static class PageEncodingStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<PageEncodingStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PageEncodingStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.page_type.getValue());
      oprot.writeI32(struct.encoding.getValue());
      oprot.writeI32(struct.count);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PageEncodingStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.page_type = org.apache.parquet.format.PageType.findByValue(iprot.readI32());
      struct.setPageTypeIsSet(true);
      struct.encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
      struct.setEncodingIsSet(true);
      struct.count = iprot.readI32();
      struct.setCountIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

