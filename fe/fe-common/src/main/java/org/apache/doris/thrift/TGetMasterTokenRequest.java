/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TGetMasterTokenRequest implements org.apache.thrift.TBase<TGetMasterTokenRequest, TGetMasterTokenRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetMasterTokenRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetMasterTokenRequest");

  private static final org.apache.thrift.protocol.TField CLUSTER_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetMasterTokenRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetMasterTokenRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String cluster; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String password; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER((short)1, "cluster"),
    USER((short)2, "user"),
    PASSWORD((short)3, "password");

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
        case 3: // PASSWORD
          return PASSWORD;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER,_Fields.USER,_Fields.PASSWORD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER, new org.apache.thrift.meta_data.FieldMetaData("cluster", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetMasterTokenRequest.class, metaDataMap);
  }

  public TGetMasterTokenRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetMasterTokenRequest(TGetMasterTokenRequest other) {
    if (other.isSetCluster()) {
      this.cluster = other.cluster;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  @Override
  public TGetMasterTokenRequest deepCopy() {
    return new TGetMasterTokenRequest(this);
  }

  @Override
  public void clear() {
    this.cluster = null;
    this.user = null;
    this.password = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCluster() {
    return this.cluster;
  }

  public TGetMasterTokenRequest setCluster(@org.apache.thrift.annotation.Nullable java.lang.String cluster) {
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

  public TGetMasterTokenRequest setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
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
  public java.lang.String getPassword() {
    return this.password;
  }

  public TGetMasterTokenRequest setPassword(@org.apache.thrift.annotation.Nullable java.lang.String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
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

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((java.lang.String)value);
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

    case PASSWORD:
      return getPassword();

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
    case PASSWORD:
      return isSetPassword();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetMasterTokenRequest)
      return this.equals((TGetMasterTokenRequest)that);
    return false;
  }

  public boolean equals(TGetMasterTokenRequest that) {
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

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
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

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetMasterTokenRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetPassword(), other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetMasterTokenRequest(");
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
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetMasterTokenRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetMasterTokenRequestStandardScheme getScheme() {
      return new TGetMasterTokenRequestStandardScheme();
    }
  }

  private static class TGetMasterTokenRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetMasterTokenRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetMasterTokenRequest struct) throws org.apache.thrift.TException {
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
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetMasterTokenRequest struct) throws org.apache.thrift.TException {
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
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetMasterTokenRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetMasterTokenRequestTupleScheme getScheme() {
      return new TGetMasterTokenRequestTupleScheme();
    }
  }

  private static class TGetMasterTokenRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetMasterTokenRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetMasterTokenRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCluster()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetPassword()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCluster()) {
        oprot.writeString(struct.cluster);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetMasterTokenRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.cluster = iprot.readString();
        struct.setClusterIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

