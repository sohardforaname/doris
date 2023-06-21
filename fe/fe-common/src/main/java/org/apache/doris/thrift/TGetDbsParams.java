/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TGetDbsParams implements org.apache.thrift.TBase<TGetDbsParams, TGetDbsParams._Fields>, java.io.Serializable, Cloneable, Comparable<TGetDbsParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetDbsParams");

  private static final org.apache.thrift.protocol.TField PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("pattern", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("user_ip", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENT_USER_IDENT_FIELD_DESC = new org.apache.thrift.protocol.TField("current_user_ident", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetDbsParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetDbsParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String pattern; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user_ip; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String catalog; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATTERN((short)1, "pattern"),
    USER((short)2, "user"),
    USER_IP((short)3, "user_ip"),
    CURRENT_USER_IDENT((short)4, "current_user_ident"),
    CATALOG((short)5, "catalog");

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
        case 1: // PATTERN
          return PATTERN;
        case 2: // USER
          return USER;
        case 3: // USER_IP
          return USER_IP;
        case 4: // CURRENT_USER_IDENT
          return CURRENT_USER_IDENT;
        case 5: // CATALOG
          return CATALOG;
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
  private static final _Fields optionals[] = {_Fields.PATTERN,_Fields.USER,_Fields.USER_IP,_Fields.CURRENT_USER_IDENT,_Fields.CATALOG};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATTERN, new org.apache.thrift.meta_data.FieldMetaData("pattern", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_IP, new org.apache.thrift.meta_data.FieldMetaData("user_ip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURRENT_USER_IDENT, new org.apache.thrift.meta_data.FieldMetaData("current_user_ident", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUserIdentity.class)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetDbsParams.class, metaDataMap);
  }

  public TGetDbsParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetDbsParams(TGetDbsParams other) {
    if (other.isSetPattern()) {
      this.pattern = other.pattern;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetUserIp()) {
      this.user_ip = other.user_ip;
    }
    if (other.isSetCurrentUserIdent()) {
      this.current_user_ident = new org.apache.doris.thrift.TUserIdentity(other.current_user_ident);
    }
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
  }

  @Override
  public TGetDbsParams deepCopy() {
    return new TGetDbsParams(this);
  }

  @Override
  public void clear() {
    this.pattern = null;
    this.user = null;
    this.user_ip = null;
    this.current_user_ident = null;
    this.catalog = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPattern() {
    return this.pattern;
  }

  public TGetDbsParams setPattern(@org.apache.thrift.annotation.Nullable java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  public void unsetPattern() {
    this.pattern = null;
  }

  /** Returns true if field pattern is set (has been assigned a value) and false otherwise */
  public boolean isSetPattern() {
    return this.pattern != null;
  }

  public void setPatternIsSet(boolean value) {
    if (!value) {
      this.pattern = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public TGetDbsParams setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
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
  public java.lang.String getUserIp() {
    return this.user_ip;
  }

  public TGetDbsParams setUserIp(@org.apache.thrift.annotation.Nullable java.lang.String user_ip) {
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
  public org.apache.doris.thrift.TUserIdentity getCurrentUserIdent() {
    return this.current_user_ident;
  }

  public TGetDbsParams setCurrentUserIdent(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident) {
    this.current_user_ident = current_user_ident;
    return this;
  }

  public void unsetCurrentUserIdent() {
    this.current_user_ident = null;
  }

  /** Returns true if field current_user_ident is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentUserIdent() {
    return this.current_user_ident != null;
  }

  public void setCurrentUserIdentIsSet(boolean value) {
    if (!value) {
      this.current_user_ident = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalog() {
    return this.catalog;
  }

  public TGetDbsParams setCatalog(@org.apache.thrift.annotation.Nullable java.lang.String catalog) {
    this.catalog = catalog;
    return this;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PATTERN:
      if (value == null) {
        unsetPattern();
      } else {
        setPattern((java.lang.String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case USER_IP:
      if (value == null) {
        unsetUserIp();
      } else {
        setUserIp((java.lang.String)value);
      }
      break;

    case CURRENT_USER_IDENT:
      if (value == null) {
        unsetCurrentUserIdent();
      } else {
        setCurrentUserIdent((org.apache.doris.thrift.TUserIdentity)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PATTERN:
      return getPattern();

    case USER:
      return getUser();

    case USER_IP:
      return getUserIp();

    case CURRENT_USER_IDENT:
      return getCurrentUserIdent();

    case CATALOG:
      return getCatalog();

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
    case PATTERN:
      return isSetPattern();
    case USER:
      return isSetUser();
    case USER_IP:
      return isSetUserIp();
    case CURRENT_USER_IDENT:
      return isSetCurrentUserIdent();
    case CATALOG:
      return isSetCatalog();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetDbsParams)
      return this.equals((TGetDbsParams)that);
    return false;
  }

  public boolean equals(TGetDbsParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pattern = true && this.isSetPattern();
    boolean that_present_pattern = true && that.isSetPattern();
    if (this_present_pattern || that_present_pattern) {
      if (!(this_present_pattern && that_present_pattern))
        return false;
      if (!this.pattern.equals(that.pattern))
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

    boolean this_present_user_ip = true && this.isSetUserIp();
    boolean that_present_user_ip = true && that.isSetUserIp();
    if (this_present_user_ip || that_present_user_ip) {
      if (!(this_present_user_ip && that_present_user_ip))
        return false;
      if (!this.user_ip.equals(that.user_ip))
        return false;
    }

    boolean this_present_current_user_ident = true && this.isSetCurrentUserIdent();
    boolean that_present_current_user_ident = true && that.isSetCurrentUserIdent();
    if (this_present_current_user_ident || that_present_current_user_ident) {
      if (!(this_present_current_user_ident && that_present_current_user_ident))
        return false;
      if (!this.current_user_ident.equals(that.current_user_ident))
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPattern()) ? 131071 : 524287);
    if (isSetPattern())
      hashCode = hashCode * 8191 + pattern.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserIp()) ? 131071 : 524287);
    if (isSetUserIp())
      hashCode = hashCode * 8191 + user_ip.hashCode();

    hashCode = hashCode * 8191 + ((isSetCurrentUserIdent()) ? 131071 : 524287);
    if (isSetCurrentUserIdent())
      hashCode = hashCode * 8191 + current_user_ident.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatalog()) ? 131071 : 524287);
    if (isSetCatalog())
      hashCode = hashCode * 8191 + catalog.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetDbsParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPattern(), other.isSetPattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pattern, other.pattern);
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
    lastComparison = java.lang.Boolean.compare(isSetCurrentUserIdent(), other.isSetCurrentUserIdent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentUserIdent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_user_ident, other.current_user_ident);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalog(), other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetDbsParams(");
    boolean first = true;

    if (isSetPattern()) {
      sb.append("pattern:");
      if (this.pattern == null) {
        sb.append("null");
      } else {
        sb.append(this.pattern);
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
    if (isSetCurrentUserIdent()) {
      if (!first) sb.append(", ");
      sb.append("current_user_ident:");
      if (this.current_user_ident == null) {
        sb.append("null");
      } else {
        sb.append(this.current_user_ident);
      }
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (current_user_ident != null) {
      current_user_ident.validate();
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

  private static class TGetDbsParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetDbsParamsStandardScheme getScheme() {
      return new TGetDbsParamsStandardScheme();
    }
  }

  private static class TGetDbsParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetDbsParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetDbsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pattern = iprot.readString();
              struct.setPatternIsSet(true);
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
          case 3: // USER_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_ip = iprot.readString();
              struct.setUserIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CURRENT_USER_IDENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
              struct.current_user_ident.read(iprot);
              struct.setCurrentUserIdentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetDbsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pattern != null) {
        if (struct.isSetPattern()) {
          oprot.writeFieldBegin(PATTERN_FIELD_DESC);
          oprot.writeString(struct.pattern);
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
      if (struct.user_ip != null) {
        if (struct.isSetUserIp()) {
          oprot.writeFieldBegin(USER_IP_FIELD_DESC);
          oprot.writeString(struct.user_ip);
          oprot.writeFieldEnd();
        }
      }
      if (struct.current_user_ident != null) {
        if (struct.isSetCurrentUserIdent()) {
          oprot.writeFieldBegin(CURRENT_USER_IDENT_FIELD_DESC);
          struct.current_user_ident.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeString(struct.catalog);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetDbsParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetDbsParamsTupleScheme getScheme() {
      return new TGetDbsParamsTupleScheme();
    }
  }

  private static class TGetDbsParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetDbsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetDbsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPattern()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetUserIp()) {
        optionals.set(2);
      }
      if (struct.isSetCurrentUserIdent()) {
        optionals.set(3);
      }
      if (struct.isSetCatalog()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPattern()) {
        oprot.writeString(struct.pattern);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetUserIp()) {
        oprot.writeString(struct.user_ip);
      }
      if (struct.isSetCurrentUserIdent()) {
        struct.current_user_ident.write(oprot);
      }
      if (struct.isSetCatalog()) {
        oprot.writeString(struct.catalog);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetDbsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.pattern = iprot.readString();
        struct.setPatternIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user_ip = iprot.readString();
        struct.setUserIpIsSet(true);
      }
      if (incoming.get(3)) {
        struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
        struct.current_user_ident.read(iprot);
        struct.setCurrentUserIdentIsSet(true);
      }
      if (incoming.get(4)) {
        struct.catalog = iprot.readString();
        struct.setCatalogIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

