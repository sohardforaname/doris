/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TGetBinlogRequest implements org.apache.thrift.TBase<TGetBinlogRequest, TGetBinlogRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetBinlogRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetBinlogRequest");

  private static final org.apache.thrift.protocol.TField CLUSTER_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("passwd", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField USER_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("user_ip", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField PREV_COMMIT_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("prev_commit_seq", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetBinlogRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetBinlogRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String cluster; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String passwd; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String db; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String table; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user_ip; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String token; // optional
  public long prev_commit_seq; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER((short)1, "cluster"),
    USER((short)2, "user"),
    PASSWD((short)3, "passwd"),
    DB((short)4, "db"),
    TABLE((short)5, "table"),
    USER_IP((short)6, "user_ip"),
    TOKEN((short)7, "token"),
    PREV_COMMIT_SEQ((short)8, "prev_commit_seq");

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
        case 1: // CLUSTER
          return CLUSTER;
        case 2: // USER
          return USER;
        case 3: // PASSWD
          return PASSWD;
        case 4: // DB
          return DB;
        case 5: // TABLE
          return TABLE;
        case 6: // USER_IP
          return USER_IP;
        case 7: // TOKEN
          return TOKEN;
        case 8: // PREV_COMMIT_SEQ
          return PREV_COMMIT_SEQ;
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
  private static final int __PREV_COMMIT_SEQ_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CLUSTER,_Fields.USER,_Fields.PASSWD,_Fields.DB,_Fields.TABLE,_Fields.USER_IP,_Fields.TOKEN,_Fields.PREV_COMMIT_SEQ};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER, new org.apache.thrift.meta_data.FieldMetaData("cluster", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWD, new org.apache.thrift.meta_data.FieldMetaData("passwd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_IP, new org.apache.thrift.meta_data.FieldMetaData("user_ip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PREV_COMMIT_SEQ, new org.apache.thrift.meta_data.FieldMetaData("prev_commit_seq", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetBinlogRequest.class, metaDataMap);
  }

  public TGetBinlogRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetBinlogRequest(TGetBinlogRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCluster()) {
      this.cluster = other.cluster;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetPasswd()) {
      this.passwd = other.passwd;
    }
    if (other.isSetDb()) {
      this.db = other.db;
    }
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetUserIp()) {
      this.user_ip = other.user_ip;
    }
    if (other.isSetToken()) {
      this.token = other.token;
    }
    this.prev_commit_seq = other.prev_commit_seq;
  }

  @Override
  public TGetBinlogRequest deepCopy() {
    return new TGetBinlogRequest(this);
  }

  @Override
  public void clear() {
    this.cluster = null;
    this.user = null;
    this.passwd = null;
    this.db = null;
    this.table = null;
    this.user_ip = null;
    this.token = null;
    setPrevCommitSeqIsSet(false);
    this.prev_commit_seq = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCluster() {
    return this.cluster;
  }

  public TGetBinlogRequest setCluster(@org.apache.thrift.annotation.Nullable java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  public void unsetCluster() {
    this.cluster = null;
  }

  /** Returns true if field cluster is set (has been assigned a value) and false otherwise */
  public boolean isSetCluster() {
    return this.cluster != null;
  }

  public void setClusterIsSet(boolean value) {
    if (!value) {
      this.cluster = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public TGetBinlogRequest setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPasswd() {
    return this.passwd;
  }

  public TGetBinlogRequest setPasswd(@org.apache.thrift.annotation.Nullable java.lang.String passwd) {
    this.passwd = passwd;
    return this;
  }

  public void unsetPasswd() {
    this.passwd = null;
  }

  /** Returns true if field passwd is set (has been assigned a value) and false otherwise */
  public boolean isSetPasswd() {
    return this.passwd != null;
  }

  public void setPasswdIsSet(boolean value) {
    if (!value) {
      this.passwd = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDb() {
    return this.db;
  }

  public TGetBinlogRequest setDb(@org.apache.thrift.annotation.Nullable java.lang.String db) {
    this.db = db;
    return this;
  }

  public void unsetDb() {
    this.db = null;
  }

  /** Returns true if field db is set (has been assigned a value) and false otherwise */
  public boolean isSetDb() {
    return this.db != null;
  }

  public void setDbIsSet(boolean value) {
    if (!value) {
      this.db = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable() {
    return this.table;
  }

  public TGetBinlogRequest setTable(@org.apache.thrift.annotation.Nullable java.lang.String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserIp() {
    return this.user_ip;
  }

  public TGetBinlogRequest setUserIp(@org.apache.thrift.annotation.Nullable java.lang.String user_ip) {
    this.user_ip = user_ip;
    return this;
  }

  public void unsetUserIp() {
    this.user_ip = null;
  }

  /** Returns true if field user_ip is set (has been assigned a value) and false otherwise */
  public boolean isSetUserIp() {
    return this.user_ip != null;
  }

  public void setUserIpIsSet(boolean value) {
    if (!value) {
      this.user_ip = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getToken() {
    return this.token;
  }

  public TGetBinlogRequest setToken(@org.apache.thrift.annotation.Nullable java.lang.String token) {
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

  public long getPrevCommitSeq() {
    return this.prev_commit_seq;
  }

  public TGetBinlogRequest setPrevCommitSeq(long prev_commit_seq) {
    this.prev_commit_seq = prev_commit_seq;
    setPrevCommitSeqIsSet(true);
    return this;
  }

  public void unsetPrevCommitSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PREV_COMMIT_SEQ_ISSET_ID);
  }

  /** Returns true if field prev_commit_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetPrevCommitSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PREV_COMMIT_SEQ_ISSET_ID);
  }

  public void setPrevCommitSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PREV_COMMIT_SEQ_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CLUSTER:
      if (value == null) {
        unsetCluster();
      } else {
        setCluster((java.lang.String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case PASSWD:
      if (value == null) {
        unsetPasswd();
      } else {
        setPasswd((java.lang.String)value);
      }
      break;

    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((java.lang.String)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((java.lang.String)value);
      }
      break;

    case USER_IP:
      if (value == null) {
        unsetUserIp();
      } else {
        setUserIp((java.lang.String)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((java.lang.String)value);
      }
      break;

    case PREV_COMMIT_SEQ:
      if (value == null) {
        unsetPrevCommitSeq();
      } else {
        setPrevCommitSeq((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER:
      return getCluster();

    case USER:
      return getUser();

    case PASSWD:
      return getPasswd();

    case DB:
      return getDb();

    case TABLE:
      return getTable();

    case USER_IP:
      return getUserIp();

    case TOKEN:
      return getToken();

    case PREV_COMMIT_SEQ:
      return getPrevCommitSeq();

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
    case CLUSTER:
      return isSetCluster();
    case USER:
      return isSetUser();
    case PASSWD:
      return isSetPasswd();
    case DB:
      return isSetDb();
    case TABLE:
      return isSetTable();
    case USER_IP:
      return isSetUserIp();
    case TOKEN:
      return isSetToken();
    case PREV_COMMIT_SEQ:
      return isSetPrevCommitSeq();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetBinlogRequest)
      return this.equals((TGetBinlogRequest)that);
    return false;
  }

  public boolean equals(TGetBinlogRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cluster = true && this.isSetCluster();
    boolean that_present_cluster = true && that.isSetCluster();
    if (this_present_cluster || that_present_cluster) {
      if (!(this_present_cluster && that_present_cluster))
        return false;
      if (!this.cluster.equals(that.cluster))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_passwd = true && this.isSetPasswd();
    boolean that_present_passwd = true && that.isSetPasswd();
    if (this_present_passwd || that_present_passwd) {
      if (!(this_present_passwd && that_present_passwd))
        return false;
      if (!this.passwd.equals(that.passwd))
        return false;
    }

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_user_ip = true && this.isSetUserIp();
    boolean that_present_user_ip = true && that.isSetUserIp();
    if (this_present_user_ip || that_present_user_ip) {
      if (!(this_present_user_ip && that_present_user_ip))
        return false;
      if (!this.user_ip.equals(that.user_ip))
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

    boolean this_present_prev_commit_seq = true && this.isSetPrevCommitSeq();
    boolean that_present_prev_commit_seq = true && that.isSetPrevCommitSeq();
    if (this_present_prev_commit_seq || that_present_prev_commit_seq) {
      if (!(this_present_prev_commit_seq && that_present_prev_commit_seq))
        return false;
      if (this.prev_commit_seq != that.prev_commit_seq)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCluster()) ? 131071 : 524287);
    if (isSetCluster())
      hashCode = hashCode * 8191 + cluster.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetPasswd()) ? 131071 : 524287);
    if (isSetPasswd())
      hashCode = hashCode * 8191 + passwd.hashCode();

    hashCode = hashCode * 8191 + ((isSetDb()) ? 131071 : 524287);
    if (isSetDb())
      hashCode = hashCode * 8191 + db.hashCode();

    hashCode = hashCode * 8191 + ((isSetTable()) ? 131071 : 524287);
    if (isSetTable())
      hashCode = hashCode * 8191 + table.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserIp()) ? 131071 : 524287);
    if (isSetUserIp())
      hashCode = hashCode * 8191 + user_ip.hashCode();

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrevCommitSeq()) ? 131071 : 524287);
    if (isSetPrevCommitSeq())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(prev_commit_seq);

    return hashCode;
  }

  @Override
  public int compareTo(TGetBinlogRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCluster(), other.isSetCluster());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCluster()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster, other.cluster);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUser(), other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPasswd(), other.isSetPasswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPasswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.passwd, other.passwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDb(), other.isSetDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db, other.db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable(), other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUserIp(), other.isSetUserIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_ip, other.user_ip);
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
    lastComparison = java.lang.Boolean.compare(isSetPrevCommitSeq(), other.isSetPrevCommitSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrevCommitSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prev_commit_seq, other.prev_commit_seq);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetBinlogRequest(");
    boolean first = true;

    if (isSetCluster()) {
      sb.append("cluster:");
      if (this.cluster == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster);
      }
      first = false;
    }
    if (isSetUser()) {
      if (!first) sb.append(", ");
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (isSetPasswd()) {
      if (!first) sb.append(", ");
      sb.append("passwd:");
      if (this.passwd == null) {
        sb.append("null");
      } else {
        sb.append(this.passwd);
      }
      first = false;
    }
    if (isSetDb()) {
      if (!first) sb.append(", ");
      sb.append("db:");
      if (this.db == null) {
        sb.append("null");
      } else {
        sb.append(this.db);
      }
      first = false;
    }
    if (isSetTable()) {
      if (!first) sb.append(", ");
      sb.append("table:");
      if (this.table == null) {
        sb.append("null");
      } else {
        sb.append(this.table);
      }
      first = false;
    }
    if (isSetUserIp()) {
      if (!first) sb.append(", ");
      sb.append("user_ip:");
      if (this.user_ip == null) {
        sb.append("null");
      } else {
        sb.append(this.user_ip);
      }
      first = false;
    }
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
    if (isSetPrevCommitSeq()) {
      if (!first) sb.append(", ");
      sb.append("prev_commit_seq:");
      sb.append(this.prev_commit_seq);
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

  private static class TGetBinlogRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetBinlogRequestStandardScheme getScheme() {
      return new TGetBinlogRequestStandardScheme();
    }
  }

  private static class TGetBinlogRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetBinlogRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetBinlogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cluster = iprot.readString();
              struct.setClusterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.passwd = iprot.readString();
              struct.setPasswdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USER_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_ip = iprot.readString();
              struct.setUserIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PREV_COMMIT_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.prev_commit_seq = iprot.readI64();
              struct.setPrevCommitSeqIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetBinlogRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cluster != null) {
        if (struct.isSetCluster()) {
          oprot.writeFieldBegin(CLUSTER_FIELD_DESC);
          oprot.writeString(struct.cluster);
          oprot.writeFieldEnd();
        }
      }
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          oprot.writeString(struct.user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.passwd != null) {
        if (struct.isSetPasswd()) {
          oprot.writeFieldBegin(PASSWD_FIELD_DESC);
          oprot.writeString(struct.passwd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.db != null) {
        if (struct.isSetDb()) {
          oprot.writeFieldBegin(DB_FIELD_DESC);
          oprot.writeString(struct.db);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table != null) {
        if (struct.isSetTable()) {
          oprot.writeFieldBegin(TABLE_FIELD_DESC);
          oprot.writeString(struct.table);
          oprot.writeFieldEnd();
        }
      }
      if (struct.user_ip != null) {
        if (struct.isSetUserIp()) {
          oprot.writeFieldBegin(USER_IP_FIELD_DESC);
          oprot.writeString(struct.user_ip);
          oprot.writeFieldEnd();
        }
      }
      if (struct.token != null) {
        if (struct.isSetToken()) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPrevCommitSeq()) {
        oprot.writeFieldBegin(PREV_COMMIT_SEQ_FIELD_DESC);
        oprot.writeI64(struct.prev_commit_seq);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetBinlogRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetBinlogRequestTupleScheme getScheme() {
      return new TGetBinlogRequestTupleScheme();
    }
  }

  private static class TGetBinlogRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetBinlogRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetBinlogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCluster()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetPasswd()) {
        optionals.set(2);
      }
      if (struct.isSetDb()) {
        optionals.set(3);
      }
      if (struct.isSetTable()) {
        optionals.set(4);
      }
      if (struct.isSetUserIp()) {
        optionals.set(5);
      }
      if (struct.isSetToken()) {
        optionals.set(6);
      }
      if (struct.isSetPrevCommitSeq()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetCluster()) {
        oprot.writeString(struct.cluster);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetPasswd()) {
        oprot.writeString(struct.passwd);
      }
      if (struct.isSetDb()) {
        oprot.writeString(struct.db);
      }
      if (struct.isSetTable()) {
        oprot.writeString(struct.table);
      }
      if (struct.isSetUserIp()) {
        oprot.writeString(struct.user_ip);
      }
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetPrevCommitSeq()) {
        oprot.writeI64(struct.prev_commit_seq);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetBinlogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.cluster = iprot.readString();
        struct.setClusterIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.passwd = iprot.readString();
        struct.setPasswdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.db = iprot.readString();
        struct.setDbIsSet(true);
      }
      if (incoming.get(4)) {
        struct.table = iprot.readString();
        struct.setTableIsSet(true);
      }
      if (incoming.get(5)) {
        struct.user_ip = iprot.readString();
        struct.setUserIpIsSet(true);
      }
      if (incoming.get(6)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(7)) {
        struct.prev_commit_seq = iprot.readI64();
        struct.setPrevCommitSeqIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

