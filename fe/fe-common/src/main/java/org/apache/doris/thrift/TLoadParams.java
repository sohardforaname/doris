/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TLoadParams implements org.apache.thrift.TBase<TLoadParams, TLoadParams._Fields>, java.io.Serializable, Cloneable, Comparable<TLoadParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLoadParams");

  private static final org.apache.thrift.protocol.TField LOAD_LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("load_label", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_PROFILES_FIELD_DESC = new org.apache.thrift.protocol.TField("data_profiles", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLoadParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLoadParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TLabelName load_label; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TDataSpecification> data_profiles; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOAD_LABEL((short)1, "load_label"),
    DATA_PROFILES((short)2, "data_profiles"),
    PROPERTIES((short)3, "properties");

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
        case 1: // LOAD_LABEL
          return LOAD_LABEL;
        case 2: // DATA_PROFILES
          return DATA_PROFILES;
        case 3: // PROPERTIES
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
  private static final _Fields optionals[] = {_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOAD_LABEL, new org.apache.thrift.meta_data.FieldMetaData("load_label", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TLabelName.class)));
    tmpMap.put(_Fields.DATA_PROFILES, new org.apache.thrift.meta_data.FieldMetaData("data_profiles", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDataSpecification.class))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLoadParams.class, metaDataMap);
  }

  public TLoadParams() {
  }

  public TLoadParams(
    TLabelName load_label,
    java.util.List<TDataSpecification> data_profiles)
  {
    this();
    this.load_label = load_label;
    this.data_profiles = data_profiles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLoadParams(TLoadParams other) {
    if (other.isSetLoadLabel()) {
      this.load_label = new TLabelName(other.load_label);
    }
    if (other.isSetDataProfiles()) {
      java.util.List<TDataSpecification> __this__data_profiles = new java.util.ArrayList<TDataSpecification>(other.data_profiles.size());
      for (TDataSpecification other_element : other.data_profiles) {
        __this__data_profiles.add(new TDataSpecification(other_element));
      }
      this.data_profiles = __this__data_profiles;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  @Override
  public TLoadParams deepCopy() {
    return new TLoadParams(this);
  }

  @Override
  public void clear() {
    this.load_label = null;
    this.data_profiles = null;
    this.properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TLabelName getLoadLabel() {
    return this.load_label;
  }

  public TLoadParams setLoadLabel(@org.apache.thrift.annotation.Nullable TLabelName load_label) {
    this.load_label = load_label;
    return this;
  }

  public void unsetLoadLabel() {
    this.load_label = null;
  }

  /** Returns true if field load_label is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadLabel() {
    return this.load_label != null;
  }

  public void setLoadLabelIsSet(boolean value) {
    if (!value) {
      this.load_label = null;
    }
  }

  public int getDataProfilesSize() {
    return (this.data_profiles == null) ? 0 : this.data_profiles.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TDataSpecification> getDataProfilesIterator() {
    return (this.data_profiles == null) ? null : this.data_profiles.iterator();
  }

  public void addToDataProfiles(TDataSpecification elem) {
    if (this.data_profiles == null) {
      this.data_profiles = new java.util.ArrayList<TDataSpecification>();
    }
    this.data_profiles.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TDataSpecification> getDataProfiles() {
    return this.data_profiles;
  }

  public TLoadParams setDataProfiles(@org.apache.thrift.annotation.Nullable java.util.List<TDataSpecification> data_profiles) {
    this.data_profiles = data_profiles;
    return this;
  }

  public void unsetDataProfiles() {
    this.data_profiles = null;
  }

  /** Returns true if field data_profiles is set (has been assigned a value) and false otherwise */
  public boolean isSetDataProfiles() {
    return this.data_profiles != null;
  }

  public void setDataProfilesIsSet(boolean value) {
    if (!value) {
      this.data_profiles = null;
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

  public TLoadParams setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
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
    case LOAD_LABEL:
      if (value == null) {
        unsetLoadLabel();
      } else {
        setLoadLabel((TLabelName)value);
      }
      break;

    case DATA_PROFILES:
      if (value == null) {
        unsetDataProfiles();
      } else {
        setDataProfiles((java.util.List<TDataSpecification>)value);
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
    case LOAD_LABEL:
      return getLoadLabel();

    case DATA_PROFILES:
      return getDataProfiles();

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
    case LOAD_LABEL:
      return isSetLoadLabel();
    case DATA_PROFILES:
      return isSetDataProfiles();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLoadParams)
      return this.equals((TLoadParams)that);
    return false;
  }

  public boolean equals(TLoadParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_load_label = true && this.isSetLoadLabel();
    boolean that_present_load_label = true && that.isSetLoadLabel();
    if (this_present_load_label || that_present_load_label) {
      if (!(this_present_load_label && that_present_load_label))
        return false;
      if (!this.load_label.equals(that.load_label))
        return false;
    }

    boolean this_present_data_profiles = true && this.isSetDataProfiles();
    boolean that_present_data_profiles = true && that.isSetDataProfiles();
    if (this_present_data_profiles || that_present_data_profiles) {
      if (!(this_present_data_profiles && that_present_data_profiles))
        return false;
      if (!this.data_profiles.equals(that.data_profiles))
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

    hashCode = hashCode * 8191 + ((isSetLoadLabel()) ? 131071 : 524287);
    if (isSetLoadLabel())
      hashCode = hashCode * 8191 + load_label.hashCode();

    hashCode = hashCode * 8191 + ((isSetDataProfiles()) ? 131071 : 524287);
    if (isSetDataProfiles())
      hashCode = hashCode * 8191 + data_profiles.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TLoadParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLoadLabel(), other.isSetLoadLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.load_label, other.load_label);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDataProfiles(), other.isSetDataProfiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataProfiles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_profiles, other.data_profiles);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLoadParams(");
    boolean first = true;

    sb.append("load_label:");
    if (this.load_label == null) {
      sb.append("null");
    } else {
      sb.append(this.load_label);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data_profiles:");
    if (this.data_profiles == null) {
      sb.append("null");
    } else {
      sb.append(this.data_profiles);
    }
    first = false;
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (load_label == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'load_label' was not present! Struct: " + toString());
    }
    if (data_profiles == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data_profiles' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (load_label != null) {
      load_label.validate();
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

  private static class TLoadParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLoadParamsStandardScheme getScheme() {
      return new TLoadParamsStandardScheme();
    }
  }

  private static class TLoadParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLoadParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TLoadParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOAD_LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.load_label = new TLabelName();
              struct.load_label.read(iprot);
              struct.setLoadLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_PROFILES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list92 = iprot.readListBegin();
                struct.data_profiles = new java.util.ArrayList<TDataSpecification>(_list92.size);
                @org.apache.thrift.annotation.Nullable TDataSpecification _elem93;
                for (int _i94 = 0; _i94 < _list92.size; ++_i94)
                {
                  _elem93 = new TDataSpecification();
                  _elem93.read(iprot);
                  struct.data_profiles.add(_elem93);
                }
                iprot.readListEnd();
              }
              struct.setDataProfilesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map95 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map95.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key96;
                @org.apache.thrift.annotation.Nullable java.lang.String _val97;
                for (int _i98 = 0; _i98 < _map95.size; ++_i98)
                {
                  _key96 = iprot.readString();
                  _val97 = iprot.readString();
                  struct.properties.put(_key96, _val97);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TLoadParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.load_label != null) {
        oprot.writeFieldBegin(LOAD_LABEL_FIELD_DESC);
        struct.load_label.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.data_profiles != null) {
        oprot.writeFieldBegin(DATA_PROFILES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data_profiles.size()));
          for (TDataSpecification _iter99 : struct.data_profiles)
          {
            _iter99.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter100 : struct.properties.entrySet())
            {
              oprot.writeString(_iter100.getKey());
              oprot.writeString(_iter100.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLoadParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLoadParamsTupleScheme getScheme() {
      return new TLoadParamsTupleScheme();
    }
  }

  private static class TLoadParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLoadParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLoadParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.load_label.write(oprot);
      {
        oprot.writeI32(struct.data_profiles.size());
        for (TDataSpecification _iter101 : struct.data_profiles)
        {
          _iter101.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProperties()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter102 : struct.properties.entrySet())
          {
            oprot.writeString(_iter102.getKey());
            oprot.writeString(_iter102.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLoadParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.load_label = new TLabelName();
      struct.load_label.read(iprot);
      struct.setLoadLabelIsSet(true);
      {
        org.apache.thrift.protocol.TList _list103 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.data_profiles = new java.util.ArrayList<TDataSpecification>(_list103.size);
        @org.apache.thrift.annotation.Nullable TDataSpecification _elem104;
        for (int _i105 = 0; _i105 < _list103.size; ++_i105)
        {
          _elem104 = new TDataSpecification();
          _elem104.read(iprot);
          struct.data_profiles.add(_elem104);
        }
      }
      struct.setDataProfilesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map106 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map106.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key107;
          @org.apache.thrift.annotation.Nullable java.lang.String _val108;
          for (int _i109 = 0; _i109 < _map106.size; ++_i109)
          {
            _key107 = iprot.readString();
            _val108 = iprot.readString();
            struct.properties.put(_key107, _val108);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

