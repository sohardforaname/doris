/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TTabletWriterCloseParams implements org.apache.thrift.TBase<TTabletWriterCloseParams, TTabletWriterCloseParams._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletWriterCloseParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletWriterCloseParams");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("index_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SENDER_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("sender_no", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletWriterCloseParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletWriterCloseParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId id; // required
  public long index_id; // required
  public int sender_no; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    INDEX_ID((short)2, "index_id"),
    SENDER_NO((short)3, "sender_no");

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
        case 1: // ID
          return ID;
        case 2: // INDEX_ID
          return INDEX_ID;
        case 3: // SENDER_NO
          return SENDER_NO;
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
  private static final int __INDEX_ID_ISSET_ID = 0;
  private static final int __SENDER_NO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.INDEX_ID, new org.apache.thrift.meta_data.FieldMetaData("index_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SENDER_NO, new org.apache.thrift.meta_data.FieldMetaData("sender_no", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletWriterCloseParams.class, metaDataMap);
  }

  public TTabletWriterCloseParams() {
  }

  public TTabletWriterCloseParams(
    org.apache.doris.thrift.TUniqueId id,
    long index_id,
    int sender_no)
  {
    this();
    this.id = id;
    this.index_id = index_id;
    setIndexIdIsSet(true);
    this.sender_no = sender_no;
    setSenderNoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletWriterCloseParams(TTabletWriterCloseParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = new org.apache.doris.thrift.TUniqueId(other.id);
    }
    this.index_id = other.index_id;
    this.sender_no = other.sender_no;
  }

  @Override
  public TTabletWriterCloseParams deepCopy() {
    return new TTabletWriterCloseParams(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setIndexIdIsSet(false);
    this.index_id = 0;
    setSenderNoIsSet(false);
    this.sender_no = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getId() {
    return this.id;
  }

  public TTabletWriterCloseParams setId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getIndexId() {
    return this.index_id;
  }

  public TTabletWriterCloseParams setIndexId(long index_id) {
    this.index_id = index_id;
    setIndexIdIsSet(true);
    return this;
  }

  public void unsetIndexId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  /** Returns true if field index_id is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  public void setIndexIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_ID_ISSET_ID, value);
  }

  public int getSenderNo() {
    return this.sender_no;
  }

  public TTabletWriterCloseParams setSenderNo(int sender_no) {
    this.sender_no = sender_no;
    setSenderNoIsSet(true);
    return this;
  }

  public void unsetSenderNo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SENDER_NO_ISSET_ID);
  }

  /** Returns true if field sender_no is set (has been assigned a value) and false otherwise */
  public boolean isSetSenderNo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SENDER_NO_ISSET_ID);
  }

  public void setSenderNoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SENDER_NO_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case INDEX_ID:
      if (value == null) {
        unsetIndexId();
      } else {
        setIndexId((java.lang.Long)value);
      }
      break;

    case SENDER_NO:
      if (value == null) {
        unsetSenderNo();
      } else {
        setSenderNo((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case INDEX_ID:
      return getIndexId();

    case SENDER_NO:
      return getSenderNo();

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
    case ID:
      return isSetId();
    case INDEX_ID:
      return isSetIndexId();
    case SENDER_NO:
      return isSetSenderNo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletWriterCloseParams)
      return this.equals((TTabletWriterCloseParams)that);
    return false;
  }

  public boolean equals(TTabletWriterCloseParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_index_id = true;
    boolean that_present_index_id = true;
    if (this_present_index_id || that_present_index_id) {
      if (!(this_present_index_id && that_present_index_id))
        return false;
      if (this.index_id != that.index_id)
        return false;
    }

    boolean this_present_sender_no = true;
    boolean that_present_sender_no = true;
    if (this_present_sender_no || that_present_sender_no) {
      if (!(this_present_sender_no && that_present_sender_no))
        return false;
      if (this.sender_no != that.sender_no)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(index_id);

    hashCode = hashCode * 8191 + sender_no;

    return hashCode;
  }

  @Override
  public int compareTo(TTabletWriterCloseParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIndexId(), other.isSetIndexId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_id, other.index_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSenderNo(), other.isSetSenderNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSenderNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender_no, other.sender_no);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletWriterCloseParams(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("index_id:");
    sb.append(this.index_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender_no:");
    sb.append(this.sender_no);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'index_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'sender_no' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (id != null) {
      id.validate();
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

  private static class TTabletWriterCloseParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletWriterCloseParamsStandardScheme getScheme() {
      return new TTabletWriterCloseParamsStandardScheme();
    }
  }

  private static class TTabletWriterCloseParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletWriterCloseParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletWriterCloseParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id = new org.apache.doris.thrift.TUniqueId();
              struct.id.read(iprot);
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.index_id = iprot.readI64();
              struct.setIndexIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SENDER_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sender_no = iprot.readI32();
              struct.setSenderNoIsSet(true);
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
      if (!struct.isSetIndexId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'index_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSenderNo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sender_no' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletWriterCloseParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        struct.id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
      oprot.writeI64(struct.index_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SENDER_NO_FIELD_DESC);
      oprot.writeI32(struct.sender_no);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTabletWriterCloseParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletWriterCloseParamsTupleScheme getScheme() {
      return new TTabletWriterCloseParamsTupleScheme();
    }
  }

  private static class TTabletWriterCloseParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletWriterCloseParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletWriterCloseParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id.write(oprot);
      oprot.writeI64(struct.index_id);
      oprot.writeI32(struct.sender_no);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletWriterCloseParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id = new org.apache.doris.thrift.TUniqueId();
      struct.id.read(iprot);
      struct.setIdIsSet(true);
      struct.index_id = iprot.readI64();
      struct.setIndexIdIsSet(true);
      struct.sender_no = iprot.readI32();
      struct.setSenderNoIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

