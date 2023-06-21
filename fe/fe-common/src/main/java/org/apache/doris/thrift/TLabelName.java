/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TLabelName implements org.apache.thrift.TBase<TLabelName, TLabelName._Fields>, java.io.Serializable, Cloneable, Comparable<TLabelName> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLabelName");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOAD_LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("load_label", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLabelNameStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLabelNameTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String db_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String load_label; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "db_name"),
    LOAD_LABEL((short)2, "load_label");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // LOAD_LABEL
          return LOAD_LABEL;
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
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOAD_LABEL, new org.apache.thrift.meta_data.FieldMetaData("load_label", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLabelName.class, metaDataMap);
  }

  public TLabelName() {
  }

  public TLabelName(
    java.lang.String db_name,
    java.lang.String load_label)
  {
    this();
    this.db_name = db_name;
    this.load_label = load_label;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLabelName(TLabelName other) {
    if (other.isSetDbName()) {
      this.db_name = other.db_name;
    }
    if (other.isSetLoadLabel()) {
      this.load_label = other.load_label;
    }
  }

  @Override
  public TLabelName deepCopy() {
    return new TLabelName(this);
  }

  @Override
  public void clear() {
    this.db_name = null;
    this.load_label = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.db_name;
  }

  public TLabelName setDbName(@org.apache.thrift.annotation.Nullable java.lang.String db_name) {
    this.db_name = db_name;
    return this;
  }

  public void unsetDbName() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.db_name != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLoadLabel() {
    return this.load_label;
  }

  public TLabelName setLoadLabel(@org.apache.thrift.annotation.Nullable java.lang.String load_label) {
    this.load_label = load_label;
    return this;
  }

  public void unsetLoadLabel() {
    this.load_label = null;
  }

  /** Returns true if field load_label is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadLabel() {
    return this.load_label != null;
  }

  public void setLoadLabelIsSet(boolean value) {
    if (!value) {
      this.load_label = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case LOAD_LABEL:
      if (value == null) {
        unsetLoadLabel();
      } else {
        setLoadLabel((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case LOAD_LABEL:
      return getLoadLabel();

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
    case DB_NAME:
      return isSetDbName();
    case LOAD_LABEL:
      return isSetLoadLabel();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLabelName)
      return this.equals((TLabelName)that);
    return false;
  }

  public boolean equals(TLabelName that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_db_name = true && this.isSetDbName();
    boolean that_present_db_name = true && that.isSetDbName();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_load_label = true && this.isSetLoadLabel();
    boolean that_present_load_label = true && that.isSetLoadLabel();
    if (this_present_load_label || that_present_load_label) {
      if (!(this_present_load_label && that_present_load_label))
        return false;
      if (!this.load_label.equals(that.load_label))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + db_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetLoadLabel()) ? 131071 : 524287);
    if (isSetLoadLabel())
      hashCode = hashCode * 8191 + load_label.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TLabelName other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLoadLabel(), other.isSetLoadLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.load_label, other.load_label);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLabelName(");
    boolean first = true;

    sb.append("db_name:");
    if (this.db_name == null) {
      sb.append("null");
    } else {
      sb.append(this.db_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("load_label:");
    if (this.load_label == null) {
      sb.append("null");
    } else {
      sb.append(this.load_label);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (db_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db_name' was not present! Struct: " + toString());
    }
    if (load_label == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'load_label' was not present! Struct: " + toString());
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

  private static class TLabelNameStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLabelNameStandardScheme getScheme() {
      return new TLabelNameStandardScheme();
    }
  }

  private static class TLabelNameStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLabelName> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TLabelName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOAD_LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.load_label = iprot.readString();
              struct.setLoadLabelIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TLabelName struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db_name != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.db_name);
        oprot.writeFieldEnd();
      }
      if (struct.load_label != null) {
        oprot.writeFieldBegin(LOAD_LABEL_FIELD_DESC);
        oprot.writeString(struct.load_label);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLabelNameTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TLabelNameTupleScheme getScheme() {
      return new TLabelNameTupleScheme();
    }
  }

  private static class TLabelNameTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLabelName> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLabelName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.db_name);
      oprot.writeString(struct.load_label);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLabelName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.db_name = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.load_label = iprot.readString();
      struct.setLoadLabelIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

