/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TLoadErrorHubInfo implements org.apache.thrift.TBase<TLoadErrorHubInfo, TLoadErrorHubInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TLoadErrorHubInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLoadErrorHubInfo");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MYSQL_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("mysql_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BROKER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("broker_info", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLoadErrorHubInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLoadErrorHubInfoTupleSchemeFactory();

  /**
   * 
   * @see TErrorHubType
   */
  public @org.apache.thrift.annotation.Nullable TErrorHubType type; // required
  public @org.apache.thrift.annotation.Nullable TMysqlErrorHubInfo mysql_info; // optional
  public @org.apache.thrift.annotation.Nullable TBrokerErrorHubInfo broker_info; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TErrorHubType
     */
    TYPE((short)1, "type"),
    MYSQL_INFO((short)2, "mysql_info"),
    BROKER_INFO((short)3, "broker_info");

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
        case 1: // TYPE
          return TYPE;
        case 2: // MYSQL_INFO
          return MYSQL_INFO;
        case 3: // BROKER_INFO
          return BROKER_INFO;
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
  private static final _Fields optionals[] = {_Fields.MYSQL_INFO,_Fields.BROKER_INFO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TErrorHubType.class)));
    tmpMap.put(_Fields.MYSQL_INFO, new org.apache.thrift.meta_data.FieldMetaData("mysql_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMysqlErrorHubInfo.class)));
    tmpMap.put(_Fields.BROKER_INFO, new org.apache.thrift.meta_data.FieldMetaData("broker_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerErrorHubInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLoadErrorHubInfo.class, metaDataMap);
  }

  public TLoadErrorHubInfo() {
    this.type = org.apache.doris.thrift.TErrorHubType.NULL_TYPE;

  }

  public TLoadErrorHubInfo(
    TErrorHubType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLoadErrorHubInfo(TLoadErrorHubInfo other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetMysqlInfo()) {
      this.mysql_info = new TMysqlErrorHubInfo(other.mysql_info);
    }
    if (other.isSetBrokerInfo()) {
      this.broker_info = new TBrokerErrorHubInfo(other.broker_info);
    }
  }

  @Override
  public TLoadErrorHubInfo deepCopy() {
    return new TLoadErrorHubInfo(this);
  }

  @Override
  public void clear() {
    this.type = org.apache.doris.thrift.TErrorHubType.NULL_TYPE;

    this.mysql_info = null;
    this.broker_info = null;
  }

  /**
   * 
   * @see TErrorHubType
   */
  @org.apache.thrift.annotation.Nullable
  public TErrorHubType getType() {
    return this.type;
  }

  /**
   * 
   * @see TErrorHubType
   */
  public TLoadErrorHubInfo setType(@org.apache.thrift.annotation.Nullable TErrorHubType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TMysqlErrorHubInfo getMysqlInfo() {
    return this.mysql_info;
  }

  public TLoadErrorHubInfo setMysqlInfo(@org.apache.thrift.annotation.Nullable TMysqlErrorHubInfo mysql_info) {
    this.mysql_info = mysql_info;
    return this;
  }

  public void unsetMysqlInfo() {
    this.mysql_info = null;
  }

  /** Returns true if field mysql_info is set (has been assigned a value) and false otherwise */
  public boolean isSetMysqlInfo() {
    return this.mysql_info != null;
  }

  public void setMysqlInfoIsSet(boolean value) {
    if (!value) {
      this.mysql_info = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBrokerErrorHubInfo getBrokerInfo() {
    return this.broker_info;
  }

  public TLoadErrorHubInfo setBrokerInfo(@org.apache.thrift.annotation.Nullable TBrokerErrorHubInfo broker_info) {
    this.broker_info = broker_info;
    return this;
  }

  public void unsetBrokerInfo() {
    this.broker_info = null;
  }

  /** Returns true if field broker_info is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokerInfo() {
    return this.broker_info != null;
  }

  public void setBrokerInfoIsSet(boolean value) {
    if (!value) {
      this.broker_info = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TErrorHubType)value);
      }
      break;

    case MYSQL_INFO:
      if (value == null) {
        unsetMysqlInfo();
      } else {
        setMysqlInfo((TMysqlErrorHubInfo)value);
      }
      break;

    case BROKER_INFO:
      if (value == null) {
        unsetBrokerInfo();
      } else {
        setBrokerInfo((TBrokerErrorHubInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case MYSQL_INFO:
      return getMysqlInfo();

    case BROKER_INFO:
      return getBrokerInfo();

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
    case TYPE:
      return isSetType();
    case MYSQL_INFO:
      return isSetMysqlInfo();
    case BROKER_INFO:
      return isSetBrokerInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLoadErrorHubInfo)
      return this.equals((TLoadErrorHubInfo)that);
    return false;
  }

  public boolean equals(TLoadErrorHubInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_mysql_info = true && this.isSetMysqlInfo();
    boolean that_present_mysql_info = true && that.isSetMysqlInfo();
    if (this_present_mysql_info || that_present_mysql_info) {
      if (!(this_present_mysql_info && that_present_mysql_info))
        return false;
      if (!this.mysql_info.equals(that.mysql_info))
        return false;
    }

    boolean this_present_broker_info = true && this.isSetBrokerInfo();
    boolean that_present_broker_info = true && that.isSetBrokerInfo();
    if (this_present_broker_info || that_present_broker_info) {
      if (!(this_present_broker_info && that_present_broker_info))
        return false;
      if (!this.broker_info.equals(that.broker_info))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetMysqlInfo()) ? 131071 : 524287);
    if (isSetMysqlInfo())
      hashCode = hashCode * 8191 + mysql_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetBrokerInfo()) ? 131071 : 524287);
    if (isSetBrokerInfo())
      hashCode = hashCode * 8191 + broker_info.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TLoadErrorHubInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMysqlInfo(), other.isSetMysqlInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMysqlInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mysql_info, other.mysql_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBrokerInfo(), other.isSetBrokerInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokerInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.broker_info, other.broker_info);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLoadErrorHubInfo(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetMysqlInfo()) {
      if (!first) sb.append(", ");
      sb.append("mysql_info:");
      if (this.mysql_info == null) {
        sb.append("null");
      } else {
        sb.append(this.mysql_info);
      }
      first = false;
    }
    if (isSetBrokerInfo()) {
      if (!first) sb.append(", ");
      sb.append("broker_info:");
      if (this.broker_info == null) {
        sb.append("null");
      } else {
        sb.append(this.broker_info);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (mysql_info != null) {
      mysql_info.validate();
    }
    if (broker_info != null) {
      broker_info.validate();
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

  private static class TLoadErrorHubInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLoadErrorHubInfoStandardScheme getScheme() {
      return new TLoadErrorHubInfoStandardScheme();
    }
  }

  private static class TLoadErrorHubInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLoadErrorHubInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.doris.thrift.TErrorHubType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MYSQL_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mysql_info = new TMysqlErrorHubInfo();
              struct.mysql_info.read(iprot);
              struct.setMysqlInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BROKER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.broker_info = new TBrokerErrorHubInfo();
              struct.broker_info.read(iprot);
              struct.setBrokerInfoIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mysql_info != null) {
        if (struct.isSetMysqlInfo()) {
          oprot.writeFieldBegin(MYSQL_INFO_FIELD_DESC);
          struct.mysql_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.broker_info != null) {
        if (struct.isSetBrokerInfo()) {
          oprot.writeFieldBegin(BROKER_INFO_FIELD_DESC);
          struct.broker_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLoadErrorHubInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLoadErrorHubInfoTupleScheme getScheme() {
      return new TLoadErrorHubInfoTupleScheme();
    }
  }

  private static class TLoadErrorHubInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLoadErrorHubInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMysqlInfo()) {
        optionals.set(0);
      }
      if (struct.isSetBrokerInfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMysqlInfo()) {
        struct.mysql_info.write(oprot);
      }
      if (struct.isSetBrokerInfo()) {
        struct.broker_info.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.type = org.apache.doris.thrift.TErrorHubType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.mysql_info = new TMysqlErrorHubInfo();
        struct.mysql_info.read(iprot);
        struct.setMysqlInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.broker_info = new TBrokerErrorHubInfo();
        struct.broker_info.read(iprot);
        struct.setBrokerInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

