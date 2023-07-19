/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TFrontendPingFrontendRequest implements org.apache.thrift.TBase<TFrontendPingFrontendRequest, TFrontendPingFrontendRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TFrontendPingFrontendRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFrontendPingFrontendRequest");

  private static final org.apache.thrift.protocol.TField CLUSTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFrontendPingFrontendRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFrontendPingFrontendRequestTupleSchemeFactory();

  public int clusterId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String token; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER_ID((short)1, "clusterId"),
    TOKEN((short)2, "token");

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
        case 1: // CLUSTER_ID
          return CLUSTER_ID;
        case 2: // TOKEN
          return TOKEN;
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
  private static final int __CLUSTERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_ID, new org.apache.thrift.meta_data.FieldMetaData("clusterId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFrontendPingFrontendRequest.class, metaDataMap);
  }

  public TFrontendPingFrontendRequest() {
  }

  public TFrontendPingFrontendRequest(
    int clusterId,
    java.lang.String token)
  {
    this();
    this.clusterId = clusterId;
    setClusterIdIsSet(true);
    this.token = token;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFrontendPingFrontendRequest(TFrontendPingFrontendRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.clusterId = other.clusterId;
    if (other.isSetToken()) {
      this.token = other.token;
    }
  }

  @Override
  public TFrontendPingFrontendRequest deepCopy() {
    return new TFrontendPingFrontendRequest(this);
  }

  @Override
  public void clear() {
    setClusterIdIsSet(false);
    this.clusterId = 0;
    this.token = null;
  }

  public int getClusterId() {
    return this.clusterId;
  }

  public TFrontendPingFrontendRequest setClusterId(int clusterId) {
    this.clusterId = clusterId;
    setClusterIdIsSet(true);
    return this;
  }

  public void unsetClusterId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CLUSTERID_ISSET_ID);
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CLUSTERID_ISSET_ID);
  }

  public void setClusterIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CLUSTERID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getToken() {
    return this.token;
  }

  public TFrontendPingFrontendRequest setToken(@org.apache.thrift.annotation.Nullable java.lang.String token) {
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

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((java.lang.Integer)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_ID:
      return getClusterId();

    case TOKEN:
      return getToken();

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
    case CLUSTER_ID:
      return isSetClusterId();
    case TOKEN:
      return isSetToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFrontendPingFrontendRequest)
      return this.equals((TFrontendPingFrontendRequest)that);
    return false;
  }

  public boolean equals(TFrontendPingFrontendRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_clusterId = true;
    boolean that_present_clusterId = true;
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (this.clusterId != that.clusterId)
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + clusterId;

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFrontendPingFrontendRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetClusterId(), other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterId, other.clusterId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFrontendPingFrontendRequest(");
    boolean first = true;

    sb.append("clusterId:");
    sb.append(this.clusterId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'clusterId' because it's a primitive and you chose the non-beans generator.
    if (token == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'token' was not present! Struct: " + toString());
    }
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

  private static class TFrontendPingFrontendRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFrontendPingFrontendRequestStandardScheme getScheme() {
      return new TFrontendPingFrontendRequestStandardScheme();
    }
  }

  private static class TFrontendPingFrontendRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFrontendPingFrontendRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TFrontendPingFrontendRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.clusterId = iprot.readI32();
              struct.setClusterIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
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
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'clusterId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TFrontendPingFrontendRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
      oprot.writeI32(struct.clusterId);
      oprot.writeFieldEnd();
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFrontendPingFrontendRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFrontendPingFrontendRequestTupleScheme getScheme() {
      return new TFrontendPingFrontendRequestTupleScheme();
    }
  }

  private static class TFrontendPingFrontendRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFrontendPingFrontendRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFrontendPingFrontendRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.clusterId);
      oprot.writeString(struct.token);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFrontendPingFrontendRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.clusterId = iprot.readI32();
      struct.setClusterIdIsSet(true);
      struct.token = iprot.readString();
      struct.setTokenIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

