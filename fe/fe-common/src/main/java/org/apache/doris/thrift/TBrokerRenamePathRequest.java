/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TBrokerRenamePathRequest implements org.apache.thrift.TBase<TBrokerRenamePathRequest, TBrokerRenamePathRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerRenamePathRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerRenamePathRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SRC_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("srcPath", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DEST_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("destPath", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerRenamePathRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerRenamePathRequestTupleSchemeFactory();

  /**
   * 
   * @see TBrokerVersion
   */
  public @org.apache.thrift.annotation.Nullable TBrokerVersion version; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String srcPath; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String destPath; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TBrokerVersion
     */
    VERSION((short)1, "version"),
    SRC_PATH((short)2, "srcPath"),
    DEST_PATH((short)3, "destPath"),
    PROPERTIES((short)4, "properties");

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
        case 1: // VERSION
          return VERSION;
        case 2: // SRC_PATH
          return SRC_PATH;
        case 3: // DEST_PATH
          return DEST_PATH;
        case 4: // PROPERTIES
          return PROPERTIES;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TBrokerVersion.class)));
    tmpMap.put(_Fields.SRC_PATH, new org.apache.thrift.meta_data.FieldMetaData("srcPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEST_PATH, new org.apache.thrift.meta_data.FieldMetaData("destPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerRenamePathRequest.class, metaDataMap);
  }

  public TBrokerRenamePathRequest() {
  }

  public TBrokerRenamePathRequest(
    TBrokerVersion version,
    java.lang.String srcPath,
    java.lang.String destPath,
    java.util.Map<java.lang.String,java.lang.String> properties)
  {
    this();
    this.version = version;
    this.srcPath = srcPath;
    this.destPath = destPath;
    this.properties = properties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerRenamePathRequest(TBrokerRenamePathRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetSrcPath()) {
      this.srcPath = other.srcPath;
    }
    if (other.isSetDestPath()) {
      this.destPath = other.destPath;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  @Override
  public TBrokerRenamePathRequest deepCopy() {
    return new TBrokerRenamePathRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.srcPath = null;
    this.destPath = null;
    this.properties = null;
  }

  /**
   * 
   * @see TBrokerVersion
   */
  @org.apache.thrift.annotation.Nullable
  public TBrokerVersion getVersion() {
    return this.version;
  }

  /**
   * 
   * @see TBrokerVersion
   */
  public TBrokerRenamePathRequest setVersion(@org.apache.thrift.annotation.Nullable TBrokerVersion version) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSrcPath() {
    return this.srcPath;
  }

  public TBrokerRenamePathRequest setSrcPath(@org.apache.thrift.annotation.Nullable java.lang.String srcPath) {
    this.srcPath = srcPath;
    return this;
  }

  public void unsetSrcPath() {
    this.srcPath = null;
  }

  /** Returns true if field srcPath is set (has been assigned a value) and false otherwise */
  public boolean isSetSrcPath() {
    return this.srcPath != null;
  }

  public void setSrcPathIsSet(boolean value) {
    if (!value) {
      this.srcPath = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDestPath() {
    return this.destPath;
  }

  public TBrokerRenamePathRequest setDestPath(@org.apache.thrift.annotation.Nullable java.lang.String destPath) {
    this.destPath = destPath;
    return this;
  }

  public void unsetDestPath() {
    this.destPath = null;
  }

  /** Returns true if field destPath is set (has been assigned a value) and false otherwise */
  public boolean isSetDestPath() {
    return this.destPath != null;
  }

  public void setDestPathIsSet(boolean value) {
    if (!value) {
      this.destPath = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.properties == null) {
      this.properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.properties;
  }

  public TBrokerRenamePathRequest setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((TBrokerVersion)value);
      }
      break;

    case SRC_PATH:
      if (value == null) {
        unsetSrcPath();
      } else {
        setSrcPath((java.lang.String)value);
      }
      break;

    case DEST_PATH:
      if (value == null) {
        unsetDestPath();
      } else {
        setDestPath((java.lang.String)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case SRC_PATH:
      return getSrcPath();

    case DEST_PATH:
      return getDestPath();

    case PROPERTIES:
      return getProperties();

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
    case VERSION:
      return isSetVersion();
    case SRC_PATH:
      return isSetSrcPath();
    case DEST_PATH:
      return isSetDestPath();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerRenamePathRequest)
      return this.equals((TBrokerRenamePathRequest)that);
    return false;
  }

  public boolean equals(TBrokerRenamePathRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_srcPath = true && this.isSetSrcPath();
    boolean that_present_srcPath = true && that.isSetSrcPath();
    if (this_present_srcPath || that_present_srcPath) {
      if (!(this_present_srcPath && that_present_srcPath))
        return false;
      if (!this.srcPath.equals(that.srcPath))
        return false;
    }

    boolean this_present_destPath = true && this.isSetDestPath();
    boolean that_present_destPath = true && that.isSetDestPath();
    if (this_present_destPath || that_present_destPath) {
      if (!(this_present_destPath && that_present_destPath))
        return false;
      if (!this.destPath.equals(that.destPath))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.getValue();

    hashCode = hashCode * 8191 + ((isSetSrcPath()) ? 131071 : 524287);
    if (isSetSrcPath())
      hashCode = hashCode * 8191 + srcPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetDestPath()) ? 131071 : 524287);
    if (isSetDestPath())
      hashCode = hashCode * 8191 + destPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerRenamePathRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetSrcPath(), other.isSetSrcPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrcPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.srcPath, other.srcPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDestPath(), other.isSetDestPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destPath, other.destPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProperties(), other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerRenamePathRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("srcPath:");
    if (this.srcPath == null) {
      sb.append("null");
    } else {
      sb.append(this.srcPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("destPath:");
    if (this.destPath == null) {
      sb.append("null");
    } else {
      sb.append(this.destPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("properties:");
    if (this.properties == null) {
      sb.append("null");
    } else {
      sb.append(this.properties);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }
    if (srcPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'srcPath' was not present! Struct: " + toString());
    }
    if (destPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'destPath' was not present! Struct: " + toString());
    }
    if (properties == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'properties' was not present! Struct: " + toString());
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

  private static class TBrokerRenamePathRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerRenamePathRequestStandardScheme getScheme() {
      return new TBrokerRenamePathRequestStandardScheme();
    }
  }

  private static class TBrokerRenamePathRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerRenamePathRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerRenamePathRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SRC_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.srcPath = iprot.readString();
              struct.setSrcPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEST_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.destPath = iprot.readString();
              struct.setDestPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map28 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map28.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key29;
                @org.apache.thrift.annotation.Nullable java.lang.String _val30;
                for (int _i31 = 0; _i31 < _map28.size; ++_i31)
                {
                  _key29 = iprot.readString();
                  _val30 = iprot.readString();
                  struct.properties.put(_key29, _val30);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerRenamePathRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.srcPath != null) {
        oprot.writeFieldBegin(SRC_PATH_FIELD_DESC);
        oprot.writeString(struct.srcPath);
        oprot.writeFieldEnd();
      }
      if (struct.destPath != null) {
        oprot.writeFieldBegin(DEST_PATH_FIELD_DESC);
        oprot.writeString(struct.destPath);
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter32 : struct.properties.entrySet())
          {
            oprot.writeString(_iter32.getKey());
            oprot.writeString(_iter32.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerRenamePathRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerRenamePathRequestTupleScheme getScheme() {
      return new TBrokerRenamePathRequestTupleScheme();
    }
  }

  private static class TBrokerRenamePathRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerRenamePathRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerRenamePathRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      oprot.writeString(struct.srcPath);
      oprot.writeString(struct.destPath);
      {
        oprot.writeI32(struct.properties.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter33 : struct.properties.entrySet())
        {
          oprot.writeString(_iter33.getKey());
          oprot.writeString(_iter33.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerRenamePathRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.srcPath = iprot.readString();
      struct.setSrcPathIsSet(true);
      struct.destPath = iprot.readString();
      struct.setDestPathIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map34 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
        struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map34.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key35;
        @org.apache.thrift.annotation.Nullable java.lang.String _val36;
        for (int _i37 = 0; _i37 < _map34.size; ++_i37)
        {
          _key35 = iprot.readString();
          _val36 = iprot.readString();
          struct.properties.put(_key35, _val36);
        }
      }
      struct.setPropertiesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

