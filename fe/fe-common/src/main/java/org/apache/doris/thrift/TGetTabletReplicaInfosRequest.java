/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TGetTabletReplicaInfosRequest implements org.apache.thrift.TBase<TGetTabletReplicaInfosRequest, TGetTabletReplicaInfosRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetTabletReplicaInfosRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetTabletReplicaInfosRequest");

  private static final org.apache.thrift.protocol.TField TABLET_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_ids", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetTabletReplicaInfosRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetTabletReplicaInfosRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> tablet_ids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_IDS((short)1, "tablet_ids");

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
        case 1: // TABLET_IDS
          return TABLET_IDS;
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
    tmpMap.put(_Fields.TABLET_IDS, new org.apache.thrift.meta_data.FieldMetaData("tablet_ids", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetTabletReplicaInfosRequest.class, metaDataMap);
  }

  public TGetTabletReplicaInfosRequest() {
  }

  public TGetTabletReplicaInfosRequest(
    java.util.List<java.lang.Long> tablet_ids)
  {
    this();
    this.tablet_ids = tablet_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetTabletReplicaInfosRequest(TGetTabletReplicaInfosRequest other) {
    if (other.isSetTabletIds()) {
      java.util.List<java.lang.Long> __this__tablet_ids = new java.util.ArrayList<java.lang.Long>(other.tablet_ids);
      this.tablet_ids = __this__tablet_ids;
    }
  }

  @Override
  public TGetTabletReplicaInfosRequest deepCopy() {
    return new TGetTabletReplicaInfosRequest(this);
  }

  @Override
  public void clear() {
    this.tablet_ids = null;
  }

  public int getTabletIdsSize() {
    return (this.tablet_ids == null) ? 0 : this.tablet_ids.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getTabletIdsIterator() {
    return (this.tablet_ids == null) ? null : this.tablet_ids.iterator();
  }

  public void addToTabletIds(long elem) {
    if (this.tablet_ids == null) {
      this.tablet_ids = new java.util.ArrayList<java.lang.Long>();
    }
    this.tablet_ids.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getTabletIds() {
    return this.tablet_ids;
  }

  public TGetTabletReplicaInfosRequest setTabletIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> tablet_ids) {
    this.tablet_ids = tablet_ids;
    return this;
  }

  public void unsetTabletIds() {
    this.tablet_ids = null;
  }

  /** Returns true if field tablet_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletIds() {
    return this.tablet_ids != null;
  }

  public void setTabletIdsIsSet(boolean value) {
    if (!value) {
      this.tablet_ids = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLET_IDS:
      if (value == null) {
        unsetTabletIds();
      } else {
        setTabletIds((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_IDS:
      return getTabletIds();

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
    case TABLET_IDS:
      return isSetTabletIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetTabletReplicaInfosRequest)
      return this.equals((TGetTabletReplicaInfosRequest)that);
    return false;
  }

  public boolean equals(TGetTabletReplicaInfosRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tablet_ids = true && this.isSetTabletIds();
    boolean that_present_tablet_ids = true && that.isSetTabletIds();
    if (this_present_tablet_ids || that_present_tablet_ids) {
      if (!(this_present_tablet_ids && that_present_tablet_ids))
        return false;
      if (!this.tablet_ids.equals(that.tablet_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTabletIds()) ? 131071 : 524287);
    if (isSetTabletIds())
      hashCode = hashCode * 8191 + tablet_ids.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetTabletReplicaInfosRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletIds(), other.isSetTabletIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_ids, other.tablet_ids);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetTabletReplicaInfosRequest(");
    boolean first = true;

    sb.append("tablet_ids:");
    if (this.tablet_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.tablet_ids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tablet_ids == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablet_ids' was not present! Struct: " + toString());
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

  private static class TGetTabletReplicaInfosRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetTabletReplicaInfosRequestStandardScheme getScheme() {
      return new TGetTabletReplicaInfosRequestStandardScheme();
    }
  }

  private static class TGetTabletReplicaInfosRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetTabletReplicaInfosRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetTabletReplicaInfosRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list432 = iprot.readListBegin();
                struct.tablet_ids = new java.util.ArrayList<java.lang.Long>(_list432.size);
                long _elem433;
                for (int _i434 = 0; _i434 < _list432.size; ++_i434)
                {
                  _elem433 = iprot.readI64();
                  struct.tablet_ids.add(_elem433);
                }
                iprot.readListEnd();
              }
              struct.setTabletIdsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetTabletReplicaInfosRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tablet_ids != null) {
        oprot.writeFieldBegin(TABLET_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.tablet_ids.size()));
          for (long _iter435 : struct.tablet_ids)
          {
            oprot.writeI64(_iter435);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetTabletReplicaInfosRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TGetTabletReplicaInfosRequestTupleScheme getScheme() {
      return new TGetTabletReplicaInfosRequestTupleScheme();
    }
  }

  private static class TGetTabletReplicaInfosRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetTabletReplicaInfosRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetTabletReplicaInfosRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tablet_ids.size());
        for (long _iter436 : struct.tablet_ids)
        {
          oprot.writeI64(_iter436);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetTabletReplicaInfosRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list437 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
        struct.tablet_ids = new java.util.ArrayList<java.lang.Long>(_list437.size);
        long _elem438;
        for (int _i439 = 0; _i439 < _list437.size; ++_i439)
        {
          _elem438 = iprot.readI64();
          struct.tablet_ids.add(_elem438);
        }
      }
      struct.setTabletIdsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

