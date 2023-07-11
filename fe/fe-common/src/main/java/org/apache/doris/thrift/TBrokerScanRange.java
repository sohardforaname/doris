/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TBrokerScanRange implements org.apache.thrift.TBase<TBrokerScanRange, TBrokerScanRange._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerScanRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerScanRange");

  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BROKER_ADDRESSES_FIELD_DESC = new org.apache.thrift.protocol.TField("broker_addresses", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerScanRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerScanRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TBrokerRangeDesc> ranges; // required
  public @org.apache.thrift.annotation.Nullable TBrokerScanRangeParams params; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TNetworkAddress> broker_addresses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RANGES((short)1, "ranges"),
    PARAMS((short)2, "params"),
    BROKER_ADDRESSES((short)3, "broker_addresses");

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
        case 1: // RANGES
          return RANGES;
        case 2: // PARAMS
          return PARAMS;
        case 3: // BROKER_ADDRESSES
          return BROKER_ADDRESSES;
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
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerRangeDesc.class))));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerScanRangeParams.class)));
    tmpMap.put(_Fields.BROKER_ADDRESSES, new org.apache.thrift.meta_data.FieldMetaData("broker_addresses", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerScanRange.class, metaDataMap);
  }

  public TBrokerScanRange() {
  }

  public TBrokerScanRange(
    java.util.List<TBrokerRangeDesc> ranges,
    TBrokerScanRangeParams params,
    java.util.List<org.apache.doris.thrift.TNetworkAddress> broker_addresses)
  {
    this();
    this.ranges = ranges;
    this.params = params;
    this.broker_addresses = broker_addresses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerScanRange(TBrokerScanRange other) {
    if (other.isSetRanges()) {
      java.util.List<TBrokerRangeDesc> __this__ranges = new java.util.ArrayList<TBrokerRangeDesc>(other.ranges.size());
      for (TBrokerRangeDesc other_element : other.ranges) {
        __this__ranges.add(new TBrokerRangeDesc(other_element));
      }
      this.ranges = __this__ranges;
    }
    if (other.isSetParams()) {
      this.params = new TBrokerScanRangeParams(other.params);
    }
    if (other.isSetBrokerAddresses()) {
      java.util.List<org.apache.doris.thrift.TNetworkAddress> __this__broker_addresses = new java.util.ArrayList<org.apache.doris.thrift.TNetworkAddress>(other.broker_addresses.size());
      for (org.apache.doris.thrift.TNetworkAddress other_element : other.broker_addresses) {
        __this__broker_addresses.add(new org.apache.doris.thrift.TNetworkAddress(other_element));
      }
      this.broker_addresses = __this__broker_addresses;
    }
  }

  @Override
  public TBrokerScanRange deepCopy() {
    return new TBrokerScanRange(this);
  }

  @Override
  public void clear() {
    this.ranges = null;
    this.params = null;
    this.broker_addresses = null;
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TBrokerRangeDesc> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(TBrokerRangeDesc elem) {
    if (this.ranges == null) {
      this.ranges = new java.util.ArrayList<TBrokerRangeDesc>();
    }
    this.ranges.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TBrokerRangeDesc> getRanges() {
    return this.ranges;
  }

  public TBrokerScanRange setRanges(@org.apache.thrift.annotation.Nullable java.util.List<TBrokerRangeDesc> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBrokerScanRangeParams getParams() {
    return this.params;
  }

  public TBrokerScanRange setParams(@org.apache.thrift.annotation.Nullable TBrokerScanRangeParams params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public int getBrokerAddressesSize() {
    return (this.broker_addresses == null) ? 0 : this.broker_addresses.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TNetworkAddress> getBrokerAddressesIterator() {
    return (this.broker_addresses == null) ? null : this.broker_addresses.iterator();
  }

  public void addToBrokerAddresses(org.apache.doris.thrift.TNetworkAddress elem) {
    if (this.broker_addresses == null) {
      this.broker_addresses = new java.util.ArrayList<org.apache.doris.thrift.TNetworkAddress>();
    }
    this.broker_addresses.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TNetworkAddress> getBrokerAddresses() {
    return this.broker_addresses;
  }

  public TBrokerScanRange setBrokerAddresses(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TNetworkAddress> broker_addresses) {
    this.broker_addresses = broker_addresses;
    return this;
  }

  public void unsetBrokerAddresses() {
    this.broker_addresses = null;
  }

  /** Returns true if field broker_addresses is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokerAddresses() {
    return this.broker_addresses != null;
  }

  public void setBrokerAddressesIsSet(boolean value) {
    if (!value) {
      this.broker_addresses = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((java.util.List<TBrokerRangeDesc>)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((TBrokerScanRangeParams)value);
      }
      break;

    case BROKER_ADDRESSES:
      if (value == null) {
        unsetBrokerAddresses();
      } else {
        setBrokerAddresses((java.util.List<org.apache.doris.thrift.TNetworkAddress>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGES:
      return getRanges();

    case PARAMS:
      return getParams();

    case BROKER_ADDRESSES:
      return getBrokerAddresses();

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
    case RANGES:
      return isSetRanges();
    case PARAMS:
      return isSetParams();
    case BROKER_ADDRESSES:
      return isSetBrokerAddresses();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerScanRange)
      return this.equals((TBrokerScanRange)that);
    return false;
  }

  public boolean equals(TBrokerScanRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    boolean this_present_broker_addresses = true && this.isSetBrokerAddresses();
    boolean that_present_broker_addresses = true && that.isSetBrokerAddresses();
    if (this_present_broker_addresses || that_present_broker_addresses) {
      if (!(this_present_broker_addresses && that_present_broker_addresses))
        return false;
      if (!this.broker_addresses.equals(that.broker_addresses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRanges()) ? 131071 : 524287);
    if (isSetRanges())
      hashCode = hashCode * 8191 + ranges.hashCode();

    hashCode = hashCode * 8191 + ((isSetParams()) ? 131071 : 524287);
    if (isSetParams())
      hashCode = hashCode * 8191 + params.hashCode();

    hashCode = hashCode * 8191 + ((isSetBrokerAddresses()) ? 131071 : 524287);
    if (isSetBrokerAddresses())
      hashCode = hashCode * 8191 + broker_addresses.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerScanRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRanges(), other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParams(), other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBrokerAddresses(), other.isSetBrokerAddresses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokerAddresses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.broker_addresses, other.broker_addresses);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerScanRange(");
    boolean first = true;

    sb.append("ranges:");
    if (this.ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.ranges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("params:");
    if (this.params == null) {
      sb.append("null");
    } else {
      sb.append(this.params);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("broker_addresses:");
    if (this.broker_addresses == null) {
      sb.append("null");
    } else {
      sb.append(this.broker_addresses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ranges == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ranges' was not present! Struct: " + toString());
    }
    if (params == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'params' was not present! Struct: " + toString());
    }
    if (broker_addresses == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'broker_addresses' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (params != null) {
      params.validate();
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

  private static class TBrokerScanRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerScanRangeStandardScheme getScheme() {
      return new TBrokerScanRangeStandardScheme();
    }
  }

  private static class TBrokerScanRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerScanRange> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list78 = iprot.readListBegin();
                struct.ranges = new java.util.ArrayList<TBrokerRangeDesc>(_list78.size);
                @org.apache.thrift.annotation.Nullable TBrokerRangeDesc _elem79;
                for (int _i80 = 0; _i80 < _list78.size; ++_i80)
                {
                  _elem79 = new TBrokerRangeDesc();
                  _elem79.read(iprot);
                  struct.ranges.add(_elem79);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.params = new TBrokerScanRangeParams();
              struct.params.read(iprot);
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BROKER_ADDRESSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list81 = iprot.readListBegin();
                struct.broker_addresses = new java.util.ArrayList<org.apache.doris.thrift.TNetworkAddress>(_list81.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress _elem82;
                for (int _i83 = 0; _i83 < _list81.size; ++_i83)
                {
                  _elem82 = new org.apache.doris.thrift.TNetworkAddress();
                  _elem82.read(iprot);
                  struct.broker_addresses.add(_elem82);
                }
                iprot.readListEnd();
              }
              struct.setBrokerAddressesIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerScanRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ranges != null) {
        oprot.writeFieldBegin(RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ranges.size()));
          for (TBrokerRangeDesc _iter84 : struct.ranges)
          {
            _iter84.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.params != null) {
        oprot.writeFieldBegin(PARAMS_FIELD_DESC);
        struct.params.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.broker_addresses != null) {
        oprot.writeFieldBegin(BROKER_ADDRESSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.broker_addresses.size()));
          for (org.apache.doris.thrift.TNetworkAddress _iter85 : struct.broker_addresses)
          {
            _iter85.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerScanRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TBrokerScanRangeTupleScheme getScheme() {
      return new TBrokerScanRangeTupleScheme();
    }
  }

  private static class TBrokerScanRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerScanRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.ranges.size());
        for (TBrokerRangeDesc _iter86 : struct.ranges)
        {
          _iter86.write(oprot);
        }
      }
      struct.params.write(oprot);
      {
        oprot.writeI32(struct.broker_addresses.size());
        for (org.apache.doris.thrift.TNetworkAddress _iter87 : struct.broker_addresses)
        {
          _iter87.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list88 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.ranges = new java.util.ArrayList<TBrokerRangeDesc>(_list88.size);
        @org.apache.thrift.annotation.Nullable TBrokerRangeDesc _elem89;
        for (int _i90 = 0; _i90 < _list88.size; ++_i90)
        {
          _elem89 = new TBrokerRangeDesc();
          _elem89.read(iprot);
          struct.ranges.add(_elem89);
        }
      }
      struct.setRangesIsSet(true);
      struct.params = new TBrokerScanRangeParams();
      struct.params.read(iprot);
      struct.setParamsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list91 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.broker_addresses = new java.util.ArrayList<org.apache.doris.thrift.TNetworkAddress>(_list91.size);
        @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress _elem92;
        for (int _i93 = 0; _i93 < _list91.size; ++_i93)
        {
          _elem92 = new org.apache.doris.thrift.TNetworkAddress();
          _elem92.read(iprot);
          struct.broker_addresses.add(_elem92);
        }
      }
      struct.setBrokerAddressesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

