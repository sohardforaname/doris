/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TStorageMigrationReqV2 implements org.apache.thrift.TBase<TStorageMigrationReqV2, TStorageMigrationReqV2._Fields>, java.io.Serializable, Cloneable, Comparable<TStorageMigrationReqV2> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStorageMigrationReqV2");

  private static final org.apache.thrift.protocol.TField BASE_TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("base_tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("new_tablet_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("base_schema_hash", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField NEW_SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("new_schema_hash", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MIGRATION_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("migration_version", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TStorageMigrationReqV2StandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TStorageMigrationReqV2TupleSchemeFactory();

  public long base_tablet_id; // optional
  public long new_tablet_id; // optional
  public int base_schema_hash; // optional
  public int new_schema_hash; // optional
  public long migration_version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_TABLET_ID((short)1, "base_tablet_id"),
    NEW_TABLET_ID((short)2, "new_tablet_id"),
    BASE_SCHEMA_HASH((short)3, "base_schema_hash"),
    NEW_SCHEMA_HASH((short)4, "new_schema_hash"),
    MIGRATION_VERSION((short)5, "migration_version");

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
        case 1: // BASE_TABLET_ID
          return BASE_TABLET_ID;
        case 2: // NEW_TABLET_ID
          return NEW_TABLET_ID;
        case 3: // BASE_SCHEMA_HASH
          return BASE_SCHEMA_HASH;
        case 4: // NEW_SCHEMA_HASH
          return NEW_SCHEMA_HASH;
        case 5: // MIGRATION_VERSION
          return MIGRATION_VERSION;
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
  private static final int __BASE_TABLET_ID_ISSET_ID = 0;
  private static final int __NEW_TABLET_ID_ISSET_ID = 1;
  private static final int __BASE_SCHEMA_HASH_ISSET_ID = 2;
  private static final int __NEW_SCHEMA_HASH_ISSET_ID = 3;
  private static final int __MIGRATION_VERSION_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BASE_TABLET_ID,_Fields.NEW_TABLET_ID,_Fields.BASE_SCHEMA_HASH,_Fields.NEW_SCHEMA_HASH,_Fields.MIGRATION_VERSION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("base_tablet_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.NEW_TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("new_tablet_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.BASE_SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("base_schema_hash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.NEW_SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("new_schema_hash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.MIGRATION_VERSION, new org.apache.thrift.meta_data.FieldMetaData("migration_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TVersion")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStorageMigrationReqV2.class, metaDataMap);
  }

  public TStorageMigrationReqV2() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStorageMigrationReqV2(TStorageMigrationReqV2 other) {
    __isset_bitfield = other.__isset_bitfield;
    this.base_tablet_id = other.base_tablet_id;
    this.new_tablet_id = other.new_tablet_id;
    this.base_schema_hash = other.base_schema_hash;
    this.new_schema_hash = other.new_schema_hash;
    this.migration_version = other.migration_version;
  }

  @Override
  public TStorageMigrationReqV2 deepCopy() {
    return new TStorageMigrationReqV2(this);
  }

  @Override
  public void clear() {
    setBaseTabletIdIsSet(false);
    this.base_tablet_id = 0;
    setNewTabletIdIsSet(false);
    this.new_tablet_id = 0;
    setBaseSchemaHashIsSet(false);
    this.base_schema_hash = 0;
    setNewSchemaHashIsSet(false);
    this.new_schema_hash = 0;
    setMigrationVersionIsSet(false);
    this.migration_version = 0;
  }

  public long getBaseTabletId() {
    return this.base_tablet_id;
  }

  public TStorageMigrationReqV2 setBaseTabletId(long base_tablet_id) {
    this.base_tablet_id = base_tablet_id;
    setBaseTabletIdIsSet(true);
    return this;
  }

  public void unsetBaseTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID);
  }

  /** Returns true if field base_tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID);
  }

  public void setBaseTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID, value);
  }

  public long getNewTabletId() {
    return this.new_tablet_id;
  }

  public TStorageMigrationReqV2 setNewTabletId(long new_tablet_id) {
    this.new_tablet_id = new_tablet_id;
    setNewTabletIdIsSet(true);
    return this;
  }

  public void unsetNewTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEW_TABLET_ID_ISSET_ID);
  }

  /** Returns true if field new_tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetNewTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEW_TABLET_ID_ISSET_ID);
  }

  public void setNewTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEW_TABLET_ID_ISSET_ID, value);
  }

  public int getBaseSchemaHash() {
    return this.base_schema_hash;
  }

  public TStorageMigrationReqV2 setBaseSchemaHash(int base_schema_hash) {
    this.base_schema_hash = base_schema_hash;
    setBaseSchemaHashIsSet(true);
    return this;
  }

  public void unsetBaseSchemaHash() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field base_schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseSchemaHash() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID);
  }

  public void setBaseSchemaHashIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID, value);
  }

  public int getNewSchemaHash() {
    return this.new_schema_hash;
  }

  public TStorageMigrationReqV2 setNewSchemaHash(int new_schema_hash) {
    this.new_schema_hash = new_schema_hash;
    setNewSchemaHashIsSet(true);
    return this;
  }

  public void unsetNewSchemaHash() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEW_SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field new_schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetNewSchemaHash() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEW_SCHEMA_HASH_ISSET_ID);
  }

  public void setNewSchemaHashIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEW_SCHEMA_HASH_ISSET_ID, value);
  }

  public long getMigrationVersion() {
    return this.migration_version;
  }

  public TStorageMigrationReqV2 setMigrationVersion(long migration_version) {
    this.migration_version = migration_version;
    setMigrationVersionIsSet(true);
    return this;
  }

  public void unsetMigrationVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIGRATION_VERSION_ISSET_ID);
  }

  /** Returns true if field migration_version is set (has been assigned a value) and false otherwise */
  public boolean isSetMigrationVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIGRATION_VERSION_ISSET_ID);
  }

  public void setMigrationVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIGRATION_VERSION_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BASE_TABLET_ID:
      if (value == null) {
        unsetBaseTabletId();
      } else {
        setBaseTabletId((java.lang.Long)value);
      }
      break;

    case NEW_TABLET_ID:
      if (value == null) {
        unsetNewTabletId();
      } else {
        setNewTabletId((java.lang.Long)value);
      }
      break;

    case BASE_SCHEMA_HASH:
      if (value == null) {
        unsetBaseSchemaHash();
      } else {
        setBaseSchemaHash((java.lang.Integer)value);
      }
      break;

    case NEW_SCHEMA_HASH:
      if (value == null) {
        unsetNewSchemaHash();
      } else {
        setNewSchemaHash((java.lang.Integer)value);
      }
      break;

    case MIGRATION_VERSION:
      if (value == null) {
        unsetMigrationVersion();
      } else {
        setMigrationVersion((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_TABLET_ID:
      return getBaseTabletId();

    case NEW_TABLET_ID:
      return getNewTabletId();

    case BASE_SCHEMA_HASH:
      return getBaseSchemaHash();

    case NEW_SCHEMA_HASH:
      return getNewSchemaHash();

    case MIGRATION_VERSION:
      return getMigrationVersion();

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
    case BASE_TABLET_ID:
      return isSetBaseTabletId();
    case NEW_TABLET_ID:
      return isSetNewTabletId();
    case BASE_SCHEMA_HASH:
      return isSetBaseSchemaHash();
    case NEW_SCHEMA_HASH:
      return isSetNewSchemaHash();
    case MIGRATION_VERSION:
      return isSetMigrationVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TStorageMigrationReqV2)
      return this.equals((TStorageMigrationReqV2)that);
    return false;
  }

  public boolean equals(TStorageMigrationReqV2 that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_base_tablet_id = true && this.isSetBaseTabletId();
    boolean that_present_base_tablet_id = true && that.isSetBaseTabletId();
    if (this_present_base_tablet_id || that_present_base_tablet_id) {
      if (!(this_present_base_tablet_id && that_present_base_tablet_id))
        return false;
      if (this.base_tablet_id != that.base_tablet_id)
        return false;
    }

    boolean this_present_new_tablet_id = true && this.isSetNewTabletId();
    boolean that_present_new_tablet_id = true && that.isSetNewTabletId();
    if (this_present_new_tablet_id || that_present_new_tablet_id) {
      if (!(this_present_new_tablet_id && that_present_new_tablet_id))
        return false;
      if (this.new_tablet_id != that.new_tablet_id)
        return false;
    }

    boolean this_present_base_schema_hash = true && this.isSetBaseSchemaHash();
    boolean that_present_base_schema_hash = true && that.isSetBaseSchemaHash();
    if (this_present_base_schema_hash || that_present_base_schema_hash) {
      if (!(this_present_base_schema_hash && that_present_base_schema_hash))
        return false;
      if (this.base_schema_hash != that.base_schema_hash)
        return false;
    }

    boolean this_present_new_schema_hash = true && this.isSetNewSchemaHash();
    boolean that_present_new_schema_hash = true && that.isSetNewSchemaHash();
    if (this_present_new_schema_hash || that_present_new_schema_hash) {
      if (!(this_present_new_schema_hash && that_present_new_schema_hash))
        return false;
      if (this.new_schema_hash != that.new_schema_hash)
        return false;
    }

    boolean this_present_migration_version = true && this.isSetMigrationVersion();
    boolean that_present_migration_version = true && that.isSetMigrationVersion();
    if (this_present_migration_version || that_present_migration_version) {
      if (!(this_present_migration_version && that_present_migration_version))
        return false;
      if (this.migration_version != that.migration_version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBaseTabletId()) ? 131071 : 524287);
    if (isSetBaseTabletId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(base_tablet_id);

    hashCode = hashCode * 8191 + ((isSetNewTabletId()) ? 131071 : 524287);
    if (isSetNewTabletId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(new_tablet_id);

    hashCode = hashCode * 8191 + ((isSetBaseSchemaHash()) ? 131071 : 524287);
    if (isSetBaseSchemaHash())
      hashCode = hashCode * 8191 + base_schema_hash;

    hashCode = hashCode * 8191 + ((isSetNewSchemaHash()) ? 131071 : 524287);
    if (isSetNewSchemaHash())
      hashCode = hashCode * 8191 + new_schema_hash;

    hashCode = hashCode * 8191 + ((isSetMigrationVersion()) ? 131071 : 524287);
    if (isSetMigrationVersion())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(migration_version);

    return hashCode;
  }

  @Override
  public int compareTo(TStorageMigrationReqV2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBaseTabletId(), other.isSetBaseTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_tablet_id, other.base_tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNewTabletId(), other.isSetNewTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.new_tablet_id, other.new_tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBaseSchemaHash(), other.isSetBaseSchemaHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseSchemaHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_schema_hash, other.base_schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNewSchemaHash(), other.isSetNewSchemaHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewSchemaHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.new_schema_hash, other.new_schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMigrationVersion(), other.isSetMigrationVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMigrationVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.migration_version, other.migration_version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TStorageMigrationReqV2(");
    boolean first = true;

    if (isSetBaseTabletId()) {
      sb.append("base_tablet_id:");
      sb.append(this.base_tablet_id);
      first = false;
    }
    if (isSetNewTabletId()) {
      if (!first) sb.append(", ");
      sb.append("new_tablet_id:");
      sb.append(this.new_tablet_id);
      first = false;
    }
    if (isSetBaseSchemaHash()) {
      if (!first) sb.append(", ");
      sb.append("base_schema_hash:");
      sb.append(this.base_schema_hash);
      first = false;
    }
    if (isSetNewSchemaHash()) {
      if (!first) sb.append(", ");
      sb.append("new_schema_hash:");
      sb.append(this.new_schema_hash);
      first = false;
    }
    if (isSetMigrationVersion()) {
      if (!first) sb.append(", ");
      sb.append("migration_version:");
      sb.append(this.migration_version);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TStorageMigrationReqV2StandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStorageMigrationReqV2StandardScheme getScheme() {
      return new TStorageMigrationReqV2StandardScheme();
    }
  }

  private static class TStorageMigrationReqV2StandardScheme extends org.apache.thrift.scheme.StandardScheme<TStorageMigrationReqV2> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TStorageMigrationReqV2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.base_tablet_id = iprot.readI64();
              struct.setBaseTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.new_tablet_id = iprot.readI64();
              struct.setNewTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BASE_SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.base_schema_hash = iprot.readI32();
              struct.setBaseSchemaHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NEW_SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.new_schema_hash = iprot.readI32();
              struct.setNewSchemaHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MIGRATION_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.migration_version = iprot.readI64();
              struct.setMigrationVersionIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TStorageMigrationReqV2 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBaseTabletId()) {
        oprot.writeFieldBegin(BASE_TABLET_ID_FIELD_DESC);
        oprot.writeI64(struct.base_tablet_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNewTabletId()) {
        oprot.writeFieldBegin(NEW_TABLET_ID_FIELD_DESC);
        oprot.writeI64(struct.new_tablet_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBaseSchemaHash()) {
        oprot.writeFieldBegin(BASE_SCHEMA_HASH_FIELD_DESC);
        oprot.writeI32(struct.base_schema_hash);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNewSchemaHash()) {
        oprot.writeFieldBegin(NEW_SCHEMA_HASH_FIELD_DESC);
        oprot.writeI32(struct.new_schema_hash);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMigrationVersion()) {
        oprot.writeFieldBegin(MIGRATION_VERSION_FIELD_DESC);
        oprot.writeI64(struct.migration_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStorageMigrationReqV2TupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStorageMigrationReqV2TupleScheme getScheme() {
      return new TStorageMigrationReqV2TupleScheme();
    }
  }

  private static class TStorageMigrationReqV2TupleScheme extends org.apache.thrift.scheme.TupleScheme<TStorageMigrationReqV2> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStorageMigrationReqV2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBaseTabletId()) {
        optionals.set(0);
      }
      if (struct.isSetNewTabletId()) {
        optionals.set(1);
      }
      if (struct.isSetBaseSchemaHash()) {
        optionals.set(2);
      }
      if (struct.isSetNewSchemaHash()) {
        optionals.set(3);
      }
      if (struct.isSetMigrationVersion()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBaseTabletId()) {
        oprot.writeI64(struct.base_tablet_id);
      }
      if (struct.isSetNewTabletId()) {
        oprot.writeI64(struct.new_tablet_id);
      }
      if (struct.isSetBaseSchemaHash()) {
        oprot.writeI32(struct.base_schema_hash);
      }
      if (struct.isSetNewSchemaHash()) {
        oprot.writeI32(struct.new_schema_hash);
      }
      if (struct.isSetMigrationVersion()) {
        oprot.writeI64(struct.migration_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStorageMigrationReqV2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.base_tablet_id = iprot.readI64();
        struct.setBaseTabletIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.new_tablet_id = iprot.readI64();
        struct.setNewTabletIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.base_schema_hash = iprot.readI32();
        struct.setBaseSchemaHashIsSet(true);
      }
      if (incoming.get(3)) {
        struct.new_schema_hash = iprot.readI32();
        struct.setNewSchemaHashIsSet(true);
      }
      if (incoming.get(4)) {
        struct.migration_version = iprot.readI64();
        struct.setMigrationVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

