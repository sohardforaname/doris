/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TAgentResult implements org.apache.thrift.TBase<TAgentResult, TAgentResult._Fields>, java.io.Serializable, Cloneable, Comparable<TAgentResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAgentResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SNAPSHOT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("snapshot_path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ALLOW_INCREMENTAL_CLONE_FIELD_DESC = new org.apache.thrift.protocol.TField("allow_incremental_clone", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField SNAPSHOT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("snapshot_version", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAgentResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAgentResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String snapshot_path; // optional
  public boolean allow_incremental_clone; // optional
  public int snapshot_version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    SNAPSHOT_PATH((short)2, "snapshot_path"),
    ALLOW_INCREMENTAL_CLONE((short)3, "allow_incremental_clone"),
    SNAPSHOT_VERSION((short)4, "snapshot_version");

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
        case 2: // SNAPSHOT_PATH
          return SNAPSHOT_PATH;
        case 3: // ALLOW_INCREMENTAL_CLONE
          return ALLOW_INCREMENTAL_CLONE;
        case 4: // SNAPSHOT_VERSION
          return SNAPSHOT_VERSION;
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
  private static final int __ALLOW_INCREMENTAL_CLONE_ISSET_ID = 0;
  private static final int __SNAPSHOT_VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SNAPSHOT_PATH,_Fields.ALLOW_INCREMENTAL_CLONE,_Fields.SNAPSHOT_VERSION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.SNAPSHOT_PATH, new org.apache.thrift.meta_data.FieldMetaData("snapshot_path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALLOW_INCREMENTAL_CLONE, new org.apache.thrift.meta_data.FieldMetaData("allow_incremental_clone", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SNAPSHOT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("snapshot_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAgentResult.class, metaDataMap);
  }

  public TAgentResult() {
    this.snapshot_version = 1;

  }

  public TAgentResult(
    org.apache.doris.thrift.TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAgentResult(TAgentResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetSnapshotPath()) {
      this.snapshot_path = other.snapshot_path;
    }
    this.allow_incremental_clone = other.allow_incremental_clone;
    this.snapshot_version = other.snapshot_version;
  }

  @Override
  public TAgentResult deepCopy() {
    return new TAgentResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.snapshot_path = null;
    setAllowIncrementalCloneIsSet(false);
    this.allow_incremental_clone = false;
    this.snapshot_version = 1;

  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TAgentResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSnapshotPath() {
    return this.snapshot_path;
  }

  public TAgentResult setSnapshotPath(@org.apache.thrift.annotation.Nullable java.lang.String snapshot_path) {
    this.snapshot_path = snapshot_path;
    return this;
  }

  public void unsetSnapshotPath() {
    this.snapshot_path = null;
  }

  /** Returns true if field snapshot_path is set (has been assigned a value) and false otherwise */
  public boolean isSetSnapshotPath() {
    return this.snapshot_path != null;
  }

  public void setSnapshotPathIsSet(boolean value) {
    if (!value) {
      this.snapshot_path = null;
    }
  }

  public boolean isAllowIncrementalClone() {
    return this.allow_incremental_clone;
  }

  public TAgentResult setAllowIncrementalClone(boolean allow_incremental_clone) {
    this.allow_incremental_clone = allow_incremental_clone;
    setAllowIncrementalCloneIsSet(true);
    return this;
  }

  public void unsetAllowIncrementalClone() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOW_INCREMENTAL_CLONE_ISSET_ID);
  }

  /** Returns true if field allow_incremental_clone is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowIncrementalClone() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOW_INCREMENTAL_CLONE_ISSET_ID);
  }

  public void setAllowIncrementalCloneIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOW_INCREMENTAL_CLONE_ISSET_ID, value);
  }

  public int getSnapshotVersion() {
    return this.snapshot_version;
  }

  public TAgentResult setSnapshotVersion(int snapshot_version) {
    this.snapshot_version = snapshot_version;
    setSnapshotVersionIsSet(true);
    return this;
  }

  public void unsetSnapshotVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SNAPSHOT_VERSION_ISSET_ID);
  }

  /** Returns true if field snapshot_version is set (has been assigned a value) and false otherwise */
  public boolean isSetSnapshotVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SNAPSHOT_VERSION_ISSET_ID);
  }

  public void setSnapshotVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SNAPSHOT_VERSION_ISSET_ID, value);
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

    case SNAPSHOT_PATH:
      if (value == null) {
        unsetSnapshotPath();
      } else {
        setSnapshotPath((java.lang.String)value);
      }
      break;

    case ALLOW_INCREMENTAL_CLONE:
      if (value == null) {
        unsetAllowIncrementalClone();
      } else {
        setAllowIncrementalClone((java.lang.Boolean)value);
      }
      break;

    case SNAPSHOT_VERSION:
      if (value == null) {
        unsetSnapshotVersion();
      } else {
        setSnapshotVersion((java.lang.Integer)value);
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

    case SNAPSHOT_PATH:
      return getSnapshotPath();

    case ALLOW_INCREMENTAL_CLONE:
      return isAllowIncrementalClone();

    case SNAPSHOT_VERSION:
      return getSnapshotVersion();

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
    case SNAPSHOT_PATH:
      return isSetSnapshotPath();
    case ALLOW_INCREMENTAL_CLONE:
      return isSetAllowIncrementalClone();
    case SNAPSHOT_VERSION:
      return isSetSnapshotVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAgentResult)
      return this.equals((TAgentResult)that);
    return false;
  }

  public boolean equals(TAgentResult that) {
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

    boolean this_present_snapshot_path = true && this.isSetSnapshotPath();
    boolean that_present_snapshot_path = true && that.isSetSnapshotPath();
    if (this_present_snapshot_path || that_present_snapshot_path) {
      if (!(this_present_snapshot_path && that_present_snapshot_path))
        return false;
      if (!this.snapshot_path.equals(that.snapshot_path))
        return false;
    }

    boolean this_present_allow_incremental_clone = true && this.isSetAllowIncrementalClone();
    boolean that_present_allow_incremental_clone = true && that.isSetAllowIncrementalClone();
    if (this_present_allow_incremental_clone || that_present_allow_incremental_clone) {
      if (!(this_present_allow_incremental_clone && that_present_allow_incremental_clone))
        return false;
      if (this.allow_incremental_clone != that.allow_incremental_clone)
        return false;
    }

    boolean this_present_snapshot_version = true && this.isSetSnapshotVersion();
    boolean that_present_snapshot_version = true && that.isSetSnapshotVersion();
    if (this_present_snapshot_version || that_present_snapshot_version) {
      if (!(this_present_snapshot_version && that_present_snapshot_version))
        return false;
      if (this.snapshot_version != that.snapshot_version)
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

    hashCode = hashCode * 8191 + ((isSetSnapshotPath()) ? 131071 : 524287);
    if (isSetSnapshotPath())
      hashCode = hashCode * 8191 + snapshot_path.hashCode();

    hashCode = hashCode * 8191 + ((isSetAllowIncrementalClone()) ? 131071 : 524287);
    if (isSetAllowIncrementalClone())
      hashCode = hashCode * 8191 + ((allow_incremental_clone) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSnapshotVersion()) ? 131071 : 524287);
    if (isSetSnapshotVersion())
      hashCode = hashCode * 8191 + snapshot_version;

    return hashCode;
  }

  @Override
  public int compareTo(TAgentResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetSnapshotPath(), other.isSetSnapshotPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnapshotPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snapshot_path, other.snapshot_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAllowIncrementalClone(), other.isSetAllowIncrementalClone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowIncrementalClone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allow_incremental_clone, other.allow_incremental_clone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSnapshotVersion(), other.isSetSnapshotVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnapshotVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snapshot_version, other.snapshot_version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAgentResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetSnapshotPath()) {
      if (!first) sb.append(", ");
      sb.append("snapshot_path:");
      if (this.snapshot_path == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshot_path);
      }
      first = false;
    }
    if (isSetAllowIncrementalClone()) {
      if (!first) sb.append(", ");
      sb.append("allow_incremental_clone:");
      sb.append(this.allow_incremental_clone);
      first = false;
    }
    if (isSetSnapshotVersion()) {
      if (!first) sb.append(", ");
      sb.append("snapshot_version:");
      sb.append(this.snapshot_version);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
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

  private static class TAgentResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAgentResultStandardScheme getScheme() {
      return new TAgentResultStandardScheme();
    }
  }

  private static class TAgentResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAgentResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TAgentResult struct) throws org.apache.thrift.TException {
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
          case 2: // SNAPSHOT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.snapshot_path = iprot.readString();
              struct.setSnapshotPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALLOW_INCREMENTAL_CLONE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allow_incremental_clone = iprot.readBool();
              struct.setAllowIncrementalCloneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SNAPSHOT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.snapshot_version = iprot.readI32();
              struct.setSnapshotVersionIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TAgentResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.snapshot_path != null) {
        if (struct.isSetSnapshotPath()) {
          oprot.writeFieldBegin(SNAPSHOT_PATH_FIELD_DESC);
          oprot.writeString(struct.snapshot_path);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAllowIncrementalClone()) {
        oprot.writeFieldBegin(ALLOW_INCREMENTAL_CLONE_FIELD_DESC);
        oprot.writeBool(struct.allow_incremental_clone);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSnapshotVersion()) {
        oprot.writeFieldBegin(SNAPSHOT_VERSION_FIELD_DESC);
        oprot.writeI32(struct.snapshot_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAgentResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAgentResultTupleScheme getScheme() {
      return new TAgentResultTupleScheme();
    }
  }

  private static class TAgentResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAgentResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAgentResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSnapshotPath()) {
        optionals.set(0);
      }
      if (struct.isSetAllowIncrementalClone()) {
        optionals.set(1);
      }
      if (struct.isSetSnapshotVersion()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSnapshotPath()) {
        oprot.writeString(struct.snapshot_path);
      }
      if (struct.isSetAllowIncrementalClone()) {
        oprot.writeBool(struct.allow_incremental_clone);
      }
      if (struct.isSetSnapshotVersion()) {
        oprot.writeI32(struct.snapshot_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAgentResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new org.apache.doris.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.snapshot_path = iprot.readString();
        struct.setSnapshotPathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.allow_incremental_clone = iprot.readBool();
        struct.setAllowIncrementalCloneIsSet(true);
      }
      if (incoming.get(2)) {
        struct.snapshot_version = iprot.readI32();
        struct.setSnapshotVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

