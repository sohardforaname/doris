/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TCreateUserParams implements org.apache.thrift.TBase<TCreateUserParams, TCreateUserParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateUserParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateUserParams");

  private static final org.apache.thrift.protocol.TField USER_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("user_spec", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCreateUserParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCreateUserParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TUserSpecification user_spec; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String password; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_SPEC((short)1, "user_spec"),
    PASSWORD((short)2, "password");

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
        case 1: // USER_SPEC
          return USER_SPEC;
        case 2: // PASSWORD
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
  private static final _Fields optionals[] = {_Fields.PASSWORD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_SPEC, new org.apache.thrift.meta_data.FieldMetaData("user_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUserSpecification.class)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateUserParams.class, metaDataMap);
  }

  public TCreateUserParams() {
  }

  public TCreateUserParams(
    TUserSpecification user_spec)
  {
    this();
    this.user_spec = user_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateUserParams(TCreateUserParams other) {
    if (other.isSetUserSpec()) {
      this.user_spec = new TUserSpecification(other.user_spec);
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  @Override
  public TCreateUserParams deepCopy() {
    return new TCreateUserParams(this);
  }

  @Override
  public void clear() {
    this.user_spec = null;
    this.password = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TUserSpecification getUserSpec() {
    return this.user_spec;
  }

  public TCreateUserParams setUserSpec(@org.apache.thrift.annotation.Nullable TUserSpecification user_spec) {
    this.user_spec = user_spec;
    return this;
  }

  public void unsetUserSpec() {
    this.user_spec = null;
  }

  /** Returns true if field user_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetUserSpec() {
    return this.user_spec != null;
  }

  public void setUserSpecIsSet(boolean value) {
    if (!value) {
      this.user_spec = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPassword() {
    return this.password;
  }

  public TCreateUserParams setPassword(@org.apache.thrift.annotation.Nullable java.lang.String password) {
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
    case USER_SPEC:
      if (value == null) {
        unsetUserSpec();
      } else {
        setUserSpec((TUserSpecification)value);
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
    case USER_SPEC:
      return getUserSpec();

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
    case USER_SPEC:
      return isSetUserSpec();
    case PASSWORD:
      return isSetPassword();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCreateUserParams)
      return this.equals((TCreateUserParams)that);
    return false;
  }

  public boolean equals(TCreateUserParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user_spec = true && this.isSetUserSpec();
    boolean that_present_user_spec = true && that.isSetUserSpec();
    if (this_present_user_spec || that_present_user_spec) {
      if (!(this_present_user_spec && that_present_user_spec))
        return false;
      if (!this.user_spec.equals(that.user_spec))
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

    hashCode = hashCode * 8191 + ((isSetUserSpec()) ? 131071 : 524287);
    if (isSetUserSpec())
      hashCode = hashCode * 8191 + user_spec.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCreateUserParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUserSpec(), other.isSetUserSpec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserSpec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_spec, other.user_spec);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCreateUserParams(");
    boolean first = true;

    sb.append("user_spec:");
    if (this.user_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.user_spec);
    }
    first = false;
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
    if (user_spec == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_spec' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (user_spec != null) {
      user_spec.validate();
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

  private static class TCreateUserParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCreateUserParamsStandardScheme getScheme() {
      return new TCreateUserParamsStandardScheme();
    }
  }

  private static class TCreateUserParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCreateUserParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user_spec = new TUserSpecification();
              struct.user_spec.read(iprot);
              struct.setUserSpecIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateUserParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_spec != null) {
        oprot.writeFieldBegin(USER_SPEC_FIELD_DESC);
        struct.user_spec.write(oprot);
        oprot.writeFieldEnd();
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

  private static class TCreateUserParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCreateUserParamsTupleScheme getScheme() {
      return new TCreateUserParamsTupleScheme();
    }
  }

  private static class TCreateUserParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCreateUserParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.user_spec.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPassword()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.user_spec = new TUserSpecification();
      struct.user_spec.read(iprot);
      struct.setUserSpecIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

