/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TUserSpecification implements org.apache.thrift.TBase<TUserSpecification, TUserSpecification._Fields>, java.io.Serializable, Cloneable, Comparable<TUserSpecification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUserSpecification");

  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("user_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("host_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUserSpecificationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUserSpecificationTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String user_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String host_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_NAME((short)1, "user_name"),
    HOST_NAME((short)2, "host_name");

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
        case 1: // USER_NAME
          return USER_NAME;
        case 2: // HOST_NAME
          return HOST_NAME;
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
  private static final _Fields optionals[] = {_Fields.HOST_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("user_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("host_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUserSpecification.class, metaDataMap);
  }

  public TUserSpecification() {
  }

  public TUserSpecification(
    java.lang.String user_name)
  {
    this();
    this.user_name = user_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUserSpecification(TUserSpecification other) {
    if (other.isSetUserName()) {
      this.user_name = other.user_name;
    }
    if (other.isSetHostName()) {
      this.host_name = other.host_name;
    }
  }

  @Override
  public TUserSpecification deepCopy() {
    return new TUserSpecification(this);
  }

  @Override
  public void clear() {
    this.user_name = null;
    this.host_name = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserName() {
    return this.user_name;
  }

  public TUserSpecification setUserName(@org.apache.thrift.annotation.Nullable java.lang.String user_name) {
    this.user_name = user_name;
    return this;
  }

  public void unsetUserName() {
    this.user_name = null;
  }

  /** Returns true if field user_name is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.user_name != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.user_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHostName() {
    return this.host_name;
  }

  public TUserSpecification setHostName(@org.apache.thrift.annotation.Nullable java.lang.String host_name) {
    this.host_name = host_name;
    return this;
  }

  public void unsetHostName() {
    this.host_name = null;
  }

  /** Returns true if field host_name is set (has been assigned a value) and false otherwise */
  public boolean isSetHostName() {
    return this.host_name != null;
  }

  public void setHostNameIsSet(boolean value) {
    if (!value) {
      this.host_name = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((java.lang.String)value);
      }
      break;

    case HOST_NAME:
      if (value == null) {
        unsetHostName();
      } else {
        setHostName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_NAME:
      return getUserName();

    case HOST_NAME:
      return getHostName();

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
    case USER_NAME:
      return isSetUserName();
    case HOST_NAME:
      return isSetHostName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUserSpecification)
      return this.equals((TUserSpecification)that);
    return false;
  }

  public boolean equals(TUserSpecification that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user_name = true && this.isSetUserName();
    boolean that_present_user_name = true && that.isSetUserName();
    if (this_present_user_name || that_present_user_name) {
      if (!(this_present_user_name && that_present_user_name))
        return false;
      if (!this.user_name.equals(that.user_name))
        return false;
    }

    boolean this_present_host_name = true && this.isSetHostName();
    boolean that_present_host_name = true && that.isSetHostName();
    if (this_present_host_name || that_present_host_name) {
      if (!(this_present_host_name && that_present_host_name))
        return false;
      if (!this.host_name.equals(that.host_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserName()) ? 131071 : 524287);
    if (isSetUserName())
      hashCode = hashCode * 8191 + user_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetHostName()) ? 131071 : 524287);
    if (isSetHostName())
      hashCode = hashCode * 8191 + host_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUserSpecification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUserName(), other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_name, other.user_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHostName(), other.isSetHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host_name, other.host_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUserSpecification(");
    boolean first = true;

    sb.append("user_name:");
    if (this.user_name == null) {
      sb.append("null");
    } else {
      sb.append(this.user_name);
    }
    first = false;
    if (isSetHostName()) {
      if (!first) sb.append(", ");
      sb.append("host_name:");
      if (this.host_name == null) {
        sb.append("null");
      } else {
        sb.append(this.host_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (user_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_name' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUserSpecificationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserSpecificationStandardScheme getScheme() {
      return new TUserSpecificationStandardScheme();
    }
  }

  private static class TUserSpecificationStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUserSpecification> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUserSpecification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_name = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host_name = iprot.readString();
              struct.setHostNameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUserSpecification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_name != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.user_name);
        oprot.writeFieldEnd();
      }
      if (struct.host_name != null) {
        if (struct.isSetHostName()) {
          oprot.writeFieldBegin(HOST_NAME_FIELD_DESC);
          oprot.writeString(struct.host_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUserSpecificationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserSpecificationTupleScheme getScheme() {
      return new TUserSpecificationTupleScheme();
    }
  }

  private static class TUserSpecificationTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUserSpecification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUserSpecification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.user_name);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHostName()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHostName()) {
        oprot.writeString(struct.host_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUserSpecification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.user_name = iprot.readString();
      struct.setUserNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.host_name = iprot.readString();
        struct.setHostNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

