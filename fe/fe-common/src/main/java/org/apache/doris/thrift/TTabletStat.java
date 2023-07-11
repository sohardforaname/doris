/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TTabletStat implements org.apache.thrift.TBase<TTabletStat, TTabletStat._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletStat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletStat");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("data_size", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ROW_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("row_num", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("version_count", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField REMOTE_DATA_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("remote_data_size", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletStatStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletStatTupleSchemeFactory();

  public long tablet_id; // required
  public long data_size; // optional
  public long row_num; // optional
  public long version_count; // optional
  public long remote_data_size; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tablet_id"),
    DATA_SIZE((short)2, "data_size"),
    ROW_NUM((short)3, "row_num"),
    VERSION_COUNT((short)4, "version_count"),
    REMOTE_DATA_SIZE((short)5, "remote_data_size");

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
        case 2: // DATA_SIZE
          return DATA_SIZE;
        case 3: // ROW_NUM
          return ROW_NUM;
        case 4: // VERSION_COUNT
          return VERSION_COUNT;
        case 5: // REMOTE_DATA_SIZE
          return REMOTE_DATA_SIZE;
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
  private static final int __DATA_SIZE_ISSET_ID = 1;
  private static final int __ROW_NUM_ISSET_ID = 2;
  private static final int __VERSION_COUNT_ISSET_ID = 3;
  private static final int __REMOTE_DATA_SIZE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DATA_SIZE,_Fields.ROW_NUM,_Fields.VERSION_COUNT,_Fields.REMOTE_DATA_SIZE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA_SIZE, new org.apache.thrift.meta_data.FieldMetaData("data_size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ROW_NUM, new org.apache.thrift.meta_data.FieldMetaData("row_num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VERSION_COUNT, new org.apache.thrift.meta_data.FieldMetaData("version_count", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REMOTE_DATA_SIZE, new org.apache.thrift.meta_data.FieldMetaData("remote_data_size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletStat.class, metaDataMap);
  }

  public TTabletStat() {
  }

  public TTabletStat(
    long tablet_id)
  {
    this();
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletStat(TTabletStat other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tablet_id = other.tablet_id;
    this.data_size = other.data_size;
    this.row_num = other.row_num;
    this.version_count = other.version_count;
    this.remote_data_size = other.remote_data_size;
  }

  @Override
  public TTabletStat deepCopy() {
    return new TTabletStat(this);
  }

  @Override
  public void clear() {
    setTabletIdIsSet(false);
    this.tablet_id = 0;
    setDataSizeIsSet(false);
    this.data_size = 0;
    setRowNumIsSet(false);
    this.row_num = 0;
    setVersionCountIsSet(false);
    this.version_count = 0;
    setRemoteDataSizeIsSet(false);
    this.remote_data_size = 0;
  }

  public long getTabletId() {
    return this.tablet_id;
  }

  public TTabletStat setTabletId(long tablet_id) {
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

  public long getDataSize() {
    return this.data_size;
  }

  public TTabletStat setDataSize(long data_size) {
    this.data_size = data_size;
    setDataSizeIsSet(true);
    return this;
  }

  public void unsetDataSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DATA_SIZE_ISSET_ID);
  }

  /** Returns true if field data_size is set (has been assigned a value) and false otherwise */
  public boolean isSetDataSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DATA_SIZE_ISSET_ID);
  }

  public void setDataSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DATA_SIZE_ISSET_ID, value);
  }

  public long getRowNum() {
    return this.row_num;
  }

  public TTabletStat setRowNum(long row_num) {
    this.row_num = row_num;
    setRowNumIsSet(true);
    return this;
  }

  public void unsetRowNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ROW_NUM_ISSET_ID);
  }

  /** Returns true if field row_num is set (has been assigned a value) and false otherwise */
  public boolean isSetRowNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ROW_NUM_ISSET_ID);
  }

  public void setRowNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ROW_NUM_ISSET_ID, value);
  }

  public long getVersionCount() {
    return this.version_count;
  }

  public TTabletStat setVersionCount(long version_count) {
    this.version_count = version_count;
    setVersionCountIsSet(true);
    return this;
  }

  public void unsetVersionCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_COUNT_ISSET_ID);
  }

  /** Returns true if field version_count is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_COUNT_ISSET_ID);
  }

  public void setVersionCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_COUNT_ISSET_ID, value);
  }

  public long getRemoteDataSize() {
    return this.remote_data_size;
  }

  public TTabletStat setRemoteDataSize(long remote_data_size) {
    this.remote_data_size = remote_data_size;
    setRemoteDataSizeIsSet(true);
    return this;
  }

  public void unsetRemoteDataSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REMOTE_DATA_SIZE_ISSET_ID);
  }

  /** Returns true if field remote_data_size is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoteDataSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REMOTE_DATA_SIZE_ISSET_ID);
  }

  public void setRemoteDataSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REMOTE_DATA_SIZE_ISSET_ID, value);
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

    case DATA_SIZE:
      if (value == null) {
        unsetDataSize();
      } else {
        setDataSize((java.lang.Long)value);
      }
      break;

    case ROW_NUM:
      if (value == null) {
        unsetRowNum();
      } else {
        setRowNum((java.lang.Long)value);
      }
      break;

    case VERSION_COUNT:
      if (value == null) {
        unsetVersionCount();
      } else {
        setVersionCount((java.lang.Long)value);
      }
      break;

    case REMOTE_DATA_SIZE:
      if (value == null) {
        unsetRemoteDataSize();
      } else {
        setRemoteDataSize((java.lang.Long)value);
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

    case DATA_SIZE:
      return getDataSize();

    case ROW_NUM:
      return getRowNum();

    case VERSION_COUNT:
      return getVersionCount();

    case REMOTE_DATA_SIZE:
      return getRemoteDataSize();

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
    case DATA_SIZE:
      return isSetDataSize();
    case ROW_NUM:
      return isSetRowNum();
    case VERSION_COUNT:
      return isSetVersionCount();
    case REMOTE_DATA_SIZE:
      return isSetRemoteDataSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletStat)
      return this.equals((TTabletStat)that);
    return false;
  }

  public boolean equals(TTabletStat that) {
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

    boolean this_present_data_size = true && this.isSetDataSize();
    boolean that_present_data_size = true && that.isSetDataSize();
    if (this_present_data_size || that_present_data_size) {
      if (!(this_present_data_size && that_present_data_size))
        return false;
      if (this.data_size != that.data_size)
        return false;
    }

    boolean this_present_row_num = true && this.isSetRowNum();
    boolean that_present_row_num = true && that.isSetRowNum();
    if (this_present_row_num || that_present_row_num) {
      if (!(this_present_row_num && that_present_row_num))
        return false;
      if (this.row_num != that.row_num)
        return false;
    }

    boolean this_present_version_count = true && this.isSetVersionCount();
    boolean that_present_version_count = true && that.isSetVersionCount();
    if (this_present_version_count || that_present_version_count) {
      if (!(this_present_version_count && that_present_version_count))
        return false;
      if (this.version_count != that.version_count)
        return false;
    }

    boolean this_present_remote_data_size = true && this.isSetRemoteDataSize();
    boolean that_present_remote_data_size = true && that.isSetRemoteDataSize();
    if (this_present_remote_data_size || that_present_remote_data_size) {
      if (!(this_present_remote_data_size && that_present_remote_data_size))
        return false;
      if (this.remote_data_size != that.remote_data_size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tablet_id);

    hashCode = hashCode * 8191 + ((isSetDataSize()) ? 131071 : 524287);
    if (isSetDataSize())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(data_size);

    hashCode = hashCode * 8191 + ((isSetRowNum()) ? 131071 : 524287);
    if (isSetRowNum())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(row_num);

    hashCode = hashCode * 8191 + ((isSetVersionCount()) ? 131071 : 524287);
    if (isSetVersionCount())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(version_count);

    hashCode = hashCode * 8191 + ((isSetRemoteDataSize()) ? 131071 : 524287);
    if (isSetRemoteDataSize())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(remote_data_size);

    return hashCode;
  }

  @Override
  public int compareTo(TTabletStat other) {
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
    lastComparison = java.lang.Boolean.compare(isSetDataSize(), other.isSetDataSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_size, other.data_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRowNum(), other.isSetRowNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row_num, other.row_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersionCount(), other.isSetVersionCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version_count, other.version_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRemoteDataSize(), other.isSetRemoteDataSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoteDataSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remote_data_size, other.remote_data_size);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletStat(");
    boolean first = true;

    sb.append("tablet_id:");
    sb.append(this.tablet_id);
    first = false;
    if (isSetDataSize()) {
      if (!first) sb.append(", ");
      sb.append("data_size:");
      sb.append(this.data_size);
      first = false;
    }
    if (isSetRowNum()) {
      if (!first) sb.append(", ");
      sb.append("row_num:");
      sb.append(this.row_num);
      first = false;
    }
    if (isSetVersionCount()) {
      if (!first) sb.append(", ");
      sb.append("version_count:");
      sb.append(this.version_count);
      first = false;
    }
    if (isSetRemoteDataSize()) {
      if (!first) sb.append(", ");
      sb.append("remote_data_size:");
      sb.append(this.remote_data_size);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tablet_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TTabletStatStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletStatStandardScheme getScheme() {
      return new TTabletStatStandardScheme();
    }
  }

  private static class TTabletStatStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletStat> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletStat struct) throws org.apache.thrift.TException {
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
          case 2: // DATA_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.data_size = iprot.readI64();
              struct.setDataSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROW_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.row_num = iprot.readI64();
              struct.setRowNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSION_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version_count = iprot.readI64();
              struct.setVersionCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMOTE_DATA_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.remote_data_size = iprot.readI64();
              struct.setRemoteDataSizeIsSet(true);
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
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletStat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.tablet_id);
      oprot.writeFieldEnd();
      if (struct.isSetDataSize()) {
        oprot.writeFieldBegin(DATA_SIZE_FIELD_DESC);
        oprot.writeI64(struct.data_size);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRowNum()) {
        oprot.writeFieldBegin(ROW_NUM_FIELD_DESC);
        oprot.writeI64(struct.row_num);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVersionCount()) {
        oprot.writeFieldBegin(VERSION_COUNT_FIELD_DESC);
        oprot.writeI64(struct.version_count);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRemoteDataSize()) {
        oprot.writeFieldBegin(REMOTE_DATA_SIZE_FIELD_DESC);
        oprot.writeI64(struct.remote_data_size);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTabletStatTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletStatTupleScheme getScheme() {
      return new TTabletStatTupleScheme();
    }
  }

  private static class TTabletStatTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletStat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletStat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.tablet_id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDataSize()) {
        optionals.set(0);
      }
      if (struct.isSetRowNum()) {
        optionals.set(1);
      }
      if (struct.isSetVersionCount()) {
        optionals.set(2);
      }
      if (struct.isSetRemoteDataSize()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDataSize()) {
        oprot.writeI64(struct.data_size);
      }
      if (struct.isSetRowNum()) {
        oprot.writeI64(struct.row_num);
      }
      if (struct.isSetVersionCount()) {
        oprot.writeI64(struct.version_count);
      }
      if (struct.isSetRemoteDataSize()) {
        oprot.writeI64(struct.remote_data_size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletStat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tablet_id = iprot.readI64();
      struct.setTabletIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.data_size = iprot.readI64();
        struct.setDataSizeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.row_num = iprot.readI64();
        struct.setRowNumIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version_count = iprot.readI64();
        struct.setVersionCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.remote_data_size = iprot.readI64();
        struct.setRemoteDataSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

