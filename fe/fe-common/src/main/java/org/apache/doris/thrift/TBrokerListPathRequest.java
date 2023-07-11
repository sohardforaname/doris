/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TBrokerListPathRequest implements org.apache.thrift.TBase<TBrokerListPathRequest, TBrokerListPathRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerListPathRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerListPathRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_RECURSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isRecursive", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField FILE_NAME_ONLY_FIELD_DESC = new org.apache.thrift.protocol.TField("fileNameOnly", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerListPathRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerListPathRequestTupleSchemeFactory();

  /**
   * 
   * @see TBrokerVersion
   */
  public @org.apache.thrift.annotation.Nullable TBrokerVersion version; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String path; // required
  public boolean isRecursive; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // required
  public boolean fileNameOnly; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TBrokerVersion
     */
    VERSION((short)1, "version"),
    PATH((short)2, "path"),
    IS_RECURSIVE((short)3, "isRecursive"),
    PROPERTIES((short)4, "properties"),
    FILE_NAME_ONLY((short)5, "fileNameOnly");

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
        case 2: // PATH
          return PATH;
        case 3: // IS_RECURSIVE
          return IS_RECURSIVE;
        case 4: // PROPERTIES
          return PROPERTIES;
        case 5: // FILE_NAME_ONLY
          return FILE_NAME_ONLY;
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
  private static final int __ISRECURSIVE_ISSET_ID = 0;
  private static final int __FILENAMEONLY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FILE_NAME_ONLY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TBrokerVersion.class)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_RECURSIVE, new org.apache.thrift.meta_data.FieldMetaData("isRecursive", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.FILE_NAME_ONLY, new org.apache.thrift.meta_data.FieldMetaData("fileNameOnly", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerListPathRequest.class, metaDataMap);
  }

  public TBrokerListPathRequest() {
  }

  public TBrokerListPathRequest(
    TBrokerVersion version,
    java.lang.String path,
    boolean isRecursive,
    java.util.Map<java.lang.String,java.lang.String> properties)
  {
    this();
    this.version = version;
    this.path = path;
    this.isRecursive = isRecursive;
    setIsRecursiveIsSet(true);
    this.properties = properties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerListPathRequest(TBrokerListPathRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.isRecursive = other.isRecursive;
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
    this.fileNameOnly = other.fileNameOnly;
  }

  @Override
  public TBrokerListPathRequest deepCopy() {
    return new TBrokerListPathRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.path = null;
    setIsRecursiveIsSet(false);
    this.isRecursive = false;
    this.properties = null;
    setFileNameOnlyIsSet(false);
    this.fileNameOnly = false;
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
  public TBrokerListPathRequest setVersion(@org.apache.thrift.annotation.Nullable TBrokerVersion version) {
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
  public java.lang.String getPath() {
    return this.path;
  }

  public TBrokerListPathRequest setPath(@org.apache.thrift.annotation.Nullable java.lang.String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public boolean isIsRecursive() {
    return this.isRecursive;
  }

  public TBrokerListPathRequest setIsRecursive(boolean isRecursive) {
    this.isRecursive = isRecursive;
    setIsRecursiveIsSet(true);
    return this;
  }

  public void unsetIsRecursive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISRECURSIVE_ISSET_ID);
  }

  /** Returns true if field isRecursive is set (has been assigned a value) and false otherwise */
  public boolean isSetIsRecursive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISRECURSIVE_ISSET_ID);
  }

  public void setIsRecursiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISRECURSIVE_ISSET_ID, value);
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

  public TBrokerListPathRequest setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
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

  public boolean isFileNameOnly() {
    return this.fileNameOnly;
  }

  public TBrokerListPathRequest setFileNameOnly(boolean fileNameOnly) {
    this.fileNameOnly = fileNameOnly;
    setFileNameOnlyIsSet(true);
    return this;
  }

  public void unsetFileNameOnly() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FILENAMEONLY_ISSET_ID);
  }

  /** Returns true if field fileNameOnly is set (has been assigned a value) and false otherwise */
  public boolean isSetFileNameOnly() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FILENAMEONLY_ISSET_ID);
  }

  public void setFileNameOnlyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FILENAMEONLY_ISSET_ID, value);
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

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((java.lang.String)value);
      }
      break;

    case IS_RECURSIVE:
      if (value == null) {
        unsetIsRecursive();
      } else {
        setIsRecursive((java.lang.Boolean)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case FILE_NAME_ONLY:
      if (value == null) {
        unsetFileNameOnly();
      } else {
        setFileNameOnly((java.lang.Boolean)value);
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

    case PATH:
      return getPath();

    case IS_RECURSIVE:
      return isIsRecursive();

    case PROPERTIES:
      return getProperties();

    case FILE_NAME_ONLY:
      return isFileNameOnly();

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
    case PATH:
      return isSetPath();
    case IS_RECURSIVE:
      return isSetIsRecursive();
    case PROPERTIES:
      return isSetProperties();
    case FILE_NAME_ONLY:
      return isSetFileNameOnly();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerListPathRequest)
      return this.equals((TBrokerListPathRequest)that);
    return false;
  }

  public boolean equals(TBrokerListPathRequest that) {
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

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_isRecursive = true;
    boolean that_present_isRecursive = true;
    if (this_present_isRecursive || that_present_isRecursive) {
      if (!(this_present_isRecursive && that_present_isRecursive))
        return false;
      if (this.isRecursive != that.isRecursive)
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

    boolean this_present_fileNameOnly = true && this.isSetFileNameOnly();
    boolean that_present_fileNameOnly = true && that.isSetFileNameOnly();
    if (this_present_fileNameOnly || that_present_fileNameOnly) {
      if (!(this_present_fileNameOnly && that_present_fileNameOnly))
        return false;
      if (this.fileNameOnly != that.fileNameOnly)
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

    hashCode = hashCode * 8191 + ((isSetPath()) ? 131071 : 524287);
    if (isSetPath())
      hashCode = hashCode * 8191 + path.hashCode();

    hashCode = hashCode * 8191 + ((isRecursive) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    hashCode = hashCode * 8191 + ((isSetFileNameOnly()) ? 131071 : 524287);
    if (isSetFileNameOnly())
      hashCode = hashCode * 8191 + ((fileNameOnly) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerListPathRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetPath(), other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsRecursive(), other.isSetIsRecursive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsRecursive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isRecursive, other.isRecursive);
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
    lastComparison = java.lang.Boolean.compare(isSetFileNameOnly(), other.isSetFileNameOnly());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileNameOnly()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileNameOnly, other.fileNameOnly);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerListPathRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isRecursive:");
    sb.append(this.isRecursive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("properties:");
    if (this.properties == null) {
      sb.append("null");
    } else {
      sb.append(this.properties);
    }
    first = false;
    if (isSetFileNameOnly()) {
      if (!first) sb.append(", ");
      sb.append("fileNameOnly:");
      sb.append(this.fileNameOnly);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }
    if (path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'path' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'isRecursive' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TBrokerListPathRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerListPathRequestStandardScheme getScheme() {
      return new TBrokerListPathRequestStandardScheme();
    }
  }

  private static class TBrokerListPathRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerListPathRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerListPathRequest struct) throws org.apache.thrift.TException {
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
          case 2: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_RECURSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isRecursive = iprot.readBool();
              struct.setIsRecursiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map8.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key9;
                @org.apache.thrift.annotation.Nullable java.lang.String _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readString();
                  _val10 = iprot.readString();
                  struct.properties.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FILE_NAME_ONLY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.fileNameOnly = iprot.readBool();
              struct.setFileNameOnlyIsSet(true);
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
      if (!struct.isSetIsRecursive()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isRecursive' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerListPathRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.path != null) {
        oprot.writeFieldBegin(PATH_FIELD_DESC);
        oprot.writeString(struct.path);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_RECURSIVE_FIELD_DESC);
      oprot.writeBool(struct.isRecursive);
      oprot.writeFieldEnd();
      if (struct.properties != null) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter12 : struct.properties.entrySet())
          {
            oprot.writeString(_iter12.getKey());
            oprot.writeString(_iter12.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetFileNameOnly()) {
        oprot.writeFieldBegin(FILE_NAME_ONLY_FIELD_DESC);
        oprot.writeBool(struct.fileNameOnly);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerListPathRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerListPathRequestTupleScheme getScheme() {
      return new TBrokerListPathRequestTupleScheme();
    }
  }

  private static class TBrokerListPathRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerListPathRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerListPathRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      oprot.writeString(struct.path);
      oprot.writeBool(struct.isRecursive);
      {
        oprot.writeI32(struct.properties.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter13 : struct.properties.entrySet())
        {
          oprot.writeString(_iter13.getKey());
          oprot.writeString(_iter13.getValue());
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFileNameOnly()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFileNameOnly()) {
        oprot.writeBool(struct.fileNameOnly);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerListPathRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.path = iprot.readString();
      struct.setPathIsSet(true);
      struct.isRecursive = iprot.readBool();
      struct.setIsRecursiveIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map14 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
        struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map14.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key15;
        @org.apache.thrift.annotation.Nullable java.lang.String _val16;
        for (int _i17 = 0; _i17 < _map14.size; ++_i17)
        {
          _key15 = iprot.readString();
          _val16 = iprot.readString();
          struct.properties.put(_key15, _val16);
        }
      }
      struct.setPropertiesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fileNameOnly = iprot.readBool();
        struct.setFileNameOnlyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

