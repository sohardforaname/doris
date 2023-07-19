/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TCooldownConf implements org.apache.thrift.TBase<TCooldownConf, TCooldownConf._Fields>, java.io.Serializable, Cloneable, Comparable<TCooldownConf> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCooldownConf");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField COOLDOWN_REPLICA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cooldown_replica_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField COOLDOWN_TERM_FIELD_DESC = new org.apache.thrift.protocol.TField("cooldown_term", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCooldownConfStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCooldownConfTupleSchemeFactory();

  public long tablet_id; // required
  public long cooldown_replica_id; // optional
  public long cooldown_term; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tablet_id"),
    COOLDOWN_REPLICA_ID((short)2, "cooldown_replica_id"),
    COOLDOWN_TERM((short)3, "cooldown_term");

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
        case 2: // COOLDOWN_REPLICA_ID
          return COOLDOWN_REPLICA_ID;
        case 3: // COOLDOWN_TERM
          return COOLDOWN_TERM;
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
  private static final int __COOLDOWN_REPLICA_ID_ISSET_ID = 1;
  private static final int __COOLDOWN_TERM_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COOLDOWN_REPLICA_ID,_Fields.COOLDOWN_TERM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.COOLDOWN_REPLICA_ID, new org.apache.thrift.meta_data.FieldMetaData("cooldown_replica_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TReplicaId")));
    tmpMap.put(_Fields.COOLDOWN_TERM, new org.apache.thrift.meta_data.FieldMetaData("cooldown_term", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCooldownConf.class, metaDataMap);
  }

  public TCooldownConf() {
  }

  public TCooldownConf(
    long tablet_id)
  {
    this();
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCooldownConf(TCooldownConf other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tablet_id = other.tablet_id;
    this.cooldown_replica_id = other.cooldown_replica_id;
    this.cooldown_term = other.cooldown_term;
  }

  @Override
  public TCooldownConf deepCopy() {
    return new TCooldownConf(this);
  }

  @Override
  public void clear() {
    setTabletIdIsSet(false);
    this.tablet_id = 0;
    setCooldownReplicaIdIsSet(false);
    this.cooldown_replica_id = 0;
    setCooldownTermIsSet(false);
    this.cooldown_term = 0;
  }

  public long getTabletId() {
    return this.tablet_id;
  }

  public TCooldownConf setTabletId(long tablet_id) {
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

  public long getCooldownReplicaId() {
    return this.cooldown_replica_id;
  }

  public TCooldownConf setCooldownReplicaId(long cooldown_replica_id) {
    this.cooldown_replica_id = cooldown_replica_id;
    setCooldownReplicaIdIsSet(true);
    return this;
  }

  public void unsetCooldownReplicaId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COOLDOWN_REPLICA_ID_ISSET_ID);
  }

  /** Returns true if field cooldown_replica_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCooldownReplicaId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COOLDOWN_REPLICA_ID_ISSET_ID);
  }

  public void setCooldownReplicaIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COOLDOWN_REPLICA_ID_ISSET_ID, value);
  }

  public long getCooldownTerm() {
    return this.cooldown_term;
  }

  public TCooldownConf setCooldownTerm(long cooldown_term) {
    this.cooldown_term = cooldown_term;
    setCooldownTermIsSet(true);
    return this;
  }

  public void unsetCooldownTerm() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COOLDOWN_TERM_ISSET_ID);
  }

  /** Returns true if field cooldown_term is set (has been assigned a value) and false otherwise */
  public boolean isSetCooldownTerm() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COOLDOWN_TERM_ISSET_ID);
  }

  public void setCooldownTermIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COOLDOWN_TERM_ISSET_ID, value);
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

    case COOLDOWN_REPLICA_ID:
      if (value == null) {
        unsetCooldownReplicaId();
      } else {
        setCooldownReplicaId((java.lang.Long)value);
      }
      break;

    case COOLDOWN_TERM:
      if (value == null) {
        unsetCooldownTerm();
      } else {
        setCooldownTerm((java.lang.Long)value);
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

    case COOLDOWN_REPLICA_ID:
      return getCooldownReplicaId();

    case COOLDOWN_TERM:
      return getCooldownTerm();

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
    case COOLDOWN_REPLICA_ID:
      return isSetCooldownReplicaId();
    case COOLDOWN_TERM:
      return isSetCooldownTerm();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCooldownConf)
      return this.equals((TCooldownConf)that);
    return false;
  }

  public boolean equals(TCooldownConf that) {
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

    boolean this_present_cooldown_replica_id = true && this.isSetCooldownReplicaId();
    boolean that_present_cooldown_replica_id = true && that.isSetCooldownReplicaId();
    if (this_present_cooldown_replica_id || that_present_cooldown_replica_id) {
      if (!(this_present_cooldown_replica_id && that_present_cooldown_replica_id))
        return false;
      if (this.cooldown_replica_id != that.cooldown_replica_id)
        return false;
    }

    boolean this_present_cooldown_term = true && this.isSetCooldownTerm();
    boolean that_present_cooldown_term = true && that.isSetCooldownTerm();
    if (this_present_cooldown_term || that_present_cooldown_term) {
      if (!(this_present_cooldown_term && that_present_cooldown_term))
        return false;
      if (this.cooldown_term != that.cooldown_term)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tablet_id);

    hashCode = hashCode * 8191 + ((isSetCooldownReplicaId()) ? 131071 : 524287);
    if (isSetCooldownReplicaId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cooldown_replica_id);

    hashCode = hashCode * 8191 + ((isSetCooldownTerm()) ? 131071 : 524287);
    if (isSetCooldownTerm())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cooldown_term);

    return hashCode;
  }

  @Override
  public int compareTo(TCooldownConf other) {
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
    lastComparison = java.lang.Boolean.compare(isSetCooldownReplicaId(), other.isSetCooldownReplicaId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCooldownReplicaId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cooldown_replica_id, other.cooldown_replica_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCooldownTerm(), other.isSetCooldownTerm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCooldownTerm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cooldown_term, other.cooldown_term);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCooldownConf(");
    boolean first = true;

    sb.append("tablet_id:");
    sb.append(this.tablet_id);
    first = false;
    if (isSetCooldownReplicaId()) {
      if (!first) sb.append(", ");
      sb.append("cooldown_replica_id:");
      sb.append(this.cooldown_replica_id);
      first = false;
    }
    if (isSetCooldownTerm()) {
      if (!first) sb.append(", ");
      sb.append("cooldown_term:");
      sb.append(this.cooldown_term);
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

  private static class TCooldownConfStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCooldownConfStandardScheme getScheme() {
      return new TCooldownConfStandardScheme();
    }
  }

  private static class TCooldownConfStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCooldownConf> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TCooldownConf struct) throws org.apache.thrift.TException {
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
          case 2: // COOLDOWN_REPLICA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cooldown_replica_id = iprot.readI64();
              struct.setCooldownReplicaIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COOLDOWN_TERM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cooldown_term = iprot.readI64();
              struct.setCooldownTermIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TCooldownConf struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.tablet_id);
      oprot.writeFieldEnd();
      if (struct.isSetCooldownReplicaId()) {
        oprot.writeFieldBegin(COOLDOWN_REPLICA_ID_FIELD_DESC);
        oprot.writeI64(struct.cooldown_replica_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCooldownTerm()) {
        oprot.writeFieldBegin(COOLDOWN_TERM_FIELD_DESC);
        oprot.writeI64(struct.cooldown_term);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCooldownConfTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCooldownConfTupleScheme getScheme() {
      return new TCooldownConfTupleScheme();
    }
  }

  private static class TCooldownConfTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCooldownConf> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCooldownConf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.tablet_id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCooldownReplicaId()) {
        optionals.set(0);
      }
      if (struct.isSetCooldownTerm()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCooldownReplicaId()) {
        oprot.writeI64(struct.cooldown_replica_id);
      }
      if (struct.isSetCooldownTerm()) {
        oprot.writeI64(struct.cooldown_term);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCooldownConf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tablet_id = iprot.readI64();
      struct.setTabletIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cooldown_replica_id = iprot.readI64();
        struct.setCooldownReplicaIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cooldown_term = iprot.readI64();
        struct.setCooldownTermIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

