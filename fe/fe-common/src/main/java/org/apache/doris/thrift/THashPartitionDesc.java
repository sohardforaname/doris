/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class THashPartitionDesc implements org.apache.thrift.TBase<THashPartitionDesc, THashPartitionDesc._Fields>, java.io.Serializable, Cloneable, Comparable<THashPartitionDesc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THashPartitionDesc");

  private static final org.apache.thrift.protocol.TField COLUMN_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("column_list", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField HASH_BUCKETS_FIELD_DESC = new org.apache.thrift.protocol.TField("hash_buckets", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HASH_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("hash_type", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THashPartitionDescStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THashPartitionDescTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> column_list; // required
  public int hash_buckets; // required
  /**
   * 
   * @see THashType
   */
  public @org.apache.thrift.annotation.Nullable THashType hash_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_LIST((short)1, "column_list"),
    HASH_BUCKETS((short)2, "hash_buckets"),
    /**
     * 
     * @see THashType
     */
    HASH_TYPE((short)3, "hash_type");

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
        case 1: // COLUMN_LIST
          return COLUMN_LIST;
        case 2: // HASH_BUCKETS
          return HASH_BUCKETS;
        case 3: // HASH_TYPE
          return HASH_TYPE;
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
  private static final int __HASH_BUCKETS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HASH_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_LIST, new org.apache.thrift.meta_data.FieldMetaData("column_list", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.HASH_BUCKETS, new org.apache.thrift.meta_data.FieldMetaData("hash_buckets", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HASH_TYPE, new org.apache.thrift.meta_data.FieldMetaData("hash_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, THashType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THashPartitionDesc.class, metaDataMap);
  }

  public THashPartitionDesc() {
  }

  public THashPartitionDesc(
    java.util.List<java.lang.String> column_list,
    int hash_buckets)
  {
    this();
    this.column_list = column_list;
    this.hash_buckets = hash_buckets;
    setHashBucketsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THashPartitionDesc(THashPartitionDesc other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumnList()) {
      java.util.List<java.lang.String> __this__column_list = new java.util.ArrayList<java.lang.String>(other.column_list);
      this.column_list = __this__column_list;
    }
    this.hash_buckets = other.hash_buckets;
    if (other.isSetHashType()) {
      this.hash_type = other.hash_type;
    }
  }

  @Override
  public THashPartitionDesc deepCopy() {
    return new THashPartitionDesc(this);
  }

  @Override
  public void clear() {
    this.column_list = null;
    setHashBucketsIsSet(false);
    this.hash_buckets = 0;
    this.hash_type = null;
  }

  public int getColumnListSize() {
    return (this.column_list == null) ? 0 : this.column_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnListIterator() {
    return (this.column_list == null) ? null : this.column_list.iterator();
  }

  public void addToColumnList(java.lang.String elem) {
    if (this.column_list == null) {
      this.column_list = new java.util.ArrayList<java.lang.String>();
    }
    this.column_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumnList() {
    return this.column_list;
  }

  public THashPartitionDesc setColumnList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> column_list) {
    this.column_list = column_list;
    return this;
  }

  public void unsetColumnList() {
    this.column_list = null;
  }

  /** Returns true if field column_list is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnList() {
    return this.column_list != null;
  }

  public void setColumnListIsSet(boolean value) {
    if (!value) {
      this.column_list = null;
    }
  }

  public int getHashBuckets() {
    return this.hash_buckets;
  }

  public THashPartitionDesc setHashBuckets(int hash_buckets) {
    this.hash_buckets = hash_buckets;
    setHashBucketsIsSet(true);
    return this;
  }

  public void unsetHashBuckets() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASH_BUCKETS_ISSET_ID);
  }

  /** Returns true if field hash_buckets is set (has been assigned a value) and false otherwise */
  public boolean isSetHashBuckets() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASH_BUCKETS_ISSET_ID);
  }

  public void setHashBucketsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASH_BUCKETS_ISSET_ID, value);
  }

  /**
   * 
   * @see THashType
   */
  @org.apache.thrift.annotation.Nullable
  public THashType getHashType() {
    return this.hash_type;
  }

  /**
   * 
   * @see THashType
   */
  public THashPartitionDesc setHashType(@org.apache.thrift.annotation.Nullable THashType hash_type) {
    this.hash_type = hash_type;
    return this;
  }

  public void unsetHashType() {
    this.hash_type = null;
  }

  /** Returns true if field hash_type is set (has been assigned a value) and false otherwise */
  public boolean isSetHashType() {
    return this.hash_type != null;
  }

  public void setHashTypeIsSet(boolean value) {
    if (!value) {
      this.hash_type = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN_LIST:
      if (value == null) {
        unsetColumnList();
      } else {
        setColumnList((java.util.List<java.lang.String>)value);
      }
      break;

    case HASH_BUCKETS:
      if (value == null) {
        unsetHashBuckets();
      } else {
        setHashBuckets((java.lang.Integer)value);
      }
      break;

    case HASH_TYPE:
      if (value == null) {
        unsetHashType();
      } else {
        setHashType((THashType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_LIST:
      return getColumnList();

    case HASH_BUCKETS:
      return getHashBuckets();

    case HASH_TYPE:
      return getHashType();

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
    case COLUMN_LIST:
      return isSetColumnList();
    case HASH_BUCKETS:
      return isSetHashBuckets();
    case HASH_TYPE:
      return isSetHashType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof THashPartitionDesc)
      return this.equals((THashPartitionDesc)that);
    return false;
  }

  public boolean equals(THashPartitionDesc that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_column_list = true && this.isSetColumnList();
    boolean that_present_column_list = true && that.isSetColumnList();
    if (this_present_column_list || that_present_column_list) {
      if (!(this_present_column_list && that_present_column_list))
        return false;
      if (!this.column_list.equals(that.column_list))
        return false;
    }

    boolean this_present_hash_buckets = true;
    boolean that_present_hash_buckets = true;
    if (this_present_hash_buckets || that_present_hash_buckets) {
      if (!(this_present_hash_buckets && that_present_hash_buckets))
        return false;
      if (this.hash_buckets != that.hash_buckets)
        return false;
    }

    boolean this_present_hash_type = true && this.isSetHashType();
    boolean that_present_hash_type = true && that.isSetHashType();
    if (this_present_hash_type || that_present_hash_type) {
      if (!(this_present_hash_type && that_present_hash_type))
        return false;
      if (!this.hash_type.equals(that.hash_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumnList()) ? 131071 : 524287);
    if (isSetColumnList())
      hashCode = hashCode * 8191 + column_list.hashCode();

    hashCode = hashCode * 8191 + hash_buckets;

    hashCode = hashCode * 8191 + ((isSetHashType()) ? 131071 : 524287);
    if (isSetHashType())
      hashCode = hashCode * 8191 + hash_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(THashPartitionDesc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumnList(), other.isSetColumnList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_list, other.column_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHashBuckets(), other.isSetHashBuckets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHashBuckets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hash_buckets, other.hash_buckets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHashType(), other.isSetHashType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHashType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hash_type, other.hash_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THashPartitionDesc(");
    boolean first = true;

    sb.append("column_list:");
    if (this.column_list == null) {
      sb.append("null");
    } else {
      sb.append(this.column_list);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hash_buckets:");
    sb.append(this.hash_buckets);
    first = false;
    if (isSetHashType()) {
      if (!first) sb.append(", ");
      sb.append("hash_type:");
      if (this.hash_type == null) {
        sb.append("null");
      } else {
        sb.append(this.hash_type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (column_list == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'column_list' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'hash_buckets' because it's a primitive and you chose the non-beans generator.
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

  private static class THashPartitionDescStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public THashPartitionDescStandardScheme getScheme() {
      return new THashPartitionDescStandardScheme();
    }
  }

  private static class THashPartitionDescStandardScheme extends org.apache.thrift.scheme.StandardScheme<THashPartitionDesc> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, THashPartitionDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.column_list = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.column_list.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setColumnListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HASH_BUCKETS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hash_buckets = iprot.readI32();
              struct.setHashBucketsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HASH_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hash_type = org.apache.doris.thrift.THashType.findByValue(iprot.readI32());
              struct.setHashTypeIsSet(true);
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
      if (!struct.isSetHashBuckets()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hash_buckets' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, THashPartitionDesc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.column_list != null) {
        oprot.writeFieldBegin(COLUMN_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.column_list.size()));
          for (java.lang.String _iter3 : struct.column_list)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HASH_BUCKETS_FIELD_DESC);
      oprot.writeI32(struct.hash_buckets);
      oprot.writeFieldEnd();
      if (struct.hash_type != null) {
        if (struct.isSetHashType()) {
          oprot.writeFieldBegin(HASH_TYPE_FIELD_DESC);
          oprot.writeI32(struct.hash_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THashPartitionDescTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public THashPartitionDescTupleScheme getScheme() {
      return new THashPartitionDescTupleScheme();
    }
  }

  private static class THashPartitionDescTupleScheme extends org.apache.thrift.scheme.TupleScheme<THashPartitionDesc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THashPartitionDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.column_list.size());
        for (java.lang.String _iter4 : struct.column_list)
        {
          oprot.writeString(_iter4);
        }
      }
      oprot.writeI32(struct.hash_buckets);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHashType()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHashType()) {
        oprot.writeI32(struct.hash_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THashPartitionDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.column_list = new java.util.ArrayList<java.lang.String>(_list5.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readString();
          struct.column_list.add(_elem6);
        }
      }
      struct.setColumnListIsSet(true);
      struct.hash_buckets = iprot.readI32();
      struct.setHashBucketsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.hash_type = org.apache.doris.thrift.THashType.findByValue(iprot.readI32());
        struct.setHashTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

