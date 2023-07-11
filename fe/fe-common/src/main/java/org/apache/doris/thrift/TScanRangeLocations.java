/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TScanRangeLocations implements org.apache.thrift.TBase<TScanRangeLocations, TScanRangeLocations._Fields>, java.io.Serializable, Cloneable, Comparable<TScanRangeLocations> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanRangeLocations");

  private static final org.apache.thrift.protocol.TField SCAN_RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TScanRangeLocationsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TScanRangeLocationsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TScanRange scan_range; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TScanRangeLocation> locations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCAN_RANGE((short)1, "scan_range"),
    LOCATIONS((short)2, "locations");

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
        case 1: // SCAN_RANGE
          return SCAN_RANGE;
        case 2: // LOCATIONS
          return LOCATIONS;
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
    tmpMap.put(_Fields.SCAN_RANGE, new org.apache.thrift.meta_data.FieldMetaData("scan_range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TScanRange.class)));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TScanRangeLocation.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanRangeLocations.class, metaDataMap);
  }

  public TScanRangeLocations() {
  }

  public TScanRangeLocations(
    org.apache.doris.thrift.TScanRange scan_range,
    java.util.List<TScanRangeLocation> locations)
  {
    this();
    this.scan_range = scan_range;
    this.locations = locations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanRangeLocations(TScanRangeLocations other) {
    if (other.isSetScanRange()) {
      this.scan_range = new org.apache.doris.thrift.TScanRange(other.scan_range);
    }
    if (other.isSetLocations()) {
      java.util.List<TScanRangeLocation> __this__locations = new java.util.ArrayList<TScanRangeLocation>(other.locations.size());
      for (TScanRangeLocation other_element : other.locations) {
        __this__locations.add(new TScanRangeLocation(other_element));
      }
      this.locations = __this__locations;
    }
  }

  @Override
  public TScanRangeLocations deepCopy() {
    return new TScanRangeLocations(this);
  }

  @Override
  public void clear() {
    this.scan_range = null;
    this.locations = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TScanRange getScanRange() {
    return this.scan_range;
  }

  public TScanRangeLocations setScanRange(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TScanRange scan_range) {
    this.scan_range = scan_range;
    return this;
  }

  public void unsetScanRange() {
    this.scan_range = null;
  }

  /** Returns true if field scan_range is set (has been assigned a value) and false otherwise */
  public boolean isSetScanRange() {
    return this.scan_range != null;
  }

  public void setScanRangeIsSet(boolean value) {
    if (!value) {
      this.scan_range = null;
    }
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TScanRangeLocation> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(TScanRangeLocation elem) {
    if (this.locations == null) {
      this.locations = new java.util.ArrayList<TScanRangeLocation>();
    }
    this.locations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TScanRangeLocation> getLocations() {
    return this.locations;
  }

  public TScanRangeLocations setLocations(@org.apache.thrift.annotation.Nullable java.util.List<TScanRangeLocation> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCAN_RANGE:
      if (value == null) {
        unsetScanRange();
      } else {
        setScanRange((org.apache.doris.thrift.TScanRange)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((java.util.List<TScanRangeLocation>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCAN_RANGE:
      return getScanRange();

    case LOCATIONS:
      return getLocations();

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
    case SCAN_RANGE:
      return isSetScanRange();
    case LOCATIONS:
      return isSetLocations();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TScanRangeLocations)
      return this.equals((TScanRangeLocations)that);
    return false;
  }

  public boolean equals(TScanRangeLocations that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scan_range = true && this.isSetScanRange();
    boolean that_present_scan_range = true && that.isSetScanRange();
    if (this_present_scan_range || that_present_scan_range) {
      if (!(this_present_scan_range && that_present_scan_range))
        return false;
      if (!this.scan_range.equals(that.scan_range))
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetScanRange()) ? 131071 : 524287);
    if (isSetScanRange())
      hashCode = hashCode * 8191 + scan_range.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocations()) ? 131071 : 524287);
    if (isSetLocations())
      hashCode = hashCode * 8191 + locations.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TScanRangeLocations other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScanRange(), other.isSetScanRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScanRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_range, other.scan_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLocations(), other.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, other.locations);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TScanRangeLocations(");
    boolean first = true;

    sb.append("scan_range:");
    if (this.scan_range == null) {
      sb.append("null");
    } else {
      sb.append(this.scan_range);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locations:");
    if (this.locations == null) {
      sb.append("null");
    } else {
      sb.append(this.locations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scan_range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scan_range' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (scan_range != null) {
      scan_range.validate();
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

  private static class TScanRangeLocationsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanRangeLocationsStandardScheme getScheme() {
      return new TScanRangeLocationsStandardScheme();
    }
  }

  private static class TScanRangeLocationsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TScanRangeLocations> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCAN_RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scan_range = new org.apache.doris.thrift.TScanRange();
              struct.scan_range.read(iprot);
              struct.setScanRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.locations = new java.util.ArrayList<TScanRangeLocation>(_list8.size);
                @org.apache.thrift.annotation.Nullable TScanRangeLocation _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new TScanRangeLocation();
                  _elem9.read(iprot);
                  struct.locations.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scan_range != null) {
        oprot.writeFieldBegin(SCAN_RANGE_FIELD_DESC);
        struct.scan_range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.locations != null) {
        oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locations.size()));
          for (TScanRangeLocation _iter11 : struct.locations)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanRangeLocationsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TScanRangeLocationsTupleScheme getScheme() {
      return new TScanRangeLocationsTupleScheme();
    }
  }

  private static class TScanRangeLocationsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TScanRangeLocations> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scan_range.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLocations()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLocations()) {
        {
          oprot.writeI32(struct.locations.size());
          for (TScanRangeLocation _iter12 : struct.locations)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanRangeLocations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scan_range = new org.apache.doris.thrift.TScanRange();
      struct.scan_range.read(iprot);
      struct.setScanRangeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.locations = new java.util.ArrayList<TScanRangeLocation>(_list13.size);
          @org.apache.thrift.annotation.Nullable TScanRangeLocation _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new TScanRangeLocation();
            _elem14.read(iprot);
            struct.locations.add(_elem14);
          }
        }
        struct.setLocationsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

