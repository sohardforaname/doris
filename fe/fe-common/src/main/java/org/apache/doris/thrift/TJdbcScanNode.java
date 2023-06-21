/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TJdbcScanNode implements org.apache.thrift.TBase<TJdbcScanNode, TJdbcScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TJdbcScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJdbcScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("query_string", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("table_type", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TJdbcScanNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TJdbcScanNodeTupleSchemeFactory();

  public int tuple_id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String table_name; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String query_string; // optional
  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOdbcTableType table_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    TABLE_NAME((short)2, "table_name"),
    QUERY_STRING((short)3, "query_string"),
    /**
     * 
     * @see org.apache.doris.thrift.TOdbcTableType
     */
    TABLE_TYPE((short)4, "table_type");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // QUERY_STRING
          return QUERY_STRING;
        case 4: // TABLE_TYPE
          return TABLE_TYPE;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TUPLE_ID,_Fields.TABLE_NAME,_Fields.QUERY_STRING,_Fields.TABLE_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY_STRING, new org.apache.thrift.meta_data.FieldMetaData("query_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("table_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TOdbcTableType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJdbcScanNode.class, metaDataMap);
  }

  public TJdbcScanNode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJdbcScanNode(TJdbcScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetTableName()) {
      this.table_name = other.table_name;
    }
    if (other.isSetQueryString()) {
      this.query_string = other.query_string;
    }
    if (other.isSetTableType()) {
      this.table_type = other.table_type;
    }
  }

  @Override
  public TJdbcScanNode deepCopy() {
    return new TJdbcScanNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.table_name = null;
    this.query_string = null;
    this.table_type = null;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TJdbcScanNode setTupleId(int tuple_id) {
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    return this;
  }

  public void unsetTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.table_name;
  }

  public TJdbcScanNode setTableName(@org.apache.thrift.annotation.Nullable java.lang.String table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTableName() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.table_name != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getQueryString() {
    return this.query_string;
  }

  public TJdbcScanNode setQueryString(@org.apache.thrift.annotation.Nullable java.lang.String query_string) {
    this.query_string = query_string;
    return this;
  }

  public void unsetQueryString() {
    this.query_string = null;
  }

  /** Returns true if field query_string is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryString() {
    return this.query_string != null;
  }

  public void setQueryStringIsSet(boolean value) {
    if (!value) {
      this.query_string = null;
    }
  }

  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TOdbcTableType getTableType() {
    return this.table_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  public TJdbcScanNode setTableType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOdbcTableType table_type) {
    this.table_type = table_type;
    return this;
  }

  public void unsetTableType() {
    this.table_type = null;
  }

  /** Returns true if field table_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTableType() {
    return this.table_type != null;
  }

  public void setTableTypeIsSet(boolean value) {
    if (!value) {
      this.table_type = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case QUERY_STRING:
      if (value == null) {
        unsetQueryString();
      } else {
        setQueryString((java.lang.String)value);
      }
      break;

    case TABLE_TYPE:
      if (value == null) {
        unsetTableType();
      } else {
        setTableType((org.apache.doris.thrift.TOdbcTableType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case TABLE_NAME:
      return getTableName();

    case QUERY_STRING:
      return getQueryString();

    case TABLE_TYPE:
      return getTableType();

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
    case TUPLE_ID:
      return isSetTupleId();
    case TABLE_NAME:
      return isSetTableName();
    case QUERY_STRING:
      return isSetQueryString();
    case TABLE_TYPE:
      return isSetTableType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TJdbcScanNode)
      return this.equals((TJdbcScanNode)that);
    return false;
  }

  public boolean equals(TJdbcScanNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true && this.isSetTupleId();
    boolean that_present_tuple_id = true && that.isSetTupleId();
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_query_string = true && this.isSetQueryString();
    boolean that_present_query_string = true && that.isSetQueryString();
    if (this_present_query_string || that_present_query_string) {
      if (!(this_present_query_string && that_present_query_string))
        return false;
      if (!this.query_string.equals(that.query_string))
        return false;
    }

    boolean this_present_table_type = true && this.isSetTableType();
    boolean that_present_table_type = true && that.isSetTableType();
    if (this_present_table_type || that_present_table_type) {
      if (!(this_present_table_type && that_present_table_type))
        return false;
      if (!this.table_type.equals(that.table_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTupleId()) ? 131071 : 524287);
    if (isSetTupleId())
      hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryString()) ? 131071 : 524287);
    if (isSetQueryString())
      hashCode = hashCode * 8191 + query_string.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableType()) ? 131071 : 524287);
    if (isSetTableType())
      hashCode = hashCode * 8191 + table_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TJdbcScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTupleId(), other.isSetTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryString(), other.isSetQueryString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_string, other.query_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableType(), other.isSetTableType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_type, other.table_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TJdbcScanNode(");
    boolean first = true;

    if (isSetTupleId()) {
      sb.append("tuple_id:");
      sb.append(this.tuple_id);
      first = false;
    }
    if (isSetTableName()) {
      if (!first) sb.append(", ");
      sb.append("table_name:");
      if (this.table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.table_name);
      }
      first = false;
    }
    if (isSetQueryString()) {
      if (!first) sb.append(", ");
      sb.append("query_string:");
      if (this.query_string == null) {
        sb.append("null");
      } else {
        sb.append(this.query_string);
      }
      first = false;
    }
    if (isSetTableType()) {
      if (!first) sb.append(", ");
      sb.append("table_type:");
      if (this.table_type == null) {
        sb.append("null");
      } else {
        sb.append(this.table_type);
      }
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

  private static class TJdbcScanNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TJdbcScanNodeStandardScheme getScheme() {
      return new TJdbcScanNodeStandardScheme();
    }
  }

  private static class TJdbcScanNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TJdbcScanNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TJdbcScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUERY_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.query_string = iprot.readString();
              struct.setQueryStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.table_type = org.apache.doris.thrift.TOdbcTableType.findByValue(iprot.readI32());
              struct.setTableTypeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TJdbcScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTupleId()) {
        oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
        oprot.writeI32(struct.tuple_id);
        oprot.writeFieldEnd();
      }
      if (struct.table_name != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.table_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.query_string != null) {
        if (struct.isSetQueryString()) {
          oprot.writeFieldBegin(QUERY_STRING_FIELD_DESC);
          oprot.writeString(struct.query_string);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table_type != null) {
        if (struct.isSetTableType()) {
          oprot.writeFieldBegin(TABLE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.table_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJdbcScanNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TJdbcScanNodeTupleScheme getScheme() {
      return new TJdbcScanNodeTupleScheme();
    }
  }

  private static class TJdbcScanNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TJdbcScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJdbcScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTupleId()) {
        optionals.set(0);
      }
      if (struct.isSetTableName()) {
        optionals.set(1);
      }
      if (struct.isSetQueryString()) {
        optionals.set(2);
      }
      if (struct.isSetTableType()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTupleId()) {
        oprot.writeI32(struct.tuple_id);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.table_name);
      }
      if (struct.isSetQueryString()) {
        oprot.writeString(struct.query_string);
      }
      if (struct.isSetTableType()) {
        oprot.writeI32(struct.table_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJdbcScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tuple_id = iprot.readI32();
        struct.setTupleIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_name = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.query_string = iprot.readString();
        struct.setQueryStringIsSet(true);
      }
      if (incoming.get(3)) {
        struct.table_type = org.apache.doris.thrift.TOdbcTableType.findByValue(iprot.readI32());
        struct.setTableTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

