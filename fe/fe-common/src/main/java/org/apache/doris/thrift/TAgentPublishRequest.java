/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TAgentPublishRequest implements org.apache.thrift.TBase<TAgentPublishRequest, TAgentPublishRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TAgentPublishRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAgentPublishRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UPDATES_FIELD_DESC = new org.apache.thrift.protocol.TField("updates", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAgentPublishRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAgentPublishRequestTupleSchemeFactory();

  /**
   * 
   * @see TAgentServiceVersion
   */
  public @org.apache.thrift.annotation.Nullable TAgentServiceVersion protocol_version; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TTopicUpdate> updates; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TAgentServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    UPDATES((short)2, "updates");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // UPDATES
          return UPDATES;
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
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TAgentServiceVersion.class)));
    tmpMap.put(_Fields.UPDATES, new org.apache.thrift.meta_data.FieldMetaData("updates", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTopicUpdate.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAgentPublishRequest.class, metaDataMap);
  }

  public TAgentPublishRequest() {
  }

  public TAgentPublishRequest(
    TAgentServiceVersion protocol_version,
    java.util.List<TTopicUpdate> updates)
  {
    this();
    this.protocol_version = protocol_version;
    this.updates = updates;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAgentPublishRequest(TAgentPublishRequest other) {
    if (other.isSetProtocolVersion()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetUpdates()) {
      java.util.List<TTopicUpdate> __this__updates = new java.util.ArrayList<TTopicUpdate>(other.updates.size());
      for (TTopicUpdate other_element : other.updates) {
        __this__updates.add(new TTopicUpdate(other_element));
      }
      this.updates = __this__updates;
    }
  }

  @Override
  public TAgentPublishRequest deepCopy() {
    return new TAgentPublishRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = null;
    this.updates = null;
  }

  /**
   * 
   * @see TAgentServiceVersion
   */
  @org.apache.thrift.annotation.Nullable
  public TAgentServiceVersion getProtocolVersion() {
    return this.protocol_version;
  }

  /**
   * 
   * @see TAgentServiceVersion
   */
  public TAgentPublishRequest setProtocolVersion(@org.apache.thrift.annotation.Nullable TAgentServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocolVersion() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocolVersion() {
    return this.protocol_version != null;
  }

  public void setProtocolVersionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  public int getUpdatesSize() {
    return (this.updates == null) ? 0 : this.updates.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTopicUpdate> getUpdatesIterator() {
    return (this.updates == null) ? null : this.updates.iterator();
  }

  public void addToUpdates(TTopicUpdate elem) {
    if (this.updates == null) {
      this.updates = new java.util.ArrayList<TTopicUpdate>();
    }
    this.updates.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTopicUpdate> getUpdates() {
    return this.updates;
  }

  public TAgentPublishRequest setUpdates(@org.apache.thrift.annotation.Nullable java.util.List<TTopicUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public void unsetUpdates() {
    this.updates = null;
  }

  /** Returns true if field updates is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdates() {
    return this.updates != null;
  }

  public void setUpdatesIsSet(boolean value) {
    if (!value) {
      this.updates = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocolVersion();
      } else {
        setProtocolVersion((TAgentServiceVersion)value);
      }
      break;

    case UPDATES:
      if (value == null) {
        unsetUpdates();
      } else {
        setUpdates((java.util.List<TTopicUpdate>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocolVersion();

    case UPDATES:
      return getUpdates();

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
    case PROTOCOL_VERSION:
      return isSetProtocolVersion();
    case UPDATES:
      return isSetUpdates();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAgentPublishRequest)
      return this.equals((TAgentPublishRequest)that);
    return false;
  }

  public boolean equals(TAgentPublishRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_protocol_version = true && this.isSetProtocolVersion();
    boolean that_present_protocol_version = true && that.isSetProtocolVersion();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_updates = true && this.isSetUpdates();
    boolean that_present_updates = true && that.isSetUpdates();
    if (this_present_updates || that_present_updates) {
      if (!(this_present_updates && that_present_updates))
        return false;
      if (!this.updates.equals(that.updates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProtocolVersion()) ? 131071 : 524287);
    if (isSetProtocolVersion())
      hashCode = hashCode * 8191 + protocol_version.getValue();

    hashCode = hashCode * 8191 + ((isSetUpdates()) ? 131071 : 524287);
    if (isSetUpdates())
      hashCode = hashCode * 8191 + updates.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TAgentPublishRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProtocolVersion(), other.isSetProtocolVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocolVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUpdates(), other.isSetUpdates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updates, other.updates);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAgentPublishRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updates:");
    if (this.updates == null) {
      sb.append("null");
    } else {
      sb.append(this.updates);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    if (updates == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'updates' was not present! Struct: " + toString());
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

  private static class TAgentPublishRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAgentPublishRequestStandardScheme getScheme() {
      return new TAgentPublishRequestStandardScheme();
    }
  }

  private static class TAgentPublishRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAgentPublishRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TAgentPublishRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = org.apache.doris.thrift.TAgentServiceVersion.findByValue(iprot.readI32());
              struct.setProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPDATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.updates = new java.util.ArrayList<TTopicUpdate>(_list226.size);
                @org.apache.thrift.annotation.Nullable TTopicUpdate _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = new TTopicUpdate();
                  _elem227.read(iprot);
                  struct.updates.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setUpdatesIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TAgentPublishRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.updates != null) {
        oprot.writeFieldBegin(UPDATES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updates.size()));
          for (TTopicUpdate _iter229 : struct.updates)
          {
            _iter229.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAgentPublishRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TAgentPublishRequestTupleScheme getScheme() {
      return new TAgentPublishRequestTupleScheme();
    }
  }

  private static class TAgentPublishRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAgentPublishRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAgentPublishRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      {
        oprot.writeI32(struct.updates.size());
        for (TTopicUpdate _iter230 : struct.updates)
        {
          _iter230.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAgentPublishRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.protocol_version = org.apache.doris.thrift.TAgentServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      {
        org.apache.thrift.protocol.TList _list231 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.updates = new java.util.ArrayList<TTopicUpdate>(_list231.size);
        @org.apache.thrift.annotation.Nullable TTopicUpdate _elem232;
        for (int _i233 = 0; _i233 < _list231.size; ++_i233)
        {
          _elem232 = new TTopicUpdate();
          _elem232.read(iprot);
          struct.updates.add(_elem232);
        }
      }
      struct.setUpdatesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

