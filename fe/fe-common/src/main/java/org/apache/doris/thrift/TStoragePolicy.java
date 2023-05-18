/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TStoragePolicy implements org.apache.thrift.TBase<TStoragePolicy, TStoragePolicy._Fields>, java.io.Serializable, Cloneable, Comparable<TStoragePolicy> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStoragePolicy");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField COOLDOWN_DATETIME_FIELD_DESC = new org.apache.thrift.protocol.TField("cooldown_datetime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField COOLDOWN_TTL_FIELD_DESC = new org.apache.thrift.protocol.TField("cooldown_ttl", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField RESOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("resource_id", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TStoragePolicyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TStoragePolicyTupleSchemeFactory();

  public long id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public long version; // optional
  public long cooldown_datetime; // optional
  public long cooldown_ttl; // optional
  public long resource_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    VERSION((short)3, "version"),
    COOLDOWN_DATETIME((short)4, "cooldown_datetime"),
    COOLDOWN_TTL((short)5, "cooldown_ttl"),
    RESOURCE_ID((short)6, "resource_id");

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
        case 2: // NAME
          return NAME;
        case 3: // VERSION
          return VERSION;
        case 4: // COOLDOWN_DATETIME
          return COOLDOWN_DATETIME;
        case 5: // COOLDOWN_TTL
          return COOLDOWN_TTL;
        case 6: // RESOURCE_ID
          return RESOURCE_ID;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __COOLDOWN_DATETIME_ISSET_ID = 2;
  private static final int __COOLDOWN_TTL_ISSET_ID = 3;
  private static final int __RESOURCE_ID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.NAME,_Fields.VERSION,_Fields.COOLDOWN_DATETIME,_Fields.COOLDOWN_TTL,_Fields.RESOURCE_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COOLDOWN_DATETIME, new org.apache.thrift.meta_data.FieldMetaData("cooldown_datetime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COOLDOWN_TTL, new org.apache.thrift.meta_data.FieldMetaData("cooldown_ttl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RESOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("resource_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStoragePolicy.class, metaDataMap);
  }

  public TStoragePolicy() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStoragePolicy(TStoragePolicy other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.version = other.version;
    this.cooldown_datetime = other.cooldown_datetime;
    this.cooldown_ttl = other.cooldown_ttl;
    this.resource_id = other.resource_id;
  }

  @Override
  public TStoragePolicy deepCopy() {
    return new TStoragePolicy(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    setVersionIsSet(false);
    this.version = 0;
    setCooldownDatetimeIsSet(false);
    this.cooldown_datetime = 0;
    setCooldownTtlIsSet(false);
    this.cooldown_ttl = 0;
    setResourceIdIsSet(false);
    this.resource_id = 0;
  }

  public long getId() {
    return this.id;
  }

  public TStoragePolicy setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public TStoragePolicy setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long getVersion() {
    return this.version;
  }

  public TStoragePolicy setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public long getCooldownDatetime() {
    return this.cooldown_datetime;
  }

  public TStoragePolicy setCooldownDatetime(long cooldown_datetime) {
    this.cooldown_datetime = cooldown_datetime;
    setCooldownDatetimeIsSet(true);
    return this;
  }

  public void unsetCooldownDatetime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COOLDOWN_DATETIME_ISSET_ID);
  }

  /** Returns true if field cooldown_datetime is set (has been assigned a value) and false otherwise */
  public boolean isSetCooldownDatetime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COOLDOWN_DATETIME_ISSET_ID);
  }

  public void setCooldownDatetimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COOLDOWN_DATETIME_ISSET_ID, value);
  }

  public long getCooldownTtl() {
    return this.cooldown_ttl;
  }

  public TStoragePolicy setCooldownTtl(long cooldown_ttl) {
    this.cooldown_ttl = cooldown_ttl;
    setCooldownTtlIsSet(true);
    return this;
  }

  public void unsetCooldownTtl() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COOLDOWN_TTL_ISSET_ID);
  }

  /** Returns true if field cooldown_ttl is set (has been assigned a value) and false otherwise */
  public boolean isSetCooldownTtl() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COOLDOWN_TTL_ISSET_ID);
  }

  public void setCooldownTtlIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COOLDOWN_TTL_ISSET_ID, value);
  }

  public long getResourceId() {
    return this.resource_id;
  }

  public TStoragePolicy setResourceId(long resource_id) {
    this.resource_id = resource_id;
    setResourceIdIsSet(true);
    return this;
  }

  public void unsetResourceId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RESOURCE_ID_ISSET_ID);
  }

  /** Returns true if field resource_id is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RESOURCE_ID_ISSET_ID);
  }

  public void setResourceIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RESOURCE_ID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Long)value);
      }
      break;

    case COOLDOWN_DATETIME:
      if (value == null) {
        unsetCooldownDatetime();
      } else {
        setCooldownDatetime((java.lang.Long)value);
      }
      break;

    case COOLDOWN_TTL:
      if (value == null) {
        unsetCooldownTtl();
      } else {
        setCooldownTtl((java.lang.Long)value);
      }
      break;

    case RESOURCE_ID:
      if (value == null) {
        unsetResourceId();
      } else {
        setResourceId((java.lang.Long)value);
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

    case NAME:
      return getName();

    case VERSION:
      return getVersion();

    case COOLDOWN_DATETIME:
      return getCooldownDatetime();

    case COOLDOWN_TTL:
      return getCooldownTtl();

    case RESOURCE_ID:
      return getResourceId();

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
    case NAME:
      return isSetName();
    case VERSION:
      return isSetVersion();
    case COOLDOWN_DATETIME:
      return isSetCooldownDatetime();
    case COOLDOWN_TTL:
      return isSetCooldownTtl();
    case RESOURCE_ID:
      return isSetResourceId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TStoragePolicy)
      return this.equals((TStoragePolicy)that);
    return false;
  }

  public boolean equals(TStoragePolicy that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_cooldown_datetime = true && this.isSetCooldownDatetime();
    boolean that_present_cooldown_datetime = true && that.isSetCooldownDatetime();
    if (this_present_cooldown_datetime || that_present_cooldown_datetime) {
      if (!(this_present_cooldown_datetime && that_present_cooldown_datetime))
        return false;
      if (this.cooldown_datetime != that.cooldown_datetime)
        return false;
    }

    boolean this_present_cooldown_ttl = true && this.isSetCooldownTtl();
    boolean that_present_cooldown_ttl = true && that.isSetCooldownTtl();
    if (this_present_cooldown_ttl || that_present_cooldown_ttl) {
      if (!(this_present_cooldown_ttl && that_present_cooldown_ttl))
        return false;
      if (this.cooldown_ttl != that.cooldown_ttl)
        return false;
    }

    boolean this_present_resource_id = true && this.isSetResourceId();
    boolean that_present_resource_id = true && that.isSetResourceId();
    if (this_present_resource_id || that_present_resource_id) {
      if (!(this_present_resource_id && that_present_resource_id))
        return false;
      if (this.resource_id != that.resource_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(version);

    hashCode = hashCode * 8191 + ((isSetCooldownDatetime()) ? 131071 : 524287);
    if (isSetCooldownDatetime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cooldown_datetime);

    hashCode = hashCode * 8191 + ((isSetCooldownTtl()) ? 131071 : 524287);
    if (isSetCooldownTtl())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cooldown_ttl);

    hashCode = hashCode * 8191 + ((isSetResourceId()) ? 131071 : 524287);
    if (isSetResourceId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(resource_id);

    return hashCode;
  }

  @Override
  public int compareTo(TStoragePolicy other) {
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
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersion(), other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCooldownDatetime(), other.isSetCooldownDatetime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCooldownDatetime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cooldown_datetime, other.cooldown_datetime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCooldownTtl(), other.isSetCooldownTtl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCooldownTtl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cooldown_ttl, other.cooldown_ttl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResourceId(), other.isSetResourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource_id, other.resource_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TStoragePolicy(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      sb.append(this.version);
      first = false;
    }
    if (isSetCooldownDatetime()) {
      if (!first) sb.append(", ");
      sb.append("cooldown_datetime:");
      sb.append(this.cooldown_datetime);
      first = false;
    }
    if (isSetCooldownTtl()) {
      if (!first) sb.append(", ");
      sb.append("cooldown_ttl:");
      sb.append(this.cooldown_ttl);
      first = false;
    }
    if (isSetResourceId()) {
      if (!first) sb.append(", ");
      sb.append("resource_id:");
      sb.append(this.resource_id);
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

  private static class TStoragePolicyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStoragePolicyStandardScheme getScheme() {
      return new TStoragePolicyStandardScheme();
    }
  }

  private static class TStoragePolicyStandardScheme extends org.apache.thrift.scheme.StandardScheme<TStoragePolicy> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TStoragePolicy struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COOLDOWN_DATETIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cooldown_datetime = iprot.readI64();
              struct.setCooldownDatetimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COOLDOWN_TTL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cooldown_ttl = iprot.readI64();
              struct.setCooldownTtlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RESOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.resource_id = iprot.readI64();
              struct.setResourceIdIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TStoragePolicy struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetVersion()) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI64(struct.version);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCooldownDatetime()) {
        oprot.writeFieldBegin(COOLDOWN_DATETIME_FIELD_DESC);
        oprot.writeI64(struct.cooldown_datetime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCooldownTtl()) {
        oprot.writeFieldBegin(COOLDOWN_TTL_FIELD_DESC);
        oprot.writeI64(struct.cooldown_ttl);
        oprot.writeFieldEnd();
      }
      if (struct.isSetResourceId()) {
        oprot.writeFieldBegin(RESOURCE_ID_FIELD_DESC);
        oprot.writeI64(struct.resource_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStoragePolicyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TStoragePolicyTupleScheme getScheme() {
      return new TStoragePolicyTupleScheme();
    }
  }

  private static class TStoragePolicyTupleScheme extends org.apache.thrift.scheme.TupleScheme<TStoragePolicy> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStoragePolicy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetCooldownDatetime()) {
        optionals.set(3);
      }
      if (struct.isSetCooldownTtl()) {
        optionals.set(4);
      }
      if (struct.isSetResourceId()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetVersion()) {
        oprot.writeI64(struct.version);
      }
      if (struct.isSetCooldownDatetime()) {
        oprot.writeI64(struct.cooldown_datetime);
      }
      if (struct.isSetCooldownTtl()) {
        oprot.writeI64(struct.cooldown_ttl);
      }
      if (struct.isSetResourceId()) {
        oprot.writeI64(struct.resource_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStoragePolicy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readI64();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cooldown_datetime = iprot.readI64();
        struct.setCooldownDatetimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.cooldown_ttl = iprot.readI64();
        struct.setCooldownTtlIsSet(true);
      }
      if (incoming.get(5)) {
        struct.resource_id = iprot.readI64();
        struct.setResourceIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

