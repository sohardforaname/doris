/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TBrokerOpenWriterRequest implements org.apache.thrift.TBase<TBrokerOpenWriterRequest, TBrokerOpenWriterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerOpenWriterRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerOpenWriterRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OPEN_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("openMode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CLIENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("clientId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerOpenWriterRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerOpenWriterRequestTupleSchemeFactory();

  /**
   * 
   * @see TBrokerVersion
   */
  public @org.apache.thrift.annotation.Nullable TBrokerVersion version; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String path; // required
  /**
   * 
   * @see TBrokerOpenMode
   */
  public @org.apache.thrift.annotation.Nullable TBrokerOpenMode openMode; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String clientId; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TBrokerVersion
     */
    VERSION((short)1, "version"),
    PATH((short)2, "path"),
    /**
     * 
     * @see TBrokerOpenMode
     */
    OPEN_MODE((short)3, "openMode"),
    CLIENT_ID((short)4, "clientId"),
    PROPERTIES((short)5, "properties");

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
        case 3: // OPEN_MODE
          return OPEN_MODE;
        case 4: // CLIENT_ID
          return CLIENT_ID;
        case 5: // PROPERTIES
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
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPEN_MODE, new org.apache.thrift.meta_data.FieldMetaData("openMode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TBrokerOpenMode.class)));
    tmpMap.put(_Fields.CLIENT_ID, new org.apache.thrift.meta_data.FieldMetaData("clientId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerOpenWriterRequest.class, metaDataMap);
  }

  public TBrokerOpenWriterRequest() {
  }

  public TBrokerOpenWriterRequest(
    TBrokerVersion version,
    java.lang.String path,
    TBrokerOpenMode openMode,
    java.lang.String clientId,
    java.util.Map<java.lang.String,java.lang.String> properties)
  {
    this();
    this.version = version;
    this.path = path;
    this.openMode = openMode;
    this.clientId = clientId;
    this.properties = properties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerOpenWriterRequest(TBrokerOpenWriterRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
    if (other.isSetOpenMode()) {
      this.openMode = other.openMode;
    }
    if (other.isSetClientId()) {
      this.clientId = other.clientId;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  @Override
  public TBrokerOpenWriterRequest deepCopy() {
    return new TBrokerOpenWriterRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.path = null;
    this.openMode = null;
    this.clientId = null;
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
  public TBrokerOpenWriterRequest setVersion(@org.apache.thrift.annotation.Nullable TBrokerVersion version) {
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

  public TBrokerOpenWriterRequest setPath(@org.apache.thrift.annotation.Nullable java.lang.String path) {
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

  /**
   * 
   * @see TBrokerOpenMode
   */
  @org.apache.thrift.annotation.Nullable
  public TBrokerOpenMode getOpenMode() {
    return this.openMode;
  }

  /**
   * 
   * @see TBrokerOpenMode
   */
  public TBrokerOpenWriterRequest setOpenMode(@org.apache.thrift.annotation.Nullable TBrokerOpenMode openMode) {
    this.openMode = openMode;
    return this;
  }

  public void unsetOpenMode() {
    this.openMode = null;
  }

  /** Returns true if field openMode is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenMode() {
    return this.openMode != null;
  }

  public void setOpenModeIsSet(boolean value) {
    if (!value) {
      this.openMode = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getClientId() {
    return this.clientId;
  }

  public TBrokerOpenWriterRequest setClientId(@org.apache.thrift.annotation.Nullable java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  public void unsetClientId() {
    this.clientId = null;
  }

  /** Returns true if field clientId is set (has been assigned a value) and false otherwise */
  public boolean isSetClientId() {
    return this.clientId != null;
  }

  public void setClientIdIsSet(boolean value) {
    if (!value) {
      this.clientId = null;
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

  public TBrokerOpenWriterRequest setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
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

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((java.lang.String)value);
      }
      break;

    case OPEN_MODE:
      if (value == null) {
        unsetOpenMode();
      } else {
        setOpenMode((TBrokerOpenMode)value);
      }
      break;

    case CLIENT_ID:
      if (value == null) {
        unsetClientId();
      } else {
        setClientId((java.lang.String)value);
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

    case PATH:
      return getPath();

    case OPEN_MODE:
      return getOpenMode();

    case CLIENT_ID:
      return getClientId();

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
    case PATH:
      return isSetPath();
    case OPEN_MODE:
      return isSetOpenMode();
    case CLIENT_ID:
      return isSetClientId();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerOpenWriterRequest)
      return this.equals((TBrokerOpenWriterRequest)that);
    return false;
  }

  public boolean equals(TBrokerOpenWriterRequest that) {
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

    boolean this_present_openMode = true && this.isSetOpenMode();
    boolean that_present_openMode = true && that.isSetOpenMode();
    if (this_present_openMode || that_present_openMode) {
      if (!(this_present_openMode && that_present_openMode))
        return false;
      if (!this.openMode.equals(that.openMode))
        return false;
    }

    boolean this_present_clientId = true && this.isSetClientId();
    boolean that_present_clientId = true && that.isSetClientId();
    if (this_present_clientId || that_present_clientId) {
      if (!(this_present_clientId && that_present_clientId))
        return false;
      if (!this.clientId.equals(that.clientId))
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

    hashCode = hashCode * 8191 + ((isSetPath()) ? 131071 : 524287);
    if (isSetPath())
      hashCode = hashCode * 8191 + path.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpenMode()) ? 131071 : 524287);
    if (isSetOpenMode())
      hashCode = hashCode * 8191 + openMode.getValue();

    hashCode = hashCode * 8191 + ((isSetClientId()) ? 131071 : 524287);
    if (isSetClientId())
      hashCode = hashCode * 8191 + clientId.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerOpenWriterRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetOpenMode(), other.isSetOpenMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openMode, other.openMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetClientId(), other.isSetClientId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientId, other.clientId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerOpenWriterRequest(");
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
    sb.append("openMode:");
    if (this.openMode == null) {
      sb.append("null");
    } else {
      sb.append(this.openMode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clientId:");
    if (this.clientId == null) {
      sb.append("null");
    } else {
      sb.append(this.clientId);
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
    if (path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'path' was not present! Struct: " + toString());
    }
    if (openMode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'openMode' was not present! Struct: " + toString());
    }
    if (clientId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'clientId' was not present! Struct: " + toString());
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

  private static class TBrokerOpenWriterRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerOpenWriterRequestStandardScheme getScheme() {
      return new TBrokerOpenWriterRequestStandardScheme();
    }
  }

  private static class TBrokerOpenWriterRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerOpenWriterRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerOpenWriterRequest struct) throws org.apache.thrift.TException {
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
          case 3: // OPEN_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.openMode = org.apache.doris.thrift.TBrokerOpenMode.findByValue(iprot.readI32());
              struct.setOpenModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLIENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientId = iprot.readString();
              struct.setClientIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map58 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map58.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key59;
                @org.apache.thrift.annotation.Nullable java.lang.String _val60;
                for (int _i61 = 0; _i61 < _map58.size; ++_i61)
                {
                  _key59 = iprot.readString();
                  _val60 = iprot.readString();
                  struct.properties.put(_key59, _val60);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerOpenWriterRequest struct) throws org.apache.thrift.TException {
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
      if (struct.openMode != null) {
        oprot.writeFieldBegin(OPEN_MODE_FIELD_DESC);
        oprot.writeI32(struct.openMode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.clientId != null) {
        oprot.writeFieldBegin(CLIENT_ID_FIELD_DESC);
        oprot.writeString(struct.clientId);
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter62 : struct.properties.entrySet())
          {
            oprot.writeString(_iter62.getKey());
            oprot.writeString(_iter62.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerOpenWriterRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerOpenWriterRequestTupleScheme getScheme() {
      return new TBrokerOpenWriterRequestTupleScheme();
    }
  }

  private static class TBrokerOpenWriterRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerOpenWriterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerOpenWriterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      oprot.writeString(struct.path);
      oprot.writeI32(struct.openMode.getValue());
      oprot.writeString(struct.clientId);
      {
        oprot.writeI32(struct.properties.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter63 : struct.properties.entrySet())
        {
          oprot.writeString(_iter63.getKey());
          oprot.writeString(_iter63.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerOpenWriterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.path = iprot.readString();
      struct.setPathIsSet(true);
      struct.openMode = org.apache.doris.thrift.TBrokerOpenMode.findByValue(iprot.readI32());
      struct.setOpenModeIsSet(true);
      struct.clientId = iprot.readString();
      struct.setClientIdIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map64 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
        struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map64.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key65;
        @org.apache.thrift.annotation.Nullable java.lang.String _val66;
        for (int _i67 = 0; _i67 < _map64.size; ++_i67)
        {
          _key65 = iprot.readString();
          _val66 = iprot.readString();
          struct.properties.put(_key65, _val66);
        }
      }
      struct.setPropertiesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

