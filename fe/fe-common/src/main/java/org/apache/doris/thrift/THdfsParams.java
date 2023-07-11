/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class THdfsParams implements org.apache.thrift.TBase<THdfsParams, THdfsParams._Fields>, java.io.Serializable, Cloneable, Comparable<THdfsParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THdfsParams");

  private static final org.apache.thrift.protocol.TField FS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fs_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HDFS_KERBEROS_PRINCIPAL_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_kerberos_principal", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HDFS_KERBEROS_KEYTAB_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_kerberos_keytab", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField HDFS_CONF_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_conf", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THdfsParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THdfsParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String fs_name; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String hdfs_kerberos_principal; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String hdfs_kerberos_keytab; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<THdfsConf> hdfs_conf; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FS_NAME((short)1, "fs_name"),
    USER((short)2, "user"),
    HDFS_KERBEROS_PRINCIPAL((short)3, "hdfs_kerberos_principal"),
    HDFS_KERBEROS_KEYTAB((short)4, "hdfs_kerberos_keytab"),
    HDFS_CONF((short)5, "hdfs_conf");

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
        case 1: // FS_NAME
          return FS_NAME;
        case 2: // USER
          return USER;
        case 3: // HDFS_KERBEROS_PRINCIPAL
          return HDFS_KERBEROS_PRINCIPAL;
        case 4: // HDFS_KERBEROS_KEYTAB
          return HDFS_KERBEROS_KEYTAB;
        case 5: // HDFS_CONF
          return HDFS_CONF;
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
  private static final _Fields optionals[] = {_Fields.FS_NAME,_Fields.USER,_Fields.HDFS_KERBEROS_PRINCIPAL,_Fields.HDFS_KERBEROS_KEYTAB,_Fields.HDFS_CONF};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FS_NAME, new org.apache.thrift.meta_data.FieldMetaData("fs_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HDFS_KERBEROS_PRINCIPAL, new org.apache.thrift.meta_data.FieldMetaData("hdfs_kerberos_principal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HDFS_KERBEROS_KEYTAB, new org.apache.thrift.meta_data.FieldMetaData("hdfs_kerberos_keytab", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HDFS_CONF, new org.apache.thrift.meta_data.FieldMetaData("hdfs_conf", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsConf.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THdfsParams.class, metaDataMap);
  }

  public THdfsParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THdfsParams(THdfsParams other) {
    if (other.isSetFsName()) {
      this.fs_name = other.fs_name;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetHdfsKerberosPrincipal()) {
      this.hdfs_kerberos_principal = other.hdfs_kerberos_principal;
    }
    if (other.isSetHdfsKerberosKeytab()) {
      this.hdfs_kerberos_keytab = other.hdfs_kerberos_keytab;
    }
    if (other.isSetHdfsConf()) {
      java.util.List<THdfsConf> __this__hdfs_conf = new java.util.ArrayList<THdfsConf>(other.hdfs_conf.size());
      for (THdfsConf other_element : other.hdfs_conf) {
        __this__hdfs_conf.add(new THdfsConf(other_element));
      }
      this.hdfs_conf = __this__hdfs_conf;
    }
  }

  @Override
  public THdfsParams deepCopy() {
    return new THdfsParams(this);
  }

  @Override
  public void clear() {
    this.fs_name = null;
    this.user = null;
    this.hdfs_kerberos_principal = null;
    this.hdfs_kerberos_keytab = null;
    this.hdfs_conf = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFsName() {
    return this.fs_name;
  }

  public THdfsParams setFsName(@org.apache.thrift.annotation.Nullable java.lang.String fs_name) {
    this.fs_name = fs_name;
    return this;
  }

  public void unsetFsName() {
    this.fs_name = null;
  }

  /** Returns true if field fs_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFsName() {
    return this.fs_name != null;
  }

  public void setFsNameIsSet(boolean value) {
    if (!value) {
      this.fs_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public THdfsParams setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
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
  public java.lang.String getHdfsKerberosPrincipal() {
    return this.hdfs_kerberos_principal;
  }

  public THdfsParams setHdfsKerberosPrincipal(@org.apache.thrift.annotation.Nullable java.lang.String hdfs_kerberos_principal) {
    this.hdfs_kerberos_principal = hdfs_kerberos_principal;
    return this;
  }

  public void unsetHdfsKerberosPrincipal() {
    this.hdfs_kerberos_principal = null;
  }

  /** Returns true if field hdfs_kerberos_principal is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfsKerberosPrincipal() {
    return this.hdfs_kerberos_principal != null;
  }

  public void setHdfsKerberosPrincipalIsSet(boolean value) {
    if (!value) {
      this.hdfs_kerberos_principal = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHdfsKerberosKeytab() {
    return this.hdfs_kerberos_keytab;
  }

  public THdfsParams setHdfsKerberosKeytab(@org.apache.thrift.annotation.Nullable java.lang.String hdfs_kerberos_keytab) {
    this.hdfs_kerberos_keytab = hdfs_kerberos_keytab;
    return this;
  }

  public void unsetHdfsKerberosKeytab() {
    this.hdfs_kerberos_keytab = null;
  }

  /** Returns true if field hdfs_kerberos_keytab is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfsKerberosKeytab() {
    return this.hdfs_kerberos_keytab != null;
  }

  public void setHdfsKerberosKeytabIsSet(boolean value) {
    if (!value) {
      this.hdfs_kerberos_keytab = null;
    }
  }

  public int getHdfsConfSize() {
    return (this.hdfs_conf == null) ? 0 : this.hdfs_conf.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<THdfsConf> getHdfsConfIterator() {
    return (this.hdfs_conf == null) ? null : this.hdfs_conf.iterator();
  }

  public void addToHdfsConf(THdfsConf elem) {
    if (this.hdfs_conf == null) {
      this.hdfs_conf = new java.util.ArrayList<THdfsConf>();
    }
    this.hdfs_conf.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<THdfsConf> getHdfsConf() {
    return this.hdfs_conf;
  }

  public THdfsParams setHdfsConf(@org.apache.thrift.annotation.Nullable java.util.List<THdfsConf> hdfs_conf) {
    this.hdfs_conf = hdfs_conf;
    return this;
  }

  public void unsetHdfsConf() {
    this.hdfs_conf = null;
  }

  /** Returns true if field hdfs_conf is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfsConf() {
    return this.hdfs_conf != null;
  }

  public void setHdfsConfIsSet(boolean value) {
    if (!value) {
      this.hdfs_conf = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FS_NAME:
      if (value == null) {
        unsetFsName();
      } else {
        setFsName((java.lang.String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case HDFS_KERBEROS_PRINCIPAL:
      if (value == null) {
        unsetHdfsKerberosPrincipal();
      } else {
        setHdfsKerberosPrincipal((java.lang.String)value);
      }
      break;

    case HDFS_KERBEROS_KEYTAB:
      if (value == null) {
        unsetHdfsKerberosKeytab();
      } else {
        setHdfsKerberosKeytab((java.lang.String)value);
      }
      break;

    case HDFS_CONF:
      if (value == null) {
        unsetHdfsConf();
      } else {
        setHdfsConf((java.util.List<THdfsConf>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FS_NAME:
      return getFsName();

    case USER:
      return getUser();

    case HDFS_KERBEROS_PRINCIPAL:
      return getHdfsKerberosPrincipal();

    case HDFS_KERBEROS_KEYTAB:
      return getHdfsKerberosKeytab();

    case HDFS_CONF:
      return getHdfsConf();

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
    case FS_NAME:
      return isSetFsName();
    case USER:
      return isSetUser();
    case HDFS_KERBEROS_PRINCIPAL:
      return isSetHdfsKerberosPrincipal();
    case HDFS_KERBEROS_KEYTAB:
      return isSetHdfsKerberosKeytab();
    case HDFS_CONF:
      return isSetHdfsConf();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof THdfsParams)
      return this.equals((THdfsParams)that);
    return false;
  }

  public boolean equals(THdfsParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fs_name = true && this.isSetFsName();
    boolean that_present_fs_name = true && that.isSetFsName();
    if (this_present_fs_name || that_present_fs_name) {
      if (!(this_present_fs_name && that_present_fs_name))
        return false;
      if (!this.fs_name.equals(that.fs_name))
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

    boolean this_present_hdfs_kerberos_principal = true && this.isSetHdfsKerberosPrincipal();
    boolean that_present_hdfs_kerberos_principal = true && that.isSetHdfsKerberosPrincipal();
    if (this_present_hdfs_kerberos_principal || that_present_hdfs_kerberos_principal) {
      if (!(this_present_hdfs_kerberos_principal && that_present_hdfs_kerberos_principal))
        return false;
      if (!this.hdfs_kerberos_principal.equals(that.hdfs_kerberos_principal))
        return false;
    }

    boolean this_present_hdfs_kerberos_keytab = true && this.isSetHdfsKerberosKeytab();
    boolean that_present_hdfs_kerberos_keytab = true && that.isSetHdfsKerberosKeytab();
    if (this_present_hdfs_kerberos_keytab || that_present_hdfs_kerberos_keytab) {
      if (!(this_present_hdfs_kerberos_keytab && that_present_hdfs_kerberos_keytab))
        return false;
      if (!this.hdfs_kerberos_keytab.equals(that.hdfs_kerberos_keytab))
        return false;
    }

    boolean this_present_hdfs_conf = true && this.isSetHdfsConf();
    boolean that_present_hdfs_conf = true && that.isSetHdfsConf();
    if (this_present_hdfs_conf || that_present_hdfs_conf) {
      if (!(this_present_hdfs_conf && that_present_hdfs_conf))
        return false;
      if (!this.hdfs_conf.equals(that.hdfs_conf))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFsName()) ? 131071 : 524287);
    if (isSetFsName())
      hashCode = hashCode * 8191 + fs_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetHdfsKerberosPrincipal()) ? 131071 : 524287);
    if (isSetHdfsKerberosPrincipal())
      hashCode = hashCode * 8191 + hdfs_kerberos_principal.hashCode();

    hashCode = hashCode * 8191 + ((isSetHdfsKerberosKeytab()) ? 131071 : 524287);
    if (isSetHdfsKerberosKeytab())
      hashCode = hashCode * 8191 + hdfs_kerberos_keytab.hashCode();

    hashCode = hashCode * 8191 + ((isSetHdfsConf()) ? 131071 : 524287);
    if (isSetHdfsConf())
      hashCode = hashCode * 8191 + hdfs_conf.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(THdfsParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFsName(), other.isSetFsName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFsName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fs_name, other.fs_name);
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
    lastComparison = java.lang.Boolean.compare(isSetHdfsKerberosPrincipal(), other.isSetHdfsKerberosPrincipal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfsKerberosPrincipal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_kerberos_principal, other.hdfs_kerberos_principal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHdfsKerberosKeytab(), other.isSetHdfsKerberosKeytab());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfsKerberosKeytab()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_kerberos_keytab, other.hdfs_kerberos_keytab);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHdfsConf(), other.isSetHdfsConf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfsConf()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_conf, other.hdfs_conf);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THdfsParams(");
    boolean first = true;

    if (isSetFsName()) {
      sb.append("fs_name:");
      if (this.fs_name == null) {
        sb.append("null");
      } else {
        sb.append(this.fs_name);
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
    if (isSetHdfsKerberosPrincipal()) {
      if (!first) sb.append(", ");
      sb.append("hdfs_kerberos_principal:");
      if (this.hdfs_kerberos_principal == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_kerberos_principal);
      }
      first = false;
    }
    if (isSetHdfsKerberosKeytab()) {
      if (!first) sb.append(", ");
      sb.append("hdfs_kerberos_keytab:");
      if (this.hdfs_kerberos_keytab == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_kerberos_keytab);
      }
      first = false;
    }
    if (isSetHdfsConf()) {
      if (!first) sb.append(", ");
      sb.append("hdfs_conf:");
      if (this.hdfs_conf == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_conf);
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

  private static class THdfsParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public THdfsParamsStandardScheme getScheme() {
      return new THdfsParamsStandardScheme();
    }
  }

  private static class THdfsParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<THdfsParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, THdfsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fs_name = iprot.readString();
              struct.setFsNameIsSet(true);
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
          case 3: // HDFS_KERBEROS_PRINCIPAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hdfs_kerberos_principal = iprot.readString();
              struct.setHdfsKerberosPrincipalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HDFS_KERBEROS_KEYTAB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hdfs_kerberos_keytab = iprot.readString();
              struct.setHdfsKerberosKeytabIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HDFS_CONF
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.hdfs_conf = new java.util.ArrayList<THdfsConf>(_list16.size);
                @org.apache.thrift.annotation.Nullable THdfsConf _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new THdfsConf();
                  _elem17.read(iprot);
                  struct.hdfs_conf.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setHdfsConfIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, THdfsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fs_name != null) {
        if (struct.isSetFsName()) {
          oprot.writeFieldBegin(FS_NAME_FIELD_DESC);
          oprot.writeString(struct.fs_name);
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
      if (struct.hdfs_kerberos_principal != null) {
        if (struct.isSetHdfsKerberosPrincipal()) {
          oprot.writeFieldBegin(HDFS_KERBEROS_PRINCIPAL_FIELD_DESC);
          oprot.writeString(struct.hdfs_kerberos_principal);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hdfs_kerberos_keytab != null) {
        if (struct.isSetHdfsKerberosKeytab()) {
          oprot.writeFieldBegin(HDFS_KERBEROS_KEYTAB_FIELD_DESC);
          oprot.writeString(struct.hdfs_kerberos_keytab);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hdfs_conf != null) {
        if (struct.isSetHdfsConf()) {
          oprot.writeFieldBegin(HDFS_CONF_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.hdfs_conf.size()));
            for (THdfsConf _iter19 : struct.hdfs_conf)
            {
              _iter19.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THdfsParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public THdfsParamsTupleScheme getScheme() {
      return new THdfsParamsTupleScheme();
    }
  }

  private static class THdfsParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<THdfsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THdfsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFsName()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetHdfsKerberosPrincipal()) {
        optionals.set(2);
      }
      if (struct.isSetHdfsKerberosKeytab()) {
        optionals.set(3);
      }
      if (struct.isSetHdfsConf()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetFsName()) {
        oprot.writeString(struct.fs_name);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetHdfsKerberosPrincipal()) {
        oprot.writeString(struct.hdfs_kerberos_principal);
      }
      if (struct.isSetHdfsKerberosKeytab()) {
        oprot.writeString(struct.hdfs_kerberos_keytab);
      }
      if (struct.isSetHdfsConf()) {
        {
          oprot.writeI32(struct.hdfs_conf.size());
          for (THdfsConf _iter20 : struct.hdfs_conf)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THdfsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.fs_name = iprot.readString();
        struct.setFsNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.hdfs_kerberos_principal = iprot.readString();
        struct.setHdfsKerberosPrincipalIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hdfs_kerberos_keytab = iprot.readString();
        struct.setHdfsKerberosKeytabIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.hdfs_conf = new java.util.ArrayList<THdfsConf>(_list21.size);
          @org.apache.thrift.annotation.Nullable THdfsConf _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new THdfsConf();
            _elem22.read(iprot);
            struct.hdfs_conf.add(_elem22);
          }
        }
        struct.setHdfsConfIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

