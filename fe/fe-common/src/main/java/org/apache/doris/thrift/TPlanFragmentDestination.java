/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TPlanFragmentDestination implements org.apache.thrift.TBase<TPlanFragmentDestination, TPlanFragmentDestination._Fields>, java.io.Serializable, Cloneable, Comparable<TPlanFragmentDestination> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPlanFragmentDestination");

  private static final org.apache.thrift.protocol.TField FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("server", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BRPC_SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("brpc_server", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPlanFragmentDestinationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPlanFragmentDestinationTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId fragment_instance_id; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress server; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress brpc_server; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRAGMENT_INSTANCE_ID((short)1, "fragment_instance_id"),
    SERVER((short)2, "server"),
    BRPC_SERVER((short)3, "brpc_server");

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
        case 1: // FRAGMENT_INSTANCE_ID
          return FRAGMENT_INSTANCE_ID;
        case 2: // SERVER
          return SERVER;
        case 3: // BRPC_SERVER
          return BRPC_SERVER;
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
  private static final _Fields optionals[] = {_Fields.BRPC_SERVER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("fragment_instance_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.SERVER, new org.apache.thrift.meta_data.FieldMetaData("server", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    tmpMap.put(_Fields.BRPC_SERVER, new org.apache.thrift.meta_data.FieldMetaData("brpc_server", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPlanFragmentDestination.class, metaDataMap);
  }

  public TPlanFragmentDestination() {
  }

  public TPlanFragmentDestination(
    org.apache.doris.thrift.TUniqueId fragment_instance_id,
    org.apache.doris.thrift.TNetworkAddress server)
  {
    this();
    this.fragment_instance_id = fragment_instance_id;
    this.server = server;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPlanFragmentDestination(TPlanFragmentDestination other) {
    if (other.isSetFragmentInstanceId()) {
      this.fragment_instance_id = new org.apache.doris.thrift.TUniqueId(other.fragment_instance_id);
    }
    if (other.isSetServer()) {
      this.server = new org.apache.doris.thrift.TNetworkAddress(other.server);
    }
    if (other.isSetBrpcServer()) {
      this.brpc_server = new org.apache.doris.thrift.TNetworkAddress(other.brpc_server);
    }
  }

  @Override
  public TPlanFragmentDestination deepCopy() {
    return new TPlanFragmentDestination(this);
  }

  @Override
  public void clear() {
    this.fragment_instance_id = null;
    this.server = null;
    this.brpc_server = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getFragmentInstanceId() {
    return this.fragment_instance_id;
  }

  public TPlanFragmentDestination setFragmentInstanceId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId fragment_instance_id) {
    this.fragment_instance_id = fragment_instance_id;
    return this;
  }

  public void unsetFragmentInstanceId() {
    this.fragment_instance_id = null;
  }

  /** Returns true if field fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetFragmentInstanceId() {
    return this.fragment_instance_id != null;
  }

  public void setFragmentInstanceIdIsSet(boolean value) {
    if (!value) {
      this.fragment_instance_id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getServer() {
    return this.server;
  }

  public TPlanFragmentDestination setServer(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress server) {
    this.server = server;
    return this;
  }

  public void unsetServer() {
    this.server = null;
  }

  /** Returns true if field server is set (has been assigned a value) and false otherwise */
  public boolean isSetServer() {
    return this.server != null;
  }

  public void setServerIsSet(boolean value) {
    if (!value) {
      this.server = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getBrpcServer() {
    return this.brpc_server;
  }

  public TPlanFragmentDestination setBrpcServer(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress brpc_server) {
    this.brpc_server = brpc_server;
    return this;
  }

  public void unsetBrpcServer() {
    this.brpc_server = null;
  }

  /** Returns true if field brpc_server is set (has been assigned a value) and false otherwise */
  public boolean isSetBrpcServer() {
    return this.brpc_server != null;
  }

  public void setBrpcServerIsSet(boolean value) {
    if (!value) {
      this.brpc_server = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetFragmentInstanceId();
      } else {
        setFragmentInstanceId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case SERVER:
      if (value == null) {
        unsetServer();
      } else {
        setServer((org.apache.doris.thrift.TNetworkAddress)value);
      }
      break;

    case BRPC_SERVER:
      if (value == null) {
        unsetBrpcServer();
      } else {
        setBrpcServer((org.apache.doris.thrift.TNetworkAddress)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FRAGMENT_INSTANCE_ID:
      return getFragmentInstanceId();

    case SERVER:
      return getServer();

    case BRPC_SERVER:
      return getBrpcServer();

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
    case FRAGMENT_INSTANCE_ID:
      return isSetFragmentInstanceId();
    case SERVER:
      return isSetServer();
    case BRPC_SERVER:
      return isSetBrpcServer();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPlanFragmentDestination)
      return this.equals((TPlanFragmentDestination)that);
    return false;
  }

  public boolean equals(TPlanFragmentDestination that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fragment_instance_id = true && this.isSetFragmentInstanceId();
    boolean that_present_fragment_instance_id = true && that.isSetFragmentInstanceId();
    if (this_present_fragment_instance_id || that_present_fragment_instance_id) {
      if (!(this_present_fragment_instance_id && that_present_fragment_instance_id))
        return false;
      if (!this.fragment_instance_id.equals(that.fragment_instance_id))
        return false;
    }

    boolean this_present_server = true && this.isSetServer();
    boolean that_present_server = true && that.isSetServer();
    if (this_present_server || that_present_server) {
      if (!(this_present_server && that_present_server))
        return false;
      if (!this.server.equals(that.server))
        return false;
    }

    boolean this_present_brpc_server = true && this.isSetBrpcServer();
    boolean that_present_brpc_server = true && that.isSetBrpcServer();
    if (this_present_brpc_server || that_present_brpc_server) {
      if (!(this_present_brpc_server && that_present_brpc_server))
        return false;
      if (!this.brpc_server.equals(that.brpc_server))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFragmentInstanceId()) ? 131071 : 524287);
    if (isSetFragmentInstanceId())
      hashCode = hashCode * 8191 + fragment_instance_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetServer()) ? 131071 : 524287);
    if (isSetServer())
      hashCode = hashCode * 8191 + server.hashCode();

    hashCode = hashCode * 8191 + ((isSetBrpcServer()) ? 131071 : 524287);
    if (isSetBrpcServer())
      hashCode = hashCode * 8191 + brpc_server.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPlanFragmentDestination other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFragmentInstanceId(), other.isSetFragmentInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFragmentInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fragment_instance_id, other.fragment_instance_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetServer(), other.isSetServer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server, other.server);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBrpcServer(), other.isSetBrpcServer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrpcServer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brpc_server, other.brpc_server);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPlanFragmentDestination(");
    boolean first = true;

    sb.append("fragment_instance_id:");
    if (this.fragment_instance_id == null) {
      sb.append("null");
    } else {
      sb.append(this.fragment_instance_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("server:");
    if (this.server == null) {
      sb.append("null");
    } else {
      sb.append(this.server);
    }
    first = false;
    if (isSetBrpcServer()) {
      if (!first) sb.append(", ");
      sb.append("brpc_server:");
      if (this.brpc_server == null) {
        sb.append("null");
      } else {
        sb.append(this.brpc_server);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fragment_instance_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fragment_instance_id' was not present! Struct: " + toString());
    }
    if (server == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'server' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (fragment_instance_id != null) {
      fragment_instance_id.validate();
    }
    if (server != null) {
      server.validate();
    }
    if (brpc_server != null) {
      brpc_server.validate();
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

  private static class TPlanFragmentDestinationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPlanFragmentDestinationStandardScheme getScheme() {
      return new TPlanFragmentDestinationStandardScheme();
    }
  }

  private static class TPlanFragmentDestinationStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPlanFragmentDestination> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
              struct.fragment_instance_id.read(iprot);
              struct.setFragmentInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.server = new org.apache.doris.thrift.TNetworkAddress();
              struct.server.read(iprot);
              struct.setServerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BRPC_SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.brpc_server = new org.apache.doris.thrift.TNetworkAddress();
              struct.brpc_server.read(iprot);
              struct.setBrpcServerIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fragment_instance_id != null) {
        oprot.writeFieldBegin(FRAGMENT_INSTANCE_ID_FIELD_DESC);
        struct.fragment_instance_id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.server != null) {
        oprot.writeFieldBegin(SERVER_FIELD_DESC);
        struct.server.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.brpc_server != null) {
        if (struct.isSetBrpcServer()) {
          oprot.writeFieldBegin(BRPC_SERVER_FIELD_DESC);
          struct.brpc_server.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPlanFragmentDestinationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPlanFragmentDestinationTupleScheme getScheme() {
      return new TPlanFragmentDestinationTupleScheme();
    }
  }

  private static class TPlanFragmentDestinationTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPlanFragmentDestination> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.fragment_instance_id.write(oprot);
      struct.server.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBrpcServer()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBrpcServer()) {
        struct.brpc_server.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
      struct.fragment_instance_id.read(iprot);
      struct.setFragmentInstanceIdIsSet(true);
      struct.server = new org.apache.doris.thrift.TNetworkAddress();
      struct.server.read(iprot);
      struct.setServerIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.brpc_server = new org.apache.doris.thrift.TNetworkAddress();
        struct.brpc_server.read(iprot);
        struct.setBrpcServerIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

