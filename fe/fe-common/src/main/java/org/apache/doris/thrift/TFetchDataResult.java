/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TFetchDataResult implements org.apache.thrift.TBase<TFetchDataResult, TFetchDataResult._Fields>, java.io.Serializable, Cloneable, Comparable<TFetchDataResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFetchDataResult");

  private static final org.apache.thrift.protocol.TField RESULT_BATCH_FIELD_DESC = new org.apache.thrift.protocol.TField("result_batch", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField EOS_FIELD_DESC = new org.apache.thrift.protocol.TField("eos", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField PACKET_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("packet_num", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFetchDataResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFetchDataResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TResultBatch result_batch; // required
  public boolean eos; // required
  public int packet_num; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT_BATCH((short)1, "result_batch"),
    EOS((short)2, "eos"),
    PACKET_NUM((short)3, "packet_num"),
    STATUS((short)4, "status");

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
        case 1: // RESULT_BATCH
          return RESULT_BATCH;
        case 2: // EOS
          return EOS;
        case 3: // PACKET_NUM
          return PACKET_NUM;
        case 4: // STATUS
          return STATUS;
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
  private static final int __EOS_ISSET_ID = 0;
  private static final int __PACKET_NUM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_BATCH, new org.apache.thrift.meta_data.FieldMetaData("result_batch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TResultBatch.class)));
    tmpMap.put(_Fields.EOS, new org.apache.thrift.meta_data.FieldMetaData("eos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PACKET_NUM, new org.apache.thrift.meta_data.FieldMetaData("packet_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFetchDataResult.class, metaDataMap);
  }

  public TFetchDataResult() {
  }

  public TFetchDataResult(
    org.apache.doris.thrift.TResultBatch result_batch,
    boolean eos,
    int packet_num)
  {
    this();
    this.result_batch = result_batch;
    this.eos = eos;
    setEosIsSet(true);
    this.packet_num = packet_num;
    setPacketNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFetchDataResult(TFetchDataResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResultBatch()) {
      this.result_batch = new org.apache.doris.thrift.TResultBatch(other.result_batch);
    }
    this.eos = other.eos;
    this.packet_num = other.packet_num;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
  }

  @Override
  public TFetchDataResult deepCopy() {
    return new TFetchDataResult(this);
  }

  @Override
  public void clear() {
    this.result_batch = null;
    setEosIsSet(false);
    this.eos = false;
    setPacketNumIsSet(false);
    this.packet_num = 0;
    this.status = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TResultBatch getResultBatch() {
    return this.result_batch;
  }

  public TFetchDataResult setResultBatch(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TResultBatch result_batch) {
    this.result_batch = result_batch;
    return this;
  }

  public void unsetResultBatch() {
    this.result_batch = null;
  }

  /** Returns true if field result_batch is set (has been assigned a value) and false otherwise */
  public boolean isSetResultBatch() {
    return this.result_batch != null;
  }

  public void setResultBatchIsSet(boolean value) {
    if (!value) {
      this.result_batch = null;
    }
  }

  public boolean isEos() {
    return this.eos;
  }

  public TFetchDataResult setEos(boolean eos) {
    this.eos = eos;
    setEosIsSet(true);
    return this;
  }

  public void unsetEos() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EOS_ISSET_ID);
  }

  /** Returns true if field eos is set (has been assigned a value) and false otherwise */
  public boolean isSetEos() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EOS_ISSET_ID);
  }

  public void setEosIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EOS_ISSET_ID, value);
  }

  public int getPacketNum() {
    return this.packet_num;
  }

  public TFetchDataResult setPacketNum(int packet_num) {
    this.packet_num = packet_num;
    setPacketNumIsSet(true);
    return this;
  }

  public void unsetPacketNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PACKET_NUM_ISSET_ID);
  }

  /** Returns true if field packet_num is set (has been assigned a value) and false otherwise */
  public boolean isSetPacketNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PACKET_NUM_ISSET_ID);
  }

  public void setPacketNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PACKET_NUM_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TFetchDataResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESULT_BATCH:
      if (value == null) {
        unsetResultBatch();
      } else {
        setResultBatch((org.apache.doris.thrift.TResultBatch)value);
      }
      break;

    case EOS:
      if (value == null) {
        unsetEos();
      } else {
        setEos((java.lang.Boolean)value);
      }
      break;

    case PACKET_NUM:
      if (value == null) {
        unsetPacketNum();
      } else {
        setPacketNum((java.lang.Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_BATCH:
      return getResultBatch();

    case EOS:
      return isEos();

    case PACKET_NUM:
      return getPacketNum();

    case STATUS:
      return getStatus();

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
    case RESULT_BATCH:
      return isSetResultBatch();
    case EOS:
      return isSetEos();
    case PACKET_NUM:
      return isSetPacketNum();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFetchDataResult)
      return this.equals((TFetchDataResult)that);
    return false;
  }

  public boolean equals(TFetchDataResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result_batch = true && this.isSetResultBatch();
    boolean that_present_result_batch = true && that.isSetResultBatch();
    if (this_present_result_batch || that_present_result_batch) {
      if (!(this_present_result_batch && that_present_result_batch))
        return false;
      if (!this.result_batch.equals(that.result_batch))
        return false;
    }

    boolean this_present_eos = true;
    boolean that_present_eos = true;
    if (this_present_eos || that_present_eos) {
      if (!(this_present_eos && that_present_eos))
        return false;
      if (this.eos != that.eos)
        return false;
    }

    boolean this_present_packet_num = true;
    boolean that_present_packet_num = true;
    if (this_present_packet_num || that_present_packet_num) {
      if (!(this_present_packet_num && that_present_packet_num))
        return false;
      if (this.packet_num != that.packet_num)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResultBatch()) ? 131071 : 524287);
    if (isSetResultBatch())
      hashCode = hashCode * 8191 + result_batch.hashCode();

    hashCode = hashCode * 8191 + ((eos) ? 131071 : 524287);

    hashCode = hashCode * 8191 + packet_num;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFetchDataResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResultBatch(), other.isSetResultBatch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultBatch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result_batch, other.result_batch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEos(), other.isSetEos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eos, other.eos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPacketNum(), other.isSetPacketNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPacketNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packet_num, other.packet_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFetchDataResult(");
    boolean first = true;

    sb.append("result_batch:");
    if (this.result_batch == null) {
      sb.append("null");
    } else {
      sb.append(this.result_batch);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eos:");
    sb.append(this.eos);
    first = false;
    if (!first) sb.append(", ");
    sb.append("packet_num:");
    sb.append(this.packet_num);
    first = false;
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (result_batch == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result_batch' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'eos' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'packet_num' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (result_batch != null) {
      result_batch.validate();
    }
    if (status != null) {
      status.validate();
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

  private static class TFetchDataResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchDataResultStandardScheme getScheme() {
      return new TFetchDataResultStandardScheme();
    }
  }

  private static class TFetchDataResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFetchDataResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_BATCH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.result_batch = new org.apache.doris.thrift.TResultBatch();
              struct.result_batch.read(iprot);
              struct.setResultBatchIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EOS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.eos = iprot.readBool();
              struct.setEosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PACKET_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.packet_num = iprot.readI32();
              struct.setPacketNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
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
      if (!struct.isSetEos()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'eos' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPacketNum()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'packet_num' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchDataResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.result_batch != null) {
        oprot.writeFieldBegin(RESULT_BATCH_FIELD_DESC);
        struct.result_batch.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EOS_FIELD_DESC);
      oprot.writeBool(struct.eos);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PACKET_NUM_FIELD_DESC);
      oprot.writeI32(struct.packet_num);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFetchDataResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchDataResultTupleScheme getScheme() {
      return new TFetchDataResultTupleScheme();
    }
  }

  private static class TFetchDataResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFetchDataResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.result_batch.write(oprot);
      oprot.writeBool(struct.eos);
      oprot.writeI32(struct.packet_num);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.result_batch = new org.apache.doris.thrift.TResultBatch();
      struct.result_batch.read(iprot);
      struct.setResultBatchIsSet(true);
      struct.eos = iprot.readBool();
      struct.setEosIsSet(true);
      struct.packet_num = iprot.readI32();
      struct.setPacketNumIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

