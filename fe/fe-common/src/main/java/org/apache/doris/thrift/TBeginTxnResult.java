/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TBeginTxnResult implements org.apache.thrift.TBase<TBeginTxnResult, TBeginTxnResult._Fields>, java.io.Serializable, Cloneable, Comparable<TBeginTxnResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBeginTxnResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("job_status", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("db_id", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBeginTxnResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBeginTxnResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public long txn_id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String job_status; // optional
  public long db_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    TXN_ID((short)2, "txn_id"),
    JOB_STATUS((short)3, "job_status"),
    DB_ID((short)4, "db_id");

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
        case 1: // STATUS
          return STATUS;
        case 2: // TXN_ID
          return TXN_ID;
        case 3: // JOB_STATUS
          return JOB_STATUS;
        case 4: // DB_ID
          return DB_ID;
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
  private static final int __TXN_ID_ISSET_ID = 0;
  private static final int __DB_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.TXN_ID,_Fields.JOB_STATUS,_Fields.DB_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JOB_STATUS, new org.apache.thrift.meta_data.FieldMetaData("job_status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_ID, new org.apache.thrift.meta_data.FieldMetaData("db_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBeginTxnResult.class, metaDataMap);
  }

  public TBeginTxnResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBeginTxnResult(TBeginTxnResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    this.txn_id = other.txn_id;
    if (other.isSetJobStatus()) {
      this.job_status = other.job_status;
    }
    this.db_id = other.db_id;
  }

  @Override
  public TBeginTxnResult deepCopy() {
    return new TBeginTxnResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setTxnIdIsSet(false);
    this.txn_id = 0;
    this.job_status = null;
    setDbIdIsSet(false);
    this.db_id = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TBeginTxnResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  public long getTxnId() {
    return this.txn_id;
  }

  public TBeginTxnResult setTxnId(long txn_id) {
    this.txn_id = txn_id;
    setTxnIdIsSet(true);
    return this;
  }

  public void unsetTxnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  /** Returns true if field txn_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXN_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getJobStatus() {
    return this.job_status;
  }

  public TBeginTxnResult setJobStatus(@org.apache.thrift.annotation.Nullable java.lang.String job_status) {
    this.job_status = job_status;
    return this;
  }

  public void unsetJobStatus() {
    this.job_status = null;
  }

  /** Returns true if field job_status is set (has been assigned a value) and false otherwise */
  public boolean isSetJobStatus() {
    return this.job_status != null;
  }

  public void setJobStatusIsSet(boolean value) {
    if (!value) {
      this.job_status = null;
    }
  }

  public long getDbId() {
    return this.db_id;
  }

  public TBeginTxnResult setDbId(long db_id) {
    this.db_id = db_id;
    setDbIdIsSet(true);
    return this;
  }

  public void unsetDbId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DB_ID_ISSET_ID);
  }

  /** Returns true if field db_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDbId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DB_ID_ISSET_ID);
  }

  public void setDbIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DB_ID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case JOB_STATUS:
      if (value == null) {
        unsetJobStatus();
      } else {
        setJobStatus((java.lang.String)value);
      }
      break;

    case DB_ID:
      if (value == null) {
        unsetDbId();
      } else {
        setDbId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TXN_ID:
      return getTxnId();

    case JOB_STATUS:
      return getJobStatus();

    case DB_ID:
      return getDbId();

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
    case STATUS:
      return isSetStatus();
    case TXN_ID:
      return isSetTxnId();
    case JOB_STATUS:
      return isSetJobStatus();
    case DB_ID:
      return isSetDbId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBeginTxnResult)
      return this.equals((TBeginTxnResult)that);
    return false;
  }

  public boolean equals(TBeginTxnResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_txn_id = true && this.isSetTxnId();
    boolean that_present_txn_id = true && that.isSetTxnId();
    if (this_present_txn_id || that_present_txn_id) {
      if (!(this_present_txn_id && that_present_txn_id))
        return false;
      if (this.txn_id != that.txn_id)
        return false;
    }

    boolean this_present_job_status = true && this.isSetJobStatus();
    boolean that_present_job_status = true && that.isSetJobStatus();
    if (this_present_job_status || that_present_job_status) {
      if (!(this_present_job_status && that_present_job_status))
        return false;
      if (!this.job_status.equals(that.job_status))
        return false;
    }

    boolean this_present_db_id = true && this.isSetDbId();
    boolean that_present_db_id = true && that.isSetDbId();
    if (this_present_db_id || that_present_db_id) {
      if (!(this_present_db_id && that_present_db_id))
        return false;
      if (this.db_id != that.db_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxnId()) ? 131071 : 524287);
    if (isSetTxnId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_id);

    hashCode = hashCode * 8191 + ((isSetJobStatus()) ? 131071 : 524287);
    if (isSetJobStatus())
      hashCode = hashCode * 8191 + job_status.hashCode();

    hashCode = hashCode * 8191 + ((isSetDbId()) ? 131071 : 524287);
    if (isSetDbId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(db_id);

    return hashCode;
  }

  @Override
  public int compareTo(TBeginTxnResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetTxnId(), other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_id, other.txn_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetJobStatus(), other.isSetJobStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_status, other.job_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbId(), other.isSetDbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_id, other.db_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBeginTxnResult(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetTxnId()) {
      if (!first) sb.append(", ");
      sb.append("txn_id:");
      sb.append(this.txn_id);
      first = false;
    }
    if (isSetJobStatus()) {
      if (!first) sb.append(", ");
      sb.append("job_status:");
      if (this.job_status == null) {
        sb.append("null");
      } else {
        sb.append(this.job_status);
      }
      first = false;
    }
    if (isSetDbId()) {
      if (!first) sb.append(", ");
      sb.append("db_id:");
      sb.append(this.db_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TBeginTxnResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBeginTxnResultStandardScheme getScheme() {
      return new TBeginTxnResultStandardScheme();
    }
  }

  private static class TBeginTxnResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBeginTxnResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBeginTxnResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_id = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.job_status = iprot.readString();
              struct.setJobStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.db_id = iprot.readI64();
              struct.setDbIdIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBeginTxnResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txn_id);
        oprot.writeFieldEnd();
      }
      if (struct.job_status != null) {
        if (struct.isSetJobStatus()) {
          oprot.writeFieldBegin(JOB_STATUS_FIELD_DESC);
          oprot.writeString(struct.job_status);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDbId()) {
        oprot.writeFieldBegin(DB_ID_FIELD_DESC);
        oprot.writeI64(struct.db_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBeginTxnResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBeginTxnResultTupleScheme getScheme() {
      return new TBeginTxnResultTupleScheme();
    }
  }

  private static class TBeginTxnResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBeginTxnResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBeginTxnResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetTxnId()) {
        optionals.set(1);
      }
      if (struct.isSetJobStatus()) {
        optionals.set(2);
      }
      if (struct.isSetDbId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txn_id);
      }
      if (struct.isSetJobStatus()) {
        oprot.writeString(struct.job_status);
      }
      if (struct.isSetDbId()) {
        oprot.writeI64(struct.db_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBeginTxnResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.txn_id = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.job_status = iprot.readString();
        struct.setJobStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.db_id = iprot.readI64();
        struct.setDbIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

