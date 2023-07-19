/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TCreateDbParams implements org.apache.thrift.TBase<TCreateDbParams, TCreateDbParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateDbParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateDbParams");

  private static final org.apache.thrift.protocol.TField DATABASE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("database_name", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCreateDbParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCreateDbParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String database_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATABASE_NAME((short)1, "database_name");

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
        case 1: // DATABASE_NAME
          return DATABASE_NAME;
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
    tmpMap.put(_Fields.DATABASE_NAME, new org.apache.thrift.meta_data.FieldMetaData("database_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateDbParams.class, metaDataMap);
  }

  public TCreateDbParams() {
  }

  public TCreateDbParams(
    java.lang.String database_name)
  {
    this();
    this.database_name = database_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateDbParams(TCreateDbParams other) {
    if (other.isSetDatabaseName()) {
      this.database_name = other.database_name;
    }
  }

  @Override
  public TCreateDbParams deepCopy() {
    return new TCreateDbParams(this);
  }

  @Override
  public void clear() {
    this.database_name = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDatabaseName() {
    return this.database_name;
  }

  public TCreateDbParams setDatabaseName(@org.apache.thrift.annotation.Nullable java.lang.String database_name) {
    this.database_name = database_name;
    return this;
  }

  public void unsetDatabaseName() {
    this.database_name = null;
  }

  /** Returns true if field database_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabaseName() {
    return this.database_name != null;
  }

  public void setDatabaseNameIsSet(boolean value) {
    if (!value) {
      this.database_name = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DATABASE_NAME:
      if (value == null) {
        unsetDatabaseName();
      } else {
        setDatabaseName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATABASE_NAME:
      return getDatabaseName();

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
    case DATABASE_NAME:
      return isSetDatabaseName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCreateDbParams)
      return this.equals((TCreateDbParams)that);
    return false;
  }

  public boolean equals(TCreateDbParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_database_name = true && this.isSetDatabaseName();
    boolean that_present_database_name = true && that.isSetDatabaseName();
    if (this_present_database_name || that_present_database_name) {
      if (!(this_present_database_name && that_present_database_name))
        return false;
      if (!this.database_name.equals(that.database_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDatabaseName()) ? 131071 : 524287);
    if (isSetDatabaseName())
      hashCode = hashCode * 8191 + database_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCreateDbParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDatabaseName(), other.isSetDatabaseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabaseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database_name, other.database_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCreateDbParams(");
    boolean first = true;

    sb.append("database_name:");
    if (this.database_name == null) {
      sb.append("null");
    } else {
      sb.append(this.database_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (database_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'database_name' was not present! Struct: " + toString());
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

  private static class TCreateDbParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCreateDbParamsStandardScheme getScheme() {
      return new TCreateDbParamsStandardScheme();
    }
  }

  private static class TCreateDbParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCreateDbParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateDbParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATABASE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database_name = iprot.readString();
              struct.setDatabaseNameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateDbParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.database_name != null) {
        oprot.writeFieldBegin(DATABASE_NAME_FIELD_DESC);
        oprot.writeString(struct.database_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateDbParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TCreateDbParamsTupleScheme getScheme() {
      return new TCreateDbParamsTupleScheme();
    }
  }

  private static class TCreateDbParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCreateDbParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateDbParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.database_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateDbParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.database_name = iprot.readString();
      struct.setDatabaseNameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

