/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TFetchSchemaTableDataRequest implements org.apache.thrift.TBase<TFetchSchemaTableDataRequest, TFetchSchemaTableDataRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TFetchSchemaTableDataRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFetchSchemaTableDataRequest");

  private static final org.apache.thrift.protocol.TField CLUSTER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEMA_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("schema_table_name", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField METADA_TABLE_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("metada_table_params", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFetchSchemaTableDataRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFetchSchemaTableDataRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String cluster_name; // optional
  /**
   * 
   * @see TSchemaTableName
   */
  public @org.apache.thrift.annotation.Nullable TSchemaTableName schema_table_name; // optional
  public @org.apache.thrift.annotation.Nullable TMetadataTableRequestParams metada_table_params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER_NAME((short)1, "cluster_name"),
    /**
     * 
     * @see TSchemaTableName
     */
    SCHEMA_TABLE_NAME((short)2, "schema_table_name"),
    METADA_TABLE_PARAMS((short)3, "metada_table_params");

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
        case 1: // CLUSTER_NAME
          return CLUSTER_NAME;
        case 2: // SCHEMA_TABLE_NAME
          return SCHEMA_TABLE_NAME;
        case 3: // METADA_TABLE_PARAMS
          return METADA_TABLE_PARAMS;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER_NAME,_Fields.SCHEMA_TABLE_NAME,_Fields.METADA_TABLE_PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_NAME, new org.apache.thrift.meta_data.FieldMetaData("cluster_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEMA_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("schema_table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TSchemaTableName.class)));
    tmpMap.put(_Fields.METADA_TABLE_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("metada_table_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMetadataTableRequestParams.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFetchSchemaTableDataRequest.class, metaDataMap);
  }

  public TFetchSchemaTableDataRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFetchSchemaTableDataRequest(TFetchSchemaTableDataRequest other) {
    if (other.isSetClusterName()) {
      this.cluster_name = other.cluster_name;
    }
    if (other.isSetSchemaTableName()) {
      this.schema_table_name = other.schema_table_name;
    }
    if (other.isSetMetadaTableParams()) {
      this.metada_table_params = new TMetadataTableRequestParams(other.metada_table_params);
    }
  }

  @Override
  public TFetchSchemaTableDataRequest deepCopy() {
    return new TFetchSchemaTableDataRequest(this);
  }

  @Override
  public void clear() {
    this.cluster_name = null;
    this.schema_table_name = null;
    this.metada_table_params = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getClusterName() {
    return this.cluster_name;
  }

  public TFetchSchemaTableDataRequest setClusterName(@org.apache.thrift.annotation.Nullable java.lang.String cluster_name) {
    this.cluster_name = cluster_name;
    return this;
  }

  public void unsetClusterName() {
    this.cluster_name = null;
  }

  /** Returns true if field cluster_name is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterName() {
    return this.cluster_name != null;
  }

  public void setClusterNameIsSet(boolean value) {
    if (!value) {
      this.cluster_name = null;
    }
  }

  /**
   * 
   * @see TSchemaTableName
   */
  @org.apache.thrift.annotation.Nullable
  public TSchemaTableName getSchemaTableName() {
    return this.schema_table_name;
  }

  /**
   * 
   * @see TSchemaTableName
   */
  public TFetchSchemaTableDataRequest setSchemaTableName(@org.apache.thrift.annotation.Nullable TSchemaTableName schema_table_name) {
    this.schema_table_name = schema_table_name;
    return this;
  }

  public void unsetSchemaTableName() {
    this.schema_table_name = null;
  }

  /** Returns true if field schema_table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaTableName() {
    return this.schema_table_name != null;
  }

  public void setSchemaTableNameIsSet(boolean value) {
    if (!value) {
      this.schema_table_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TMetadataTableRequestParams getMetadaTableParams() {
    return this.metada_table_params;
  }

  public TFetchSchemaTableDataRequest setMetadaTableParams(@org.apache.thrift.annotation.Nullable TMetadataTableRequestParams metada_table_params) {
    this.metada_table_params = metada_table_params;
    return this;
  }

  public void unsetMetadaTableParams() {
    this.metada_table_params = null;
  }

  /** Returns true if field metada_table_params is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadaTableParams() {
    return this.metada_table_params != null;
  }

  public void setMetadaTableParamsIsSet(boolean value) {
    if (!value) {
      this.metada_table_params = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CLUSTER_NAME:
      if (value == null) {
        unsetClusterName();
      } else {
        setClusterName((java.lang.String)value);
      }
      break;

    case SCHEMA_TABLE_NAME:
      if (value == null) {
        unsetSchemaTableName();
      } else {
        setSchemaTableName((TSchemaTableName)value);
      }
      break;

    case METADA_TABLE_PARAMS:
      if (value == null) {
        unsetMetadaTableParams();
      } else {
        setMetadaTableParams((TMetadataTableRequestParams)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_NAME:
      return getClusterName();

    case SCHEMA_TABLE_NAME:
      return getSchemaTableName();

    case METADA_TABLE_PARAMS:
      return getMetadaTableParams();

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
    case CLUSTER_NAME:
      return isSetClusterName();
    case SCHEMA_TABLE_NAME:
      return isSetSchemaTableName();
    case METADA_TABLE_PARAMS:
      return isSetMetadaTableParams();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFetchSchemaTableDataRequest)
      return this.equals((TFetchSchemaTableDataRequest)that);
    return false;
  }

  public boolean equals(TFetchSchemaTableDataRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cluster_name = true && this.isSetClusterName();
    boolean that_present_cluster_name = true && that.isSetClusterName();
    if (this_present_cluster_name || that_present_cluster_name) {
      if (!(this_present_cluster_name && that_present_cluster_name))
        return false;
      if (!this.cluster_name.equals(that.cluster_name))
        return false;
    }

    boolean this_present_schema_table_name = true && this.isSetSchemaTableName();
    boolean that_present_schema_table_name = true && that.isSetSchemaTableName();
    if (this_present_schema_table_name || that_present_schema_table_name) {
      if (!(this_present_schema_table_name && that_present_schema_table_name))
        return false;
      if (!this.schema_table_name.equals(that.schema_table_name))
        return false;
    }

    boolean this_present_metada_table_params = true && this.isSetMetadaTableParams();
    boolean that_present_metada_table_params = true && that.isSetMetadaTableParams();
    if (this_present_metada_table_params || that_present_metada_table_params) {
      if (!(this_present_metada_table_params && that_present_metada_table_params))
        return false;
      if (!this.metada_table_params.equals(that.metada_table_params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetClusterName()) ? 131071 : 524287);
    if (isSetClusterName())
      hashCode = hashCode * 8191 + cluster_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetSchemaTableName()) ? 131071 : 524287);
    if (isSetSchemaTableName())
      hashCode = hashCode * 8191 + schema_table_name.getValue();

    hashCode = hashCode * 8191 + ((isSetMetadaTableParams()) ? 131071 : 524287);
    if (isSetMetadaTableParams())
      hashCode = hashCode * 8191 + metada_table_params.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFetchSchemaTableDataRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetClusterName(), other.isSetClusterName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster_name, other.cluster_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchemaTableName(), other.isSetSchemaTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema_table_name, other.schema_table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMetadaTableParams(), other.isSetMetadaTableParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadaTableParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metada_table_params, other.metada_table_params);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFetchSchemaTableDataRequest(");
    boolean first = true;

    if (isSetClusterName()) {
      sb.append("cluster_name:");
      if (this.cluster_name == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster_name);
      }
      first = false;
    }
    if (isSetSchemaTableName()) {
      if (!first) sb.append(", ");
      sb.append("schema_table_name:");
      if (this.schema_table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.schema_table_name);
      }
      first = false;
    }
    if (isSetMetadaTableParams()) {
      if (!first) sb.append(", ");
      sb.append("metada_table_params:");
      if (this.metada_table_params == null) {
        sb.append("null");
      } else {
        sb.append(this.metada_table_params);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (metada_table_params != null) {
      metada_table_params.validate();
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

  private static class TFetchSchemaTableDataRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchSchemaTableDataRequestStandardScheme getScheme() {
      return new TFetchSchemaTableDataRequestStandardScheme();
    }
  }

  private static class TFetchSchemaTableDataRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFetchSchemaTableDataRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchSchemaTableDataRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cluster_name = iprot.readString();
              struct.setClusterNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHEMA_TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schema_table_name = org.apache.doris.thrift.TSchemaTableName.findByValue(iprot.readI32());
              struct.setSchemaTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METADA_TABLE_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metada_table_params = new TMetadataTableRequestParams();
              struct.metada_table_params.read(iprot);
              struct.setMetadaTableParamsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchSchemaTableDataRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cluster_name != null) {
        if (struct.isSetClusterName()) {
          oprot.writeFieldBegin(CLUSTER_NAME_FIELD_DESC);
          oprot.writeString(struct.cluster_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.schema_table_name != null) {
        if (struct.isSetSchemaTableName()) {
          oprot.writeFieldBegin(SCHEMA_TABLE_NAME_FIELD_DESC);
          oprot.writeI32(struct.schema_table_name.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.metada_table_params != null) {
        if (struct.isSetMetadaTableParams()) {
          oprot.writeFieldBegin(METADA_TABLE_PARAMS_FIELD_DESC);
          struct.metada_table_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFetchSchemaTableDataRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchSchemaTableDataRequestTupleScheme getScheme() {
      return new TFetchSchemaTableDataRequestTupleScheme();
    }
  }

  private static class TFetchSchemaTableDataRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFetchSchemaTableDataRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchSchemaTableDataRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClusterName()) {
        optionals.set(0);
      }
      if (struct.isSetSchemaTableName()) {
        optionals.set(1);
      }
      if (struct.isSetMetadaTableParams()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetClusterName()) {
        oprot.writeString(struct.cluster_name);
      }
      if (struct.isSetSchemaTableName()) {
        oprot.writeI32(struct.schema_table_name.getValue());
      }
      if (struct.isSetMetadaTableParams()) {
        struct.metada_table_params.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchSchemaTableDataRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.cluster_name = iprot.readString();
        struct.setClusterNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.schema_table_name = org.apache.doris.thrift.TSchemaTableName.findByValue(iprot.readI32());
        struct.setSchemaTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.metada_table_params = new TMetadataTableRequestParams();
        struct.metada_table_params.read(iprot);
        struct.setMetadaTableParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

