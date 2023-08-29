/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

/**
 * The dictionary page must be placed at the first position of the column chunk
 * if it is partly or completely dictionary encoded. At most one dictionary page
 * can be placed in a column chunk.
 * 
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class DictionaryPageHeader implements org.apache.thrift.TBase<DictionaryPageHeader, DictionaryPageHeader._Fields>, java.io.Serializable, Cloneable, Comparable<DictionaryPageHeader> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DictionaryPageHeader");

  private static final org.apache.thrift.protocol.TField NUM_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("num_values", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("encoding", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IS_SORTED_FIELD_DESC = new org.apache.thrift.protocol.TField("is_sorted", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DictionaryPageHeaderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DictionaryPageHeaderTupleSchemeFactory();

  /**
   * Number of values in the dictionary *
   */
  public int num_values; // required
  /**
   * Encoding using this dictionary page *
   * 
   * @see Encoding
   */
  public @org.apache.thrift.annotation.Nullable Encoding encoding; // required
  /**
   * If true, the entries in the dictionary are sorted in ascending order *
   */
  public boolean is_sorted; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Number of values in the dictionary *
     */
    NUM_VALUES((short)1, "num_values"),
    /**
     * Encoding using this dictionary page *
     * 
     * @see Encoding
     */
    ENCODING((short)2, "encoding"),
    /**
     * If true, the entries in the dictionary are sorted in ascending order *
     */
    IS_SORTED((short)3, "is_sorted");

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
        case 1: // NUM_VALUES
          return NUM_VALUES;
        case 2: // ENCODING
          return ENCODING;
        case 3: // IS_SORTED
          return IS_SORTED;
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
  private static final int __NUM_VALUES_ISSET_ID = 0;
  private static final int __IS_SORTED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IS_SORTED};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_VALUES, new org.apache.thrift.meta_data.FieldMetaData("num_values", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENCODING, new org.apache.thrift.meta_data.FieldMetaData("encoding", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Encoding.class)));
    tmpMap.put(_Fields.IS_SORTED, new org.apache.thrift.meta_data.FieldMetaData("is_sorted", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DictionaryPageHeader.class, metaDataMap);
  }

  public DictionaryPageHeader() {
  }

  public DictionaryPageHeader(
    int num_values,
    Encoding encoding)
  {
    this();
    this.num_values = num_values;
    setNumValuesIsSet(true);
    this.encoding = encoding;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DictionaryPageHeader(DictionaryPageHeader other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_values = other.num_values;
    if (other.isSetEncoding()) {
      this.encoding = other.encoding;
    }
    this.is_sorted = other.is_sorted;
  }

  @Override
  public DictionaryPageHeader deepCopy() {
    return new DictionaryPageHeader(this);
  }

  @Override
  public void clear() {
    setNumValuesIsSet(false);
    this.num_values = 0;
    this.encoding = null;
    setIsSortedIsSet(false);
    this.is_sorted = false;
  }

  /**
   * Number of values in the dictionary *
   */
  public int getNumValues() {
    return this.num_values;
  }

  /**
   * Number of values in the dictionary *
   */
  public DictionaryPageHeader setNumValues(int num_values) {
    this.num_values = num_values;
    setNumValuesIsSet(true);
    return this;
  }

  public void unsetNumValues() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_VALUES_ISSET_ID);
  }

  /** Returns true if field num_values is set (has been assigned a value) and false otherwise */
  public boolean isSetNumValues() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_VALUES_ISSET_ID);
  }

  public void setNumValuesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_VALUES_ISSET_ID, value);
  }

  /**
   * Encoding using this dictionary page *
   * 
   * @see Encoding
   */
  @org.apache.thrift.annotation.Nullable
  public Encoding getEncoding() {
    return this.encoding;
  }

  /**
   * Encoding using this dictionary page *
   * 
   * @see Encoding
   */
  public DictionaryPageHeader setEncoding(@org.apache.thrift.annotation.Nullable Encoding encoding) {
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
   * If true, the entries in the dictionary are sorted in ascending order *
   */
  public boolean isIsSorted() {
    return this.is_sorted;
  }

  /**
   * If true, the entries in the dictionary are sorted in ascending order *
   */
  public DictionaryPageHeader setIsSorted(boolean is_sorted) {
    this.is_sorted = is_sorted;
    setIsSortedIsSet(true);
    return this;
  }

  public void unsetIsSorted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_SORTED_ISSET_ID);
  }

  /** Returns true if field is_sorted is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSorted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_SORTED_ISSET_ID);
  }

  public void setIsSortedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_SORTED_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUM_VALUES:
      if (value == null) {
        unsetNumValues();
      } else {
        setNumValues((java.lang.Integer)value);
      }
      break;

    case ENCODING:
      if (value == null) {
        unsetEncoding();
      } else {
        setEncoding((Encoding)value);
      }
      break;

    case IS_SORTED:
      if (value == null) {
        unsetIsSorted();
      } else {
        setIsSorted((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_VALUES:
      return getNumValues();

    case ENCODING:
      return getEncoding();

    case IS_SORTED:
      return isIsSorted();

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
    case NUM_VALUES:
      return isSetNumValues();
    case ENCODING:
      return isSetEncoding();
    case IS_SORTED:
      return isSetIsSorted();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DictionaryPageHeader)
      return this.equals((DictionaryPageHeader)that);
    return false;
  }

  public boolean equals(DictionaryPageHeader that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_num_values = true;
    boolean that_present_num_values = true;
    if (this_present_num_values || that_present_num_values) {
      if (!(this_present_num_values && that_present_num_values))
        return false;
      if (this.num_values != that.num_values)
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

    boolean this_present_is_sorted = true && this.isSetIsSorted();
    boolean that_present_is_sorted = true && that.isSetIsSorted();
    if (this_present_is_sorted || that_present_is_sorted) {
      if (!(this_present_is_sorted && that_present_is_sorted))
        return false;
      if (this.is_sorted != that.is_sorted)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + num_values;

    hashCode = hashCode * 8191 + ((isSetEncoding()) ? 131071 : 524287);
    if (isSetEncoding())
      hashCode = hashCode * 8191 + encoding.getValue();

    hashCode = hashCode * 8191 + ((isSetIsSorted()) ? 131071 : 524287);
    if (isSetIsSorted())
      hashCode = hashCode * 8191 + ((is_sorted) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(DictionaryPageHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNumValues(), other.isSetNumValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_values, other.num_values);
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
    lastComparison = java.lang.Boolean.compare(isSetIsSorted(), other.isSetIsSorted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSorted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_sorted, other.is_sorted);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DictionaryPageHeader(");
    boolean first = true;

    sb.append("num_values:");
    sb.append(this.num_values);
    first = false;
    if (!first) sb.append(", ");
    sb.append("encoding:");
    if (this.encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.encoding);
    }
    first = false;
    if (isSetIsSorted()) {
      if (!first) sb.append(", ");
      sb.append("is_sorted:");
      sb.append(this.is_sorted);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_values' because it's a primitive and you chose the non-beans generator.
    if (encoding == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'encoding' was not present! Struct: " + toString());
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

  private static class DictionaryPageHeaderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DictionaryPageHeaderStandardScheme getScheme() {
      return new DictionaryPageHeaderStandardScheme();
    }
  }

  private static class DictionaryPageHeaderStandardScheme extends org.apache.thrift.scheme.StandardScheme<DictionaryPageHeader> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, DictionaryPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_values = iprot.readI32();
              struct.setNumValuesIsSet(true);
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
          case 3: // IS_SORTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_sorted = iprot.readBool();
              struct.setIsSortedIsSet(true);
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
      if (!struct.isSetNumValues()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_values' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, DictionaryPageHeader struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_VALUES_FIELD_DESC);
      oprot.writeI32(struct.num_values);
      oprot.writeFieldEnd();
      if (struct.encoding != null) {
        oprot.writeFieldBegin(ENCODING_FIELD_DESC);
        oprot.writeI32(struct.encoding.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsSorted()) {
        oprot.writeFieldBegin(IS_SORTED_FIELD_DESC);
        oprot.writeBool(struct.is_sorted);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DictionaryPageHeaderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DictionaryPageHeaderTupleScheme getScheme() {
      return new DictionaryPageHeaderTupleScheme();
    }
  }

  private static class DictionaryPageHeaderTupleScheme extends org.apache.thrift.scheme.TupleScheme<DictionaryPageHeader> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DictionaryPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_values);
      oprot.writeI32(struct.encoding.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIsSorted()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIsSorted()) {
        oprot.writeBool(struct.is_sorted);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DictionaryPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_values = iprot.readI32();
      struct.setNumValuesIsSet(true);
      struct.encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
      struct.setEncodingIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.is_sorted = iprot.readBool();
        struct.setIsSortedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

