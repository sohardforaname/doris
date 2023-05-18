/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TMasterInfo implements org.apache.thrift.TBase<TMasterInfo, TMasterInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TMasterInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMasterInfo");

  private static final org.apache.thrift.protocol.TField NETWORK_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("network_address", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CLUSTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EPOCH_FIELD_DESC = new org.apache.thrift.protocol.TField("epoch", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField BACKEND_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("backend_ip", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField HTTP_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("http_port", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField HEARTBEAT_FLAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("heartbeat_flags", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField BACKEND_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("backend_id", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMasterInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMasterInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress network_address; // required
  public int cluster_id; // required
  public long epoch; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String token; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String backend_ip; // optional
  public int http_port; // optional
  public long heartbeat_flags; // optional
  public long backend_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NETWORK_ADDRESS((short)1, "network_address"),
    CLUSTER_ID((short)2, "cluster_id"),
    EPOCH((short)3, "epoch"),
    TOKEN((short)4, "token"),
    BACKEND_IP((short)5, "backend_ip"),
    HTTP_PORT((short)6, "http_port"),
    HEARTBEAT_FLAGS((short)7, "heartbeat_flags"),
    BACKEND_ID((short)8, "backend_id");

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
        case 1: // NETWORK_ADDRESS
          return NETWORK_ADDRESS;
        case 2: // CLUSTER_ID
          return CLUSTER_ID;
        case 3: // EPOCH
          return EPOCH;
        case 4: // TOKEN
          return TOKEN;
        case 5: // BACKEND_IP
          return BACKEND_IP;
        case 6: // HTTP_PORT
          return HTTP_PORT;
        case 7: // HEARTBEAT_FLAGS
          return HEARTBEAT_FLAGS;
        case 8: // BACKEND_ID
          return BACKEND_ID;
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
  private static final int __CLUSTER_ID_ISSET_ID = 0;
  private static final int __EPOCH_ISSET_ID = 1;
  private static final int __HTTP_PORT_ISSET_ID = 2;
  private static final int __HEARTBEAT_FLAGS_ISSET_ID = 3;
  private static final int __BACKEND_ID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOKEN,_Fields.BACKEND_IP,_Fields.HTTP_PORT,_Fields.HEARTBEAT_FLAGS,_Fields.BACKEND_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NETWORK_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("network_address", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    tmpMap.put(_Fields.CLUSTER_ID, new org.apache.thrift.meta_data.FieldMetaData("cluster_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TClusterId")));
    tmpMap.put(_Fields.EPOCH, new org.apache.thrift.meta_data.FieldMetaData("epoch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TEpoch")));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BACKEND_IP, new org.apache.thrift.meta_data.FieldMetaData("backend_ip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HTTP_PORT, new org.apache.thrift.meta_data.FieldMetaData("http_port", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPort")));
    tmpMap.put(_Fields.HEARTBEAT_FLAGS, new org.apache.thrift.meta_data.FieldMetaData("heartbeat_flags", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BACKEND_ID, new org.apache.thrift.meta_data.FieldMetaData("backend_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMasterInfo.class, metaDataMap);
  }

  public TMasterInfo() {
  }

  public TMasterInfo(
    org.apache.doris.thrift.TNetworkAddress network_address,
    int cluster_id,
    long epoch)
  {
    this();
    this.network_address = network_address;
    this.cluster_id = cluster_id;
    setClusterIdIsSet(true);
    this.epoch = epoch;
    setEpochIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMasterInfo(TMasterInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNetworkAddress()) {
      this.network_address = new org.apache.doris.thrift.TNetworkAddress(other.network_address);
    }
    this.cluster_id = other.cluster_id;
    this.epoch = other.epoch;
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetBackendIp()) {
      this.backend_ip = other.backend_ip;
    }
    this.http_port = other.http_port;
    this.heartbeat_flags = other.heartbeat_flags;
    this.backend_id = other.backend_id;
  }

  @Override
  public TMasterInfo deepCopy() {
    return new TMasterInfo(this);
  }

  @Override
  public void clear() {
    this.network_address = null;
    setClusterIdIsSet(false);
    this.cluster_id = 0;
    setEpochIsSet(false);
    this.epoch = 0;
    this.token = null;
    this.backend_ip = null;
    setHttpPortIsSet(false);
    this.http_port = 0;
    setHeartbeatFlagsIsSet(false);
    this.heartbeat_flags = 0;
    setBackendIdIsSet(false);
    this.backend_id = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getNetworkAddress() {
    return this.network_address;
  }

  public TMasterInfo setNetworkAddress(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress network_address) {
    this.network_address = network_address;
    return this;
  }

  public void unsetNetworkAddress() {
    this.network_address = null;
  }

  /** Returns true if field network_address is set (has been assigned a value) and false otherwise */
  public boolean isSetNetworkAddress() {
    return this.network_address != null;
  }

  public void setNetworkAddressIsSet(boolean value) {
    if (!value) {
      this.network_address = null;
    }
  }

  public int getClusterId() {
    return this.cluster_id;
  }

  public TMasterInfo setClusterId(int cluster_id) {
    this.cluster_id = cluster_id;
    setClusterIdIsSet(true);
    return this;
  }

  public void unsetClusterId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID);
  }

  /** Returns true if field cluster_id is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID);
  }

  public void setClusterIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID, value);
  }

  public long getEpoch() {
    return this.epoch;
  }

  public TMasterInfo setEpoch(long epoch) {
    this.epoch = epoch;
    setEpochIsSet(true);
    return this;
  }

  public void unsetEpoch() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EPOCH_ISSET_ID);
  }

  /** Returns true if field epoch is set (has been assigned a value) and false otherwise */
  public boolean isSetEpoch() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EPOCH_ISSET_ID);
  }

  public void setEpochIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EPOCH_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getToken() {
    return this.token;
  }

  public TMasterInfo setToken(@org.apache.thrift.annotation.Nullable java.lang.String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBackendIp() {
    return this.backend_ip;
  }

  public TMasterInfo setBackendIp(@org.apache.thrift.annotation.Nullable java.lang.String backend_ip) {
    this.backend_ip = backend_ip;
    return this;
  }

  public void unsetBackendIp() {
    this.backend_ip = null;
  }

  /** Returns true if field backend_ip is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendIp() {
    return this.backend_ip != null;
  }

  public void setBackendIpIsSet(boolean value) {
    if (!value) {
      this.backend_ip = null;
    }
  }

  public int getHttpPort() {
    return this.http_port;
  }

  public TMasterInfo setHttpPort(int http_port) {
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

  public long getHeartbeatFlags() {
    return this.heartbeat_flags;
  }

  public TMasterInfo setHeartbeatFlags(long heartbeat_flags) {
    this.heartbeat_flags = heartbeat_flags;
    setHeartbeatFlagsIsSet(true);
    return this;
  }

  public void unsetHeartbeatFlags() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HEARTBEAT_FLAGS_ISSET_ID);
  }

  /** Returns true if field heartbeat_flags is set (has been assigned a value) and false otherwise */
  public boolean isSetHeartbeatFlags() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HEARTBEAT_FLAGS_ISSET_ID);
  }

  public void setHeartbeatFlagsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HEARTBEAT_FLAGS_ISSET_ID, value);
  }

  public long getBackendId() {
    return this.backend_id;
  }

  public TMasterInfo setBackendId(long backend_id) {
    this.backend_id = backend_id;
    setBackendIdIsSet(true);
    return this;
  }

  public void unsetBackendId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BACKEND_ID_ISSET_ID);
  }

  /** Returns true if field backend_id is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BACKEND_ID_ISSET_ID);
  }

  public void setBackendIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BACKEND_ID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NETWORK_ADDRESS:
      if (value == null) {
        unsetNetworkAddress();
      } else {
        setNetworkAddress((org.apache.doris.thrift.TNetworkAddress)value);
      }
      break;

    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((java.lang.Integer)value);
      }
      break;

    case EPOCH:
      if (value == null) {
        unsetEpoch();
      } else {
        setEpoch((java.lang.Long)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((java.lang.String)value);
      }
      break;

    case BACKEND_IP:
      if (value == null) {
        unsetBackendIp();
      } else {
        setBackendIp((java.lang.String)value);
      }
      break;

    case HTTP_PORT:
      if (value == null) {
        unsetHttpPort();
      } else {
        setHttpPort((java.lang.Integer)value);
      }
      break;

    case HEARTBEAT_FLAGS:
      if (value == null) {
        unsetHeartbeatFlags();
      } else {
        setHeartbeatFlags((java.lang.Long)value);
      }
      break;

    case BACKEND_ID:
      if (value == null) {
        unsetBackendId();
      } else {
        setBackendId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NETWORK_ADDRESS:
      return getNetworkAddress();

    case CLUSTER_ID:
      return getClusterId();

    case EPOCH:
      return getEpoch();

    case TOKEN:
      return getToken();

    case BACKEND_IP:
      return getBackendIp();

    case HTTP_PORT:
      return getHttpPort();

    case HEARTBEAT_FLAGS:
      return getHeartbeatFlags();

    case BACKEND_ID:
      return getBackendId();

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
    case NETWORK_ADDRESS:
      return isSetNetworkAddress();
    case CLUSTER_ID:
      return isSetClusterId();
    case EPOCH:
      return isSetEpoch();
    case TOKEN:
      return isSetToken();
    case BACKEND_IP:
      return isSetBackendIp();
    case HTTP_PORT:
      return isSetHttpPort();
    case HEARTBEAT_FLAGS:
      return isSetHeartbeatFlags();
    case BACKEND_ID:
      return isSetBackendId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMasterInfo)
      return this.equals((TMasterInfo)that);
    return false;
  }

  public boolean equals(TMasterInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_network_address = true && this.isSetNetworkAddress();
    boolean that_present_network_address = true && that.isSetNetworkAddress();
    if (this_present_network_address || that_present_network_address) {
      if (!(this_present_network_address && that_present_network_address))
        return false;
      if (!this.network_address.equals(that.network_address))
        return false;
    }

    boolean this_present_cluster_id = true;
    boolean that_present_cluster_id = true;
    if (this_present_cluster_id || that_present_cluster_id) {
      if (!(this_present_cluster_id && that_present_cluster_id))
        return false;
      if (this.cluster_id != that.cluster_id)
        return false;
    }

    boolean this_present_epoch = true;
    boolean that_present_epoch = true;
    if (this_present_epoch || that_present_epoch) {
      if (!(this_present_epoch && that_present_epoch))
        return false;
      if (this.epoch != that.epoch)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_backend_ip = true && this.isSetBackendIp();
    boolean that_present_backend_ip = true && that.isSetBackendIp();
    if (this_present_backend_ip || that_present_backend_ip) {
      if (!(this_present_backend_ip && that_present_backend_ip))
        return false;
      if (!this.backend_ip.equals(that.backend_ip))
        return false;
    }

    boolean this_present_http_port = true && this.isSetHttpPort();
    boolean that_present_http_port = true && that.isSetHttpPort();
    if (this_present_http_port || that_present_http_port) {
      if (!(this_present_http_port && that_present_http_port))
        return false;
      if (this.http_port != that.http_port)
        return false;
    }

    boolean this_present_heartbeat_flags = true && this.isSetHeartbeatFlags();
    boolean that_present_heartbeat_flags = true && that.isSetHeartbeatFlags();
    if (this_present_heartbeat_flags || that_present_heartbeat_flags) {
      if (!(this_present_heartbeat_flags && that_present_heartbeat_flags))
        return false;
      if (this.heartbeat_flags != that.heartbeat_flags)
        return false;
    }

    boolean this_present_backend_id = true && this.isSetBackendId();
    boolean that_present_backend_id = true && that.isSetBackendId();
    if (this_present_backend_id || that_present_backend_id) {
      if (!(this_present_backend_id && that_present_backend_id))
        return false;
      if (this.backend_id != that.backend_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNetworkAddress()) ? 131071 : 524287);
    if (isSetNetworkAddress())
      hashCode = hashCode * 8191 + network_address.hashCode();

    hashCode = hashCode * 8191 + cluster_id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(epoch);

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    hashCode = hashCode * 8191 + ((isSetBackendIp()) ? 131071 : 524287);
    if (isSetBackendIp())
      hashCode = hashCode * 8191 + backend_ip.hashCode();

    hashCode = hashCode * 8191 + ((isSetHttpPort()) ? 131071 : 524287);
    if (isSetHttpPort())
      hashCode = hashCode * 8191 + http_port;

    hashCode = hashCode * 8191 + ((isSetHeartbeatFlags()) ? 131071 : 524287);
    if (isSetHeartbeatFlags())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(heartbeat_flags);

    hashCode = hashCode * 8191 + ((isSetBackendId()) ? 131071 : 524287);
    if (isSetBackendId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(backend_id);

    return hashCode;
  }

  @Override
  public int compareTo(TMasterInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNetworkAddress(), other.isSetNetworkAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetworkAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.network_address, other.network_address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetClusterId(), other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster_id, other.cluster_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEpoch(), other.isSetEpoch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEpoch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.epoch, other.epoch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetToken(), other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBackendIp(), other.isSetBackendIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend_ip, other.backend_ip);
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
    lastComparison = java.lang.Boolean.compare(isSetHeartbeatFlags(), other.isSetHeartbeatFlags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeartbeatFlags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.heartbeat_flags, other.heartbeat_flags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBackendId(), other.isSetBackendId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend_id, other.backend_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMasterInfo(");
    boolean first = true;

    sb.append("network_address:");
    if (this.network_address == null) {
      sb.append("null");
    } else {
      sb.append(this.network_address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cluster_id:");
    sb.append(this.cluster_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("epoch:");
    sb.append(this.epoch);
    first = false;
    if (isSetToken()) {
      if (!first) sb.append(", ");
      sb.append("token:");
      if (this.token == null) {
        sb.append("null");
      } else {
        sb.append(this.token);
      }
      first = false;
    }
    if (isSetBackendIp()) {
      if (!first) sb.append(", ");
      sb.append("backend_ip:");
      if (this.backend_ip == null) {
        sb.append("null");
      } else {
        sb.append(this.backend_ip);
      }
      first = false;
    }
    if (isSetHttpPort()) {
      if (!first) sb.append(", ");
      sb.append("http_port:");
      sb.append(this.http_port);
      first = false;
    }
    if (isSetHeartbeatFlags()) {
      if (!first) sb.append(", ");
      sb.append("heartbeat_flags:");
      sb.append(this.heartbeat_flags);
      first = false;
    }
    if (isSetBackendId()) {
      if (!first) sb.append(", ");
      sb.append("backend_id:");
      sb.append(this.backend_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (network_address == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'network_address' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'cluster_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'epoch' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (network_address != null) {
      network_address.validate();
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

  private static class TMasterInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMasterInfoStandardScheme getScheme() {
      return new TMasterInfoStandardScheme();
    }
  }

  private static class TMasterInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMasterInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMasterInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NETWORK_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.network_address = new org.apache.doris.thrift.TNetworkAddress();
              struct.network_address.read(iprot);
              struct.setNetworkAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cluster_id = iprot.readI32();
              struct.setClusterIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EPOCH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.epoch = iprot.readI64();
              struct.setEpochIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BACKEND_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.backend_ip = iprot.readString();
              struct.setBackendIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HTTP_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.http_port = iprot.readI32();
              struct.setHttpPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // HEARTBEAT_FLAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.heartbeat_flags = iprot.readI64();
              struct.setHeartbeatFlagsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // BACKEND_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.backend_id = iprot.readI64();
              struct.setBackendIdIsSet(true);
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
      if (!struct.isSetClusterId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cluster_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetEpoch()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'epoch' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMasterInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.network_address != null) {
        oprot.writeFieldBegin(NETWORK_ADDRESS_FIELD_DESC);
        struct.network_address.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
      oprot.writeI32(struct.cluster_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EPOCH_FIELD_DESC);
      oprot.writeI64(struct.epoch);
      oprot.writeFieldEnd();
      if (struct.token != null) {
        if (struct.isSetToken()) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
      }
      if (struct.backend_ip != null) {
        if (struct.isSetBackendIp()) {
          oprot.writeFieldBegin(BACKEND_IP_FIELD_DESC);
          oprot.writeString(struct.backend_ip);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetHttpPort()) {
        oprot.writeFieldBegin(HTTP_PORT_FIELD_DESC);
        oprot.writeI32(struct.http_port);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHeartbeatFlags()) {
        oprot.writeFieldBegin(HEARTBEAT_FLAGS_FIELD_DESC);
        oprot.writeI64(struct.heartbeat_flags);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBackendId()) {
        oprot.writeFieldBegin(BACKEND_ID_FIELD_DESC);
        oprot.writeI64(struct.backend_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMasterInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMasterInfoTupleScheme getScheme() {
      return new TMasterInfoTupleScheme();
    }
  }

  private static class TMasterInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMasterInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMasterInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.network_address.write(oprot);
      oprot.writeI32(struct.cluster_id);
      oprot.writeI64(struct.epoch);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      if (struct.isSetBackendIp()) {
        optionals.set(1);
      }
      if (struct.isSetHttpPort()) {
        optionals.set(2);
      }
      if (struct.isSetHeartbeatFlags()) {
        optionals.set(3);
      }
      if (struct.isSetBackendId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetBackendIp()) {
        oprot.writeString(struct.backend_ip);
      }
      if (struct.isSetHttpPort()) {
        oprot.writeI32(struct.http_port);
      }
      if (struct.isSetHeartbeatFlags()) {
        oprot.writeI64(struct.heartbeat_flags);
      }
      if (struct.isSetBackendId()) {
        oprot.writeI64(struct.backend_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMasterInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.network_address = new org.apache.doris.thrift.TNetworkAddress();
      struct.network_address.read(iprot);
      struct.setNetworkAddressIsSet(true);
      struct.cluster_id = iprot.readI32();
      struct.setClusterIdIsSet(true);
      struct.epoch = iprot.readI64();
      struct.setEpochIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.backend_ip = iprot.readString();
        struct.setBackendIpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.http_port = iprot.readI32();
        struct.setHttpPortIsSet(true);
      }
      if (incoming.get(3)) {
        struct.heartbeat_flags = iprot.readI64();
        struct.setHeartbeatFlagsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.backend_id = iprot.readI64();
        struct.setBackendIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

