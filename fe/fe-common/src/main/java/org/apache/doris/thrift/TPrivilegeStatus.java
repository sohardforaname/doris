/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TPrivilegeStatus implements org.apache.thrift.TBase<TPrivilegeStatus, TPrivilegeStatus._Fields>, java.io.Serializable, Cloneable, Comparable<TPrivilegeStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPrivilegeStatus");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PRIVILEGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("privilege_type", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GRANTEE_FIELD_DESC = new org.apache.thrift.protocol.TField("grantee", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("schema", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IS_GRANTABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_grantable", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPrivilegeStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPrivilegeStatusTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String table_name; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String privilege_type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String grantee; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String schema; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String is_grantable; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
    PRIVILEGE_TYPE((short)2, "privilege_type"),
    GRANTEE((short)3, "grantee"),
    SCHEMA((short)4, "schema"),
    IS_GRANTABLE((short)5, "is_grantable");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // PRIVILEGE_TYPE
          return PRIVILEGE_TYPE;
        case 3: // GRANTEE
          return GRANTEE;
        case 4: // SCHEMA
          return SCHEMA;
        case 5: // IS_GRANTABLE
          return IS_GRANTABLE;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.PRIVILEGE_TYPE,_Fields.GRANTEE,_Fields.SCHEMA,_Fields.IS_GRANTABLE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIVILEGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("privilege_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GRANTEE, new org.apache.thrift.meta_data.FieldMetaData("grantee", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("schema", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_GRANTABLE, new org.apache.thrift.meta_data.FieldMetaData("is_grantable", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPrivilegeStatus.class, metaDataMap);
  }

  public TPrivilegeStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPrivilegeStatus(TPrivilegeStatus other) {
    if (other.isSetTableName()) {
      this.table_name = other.table_name;
    }
    if (other.isSetPrivilegeType()) {
      this.privilege_type = other.privilege_type;
    }
    if (other.isSetGrantee()) {
      this.grantee = other.grantee;
    }
    if (other.isSetSchema()) {
      this.schema = other.schema;
    }
    if (other.isSetIsGrantable()) {
      this.is_grantable = other.is_grantable;
    }
  }

  @Override
  public TPrivilegeStatus deepCopy() {
    return new TPrivilegeStatus(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.privilege_type = null;
    this.grantee = null;
    this.schema = null;
    this.is_grantable = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.table_name;
  }

  public TPrivilegeStatus setTableName(@org.apache.thrift.annotation.Nullable java.lang.String table_name) {
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
  public java.lang.String getPrivilegeType() {
    return this.privilege_type;
  }

  public TPrivilegeStatus setPrivilegeType(@org.apache.thrift.annotation.Nullable java.lang.String privilege_type) {
    this.privilege_type = privilege_type;
    return this;
  }

  public void unsetPrivilegeType() {
    this.privilege_type = null;
  }

  /** Returns true if field privilege_type is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivilegeType() {
    return this.privilege_type != null;
  }

  public void setPrivilegeTypeIsSet(boolean value) {
    if (!value) {
      this.privilege_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getGrantee() {
    return this.grantee;
  }

  public TPrivilegeStatus setGrantee(@org.apache.thrift.annotation.Nullable java.lang.String grantee) {
    this.grantee = grantee;
    return this;
  }

  public void unsetGrantee() {
    this.grantee = null;
  }

  /** Returns true if field grantee is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantee() {
    return this.grantee != null;
  }

  public void setGranteeIsSet(boolean value) {
    if (!value) {
      this.grantee = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSchema() {
    return this.schema;
  }

  public TPrivilegeStatus setSchema(@org.apache.thrift.annotation.Nullable java.lang.String schema) {
    this.schema = schema;
    return this;
  }

  public void unsetSchema() {
    this.schema = null;
  }

  /** Returns true if field schema is set (has been assigned a value) and false otherwise */
  public boolean isSetSchema() {
    return this.schema != null;
  }

  public void setSchemaIsSet(boolean value) {
    if (!value) {
      this.schema = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIsGrantable() {
    return this.is_grantable;
  }

  public TPrivilegeStatus setIsGrantable(@org.apache.thrift.annotation.Nullable java.lang.String is_grantable) {
    this.is_grantable = is_grantable;
    return this;
  }

  public void unsetIsGrantable() {
    this.is_grantable = null;
  }

  /** Returns true if field is_grantable is set (has been assigned a value) and false otherwise */
  public boolean isSetIsGrantable() {
    return this.is_grantable != null;
  }

  public void setIsGrantableIsSet(boolean value) {
    if (!value) {
      this.is_grantable = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case PRIVILEGE_TYPE:
      if (value == null) {
        unsetPrivilegeType();
      } else {
        setPrivilegeType((java.lang.String)value);
      }
      break;

    case GRANTEE:
      if (value == null) {
        unsetGrantee();
      } else {
        setGrantee((java.lang.String)value);
      }
      break;

    case SCHEMA:
      if (value == null) {
        unsetSchema();
      } else {
        setSchema((java.lang.String)value);
      }
      break;

    case IS_GRANTABLE:
      if (value == null) {
        unsetIsGrantable();
      } else {
        setIsGrantable((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case PRIVILEGE_TYPE:
      return getPrivilegeType();

    case GRANTEE:
      return getGrantee();

    case SCHEMA:
      return getSchema();

    case IS_GRANTABLE:
      return getIsGrantable();

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
    case TABLE_NAME:
      return isSetTableName();
    case PRIVILEGE_TYPE:
      return isSetPrivilegeType();
    case GRANTEE:
      return isSetGrantee();
    case SCHEMA:
      return isSetSchema();
    case IS_GRANTABLE:
      return isSetIsGrantable();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPrivilegeStatus)
      return this.equals((TPrivilegeStatus)that);
    return false;
  }

  public boolean equals(TPrivilegeStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_privilege_type = true && this.isSetPrivilegeType();
    boolean that_present_privilege_type = true && that.isSetPrivilegeType();
    if (this_present_privilege_type || that_present_privilege_type) {
      if (!(this_present_privilege_type && that_present_privilege_type))
        return false;
      if (!this.privilege_type.equals(that.privilege_type))
        return false;
    }

    boolean this_present_grantee = true && this.isSetGrantee();
    boolean that_present_grantee = true && that.isSetGrantee();
    if (this_present_grantee || that_present_grantee) {
      if (!(this_present_grantee && that_present_grantee))
        return false;
      if (!this.grantee.equals(that.grantee))
        return false;
    }

    boolean this_present_schema = true && this.isSetSchema();
    boolean that_present_schema = true && that.isSetSchema();
    if (this_present_schema || that_present_schema) {
      if (!(this_present_schema && that_present_schema))
        return false;
      if (!this.schema.equals(that.schema))
        return false;
    }

    boolean this_present_is_grantable = true && this.isSetIsGrantable();
    boolean that_present_is_grantable = true && that.isSetIsGrantable();
    if (this_present_is_grantable || that_present_is_grantable) {
      if (!(this_present_is_grantable && that_present_is_grantable))
        return false;
      if (!this.is_grantable.equals(that.is_grantable))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrivilegeType()) ? 131071 : 524287);
    if (isSetPrivilegeType())
      hashCode = hashCode * 8191 + privilege_type.hashCode();

    hashCode = hashCode * 8191 + ((isSetGrantee()) ? 131071 : 524287);
    if (isSetGrantee())
      hashCode = hashCode * 8191 + grantee.hashCode();

    hashCode = hashCode * 8191 + ((isSetSchema()) ? 131071 : 524287);
    if (isSetSchema())
      hashCode = hashCode * 8191 + schema.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsGrantable()) ? 131071 : 524287);
    if (isSetIsGrantable())
      hashCode = hashCode * 8191 + is_grantable.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPrivilegeStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetPrivilegeType(), other.isSetPrivilegeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivilegeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privilege_type, other.privilege_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetGrantee(), other.isSetGrantee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantee, other.grantee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchema(), other.isSetSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema, other.schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsGrantable(), other.isSetIsGrantable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsGrantable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_grantable, other.is_grantable);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPrivilegeStatus(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("table_name:");
      if (this.table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.table_name);
      }
      first = false;
    }
    if (isSetPrivilegeType()) {
      if (!first) sb.append(", ");
      sb.append("privilege_type:");
      if (this.privilege_type == null) {
        sb.append("null");
      } else {
        sb.append(this.privilege_type);
      }
      first = false;
    }
    if (isSetGrantee()) {
      if (!first) sb.append(", ");
      sb.append("grantee:");
      if (this.grantee == null) {
        sb.append("null");
      } else {
        sb.append(this.grantee);
      }
      first = false;
    }
    if (isSetSchema()) {
      if (!first) sb.append(", ");
      sb.append("schema:");
      if (this.schema == null) {
        sb.append("null");
      } else {
        sb.append(this.schema);
      }
      first = false;
    }
    if (isSetIsGrantable()) {
      if (!first) sb.append(", ");
      sb.append("is_grantable:");
      if (this.is_grantable == null) {
        sb.append("null");
      } else {
        sb.append(this.is_grantable);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPrivilegeStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPrivilegeStatusStandardScheme getScheme() {
      return new TPrivilegeStatusStandardScheme();
    }
  }

  private static class TPrivilegeStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPrivilegeStatus> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPrivilegeStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRIVILEGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privilege_type = iprot.readString();
              struct.setPrivilegeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GRANTEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.grantee = iprot.readString();
              struct.setGranteeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.schema = iprot.readString();
              struct.setSchemaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_GRANTABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.is_grantable = iprot.readString();
              struct.setIsGrantableIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPrivilegeStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.table_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.privilege_type != null) {
        if (struct.isSetPrivilegeType()) {
          oprot.writeFieldBegin(PRIVILEGE_TYPE_FIELD_DESC);
          oprot.writeString(struct.privilege_type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.grantee != null) {
        if (struct.isSetGrantee()) {
          oprot.writeFieldBegin(GRANTEE_FIELD_DESC);
          oprot.writeString(struct.grantee);
          oprot.writeFieldEnd();
        }
      }
      if (struct.schema != null) {
        if (struct.isSetSchema()) {
          oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
          oprot.writeString(struct.schema);
          oprot.writeFieldEnd();
        }
      }
      if (struct.is_grantable != null) {
        if (struct.isSetIsGrantable()) {
          oprot.writeFieldBegin(IS_GRANTABLE_FIELD_DESC);
          oprot.writeString(struct.is_grantable);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPrivilegeStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPrivilegeStatusTupleScheme getScheme() {
      return new TPrivilegeStatusTupleScheme();
    }
  }

  private static class TPrivilegeStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPrivilegeStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPrivilegeStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetPrivilegeType()) {
        optionals.set(1);
      }
      if (struct.isSetGrantee()) {
        optionals.set(2);
      }
      if (struct.isSetSchema()) {
        optionals.set(3);
      }
      if (struct.isSetIsGrantable()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.table_name);
      }
      if (struct.isSetPrivilegeType()) {
        oprot.writeString(struct.privilege_type);
      }
      if (struct.isSetGrantee()) {
        oprot.writeString(struct.grantee);
      }
      if (struct.isSetSchema()) {
        oprot.writeString(struct.schema);
      }
      if (struct.isSetIsGrantable()) {
        oprot.writeString(struct.is_grantable);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPrivilegeStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.table_name = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.privilege_type = iprot.readString();
        struct.setPrivilegeTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.grantee = iprot.readString();
        struct.setGranteeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.schema = iprot.readString();
        struct.setSchemaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.is_grantable = iprot.readString();
        struct.setIsGrantableIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

