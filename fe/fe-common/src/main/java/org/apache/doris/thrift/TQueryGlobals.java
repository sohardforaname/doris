/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TQueryGlobals implements org.apache.thrift.TBase<TQueryGlobals, TQueryGlobals._Fields>, java.io.Serializable, Cloneable, Comparable<TQueryGlobals> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQueryGlobals");

  private static final org.apache.thrift.protocol.TField NOW_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("now_string", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp_ms", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_ZONE_FIELD_DESC = new org.apache.thrift.protocol.TField("time_zone", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOAD_ZERO_TOLERANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("load_zero_tolerance", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField NANO_SECONDS_FIELD_DESC = new org.apache.thrift.protocol.TField("nano_seconds", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TQueryGlobalsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TQueryGlobalsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String now_string; // required
  public long timestamp_ms; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String time_zone; // optional
  public boolean load_zero_tolerance; // optional
  public int nano_seconds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOW_STRING((short)1, "now_string"),
    TIMESTAMP_MS((short)2, "timestamp_ms"),
    TIME_ZONE((short)3, "time_zone"),
    LOAD_ZERO_TOLERANCE((short)4, "load_zero_tolerance"),
    NANO_SECONDS((short)5, "nano_seconds");

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
        case 1: // NOW_STRING
          return NOW_STRING;
        case 2: // TIMESTAMP_MS
          return TIMESTAMP_MS;
        case 3: // TIME_ZONE
          return TIME_ZONE;
        case 4: // LOAD_ZERO_TOLERANCE
          return LOAD_ZERO_TOLERANCE;
        case 5: // NANO_SECONDS
          return NANO_SECONDS;
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
  private static final int __TIMESTAMP_MS_ISSET_ID = 0;
  private static final int __LOAD_ZERO_TOLERANCE_ISSET_ID = 1;
  private static final int __NANO_SECONDS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIMESTAMP_MS,_Fields.TIME_ZONE,_Fields.LOAD_ZERO_TOLERANCE,_Fields.NANO_SECONDS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOW_STRING, new org.apache.thrift.meta_data.FieldMetaData("now_string", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP_MS, new org.apache.thrift.meta_data.FieldMetaData("timestamp_ms", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME_ZONE, new org.apache.thrift.meta_data.FieldMetaData("time_zone", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOAD_ZERO_TOLERANCE, new org.apache.thrift.meta_data.FieldMetaData("load_zero_tolerance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NANO_SECONDS, new org.apache.thrift.meta_data.FieldMetaData("nano_seconds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQueryGlobals.class, metaDataMap);
  }

  public TQueryGlobals() {
    this.load_zero_tolerance = false;

  }

  public TQueryGlobals(
    java.lang.String now_string)
  {
    this();
    this.now_string = now_string;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQueryGlobals(TQueryGlobals other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNowString()) {
      this.now_string = other.now_string;
    }
    this.timestamp_ms = other.timestamp_ms;
    if (other.isSetTimeZone()) {
      this.time_zone = other.time_zone;
    }
    this.load_zero_tolerance = other.load_zero_tolerance;
    this.nano_seconds = other.nano_seconds;
  }

  @Override
  public TQueryGlobals deepCopy() {
    return new TQueryGlobals(this);
  }

  @Override
  public void clear() {
    this.now_string = null;
    setTimestampMsIsSet(false);
    this.timestamp_ms = 0;
    this.time_zone = null;
    this.load_zero_tolerance = false;

    setNanoSecondsIsSet(false);
    this.nano_seconds = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNowString() {
    return this.now_string;
  }

  public TQueryGlobals setNowString(@org.apache.thrift.annotation.Nullable java.lang.String now_string) {
    this.now_string = now_string;
    return this;
  }

  public void unsetNowString() {
    this.now_string = null;
  }

  /** Returns true if field now_string is set (has been assigned a value) and false otherwise */
  public boolean isSetNowString() {
    return this.now_string != null;
  }

  public void setNowStringIsSet(boolean value) {
    if (!value) {
      this.now_string = null;
    }
  }

  public long getTimestampMs() {
    return this.timestamp_ms;
  }

  public TQueryGlobals setTimestampMs(long timestamp_ms) {
    this.timestamp_ms = timestamp_ms;
    setTimestampMsIsSet(true);
    return this;
  }

  public void unsetTimestampMs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_MS_ISSET_ID);
  }

  /** Returns true if field timestamp_ms is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestampMs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_MS_ISSET_ID);
  }

  public void setTimestampMsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_MS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTimeZone() {
    return this.time_zone;
  }

  public TQueryGlobals setTimeZone(@org.apache.thrift.annotation.Nullable java.lang.String time_zone) {
    this.time_zone = time_zone;
    return this;
  }

  public void unsetTimeZone() {
    this.time_zone = null;
  }

  /** Returns true if field time_zone is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeZone() {
    return this.time_zone != null;
  }

  public void setTimeZoneIsSet(boolean value) {
    if (!value) {
      this.time_zone = null;
    }
  }

  public boolean isLoadZeroTolerance() {
    return this.load_zero_tolerance;
  }

  public TQueryGlobals setLoadZeroTolerance(boolean load_zero_tolerance) {
    this.load_zero_tolerance = load_zero_tolerance;
    setLoadZeroToleranceIsSet(true);
    return this;
  }

  public void unsetLoadZeroTolerance() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOAD_ZERO_TOLERANCE_ISSET_ID);
  }

  /** Returns true if field load_zero_tolerance is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadZeroTolerance() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOAD_ZERO_TOLERANCE_ISSET_ID);
  }

  public void setLoadZeroToleranceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOAD_ZERO_TOLERANCE_ISSET_ID, value);
  }

  public int getNanoSeconds() {
    return this.nano_seconds;
  }

  public TQueryGlobals setNanoSeconds(int nano_seconds) {
    this.nano_seconds = nano_seconds;
    setNanoSecondsIsSet(true);
    return this;
  }

  public void unsetNanoSeconds() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NANO_SECONDS_ISSET_ID);
  }

  /** Returns true if field nano_seconds is set (has been assigned a value) and false otherwise */
  public boolean isSetNanoSeconds() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NANO_SECONDS_ISSET_ID);
  }

  public void setNanoSecondsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NANO_SECONDS_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NOW_STRING:
      if (value == null) {
        unsetNowString();
      } else {
        setNowString((java.lang.String)value);
      }
      break;

    case TIMESTAMP_MS:
      if (value == null) {
        unsetTimestampMs();
      } else {
        setTimestampMs((java.lang.Long)value);
      }
      break;

    case TIME_ZONE:
      if (value == null) {
        unsetTimeZone();
      } else {
        setTimeZone((java.lang.String)value);
      }
      break;

    case LOAD_ZERO_TOLERANCE:
      if (value == null) {
        unsetLoadZeroTolerance();
      } else {
        setLoadZeroTolerance((java.lang.Boolean)value);
      }
      break;

    case NANO_SECONDS:
      if (value == null) {
        unsetNanoSeconds();
      } else {
        setNanoSeconds((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NOW_STRING:
      return getNowString();

    case TIMESTAMP_MS:
      return getTimestampMs();

    case TIME_ZONE:
      return getTimeZone();

    case LOAD_ZERO_TOLERANCE:
      return isLoadZeroTolerance();

    case NANO_SECONDS:
      return getNanoSeconds();

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
    case NOW_STRING:
      return isSetNowString();
    case TIMESTAMP_MS:
      return isSetTimestampMs();
    case TIME_ZONE:
      return isSetTimeZone();
    case LOAD_ZERO_TOLERANCE:
      return isSetLoadZeroTolerance();
    case NANO_SECONDS:
      return isSetNanoSeconds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TQueryGlobals)
      return this.equals((TQueryGlobals)that);
    return false;
  }

  public boolean equals(TQueryGlobals that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_now_string = true && this.isSetNowString();
    boolean that_present_now_string = true && that.isSetNowString();
    if (this_present_now_string || that_present_now_string) {
      if (!(this_present_now_string && that_present_now_string))
        return false;
      if (!this.now_string.equals(that.now_string))
        return false;
    }

    boolean this_present_timestamp_ms = true && this.isSetTimestampMs();
    boolean that_present_timestamp_ms = true && that.isSetTimestampMs();
    if (this_present_timestamp_ms || that_present_timestamp_ms) {
      if (!(this_present_timestamp_ms && that_present_timestamp_ms))
        return false;
      if (this.timestamp_ms != that.timestamp_ms)
        return false;
    }

    boolean this_present_time_zone = true && this.isSetTimeZone();
    boolean that_present_time_zone = true && that.isSetTimeZone();
    if (this_present_time_zone || that_present_time_zone) {
      if (!(this_present_time_zone && that_present_time_zone))
        return false;
      if (!this.time_zone.equals(that.time_zone))
        return false;
    }

    boolean this_present_load_zero_tolerance = true && this.isSetLoadZeroTolerance();
    boolean that_present_load_zero_tolerance = true && that.isSetLoadZeroTolerance();
    if (this_present_load_zero_tolerance || that_present_load_zero_tolerance) {
      if (!(this_present_load_zero_tolerance && that_present_load_zero_tolerance))
        return false;
      if (this.load_zero_tolerance != that.load_zero_tolerance)
        return false;
    }

    boolean this_present_nano_seconds = true && this.isSetNanoSeconds();
    boolean that_present_nano_seconds = true && that.isSetNanoSeconds();
    if (this_present_nano_seconds || that_present_nano_seconds) {
      if (!(this_present_nano_seconds && that_present_nano_seconds))
        return false;
      if (this.nano_seconds != that.nano_seconds)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNowString()) ? 131071 : 524287);
    if (isSetNowString())
      hashCode = hashCode * 8191 + now_string.hashCode();

    hashCode = hashCode * 8191 + ((isSetTimestampMs()) ? 131071 : 524287);
    if (isSetTimestampMs())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timestamp_ms);

    hashCode = hashCode * 8191 + ((isSetTimeZone()) ? 131071 : 524287);
    if (isSetTimeZone())
      hashCode = hashCode * 8191 + time_zone.hashCode();

    hashCode = hashCode * 8191 + ((isSetLoadZeroTolerance()) ? 131071 : 524287);
    if (isSetLoadZeroTolerance())
      hashCode = hashCode * 8191 + ((load_zero_tolerance) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetNanoSeconds()) ? 131071 : 524287);
    if (isSetNanoSeconds())
      hashCode = hashCode * 8191 + nano_seconds;

    return hashCode;
  }

  @Override
  public int compareTo(TQueryGlobals other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNowString(), other.isSetNowString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNowString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.now_string, other.now_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTimestampMs(), other.isSetTimestampMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestampMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp_ms, other.timestamp_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTimeZone(), other.isSetTimeZone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeZone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_zone, other.time_zone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLoadZeroTolerance(), other.isSetLoadZeroTolerance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadZeroTolerance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.load_zero_tolerance, other.load_zero_tolerance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNanoSeconds(), other.isSetNanoSeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNanoSeconds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nano_seconds, other.nano_seconds);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TQueryGlobals(");
    boolean first = true;

    sb.append("now_string:");
    if (this.now_string == null) {
      sb.append("null");
    } else {
      sb.append(this.now_string);
    }
    first = false;
    if (isSetTimestampMs()) {
      if (!first) sb.append(", ");
      sb.append("timestamp_ms:");
      sb.append(this.timestamp_ms);
      first = false;
    }
    if (isSetTimeZone()) {
      if (!first) sb.append(", ");
      sb.append("time_zone:");
      if (this.time_zone == null) {
        sb.append("null");
      } else {
        sb.append(this.time_zone);
      }
      first = false;
    }
    if (isSetLoadZeroTolerance()) {
      if (!first) sb.append(", ");
      sb.append("load_zero_tolerance:");
      sb.append(this.load_zero_tolerance);
      first = false;
    }
    if (isSetNanoSeconds()) {
      if (!first) sb.append(", ");
      sb.append("nano_seconds:");
      sb.append(this.nano_seconds);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (now_string == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'now_string' was not present! Struct: " + toString());
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

  private static class TQueryGlobalsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TQueryGlobalsStandardScheme getScheme() {
      return new TQueryGlobalsStandardScheme();
    }
  }

  private static class TQueryGlobalsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TQueryGlobals> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TQueryGlobals struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOW_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.now_string = iprot.readString();
              struct.setNowStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMESTAMP_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp_ms = iprot.readI64();
              struct.setTimestampMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_ZONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.time_zone = iprot.readString();
              struct.setTimeZoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOAD_ZERO_TOLERANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.load_zero_tolerance = iprot.readBool();
              struct.setLoadZeroToleranceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NANO_SECONDS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nano_seconds = iprot.readI32();
              struct.setNanoSecondsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TQueryGlobals struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.now_string != null) {
        oprot.writeFieldBegin(NOW_STRING_FIELD_DESC);
        oprot.writeString(struct.now_string);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimestampMs()) {
        oprot.writeFieldBegin(TIMESTAMP_MS_FIELD_DESC);
        oprot.writeI64(struct.timestamp_ms);
        oprot.writeFieldEnd();
      }
      if (struct.time_zone != null) {
        if (struct.isSetTimeZone()) {
          oprot.writeFieldBegin(TIME_ZONE_FIELD_DESC);
          oprot.writeString(struct.time_zone);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLoadZeroTolerance()) {
        oprot.writeFieldBegin(LOAD_ZERO_TOLERANCE_FIELD_DESC);
        oprot.writeBool(struct.load_zero_tolerance);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNanoSeconds()) {
        oprot.writeFieldBegin(NANO_SECONDS_FIELD_DESC);
        oprot.writeI32(struct.nano_seconds);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueryGlobalsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TQueryGlobalsTupleScheme getScheme() {
      return new TQueryGlobalsTupleScheme();
    }
  }

  private static class TQueryGlobalsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TQueryGlobals> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQueryGlobals struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.now_string);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTimestampMs()) {
        optionals.set(0);
      }
      if (struct.isSetTimeZone()) {
        optionals.set(1);
      }
      if (struct.isSetLoadZeroTolerance()) {
        optionals.set(2);
      }
      if (struct.isSetNanoSeconds()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTimestampMs()) {
        oprot.writeI64(struct.timestamp_ms);
      }
      if (struct.isSetTimeZone()) {
        oprot.writeString(struct.time_zone);
      }
      if (struct.isSetLoadZeroTolerance()) {
        oprot.writeBool(struct.load_zero_tolerance);
      }
      if (struct.isSetNanoSeconds()) {
        oprot.writeI32(struct.nano_seconds);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQueryGlobals struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.now_string = iprot.readString();
      struct.setNowStringIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.timestamp_ms = iprot.readI64();
        struct.setTimestampMsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.time_zone = iprot.readString();
        struct.setTimeZoneIsSet(true);
      }
      if (incoming.get(2)) {
        struct.load_zero_tolerance = iprot.readBool();
        struct.setLoadZeroToleranceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.nano_seconds = iprot.readI32();
        struct.setNanoSecondsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

