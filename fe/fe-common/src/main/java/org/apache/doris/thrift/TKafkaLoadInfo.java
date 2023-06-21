/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TKafkaLoadInfo implements org.apache.thrift.TBase<TKafkaLoadInfo, TKafkaLoadInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TKafkaLoadInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKafkaLoadInfo");

  private static final org.apache.thrift.protocol.TField BROKERS_FIELD_DESC = new org.apache.thrift.protocol.TField("brokers", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TOPIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topic", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_BEGIN_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_begin_offset", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TKafkaLoadInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TKafkaLoadInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String brokers; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String topic; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Long> partition_begin_offset; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKERS((short)1, "brokers"),
    TOPIC((short)2, "topic"),
    PARTITION_BEGIN_OFFSET((short)3, "partition_begin_offset"),
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
        case 1: // BROKERS
          return BROKERS;
        case 2: // TOPIC
          return TOPIC;
        case 3: // PARTITION_BEGIN_OFFSET
          return PARTITION_BEGIN_OFFSET;
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
  private static final _Fields optionals[] = {_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BROKERS, new org.apache.thrift.meta_data.FieldMetaData("brokers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC, new org.apache.thrift.meta_data.FieldMetaData("topic", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_BEGIN_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("partition_begin_offset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKafkaLoadInfo.class, metaDataMap);
  }

  public TKafkaLoadInfo() {
  }

  public TKafkaLoadInfo(
    java.lang.String brokers,
    java.lang.String topic,
    java.util.Map<java.lang.Integer,java.lang.Long> partition_begin_offset)
  {
    this();
    this.brokers = brokers;
    this.topic = topic;
    this.partition_begin_offset = partition_begin_offset;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKafkaLoadInfo(TKafkaLoadInfo other) {
    if (other.isSetBrokers()) {
      this.brokers = other.brokers;
    }
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    if (other.isSetPartitionBeginOffset()) {
      java.util.Map<java.lang.Integer,java.lang.Long> __this__partition_begin_offset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(other.partition_begin_offset);
      this.partition_begin_offset = __this__partition_begin_offset;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  @Override
  public TKafkaLoadInfo deepCopy() {
    return new TKafkaLoadInfo(this);
  }

  @Override
  public void clear() {
    this.brokers = null;
    this.topic = null;
    this.partition_begin_offset = null;
    this.properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBrokers() {
    return this.brokers;
  }

  public TKafkaLoadInfo setBrokers(@org.apache.thrift.annotation.Nullable java.lang.String brokers) {
    this.brokers = brokers;
    return this;
  }

  public void unsetBrokers() {
    this.brokers = null;
  }

  /** Returns true if field brokers is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokers() {
    return this.brokers != null;
  }

  public void setBrokersIsSet(boolean value) {
    if (!value) {
      this.brokers = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTopic() {
    return this.topic;
  }

  public TKafkaLoadInfo setTopic(@org.apache.thrift.annotation.Nullable java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  public int getPartitionBeginOffsetSize() {
    return (this.partition_begin_offset == null) ? 0 : this.partition_begin_offset.size();
  }

  public void putToPartitionBeginOffset(int key, long val) {
    if (this.partition_begin_offset == null) {
      this.partition_begin_offset = new java.util.HashMap<java.lang.Integer,java.lang.Long>();
    }
    this.partition_begin_offset.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,java.lang.Long> getPartitionBeginOffset() {
    return this.partition_begin_offset;
  }

  public TKafkaLoadInfo setPartitionBeginOffset(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Long> partition_begin_offset) {
    this.partition_begin_offset = partition_begin_offset;
    return this;
  }

  public void unsetPartitionBeginOffset() {
    this.partition_begin_offset = null;
  }

  /** Returns true if field partition_begin_offset is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionBeginOffset() {
    return this.partition_begin_offset != null;
  }

  public void setPartitionBeginOffsetIsSet(boolean value) {
    if (!value) {
      this.partition_begin_offset = null;
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

  public TKafkaLoadInfo setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
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
    case BROKERS:
      if (value == null) {
        unsetBrokers();
      } else {
        setBrokers((java.lang.String)value);
      }
      break;

    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((java.lang.String)value);
      }
      break;

    case PARTITION_BEGIN_OFFSET:
      if (value == null) {
        unsetPartitionBeginOffset();
      } else {
        setPartitionBeginOffset((java.util.Map<java.lang.Integer,java.lang.Long>)value);
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
    case BROKERS:
      return getBrokers();

    case TOPIC:
      return getTopic();

    case PARTITION_BEGIN_OFFSET:
      return getPartitionBeginOffset();

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
    case BROKERS:
      return isSetBrokers();
    case TOPIC:
      return isSetTopic();
    case PARTITION_BEGIN_OFFSET:
      return isSetPartitionBeginOffset();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TKafkaLoadInfo)
      return this.equals((TKafkaLoadInfo)that);
    return false;
  }

  public boolean equals(TKafkaLoadInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_brokers = true && this.isSetBrokers();
    boolean that_present_brokers = true && that.isSetBrokers();
    if (this_present_brokers || that_present_brokers) {
      if (!(this_present_brokers && that_present_brokers))
        return false;
      if (!this.brokers.equals(that.brokers))
        return false;
    }

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    boolean this_present_partition_begin_offset = true && this.isSetPartitionBeginOffset();
    boolean that_present_partition_begin_offset = true && that.isSetPartitionBeginOffset();
    if (this_present_partition_begin_offset || that_present_partition_begin_offset) {
      if (!(this_present_partition_begin_offset && that_present_partition_begin_offset))
        return false;
      if (!this.partition_begin_offset.equals(that.partition_begin_offset))
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

    hashCode = hashCode * 8191 + ((isSetBrokers()) ? 131071 : 524287);
    if (isSetBrokers())
      hashCode = hashCode * 8191 + brokers.hashCode();

    hashCode = hashCode * 8191 + ((isSetTopic()) ? 131071 : 524287);
    if (isSetTopic())
      hashCode = hashCode * 8191 + topic.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionBeginOffset()) ? 131071 : 524287);
    if (isSetPartitionBeginOffset())
      hashCode = hashCode * 8191 + partition_begin_offset.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TKafkaLoadInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBrokers(), other.isSetBrokers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brokers, other.brokers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTopic(), other.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic, other.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionBeginOffset(), other.isSetPartitionBeginOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionBeginOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_begin_offset, other.partition_begin_offset);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TKafkaLoadInfo(");
    boolean first = true;

    sb.append("brokers:");
    if (this.brokers == null) {
      sb.append("null");
    } else {
      sb.append(this.brokers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topic:");
    if (this.topic == null) {
      sb.append("null");
    } else {
      sb.append(this.topic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_begin_offset:");
    if (this.partition_begin_offset == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_begin_offset);
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
    if (brokers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'brokers' was not present! Struct: " + toString());
    }
    if (topic == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topic' was not present! Struct: " + toString());
    }
    if (partition_begin_offset == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_begin_offset' was not present! Struct: " + toString());
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

  private static class TKafkaLoadInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TKafkaLoadInfoStandardScheme getScheme() {
      return new TKafkaLoadInfoStandardScheme();
    }
  }

  private static class TKafkaLoadInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TKafkaLoadInfo> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TKafkaLoadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BROKERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokers = iprot.readString();
              struct.setBrokersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topic = iprot.readString();
              struct.setTopicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_BEGIN_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map18 = iprot.readMapBegin();
                struct.partition_begin_offset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(2*_map18.size);
                int _key19;
                long _val20;
                for (int _i21 = 0; _i21 < _map18.size; ++_i21)
                {
                  _key19 = iprot.readI32();
                  _val20 = iprot.readI64();
                  struct.partition_begin_offset.put(_key19, _val20);
                }
                iprot.readMapEnd();
              }
              struct.setPartitionBeginOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map22 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map22.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key23;
                @org.apache.thrift.annotation.Nullable java.lang.String _val24;
                for (int _i25 = 0; _i25 < _map22.size; ++_i25)
                {
                  _key23 = iprot.readString();
                  _val24 = iprot.readString();
                  struct.properties.put(_key23, _val24);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TKafkaLoadInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokers != null) {
        oprot.writeFieldBegin(BROKERS_FIELD_DESC);
        oprot.writeString(struct.brokers);
        oprot.writeFieldEnd();
      }
      if (struct.topic != null) {
        oprot.writeFieldBegin(TOPIC_FIELD_DESC);
        oprot.writeString(struct.topic);
        oprot.writeFieldEnd();
      }
      if (struct.partition_begin_offset != null) {
        oprot.writeFieldBegin(PARTITION_BEGIN_OFFSET_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64, struct.partition_begin_offset.size()));
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> _iter26 : struct.partition_begin_offset.entrySet())
          {
            oprot.writeI32(_iter26.getKey());
            oprot.writeI64(_iter26.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter27 : struct.properties.entrySet())
            {
              oprot.writeString(_iter27.getKey());
              oprot.writeString(_iter27.getValue());
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

  private static class TKafkaLoadInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TKafkaLoadInfoTupleScheme getScheme() {
      return new TKafkaLoadInfoTupleScheme();
    }
  }

  private static class TKafkaLoadInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TKafkaLoadInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKafkaLoadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.brokers);
      oprot.writeString(struct.topic);
      {
        oprot.writeI32(struct.partition_begin_offset.size());
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> _iter28 : struct.partition_begin_offset.entrySet())
        {
          oprot.writeI32(_iter28.getKey());
          oprot.writeI64(_iter28.getValue());
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
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter29 : struct.properties.entrySet())
          {
            oprot.writeString(_iter29.getKey());
            oprot.writeString(_iter29.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKafkaLoadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.brokers = iprot.readString();
      struct.setBrokersIsSet(true);
      struct.topic = iprot.readString();
      struct.setTopicIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map30 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64); 
        struct.partition_begin_offset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(2*_map30.size);
        int _key31;
        long _val32;
        for (int _i33 = 0; _i33 < _map30.size; ++_i33)
        {
          _key31 = iprot.readI32();
          _val32 = iprot.readI64();
          struct.partition_begin_offset.put(_key31, _val32);
        }
      }
      struct.setPartitionBeginOffsetIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
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
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

