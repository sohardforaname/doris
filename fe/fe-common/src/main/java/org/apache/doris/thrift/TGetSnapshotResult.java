/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TGetSnapshotResult implements org.apache.thrift.TBase<TGetSnapshotResult, TGetSnapshotResult._Fields>, java.io.Serializable, Cloneable, Comparable<TGetSnapshotResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetSnapshotResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField META_FIELD_DESC = new org.apache.thrift.protocol.TField("meta", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("job_info", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetSnapshotResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetSnapshotResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer meta; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer job_info; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    META((short)2, "meta"),
    JOB_INFO((short)3, "job_info");

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
        case 2: // META
          return META;
        case 3: // JOB_INFO
          return JOB_INFO;
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
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.META,_Fields.JOB_INFO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.META, new org.apache.thrift.meta_data.FieldMetaData("meta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.JOB_INFO, new org.apache.thrift.meta_data.FieldMetaData("job_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetSnapshotResult.class, metaDataMap);
  }

  public TGetSnapshotResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetSnapshotResult(TGetSnapshotResult other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetMeta()) {
      this.meta = org.apache.thrift.TBaseHelper.copyBinary(other.meta);
    }
    if (other.isSetJobInfo()) {
      this.job_info = org.apache.thrift.TBaseHelper.copyBinary(other.job_info);
    }
  }

  @Override
  public TGetSnapshotResult deepCopy() {
    return new TGetSnapshotResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.meta = null;
    this.job_info = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TGetSnapshotResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  public byte[] getMeta() {
    setMeta(org.apache.thrift.TBaseHelper.rightSize(meta));
    return meta == null ? null : meta.array();
  }

  public java.nio.ByteBuffer bufferForMeta() {
    return org.apache.thrift.TBaseHelper.copyBinary(meta);
  }

  public TGetSnapshotResult setMeta(byte[] meta) {
    this.meta = meta == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(meta.clone());
    return this;
  }

  public TGetSnapshotResult setMeta(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer meta) {
    this.meta = org.apache.thrift.TBaseHelper.copyBinary(meta);
    return this;
  }

  public void unsetMeta() {
    this.meta = null;
  }

  /** Returns true if field meta is set (has been assigned a value) and false otherwise */
  public boolean isSetMeta() {
    return this.meta != null;
  }

  public void setMetaIsSet(boolean value) {
    if (!value) {
      this.meta = null;
    }
  }

  public byte[] getJobInfo() {
    setJobInfo(org.apache.thrift.TBaseHelper.rightSize(job_info));
    return job_info == null ? null : job_info.array();
  }

  public java.nio.ByteBuffer bufferForJobInfo() {
    return org.apache.thrift.TBaseHelper.copyBinary(job_info);
  }

  public TGetSnapshotResult setJobInfo(byte[] job_info) {
    this.job_info = job_info == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(job_info.clone());
    return this;
  }

  public TGetSnapshotResult setJobInfo(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer job_info) {
    this.job_info = org.apache.thrift.TBaseHelper.copyBinary(job_info);
    return this;
  }

  public void unsetJobInfo() {
    this.job_info = null;
  }

  /** Returns true if field job_info is set (has been assigned a value) and false otherwise */
  public boolean isSetJobInfo() {
    return this.job_info != null;
  }

  public void setJobInfoIsSet(boolean value) {
    if (!value) {
      this.job_info = null;
    }
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

    case META:
      if (value == null) {
        unsetMeta();
      } else {
        if (value instanceof byte[]) {
          setMeta((byte[])value);
        } else {
          setMeta((java.nio.ByteBuffer)value);
        }
      }
      break;

    case JOB_INFO:
      if (value == null) {
        unsetJobInfo();
      } else {
        if (value instanceof byte[]) {
          setJobInfo((byte[])value);
        } else {
          setJobInfo((java.nio.ByteBuffer)value);
        }
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

    case META:
      return getMeta();

    case JOB_INFO:
      return getJobInfo();

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
    case META:
      return isSetMeta();
    case JOB_INFO:
      return isSetJobInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetSnapshotResult)
      return this.equals((TGetSnapshotResult)that);
    return false;
  }

  public boolean equals(TGetSnapshotResult that) {
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

    boolean this_present_meta = true && this.isSetMeta();
    boolean that_present_meta = true && that.isSetMeta();
    if (this_present_meta || that_present_meta) {
      if (!(this_present_meta && that_present_meta))
        return false;
      if (!this.meta.equals(that.meta))
        return false;
    }

    boolean this_present_job_info = true && this.isSetJobInfo();
    boolean that_present_job_info = true && that.isSetJobInfo();
    if (this_present_job_info || that_present_job_info) {
      if (!(this_present_job_info && that_present_job_info))
        return false;
      if (!this.job_info.equals(that.job_info))
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

    hashCode = hashCode * 8191 + ((isSetMeta()) ? 131071 : 524287);
    if (isSetMeta())
      hashCode = hashCode * 8191 + meta.hashCode();

    hashCode = hashCode * 8191 + ((isSetJobInfo()) ? 131071 : 524287);
    if (isSetJobInfo())
      hashCode = hashCode * 8191 + job_info.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetSnapshotResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetMeta(), other.isSetMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMeta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.meta, other.meta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetJobInfo(), other.isSetJobInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_info, other.job_info);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetSnapshotResult(");
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
    if (isSetMeta()) {
      if (!first) sb.append(", ");
      sb.append("meta:");
      if (this.meta == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.meta, sb);
      }
      first = false;
    }
    if (isSetJobInfo()) {
      if (!first) sb.append(", ");
      sb.append("job_info:");
      if (this.job_info == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.job_info, sb);
      }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetSnapshotResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetSnapshotResultStandardScheme getScheme() {
      return new TGetSnapshotResultStandardScheme();
    }
  }

  private static class TGetSnapshotResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetSnapshotResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetSnapshotResult struct) throws org.apache.thrift.TException {
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
          case 2: // META
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.meta = iprot.readBinary();
              struct.setMetaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.job_info = iprot.readBinary();
              struct.setJobInfoIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetSnapshotResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.meta != null) {
        if (struct.isSetMeta()) {
          oprot.writeFieldBegin(META_FIELD_DESC);
          oprot.writeBinary(struct.meta);
          oprot.writeFieldEnd();
        }
      }
      if (struct.job_info != null) {
        if (struct.isSetJobInfo()) {
          oprot.writeFieldBegin(JOB_INFO_FIELD_DESC);
          oprot.writeBinary(struct.job_info);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetSnapshotResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetSnapshotResultTupleScheme getScheme() {
      return new TGetSnapshotResultTupleScheme();
    }
  }

  private static class TGetSnapshotResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetSnapshotResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetSnapshotResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetMeta()) {
        optionals.set(1);
      }
      if (struct.isSetJobInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetMeta()) {
        oprot.writeBinary(struct.meta);
      }
      if (struct.isSetJobInfo()) {
        oprot.writeBinary(struct.job_info);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetSnapshotResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.meta = iprot.readBinary();
        struct.setMetaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.job_info = iprot.readBinary();
        struct.setJobInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

