/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TNodeInfo implements org.apache.thrift.TBase<TNodeInfo, TNodeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TNodeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TNodeInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("option", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ASYNC_INTERNAL_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("async_internal_port", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TNodeInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TNodeInfoTupleSchemeFactory();

  public long id; // required
  public long option; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String host; // required
  public int async_internal_port; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    OPTION((short)2, "option"),
    HOST((short)3, "host"),
    ASYNC_INTERNAL_PORT((short)4, "async_internal_port");

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
        case 2: // OPTION
          return OPTION;
        case 3: // HOST
          return HOST;
        case 4: // ASYNC_INTERNAL_PORT
          return ASYNC_INTERNAL_PORT;
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
  private static final int __OPTION_ISSET_ID = 1;
  private static final int __ASYNC_INTERNAL_PORT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPTION, new org.apache.thrift.meta_data.FieldMetaData("option", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ASYNC_INTERNAL_PORT, new org.apache.thrift.meta_data.FieldMetaData("async_internal_port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TNodeInfo.class, metaDataMap);
  }

  public TNodeInfo() {
  }

  public TNodeInfo(
    long id,
    long option,
    java.lang.String host,
    int async_internal_port)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.option = option;
    setOptionIsSet(true);
    this.host = host;
    this.async_internal_port = async_internal_port;
    setAsyncInternalPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TNodeInfo(TNodeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.option = other.option;
    if (other.isSetHost()) {
      this.host = other.host;
    }
    this.async_internal_port = other.async_internal_port;
  }

  @Override
  public TNodeInfo deepCopy() {
    return new TNodeInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setOptionIsSet(false);
    this.option = 0;
    this.host = null;
    setAsyncInternalPortIsSet(false);
    this.async_internal_port = 0;
  }

  public long getId() {
    return this.id;
  }

  public TNodeInfo setId(long id) {
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

  public long getOption() {
    return this.option;
  }

  public TNodeInfo setOption(long option) {
    this.option = option;
    setOptionIsSet(true);
    return this;
  }

  public void unsetOption() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPTION_ISSET_ID);
  }

  /** Returns true if field option is set (has been assigned a value) and false otherwise */
  public boolean isSetOption() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPTION_ISSET_ID);
  }

  public void setOptionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPTION_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHost() {
    return this.host;
  }

  public TNodeInfo setHost(@org.apache.thrift.annotation.Nullable java.lang.String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getAsyncInternalPort() {
    return this.async_internal_port;
  }

  public TNodeInfo setAsyncInternalPort(int async_internal_port) {
    this.async_internal_port = async_internal_port;
    setAsyncInternalPortIsSet(true);
    return this;
  }

  public void unsetAsyncInternalPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ASYNC_INTERNAL_PORT_ISSET_ID);
  }

  /** Returns true if field async_internal_port is set (has been assigned a value) and false otherwise */
  public boolean isSetAsyncInternalPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ASYNC_INTERNAL_PORT_ISSET_ID);
  }

  public void setAsyncInternalPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ASYNC_INTERNAL_PORT_ISSET_ID, value);
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

    case OPTION:
      if (value == null) {
        unsetOption();
      } else {
        setOption((java.lang.Long)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((java.lang.String)value);
      }
      break;

    case ASYNC_INTERNAL_PORT:
      if (value == null) {
        unsetAsyncInternalPort();
      } else {
        setAsyncInternalPort((java.lang.Integer)value);
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

    case OPTION:
      return getOption();

    case HOST:
      return getHost();

    case ASYNC_INTERNAL_PORT:
      return getAsyncInternalPort();

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
    case OPTION:
      return isSetOption();
    case HOST:
      return isSetHost();
    case ASYNC_INTERNAL_PORT:
      return isSetAsyncInternalPort();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TNodeInfo)
      return this.equals((TNodeInfo)that);
    return false;
  }

  public boolean equals(TNodeInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_option = true;
    boolean that_present_option = true;
    if (this_present_option || that_present_option) {
      if (!(this_present_option && that_present_option))
        return false;
      if (this.option != that.option)
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_async_internal_port = true;
    boolean that_present_async_internal_port = true;
    if (this_present_async_internal_port || that_present_async_internal_port) {
      if (!(this_present_async_internal_port && that_present_async_internal_port))
        return false;
      if (this.async_internal_port != that.async_internal_port)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(option);

    hashCode = hashCode * 8191 + ((isSetHost()) ? 131071 : 524287);
    if (isSetHost())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + async_internal_port;

    return hashCode;
  }

  @Override
  public int compareTo(TNodeInfo other) {
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
    lastComparison = java.lang.Boolean.compare(isSetOption(), other.isSetOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.option, other.option);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHost(), other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAsyncInternalPort(), other.isSetAsyncInternalPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsyncInternalPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.async_internal_port, other.async_internal_port);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TNodeInfo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("option:");
    sb.append(this.option);
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("async_internal_port:");
    sb.append(this.async_internal_port);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'option' because it's a primitive and you chose the non-beans generator.
    if (host == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'host' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'async_internal_port' because it's a primitive and you chose the non-beans generator.
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

  private static class TNodeInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TNodeInfoStandardScheme getScheme() {
      return new TNodeInfoStandardScheme();
    }
  }

  private static class TNodeInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TNodeInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TNodeInfo struct) throws org.apache.thrift.TException {
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
          case 2: // OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.option = iprot.readI64();
              struct.setOptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ASYNC_INTERNAL_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.async_internal_port = iprot.readI32();
              struct.setAsyncInternalPortIsSet(true);
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
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetOption()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'option' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetAsyncInternalPort()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'async_internal_port' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TNodeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPTION_FIELD_DESC);
      oprot.writeI64(struct.option);
      oprot.writeFieldEnd();
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ASYNC_INTERNAL_PORT_FIELD_DESC);
      oprot.writeI32(struct.async_internal_port);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TNodeInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TNodeInfoTupleScheme getScheme() {
      return new TNodeInfoTupleScheme();
    }
  }

  private static class TNodeInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TNodeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TNodeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.id);
      oprot.writeI64(struct.option);
      oprot.writeString(struct.host);
      oprot.writeI32(struct.async_internal_port);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TNodeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id = iprot.readI64();
      struct.setIdIsSet(true);
      struct.option = iprot.readI64();
      struct.setOptionIsSet(true);
      struct.host = iprot.readString();
      struct.setHostIsSet(true);
      struct.async_internal_port = iprot.readI32();
      struct.setAsyncInternalPortIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

