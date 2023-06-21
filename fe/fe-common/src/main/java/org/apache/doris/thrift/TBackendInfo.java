/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TBackendInfo implements org.apache.thrift.TBase<TBackendInfo, TBackendInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TBackendInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBackendInfo");

  private static final org.apache.thrift.protocol.TField BE_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("be_port", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HTTP_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("http_port", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BE_RPC_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("be_rpc_port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BRPC_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("brpc_port", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BE_START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("be_start_time", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField BE_NODE_ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("be_node_role", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBackendInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBackendInfoTupleSchemeFactory();

  public int be_port; // required
  public int http_port; // required
  public int be_rpc_port; // optional
  public int brpc_port; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String version; // optional
  public long be_start_time; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String be_node_role; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BE_PORT((short)1, "be_port"),
    HTTP_PORT((short)2, "http_port"),
    BE_RPC_PORT((short)3, "be_rpc_port"),
    BRPC_PORT((short)4, "brpc_port"),
    VERSION((short)5, "version"),
    BE_START_TIME((short)6, "be_start_time"),
    BE_NODE_ROLE((short)7, "be_node_role");

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
        case 1: // BE_PORT
          return BE_PORT;
        case 2: // HTTP_PORT
          return HTTP_PORT;
        case 3: // BE_RPC_PORT
          return BE_RPC_PORT;
        case 4: // BRPC_PORT
          return BRPC_PORT;
        case 5: // VERSION
          return VERSION;
        case 6: // BE_START_TIME
          return BE_START_TIME;
        case 7: // BE_NODE_ROLE
          return BE_NODE_ROLE;
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
  private static final int __BE_PORT_ISSET_ID = 0;
  private static final int __HTTP_PORT_ISSET_ID = 1;
  private static final int __BE_RPC_PORT_ISSET_ID = 2;
  private static final int __BRPC_PORT_ISSET_ID = 3;
  private static final int __BE_START_TIME_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BE_RPC_PORT,_Fields.BRPC_PORT,_Fields.VERSION,_Fields.BE_START_TIME,_Fields.BE_NODE_ROLE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BE_PORT, new org.apache.thrift.meta_data.FieldMetaData("be_port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPort")));
    tmpMap.put(_Fields.HTTP_PORT, new org.apache.thrift.meta_data.FieldMetaData("http_port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPort")));
    tmpMap.put(_Fields.BE_RPC_PORT, new org.apache.thrift.meta_data.FieldMetaData("be_rpc_port", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPort")));
    tmpMap.put(_Fields.BRPC_PORT, new org.apache.thrift.meta_data.FieldMetaData("brpc_port", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPort")));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BE_START_TIME, new org.apache.thrift.meta_data.FieldMetaData("be_start_time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BE_NODE_ROLE, new org.apache.thrift.meta_data.FieldMetaData("be_node_role", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBackendInfo.class, metaDataMap);
  }

  public TBackendInfo() {
  }

  public TBackendInfo(
    int be_port,
    int http_port)
  {
    this();
    this.be_port = be_port;
    setBePortIsSet(true);
    this.http_port = http_port;
    setHttpPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBackendInfo(TBackendInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.be_port = other.be_port;
    this.http_port = other.http_port;
    this.be_rpc_port = other.be_rpc_port;
    this.brpc_port = other.brpc_port;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    this.be_start_time = other.be_start_time;
    if (other.isSetBeNodeRole()) {
      this.be_node_role = other.be_node_role;
    }
  }

  @Override
  public TBackendInfo deepCopy() {
    return new TBackendInfo(this);
  }

  @Override
  public void clear() {
    setBePortIsSet(false);
    this.be_port = 0;
    setHttpPortIsSet(false);
    this.http_port = 0;
    setBeRpcPortIsSet(false);
    this.be_rpc_port = 0;
    setBrpcPortIsSet(false);
    this.brpc_port = 0;
    this.version = null;
    setBeStartTimeIsSet(false);
    this.be_start_time = 0;
    this.be_node_role = null;
  }

  public int getBePort() {
    return this.be_port;
  }

  public TBackendInfo setBePort(int be_port) {
    this.be_port = be_port;
    setBePortIsSet(true);
    return this;
  }

  public void unsetBePort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BE_PORT_ISSET_ID);
  }

  /** Returns true if field be_port is set (has been assigned a value) and false otherwise */
  public boolean isSetBePort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BE_PORT_ISSET_ID);
  }

  public void setBePortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BE_PORT_ISSET_ID, value);
  }

  public int getHttpPort() {
    return this.http_port;
  }

  public TBackendInfo setHttpPort(int http_port) {
    this.http_port = http_port;
    setHttpPortIsSet(true);
    return this;
  }

  public void unsetHttpPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HTTP_PORT_ISSET_ID);
  }

  /** Returns true if field http_port is set (has been assigned a value) and false otherwise */
  public boolean isSetHttpPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HTTP_PORT_ISSET_ID);
  }

  public void setHttpPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HTTP_PORT_ISSET_ID, value);
  }

  public int getBeRpcPort() {
    return this.be_rpc_port;
  }

  public TBackendInfo setBeRpcPort(int be_rpc_port) {
    this.be_rpc_port = be_rpc_port;
    setBeRpcPortIsSet(true);
    return this;
  }

  public void unsetBeRpcPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BE_RPC_PORT_ISSET_ID);
  }

  /** Returns true if field be_rpc_port is set (has been assigned a value) and false otherwise */
  public boolean isSetBeRpcPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BE_RPC_PORT_ISSET_ID);
  }

  public void setBeRpcPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BE_RPC_PORT_ISSET_ID, value);
  }

  public int getBrpcPort() {
    return this.brpc_port;
  }

  public TBackendInfo setBrpcPort(int brpc_port) {
    this.brpc_port = brpc_port;
    setBrpcPortIsSet(true);
    return this;
  }

  public void unsetBrpcPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BRPC_PORT_ISSET_ID);
  }

  /** Returns true if field brpc_port is set (has been assigned a value) and false otherwise */
  public boolean isSetBrpcPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BRPC_PORT_ISSET_ID);
  }

  public void setBrpcPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BRPC_PORT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersion() {
    return this.version;
  }

  public TBackendInfo setVersion(@org.apache.thrift.annotation.Nullable java.lang.String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public long getBeStartTime() {
    return this.be_start_time;
  }

  public TBackendInfo setBeStartTime(long be_start_time) {
    this.be_start_time = be_start_time;
    setBeStartTimeIsSet(true);
    return this;
  }

  public void unsetBeStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BE_START_TIME_ISSET_ID);
  }

  /** Returns true if field be_start_time is set (has been assigned a value) and false otherwise */
  public boolean isSetBeStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BE_START_TIME_ISSET_ID);
  }

  public void setBeStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BE_START_TIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBeNodeRole() {
    return this.be_node_role;
  }

  public TBackendInfo setBeNodeRole(@org.apache.thrift.annotation.Nullable java.lang.String be_node_role) {
    this.be_node_role = be_node_role;
    return this;
  }

  public void unsetBeNodeRole() {
    this.be_node_role = null;
  }

  /** Returns true if field be_node_role is set (has been assigned a value) and false otherwise */
  public boolean isSetBeNodeRole() {
    return this.be_node_role != null;
  }

  public void setBeNodeRoleIsSet(boolean value) {
    if (!value) {
      this.be_node_role = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BE_PORT:
      if (value == null) {
        unsetBePort();
      } else {
        setBePort((java.lang.Integer)value);
      }
      break;

    case HTTP_PORT:
      if (value == null) {
        unsetHttpPort();
      } else {
        setHttpPort((java.lang.Integer)value);
      }
      break;

    case BE_RPC_PORT:
      if (value == null) {
        unsetBeRpcPort();
      } else {
        setBeRpcPort((java.lang.Integer)value);
      }
      break;

    case BRPC_PORT:
      if (value == null) {
        unsetBrpcPort();
      } else {
        setBrpcPort((java.lang.Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.String)value);
      }
      break;

    case BE_START_TIME:
      if (value == null) {
        unsetBeStartTime();
      } else {
        setBeStartTime((java.lang.Long)value);
      }
      break;

    case BE_NODE_ROLE:
      if (value == null) {
        unsetBeNodeRole();
      } else {
        setBeNodeRole((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BE_PORT:
      return getBePort();

    case HTTP_PORT:
      return getHttpPort();

    case BE_RPC_PORT:
      return getBeRpcPort();

    case BRPC_PORT:
      return getBrpcPort();

    case VERSION:
      return getVersion();

    case BE_START_TIME:
      return getBeStartTime();

    case BE_NODE_ROLE:
      return getBeNodeRole();

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
    case BE_PORT:
      return isSetBePort();
    case HTTP_PORT:
      return isSetHttpPort();
    case BE_RPC_PORT:
      return isSetBeRpcPort();
    case BRPC_PORT:
      return isSetBrpcPort();
    case VERSION:
      return isSetVersion();
    case BE_START_TIME:
      return isSetBeStartTime();
    case BE_NODE_ROLE:
      return isSetBeNodeRole();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBackendInfo)
      return this.equals((TBackendInfo)that);
    return false;
  }

  public boolean equals(TBackendInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_be_port = true;
    boolean that_present_be_port = true;
    if (this_present_be_port || that_present_be_port) {
      if (!(this_present_be_port && that_present_be_port))
        return false;
      if (this.be_port != that.be_port)
        return false;
    }

    boolean this_present_http_port = true;
    boolean that_present_http_port = true;
    if (this_present_http_port || that_present_http_port) {
      if (!(this_present_http_port && that_present_http_port))
        return false;
      if (this.http_port != that.http_port)
        return false;
    }

    boolean this_present_be_rpc_port = true && this.isSetBeRpcPort();
    boolean that_present_be_rpc_port = true && that.isSetBeRpcPort();
    if (this_present_be_rpc_port || that_present_be_rpc_port) {
      if (!(this_present_be_rpc_port && that_present_be_rpc_port))
        return false;
      if (this.be_rpc_port != that.be_rpc_port)
        return false;
    }

    boolean this_present_brpc_port = true && this.isSetBrpcPort();
    boolean that_present_brpc_port = true && that.isSetBrpcPort();
    if (this_present_brpc_port || that_present_brpc_port) {
      if (!(this_present_brpc_port && that_present_brpc_port))
        return false;
      if (this.brpc_port != that.brpc_port)
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_be_start_time = true && this.isSetBeStartTime();
    boolean that_present_be_start_time = true && that.isSetBeStartTime();
    if (this_present_be_start_time || that_present_be_start_time) {
      if (!(this_present_be_start_time && that_present_be_start_time))
        return false;
      if (this.be_start_time != that.be_start_time)
        return false;
    }

    boolean this_present_be_node_role = true && this.isSetBeNodeRole();
    boolean that_present_be_node_role = true && that.isSetBeNodeRole();
    if (this_present_be_node_role || that_present_be_node_role) {
      if (!(this_present_be_node_role && that_present_be_node_role))
        return false;
      if (!this.be_node_role.equals(that.be_node_role))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + be_port;

    hashCode = hashCode * 8191 + http_port;

    hashCode = hashCode * 8191 + ((isSetBeRpcPort()) ? 131071 : 524287);
    if (isSetBeRpcPort())
      hashCode = hashCode * 8191 + be_rpc_port;

    hashCode = hashCode * 8191 + ((isSetBrpcPort()) ? 131071 : 524287);
    if (isSetBrpcPort())
      hashCode = hashCode * 8191 + brpc_port;

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.hashCode();

    hashCode = hashCode * 8191 + ((isSetBeStartTime()) ? 131071 : 524287);
    if (isSetBeStartTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(be_start_time);

    hashCode = hashCode * 8191 + ((isSetBeNodeRole()) ? 131071 : 524287);
    if (isSetBeNodeRole())
      hashCode = hashCode * 8191 + be_node_role.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBackendInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBePort(), other.isSetBePort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBePort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_port, other.be_port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHttpPort(), other.isSetHttpPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHttpPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.http_port, other.http_port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBeRpcPort(), other.isSetBeRpcPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeRpcPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_rpc_port, other.be_rpc_port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBrpcPort(), other.isSetBrpcPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrpcPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brpc_port, other.brpc_port);
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
    lastComparison = java.lang.Boolean.compare(isSetBeStartTime(), other.isSetBeStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_start_time, other.be_start_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBeNodeRole(), other.isSetBeNodeRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeNodeRole()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.be_node_role, other.be_node_role);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBackendInfo(");
    boolean first = true;

    sb.append("be_port:");
    sb.append(this.be_port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("http_port:");
    sb.append(this.http_port);
    first = false;
    if (isSetBeRpcPort()) {
      if (!first) sb.append(", ");
      sb.append("be_rpc_port:");
      sb.append(this.be_rpc_port);
      first = false;
    }
    if (isSetBrpcPort()) {
      if (!first) sb.append(", ");
      sb.append("brpc_port:");
      sb.append(this.brpc_port);
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    if (isSetBeStartTime()) {
      if (!first) sb.append(", ");
      sb.append("be_start_time:");
      sb.append(this.be_start_time);
      first = false;
    }
    if (isSetBeNodeRole()) {
      if (!first) sb.append(", ");
      sb.append("be_node_role:");
      if (this.be_node_role == null) {
        sb.append("null");
      } else {
        sb.append(this.be_node_role);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'be_port' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'http_port' because it's a primitive and you chose the non-beans generator.
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

  private static class TBackendInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBackendInfoStandardScheme getScheme() {
      return new TBackendInfoStandardScheme();
    }
  }

  private static class TBackendInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBackendInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BE_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.be_port = iprot.readI32();
              struct.setBePortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HTTP_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.http_port = iprot.readI32();
              struct.setHttpPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BE_RPC_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.be_rpc_port = iprot.readI32();
              struct.setBeRpcPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BRPC_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.brpc_port = iprot.readI32();
              struct.setBrpcPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BE_START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.be_start_time = iprot.readI64();
              struct.setBeStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // BE_NODE_ROLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.be_node_role = iprot.readString();
              struct.setBeNodeRoleIsSet(true);
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
      if (!struct.isSetBePort()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'be_port' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHttpPort()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'http_port' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBackendInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BE_PORT_FIELD_DESC);
      oprot.writeI32(struct.be_port);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HTTP_PORT_FIELD_DESC);
      oprot.writeI32(struct.http_port);
      oprot.writeFieldEnd();
      if (struct.isSetBeRpcPort()) {
        oprot.writeFieldBegin(BE_RPC_PORT_FIELD_DESC);
        oprot.writeI32(struct.be_rpc_port);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBrpcPort()) {
        oprot.writeFieldBegin(BRPC_PORT_FIELD_DESC);
        oprot.writeI32(struct.brpc_port);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeString(struct.version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetBeStartTime()) {
        oprot.writeFieldBegin(BE_START_TIME_FIELD_DESC);
        oprot.writeI64(struct.be_start_time);
        oprot.writeFieldEnd();
      }
      if (struct.be_node_role != null) {
        if (struct.isSetBeNodeRole()) {
          oprot.writeFieldBegin(BE_NODE_ROLE_FIELD_DESC);
          oprot.writeString(struct.be_node_role);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBackendInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBackendInfoTupleScheme getScheme() {
      return new TBackendInfoTupleScheme();
    }
  }

  private static class TBackendInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBackendInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.be_port);
      oprot.writeI32(struct.http_port);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBeRpcPort()) {
        optionals.set(0);
      }
      if (struct.isSetBrpcPort()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetBeStartTime()) {
        optionals.set(3);
      }
      if (struct.isSetBeNodeRole()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBeRpcPort()) {
        oprot.writeI32(struct.be_rpc_port);
      }
      if (struct.isSetBrpcPort()) {
        oprot.writeI32(struct.brpc_port);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
      if (struct.isSetBeStartTime()) {
        oprot.writeI64(struct.be_start_time);
      }
      if (struct.isSetBeNodeRole()) {
        oprot.writeString(struct.be_node_role);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBackendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.be_port = iprot.readI32();
      struct.setBePortIsSet(true);
      struct.http_port = iprot.readI32();
      struct.setHttpPortIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.be_rpc_port = iprot.readI32();
        struct.setBeRpcPortIsSet(true);
      }
      if (incoming.get(1)) {
        struct.brpc_port = iprot.readI32();
        struct.setBrpcPortIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.be_start_time = iprot.readI64();
        struct.setBeStartTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.be_node_role = iprot.readString();
        struct.setBeNodeRoleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

