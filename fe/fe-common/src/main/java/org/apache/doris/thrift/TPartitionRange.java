/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TPartitionRange implements org.apache.thrift.TBase<TPartitionRange, TPartitionRange._Fields>, java.io.Serializable, Cloneable, Comparable<TPartitionRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPartitionRange");

  private static final org.apache.thrift.protocol.TField START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("start_key", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField END_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("end_key", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INCLUDE_START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("include_start_key", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField INCLUDE_END_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("include_end_key", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPartitionRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPartitionRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TPartitionKey start_key; // required
  public @org.apache.thrift.annotation.Nullable TPartitionKey end_key; // required
  public boolean include_start_key; // required
  public boolean include_end_key; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_KEY((short)1, "start_key"),
    END_KEY((short)2, "end_key"),
    INCLUDE_START_KEY((short)3, "include_start_key"),
    INCLUDE_END_KEY((short)4, "include_end_key");

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
        case 1: // START_KEY
          return START_KEY;
        case 2: // END_KEY
          return END_KEY;
        case 3: // INCLUDE_START_KEY
          return INCLUDE_START_KEY;
        case 4: // INCLUDE_END_KEY
          return INCLUDE_END_KEY;
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
  private static final int __INCLUDE_START_KEY_ISSET_ID = 0;
  private static final int __INCLUDE_END_KEY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_KEY, new org.apache.thrift.meta_data.FieldMetaData("start_key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartitionKey.class)));
    tmpMap.put(_Fields.END_KEY, new org.apache.thrift.meta_data.FieldMetaData("end_key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartitionKey.class)));
    tmpMap.put(_Fields.INCLUDE_START_KEY, new org.apache.thrift.meta_data.FieldMetaData("include_start_key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_END_KEY, new org.apache.thrift.meta_data.FieldMetaData("include_end_key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPartitionRange.class, metaDataMap);
  }

  public TPartitionRange() {
  }

  public TPartitionRange(
    TPartitionKey start_key,
    TPartitionKey end_key,
    boolean include_start_key,
    boolean include_end_key)
  {
    this();
    this.start_key = start_key;
    this.end_key = end_key;
    this.include_start_key = include_start_key;
    setIncludeStartKeyIsSet(true);
    this.include_end_key = include_end_key;
    setIncludeEndKeyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPartitionRange(TPartitionRange other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStartKey()) {
      this.start_key = new TPartitionKey(other.start_key);
    }
    if (other.isSetEndKey()) {
      this.end_key = new TPartitionKey(other.end_key);
    }
    this.include_start_key = other.include_start_key;
    this.include_end_key = other.include_end_key;
  }

  @Override
  public TPartitionRange deepCopy() {
    return new TPartitionRange(this);
  }

  @Override
  public void clear() {
    this.start_key = null;
    this.end_key = null;
    setIncludeStartKeyIsSet(false);
    this.include_start_key = false;
    setIncludeEndKeyIsSet(false);
    this.include_end_key = false;
  }

  @org.apache.thrift.annotation.Nullable
  public TPartitionKey getStartKey() {
    return this.start_key;
  }

  public TPartitionRange setStartKey(@org.apache.thrift.annotation.Nullable TPartitionKey start_key) {
    this.start_key = start_key;
    return this;
  }

  public void unsetStartKey() {
    this.start_key = null;
  }

  /** Returns true if field start_key is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.start_key != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.start_key = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TPartitionKey getEndKey() {
    return this.end_key;
  }

  public TPartitionRange setEndKey(@org.apache.thrift.annotation.Nullable TPartitionKey end_key) {
    this.end_key = end_key;
    return this;
  }

  public void unsetEndKey() {
    this.end_key = null;
  }

  /** Returns true if field end_key is set (has been assigned a value) and false otherwise */
  public boolean isSetEndKey() {
    return this.end_key != null;
  }

  public void setEndKeyIsSet(boolean value) {
    if (!value) {
      this.end_key = null;
    }
  }

  public boolean isIncludeStartKey() {
    return this.include_start_key;
  }

  public TPartitionRange setIncludeStartKey(boolean include_start_key) {
    this.include_start_key = include_start_key;
    setIncludeStartKeyIsSet(true);
    return this;
  }

  public void unsetIncludeStartKey() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INCLUDE_START_KEY_ISSET_ID);
  }

  /** Returns true if field include_start_key is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeStartKey() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INCLUDE_START_KEY_ISSET_ID);
  }

  public void setIncludeStartKeyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INCLUDE_START_KEY_ISSET_ID, value);
  }

  public boolean isIncludeEndKey() {
    return this.include_end_key;
  }

  public TPartitionRange setIncludeEndKey(boolean include_end_key) {
    this.include_end_key = include_end_key;
    setIncludeEndKeyIsSet(true);
    return this;
  }

  public void unsetIncludeEndKey() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INCLUDE_END_KEY_ISSET_ID);
  }

  /** Returns true if field include_end_key is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeEndKey() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INCLUDE_END_KEY_ISSET_ID);
  }

  public void setIncludeEndKeyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INCLUDE_END_KEY_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        setStartKey((TPartitionKey)value);
      }
      break;

    case END_KEY:
      if (value == null) {
        unsetEndKey();
      } else {
        setEndKey((TPartitionKey)value);
      }
      break;

    case INCLUDE_START_KEY:
      if (value == null) {
        unsetIncludeStartKey();
      } else {
        setIncludeStartKey((java.lang.Boolean)value);
      }
      break;

    case INCLUDE_END_KEY:
      if (value == null) {
        unsetIncludeEndKey();
      } else {
        setIncludeEndKey((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_KEY:
      return getStartKey();

    case END_KEY:
      return getEndKey();

    case INCLUDE_START_KEY:
      return isIncludeStartKey();

    case INCLUDE_END_KEY:
      return isIncludeEndKey();

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
    case START_KEY:
      return isSetStartKey();
    case END_KEY:
      return isSetEndKey();
    case INCLUDE_START_KEY:
      return isSetIncludeStartKey();
    case INCLUDE_END_KEY:
      return isSetIncludeEndKey();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPartitionRange)
      return this.equals((TPartitionRange)that);
    return false;
  }

  public boolean equals(TPartitionRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_start_key = true && this.isSetStartKey();
    boolean that_present_start_key = true && that.isSetStartKey();
    if (this_present_start_key || that_present_start_key) {
      if (!(this_present_start_key && that_present_start_key))
        return false;
      if (!this.start_key.equals(that.start_key))
        return false;
    }

    boolean this_present_end_key = true && this.isSetEndKey();
    boolean that_present_end_key = true && that.isSetEndKey();
    if (this_present_end_key || that_present_end_key) {
      if (!(this_present_end_key && that_present_end_key))
        return false;
      if (!this.end_key.equals(that.end_key))
        return false;
    }

    boolean this_present_include_start_key = true;
    boolean that_present_include_start_key = true;
    if (this_present_include_start_key || that_present_include_start_key) {
      if (!(this_present_include_start_key && that_present_include_start_key))
        return false;
      if (this.include_start_key != that.include_start_key)
        return false;
    }

    boolean this_present_include_end_key = true;
    boolean that_present_include_end_key = true;
    if (this_present_include_end_key || that_present_include_end_key) {
      if (!(this_present_include_end_key && that_present_include_end_key))
        return false;
      if (this.include_end_key != that.include_end_key)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStartKey()) ? 131071 : 524287);
    if (isSetStartKey())
      hashCode = hashCode * 8191 + start_key.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndKey()) ? 131071 : 524287);
    if (isSetEndKey())
      hashCode = hashCode * 8191 + end_key.hashCode();

    hashCode = hashCode * 8191 + ((include_start_key) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((include_end_key) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TPartitionRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStartKey(), other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_key, other.start_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEndKey(), other.isSetEndKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_key, other.end_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIncludeStartKey(), other.isSetIncludeStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.include_start_key, other.include_start_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIncludeEndKey(), other.isSetIncludeEndKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeEndKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.include_end_key, other.include_end_key);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPartitionRange(");
    boolean first = true;

    sb.append("start_key:");
    if (this.start_key == null) {
      sb.append("null");
    } else {
      sb.append(this.start_key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_key:");
    if (this.end_key == null) {
      sb.append("null");
    } else {
      sb.append(this.end_key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("include_start_key:");
    sb.append(this.include_start_key);
    first = false;
    if (!first) sb.append(", ");
    sb.append("include_end_key:");
    sb.append(this.include_end_key);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (start_key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'start_key' was not present! Struct: " + toString());
    }
    if (end_key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'end_key' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'include_start_key' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'include_end_key' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (start_key != null) {
      start_key.validate();
    }
    if (end_key != null) {
      end_key.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPartitionRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPartitionRangeStandardScheme getScheme() {
      return new TPartitionRangeStandardScheme();
    }
  }

  private static class TPartitionRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPartitionRange> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPartitionRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.start_key = new TPartitionKey();
              struct.start_key.read(iprot);
              struct.setStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.end_key = new TPartitionKey();
              struct.end_key.read(iprot);
              struct.setEndKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INCLUDE_START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.include_start_key = iprot.readBool();
              struct.setIncludeStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INCLUDE_END_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.include_end_key = iprot.readBool();
              struct.setIncludeEndKeyIsSet(true);
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
      if (!struct.isSetIncludeStartKey()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'include_start_key' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIncludeEndKey()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'include_end_key' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPartitionRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.start_key != null) {
        oprot.writeFieldBegin(START_KEY_FIELD_DESC);
        struct.start_key.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.end_key != null) {
        oprot.writeFieldBegin(END_KEY_FIELD_DESC);
        struct.end_key.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INCLUDE_START_KEY_FIELD_DESC);
      oprot.writeBool(struct.include_start_key);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INCLUDE_END_KEY_FIELD_DESC);
      oprot.writeBool(struct.include_end_key);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPartitionRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPartitionRangeTupleScheme getScheme() {
      return new TPartitionRangeTupleScheme();
    }
  }

  private static class TPartitionRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPartitionRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPartitionRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.start_key.write(oprot);
      struct.end_key.write(oprot);
      oprot.writeBool(struct.include_start_key);
      oprot.writeBool(struct.include_end_key);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPartitionRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.start_key = new TPartitionKey();
      struct.start_key.read(iprot);
      struct.setStartKeyIsSet(true);
      struct.end_key = new TPartitionKey();
      struct.end_key.read(iprot);
      struct.setEndKeyIsSet(true);
      struct.include_start_key = iprot.readBool();
      struct.setIncludeStartKeyIsSet(true);
      struct.include_end_key = iprot.readBool();
      struct.setIncludeEndKeyIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

