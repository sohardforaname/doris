/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TMoveDirReq implements org.apache.thrift.TBase<TMoveDirReq, TMoveDirReq._Fields>, java.io.Serializable, Cloneable, Comparable<TMoveDirReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMoveDirReq");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("schema_hash", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SRC_FIELD_DESC = new org.apache.thrift.protocol.TField("src", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("job_id", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField OVERWRITE_FIELD_DESC = new org.apache.thrift.protocol.TField("overwrite", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMoveDirReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMoveDirReqTupleSchemeFactory();

  public long tablet_id; // required
  public int schema_hash; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String src; // required
  public long job_id; // required
  public boolean overwrite; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tablet_id"),
    SCHEMA_HASH((short)2, "schema_hash"),
    SRC((short)3, "src"),
    JOB_ID((short)4, "job_id"),
    OVERWRITE((short)5, "overwrite");

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
        case 1: // TABLET_ID
          return TABLET_ID;
        case 2: // SCHEMA_HASH
          return SCHEMA_HASH;
        case 3: // SRC
          return SRC;
        case 4: // JOB_ID
          return JOB_ID;
        case 5: // OVERWRITE
          return OVERWRITE;
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
  private static final int __TABLET_ID_ISSET_ID = 0;
  private static final int __SCHEMA_HASH_ISSET_ID = 1;
  private static final int __JOB_ID_ISSET_ID = 2;
  private static final int __OVERWRITE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("schema_hash", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.SRC, new org.apache.thrift.meta_data.FieldMetaData("src", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("job_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OVERWRITE, new org.apache.thrift.meta_data.FieldMetaData("overwrite", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMoveDirReq.class, metaDataMap);
  }

  public TMoveDirReq() {
  }

  public TMoveDirReq(
    long tablet_id,
    int schema_hash,
    java.lang.String src,
    long job_id,
    boolean overwrite)
  {
    this();
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
    this.schema_hash = schema_hash;
    setSchemaHashIsSet(true);
    this.src = src;
    this.job_id = job_id;
    setJobIdIsSet(true);
    this.overwrite = overwrite;
    setOverwriteIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMoveDirReq(TMoveDirReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tablet_id = other.tablet_id;
    this.schema_hash = other.schema_hash;
    if (other.isSetSrc()) {
      this.src = other.src;
    }
    this.job_id = other.job_id;
    this.overwrite = other.overwrite;
  }

  @Override
  public TMoveDirReq deepCopy() {
    return new TMoveDirReq(this);
  }

  @Override
  public void clear() {
    setTabletIdIsSet(false);
    this.tablet_id = 0;
    setSchemaHashIsSet(false);
    this.schema_hash = 0;
    this.src = null;
    setJobIdIsSet(false);
    this.job_id = 0;
    setOverwriteIsSet(false);
    this.overwrite = false;
  }

  public long getTabletId() {
    return this.tablet_id;
  }

  public TMoveDirReq setTabletId(long tablet_id) {
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
    return this;
  }

  public void unsetTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  /** Returns true if field tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  public void setTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLET_ID_ISSET_ID, value);
  }

  public int getSchemaHash() {
    return this.schema_hash;
  }

  public TMoveDirReq setSchemaHash(int schema_hash) {
    this.schema_hash = schema_hash;
    setSchemaHashIsSet(true);
    return this;
  }

  public void unsetSchemaHash() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaHash() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  public void setSchemaHashIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSrc() {
    return this.src;
  }

  public TMoveDirReq setSrc(@org.apache.thrift.annotation.Nullable java.lang.String src) {
    this.src = src;
    return this;
  }

  public void unsetSrc() {
    this.src = null;
  }

  /** Returns true if field src is set (has been assigned a value) and false otherwise */
  public boolean isSetSrc() {
    return this.src != null;
  }

  public void setSrcIsSet(boolean value) {
    if (!value) {
      this.src = null;
    }
  }

  public long getJobId() {
    return this.job_id;
  }

  public TMoveDirReq setJobId(long job_id) {
    this.job_id = job_id;
    setJobIdIsSet(true);
    return this;
  }

  public void unsetJobId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  /** Returns true if field job_id is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  public void setJobIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOB_ID_ISSET_ID, value);
  }

  public boolean isOverwrite() {
    return this.overwrite;
  }

  public TMoveDirReq setOverwrite(boolean overwrite) {
    this.overwrite = overwrite;
    setOverwriteIsSet(true);
    return this;
  }

  public void unsetOverwrite() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OVERWRITE_ISSET_ID);
  }

  /** Returns true if field overwrite is set (has been assigned a value) and false otherwise */
  public boolean isSetOverwrite() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OVERWRITE_ISSET_ID);
  }

  public void setOverwriteIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OVERWRITE_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLET_ID:
      if (value == null) {
        unsetTabletId();
      } else {
        setTabletId((java.lang.Long)value);
      }
      break;

    case SCHEMA_HASH:
      if (value == null) {
        unsetSchemaHash();
      } else {
        setSchemaHash((java.lang.Integer)value);
      }
      break;

    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((java.lang.String)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((java.lang.Long)value);
      }
      break;

    case OVERWRITE:
      if (value == null) {
        unsetOverwrite();
      } else {
        setOverwrite((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_ID:
      return getTabletId();

    case SCHEMA_HASH:
      return getSchemaHash();

    case SRC:
      return getSrc();

    case JOB_ID:
      return getJobId();

    case OVERWRITE:
      return isOverwrite();

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
    case TABLET_ID:
      return isSetTabletId();
    case SCHEMA_HASH:
      return isSetSchemaHash();
    case SRC:
      return isSetSrc();
    case JOB_ID:
      return isSetJobId();
    case OVERWRITE:
      return isSetOverwrite();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMoveDirReq)
      return this.equals((TMoveDirReq)that);
    return false;
  }

  public boolean equals(TMoveDirReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tablet_id = true;
    boolean that_present_tablet_id = true;
    if (this_present_tablet_id || that_present_tablet_id) {
      if (!(this_present_tablet_id && that_present_tablet_id))
        return false;
      if (this.tablet_id != that.tablet_id)
        return false;
    }

    boolean this_present_schema_hash = true;
    boolean that_present_schema_hash = true;
    if (this_present_schema_hash || that_present_schema_hash) {
      if (!(this_present_schema_hash && that_present_schema_hash))
        return false;
      if (this.schema_hash != that.schema_hash)
        return false;
    }

    boolean this_present_src = true && this.isSetSrc();
    boolean that_present_src = true && that.isSetSrc();
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!this.src.equals(that.src))
        return false;
    }

    boolean this_present_job_id = true;
    boolean that_present_job_id = true;
    if (this_present_job_id || that_present_job_id) {
      if (!(this_present_job_id && that_present_job_id))
        return false;
      if (this.job_id != that.job_id)
        return false;
    }

    boolean this_present_overwrite = true;
    boolean that_present_overwrite = true;
    if (this_present_overwrite || that_present_overwrite) {
      if (!(this_present_overwrite && that_present_overwrite))
        return false;
      if (this.overwrite != that.overwrite)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tablet_id);

    hashCode = hashCode * 8191 + schema_hash;

    hashCode = hashCode * 8191 + ((isSetSrc()) ? 131071 : 524287);
    if (isSetSrc())
      hashCode = hashCode * 8191 + src.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(job_id);

    hashCode = hashCode * 8191 + ((overwrite) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TMoveDirReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletId(), other.isSetTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_id, other.tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchemaHash(), other.isSetSchemaHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema_hash, other.schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSrc(), other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.src, other.src);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetJobId(), other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_id, other.job_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOverwrite(), other.isSetOverwrite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOverwrite()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.overwrite, other.overwrite);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMoveDirReq(");
    boolean first = true;

    sb.append("tablet_id:");
    sb.append(this.tablet_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("schema_hash:");
    sb.append(this.schema_hash);
    first = false;
    if (!first) sb.append(", ");
    sb.append("src:");
    if (this.src == null) {
      sb.append("null");
    } else {
      sb.append(this.src);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("job_id:");
    sb.append(this.job_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("overwrite:");
    sb.append(this.overwrite);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tablet_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'schema_hash' because it's a primitive and you chose the non-beans generator.
    if (src == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'src' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'job_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'overwrite' because it's a primitive and you chose the non-beans generator.
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

  private static class TMoveDirReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMoveDirReqStandardScheme getScheme() {
      return new TMoveDirReqStandardScheme();
    }
  }

  private static class TMoveDirReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMoveDirReq> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMoveDirReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tablet_id = iprot.readI64();
              struct.setTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schema_hash = iprot.readI32();
              struct.setSchemaHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SRC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.src = iprot.readString();
              struct.setSrcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.job_id = iprot.readI64();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OVERWRITE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.overwrite = iprot.readBool();
              struct.setOverwriteIsSet(true);
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
      if (!struct.isSetTabletId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablet_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSchemaHash()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'schema_hash' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetJobId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'job_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetOverwrite()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'overwrite' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMoveDirReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.tablet_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCHEMA_HASH_FIELD_DESC);
      oprot.writeI32(struct.schema_hash);
      oprot.writeFieldEnd();
      if (struct.src != null) {
        oprot.writeFieldBegin(SRC_FIELD_DESC);
        oprot.writeString(struct.src);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI64(struct.job_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OVERWRITE_FIELD_DESC);
      oprot.writeBool(struct.overwrite);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMoveDirReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMoveDirReqTupleScheme getScheme() {
      return new TMoveDirReqTupleScheme();
    }
  }

  private static class TMoveDirReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMoveDirReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMoveDirReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.tablet_id);
      oprot.writeI32(struct.schema_hash);
      oprot.writeString(struct.src);
      oprot.writeI64(struct.job_id);
      oprot.writeBool(struct.overwrite);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMoveDirReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tablet_id = iprot.readI64();
      struct.setTabletIdIsSet(true);
      struct.schema_hash = iprot.readI32();
      struct.setSchemaHashIsSet(true);
      struct.src = iprot.readString();
      struct.setSrcIsSet(true);
      struct.job_id = iprot.readI64();
      struct.setJobIdIsSet(true);
      struct.overwrite = iprot.readBool();
      struct.setOverwriteIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

