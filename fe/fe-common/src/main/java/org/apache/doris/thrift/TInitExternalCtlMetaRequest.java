/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TInitExternalCtlMetaRequest implements org.apache.thrift.TBase<TInitExternalCtlMetaRequest, TInitExternalCtlMetaRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TInitExternalCtlMetaRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInitExternalCtlMetaRequest");

  private static final org.apache.thrift.protocol.TField CATALOG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalogId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dbId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tableId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TInitExternalCtlMetaRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TInitExternalCtlMetaRequestTupleSchemeFactory();

  public long catalogId; // optional
  public long dbId; // optional
  public long tableId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATALOG_ID((short)1, "catalogId"),
    DB_ID((short)2, "dbId"),
    TABLE_ID((short)3, "tableId");

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
        case 1: // CATALOG_ID
          return CATALOG_ID;
        case 2: // DB_ID
          return DB_ID;
        case 3: // TABLE_ID
          return TABLE_ID;
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
  private static final int __CATALOGID_ISSET_ID = 0;
  private static final int __DBID_ISSET_ID = 1;
  private static final int __TABLEID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CATALOG_ID,_Fields.DB_ID,_Fields.TABLE_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATALOG_ID, new org.apache.thrift.meta_data.FieldMetaData("catalogId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DB_ID, new org.apache.thrift.meta_data.FieldMetaData("dbId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tableId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInitExternalCtlMetaRequest.class, metaDataMap);
  }

  public TInitExternalCtlMetaRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInitExternalCtlMetaRequest(TInitExternalCtlMetaRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.catalogId = other.catalogId;
    this.dbId = other.dbId;
    this.tableId = other.tableId;
  }

  @Override
  public TInitExternalCtlMetaRequest deepCopy() {
    return new TInitExternalCtlMetaRequest(this);
  }

  @Override
  public void clear() {
    setCatalogIdIsSet(false);
    this.catalogId = 0;
    setDbIdIsSet(false);
    this.dbId = 0;
    setTableIdIsSet(false);
    this.tableId = 0;
  }

  public long getCatalogId() {
    return this.catalogId;
  }

  public TInitExternalCtlMetaRequest setCatalogId(long catalogId) {
    this.catalogId = catalogId;
    setCatalogIdIsSet(true);
    return this;
  }

  public void unsetCatalogId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CATALOGID_ISSET_ID);
  }

  /** Returns true if field catalogId is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalogId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CATALOGID_ISSET_ID);
  }

  public void setCatalogIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CATALOGID_ISSET_ID, value);
  }

  public long getDbId() {
    return this.dbId;
  }

  public TInitExternalCtlMetaRequest setDbId(long dbId) {
    this.dbId = dbId;
    setDbIdIsSet(true);
    return this;
  }

  public void unsetDbId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DBID_ISSET_ID);
  }

  /** Returns true if field dbId is set (has been assigned a value) and false otherwise */
  public boolean isSetDbId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DBID_ISSET_ID);
  }

  public void setDbIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DBID_ISSET_ID, value);
  }

  public long getTableId() {
    return this.tableId;
  }

  public TInitExternalCtlMetaRequest setTableId(long tableId) {
    this.tableId = tableId;
    setTableIdIsSet(true);
    return this;
  }

  public void unsetTableId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLEID_ISSET_ID);
  }

  /** Returns true if field tableId is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLEID_ISSET_ID);
  }

  public void setTableIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLEID_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CATALOG_ID:
      if (value == null) {
        unsetCatalogId();
      } else {
        setCatalogId((java.lang.Long)value);
      }
      break;

    case DB_ID:
      if (value == null) {
        unsetDbId();
      } else {
        setDbId((java.lang.Long)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CATALOG_ID:
      return getCatalogId();

    case DB_ID:
      return getDbId();

    case TABLE_ID:
      return getTableId();

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
    case CATALOG_ID:
      return isSetCatalogId();
    case DB_ID:
      return isSetDbId();
    case TABLE_ID:
      return isSetTableId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TInitExternalCtlMetaRequest)
      return this.equals((TInitExternalCtlMetaRequest)that);
    return false;
  }

  public boolean equals(TInitExternalCtlMetaRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_catalogId = true && this.isSetCatalogId();
    boolean that_present_catalogId = true && that.isSetCatalogId();
    if (this_present_catalogId || that_present_catalogId) {
      if (!(this_present_catalogId && that_present_catalogId))
        return false;
      if (this.catalogId != that.catalogId)
        return false;
    }

    boolean this_present_dbId = true && this.isSetDbId();
    boolean that_present_dbId = true && that.isSetDbId();
    if (this_present_dbId || that_present_dbId) {
      if (!(this_present_dbId && that_present_dbId))
        return false;
      if (this.dbId != that.dbId)
        return false;
    }

    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (this.tableId != that.tableId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCatalogId()) ? 131071 : 524287);
    if (isSetCatalogId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(catalogId);

    hashCode = hashCode * 8191 + ((isSetDbId()) ? 131071 : 524287);
    if (isSetDbId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(dbId);

    hashCode = hashCode * 8191 + ((isSetTableId()) ? 131071 : 524287);
    if (isSetTableId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tableId);

    return hashCode;
  }

  @Override
  public int compareTo(TInitExternalCtlMetaRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCatalogId(), other.isSetCatalogId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalogId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalogId, other.catalogId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbId(), other.isSetDbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbId, other.dbId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableId(), other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableId, other.tableId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TInitExternalCtlMetaRequest(");
    boolean first = true;

    if (isSetCatalogId()) {
      sb.append("catalogId:");
      sb.append(this.catalogId);
      first = false;
    }
    if (isSetDbId()) {
      if (!first) sb.append(", ");
      sb.append("dbId:");
      sb.append(this.dbId);
      first = false;
    }
    if (isSetTableId()) {
      if (!first) sb.append(", ");
      sb.append("tableId:");
      sb.append(this.tableId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TInitExternalCtlMetaRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInitExternalCtlMetaRequestStandardScheme getScheme() {
      return new TInitExternalCtlMetaRequestStandardScheme();
    }
  }

  private static class TInitExternalCtlMetaRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TInitExternalCtlMetaRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TInitExternalCtlMetaRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATALOG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.catalogId = iprot.readI64();
              struct.setCatalogIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dbId = iprot.readI64();
              struct.setDbIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tableId = iprot.readI64();
              struct.setTableIdIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TInitExternalCtlMetaRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCatalogId()) {
        oprot.writeFieldBegin(CATALOG_ID_FIELD_DESC);
        oprot.writeI64(struct.catalogId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDbId()) {
        oprot.writeFieldBegin(DB_ID_FIELD_DESC);
        oprot.writeI64(struct.dbId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTableId()) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeI64(struct.tableId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInitExternalCtlMetaRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TInitExternalCtlMetaRequestTupleScheme getScheme() {
      return new TInitExternalCtlMetaRequestTupleScheme();
    }
  }

  private static class TInitExternalCtlMetaRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TInitExternalCtlMetaRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInitExternalCtlMetaRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatalogId()) {
        optionals.set(0);
      }
      if (struct.isSetDbId()) {
        optionals.set(1);
      }
      if (struct.isSetTableId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCatalogId()) {
        oprot.writeI64(struct.catalogId);
      }
      if (struct.isSetDbId()) {
        oprot.writeI64(struct.dbId);
      }
      if (struct.isSetTableId()) {
        oprot.writeI64(struct.tableId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInitExternalCtlMetaRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.catalogId = iprot.readI64();
        struct.setCatalogIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dbId = iprot.readI64();
        struct.setDbIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tableId = iprot.readI64();
        struct.setTableIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

