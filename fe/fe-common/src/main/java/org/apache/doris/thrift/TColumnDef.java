/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TColumnDef implements org.apache.thrift.TBase<TColumnDef, TColumnDef._Fields>, java.io.Serializable, Cloneable, Comparable<TColumnDef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumnDef");

  private static final org.apache.thrift.protocol.TField COLUMN_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("columnDesc", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TColumnDefStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TColumnDefTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TColumnDesc columnDesc; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String comment; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_DESC((short)1, "columnDesc"),
    COMMENT((short)2, "comment");

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
        case 1: // COLUMN_DESC
          return COLUMN_DESC;
        case 2: // COMMENT
          return COMMENT;
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
  private static final _Fields optionals[] = {_Fields.COMMENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_DESC, new org.apache.thrift.meta_data.FieldMetaData("columnDesc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnDesc.class)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumnDef.class, metaDataMap);
  }

  public TColumnDef() {
  }

  public TColumnDef(
    TColumnDesc columnDesc)
  {
    this();
    this.columnDesc = columnDesc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumnDef(TColumnDef other) {
    if (other.isSetColumnDesc()) {
      this.columnDesc = new TColumnDesc(other.columnDesc);
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
  }

  @Override
  public TColumnDef deepCopy() {
    return new TColumnDef(this);
  }

  @Override
  public void clear() {
    this.columnDesc = null;
    this.comment = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TColumnDesc getColumnDesc() {
    return this.columnDesc;
  }

  public TColumnDef setColumnDesc(@org.apache.thrift.annotation.Nullable TColumnDesc columnDesc) {
    this.columnDesc = columnDesc;
    return this;
  }

  public void unsetColumnDesc() {
    this.columnDesc = null;
  }

  /** Returns true if field columnDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnDesc() {
    return this.columnDesc != null;
  }

  public void setColumnDescIsSet(boolean value) {
    if (!value) {
      this.columnDesc = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getComment() {
    return this.comment;
  }

  public TColumnDef setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN_DESC:
      if (value == null) {
        unsetColumnDesc();
      } else {
        setColumnDesc((TColumnDesc)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_DESC:
      return getColumnDesc();

    case COMMENT:
      return getComment();

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
    case COLUMN_DESC:
      return isSetColumnDesc();
    case COMMENT:
      return isSetComment();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TColumnDef)
      return this.equals((TColumnDef)that);
    return false;
  }

  public boolean equals(TColumnDef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_columnDesc = true && this.isSetColumnDesc();
    boolean that_present_columnDesc = true && that.isSetColumnDesc();
    if (this_present_columnDesc || that_present_columnDesc) {
      if (!(this_present_columnDesc && that_present_columnDesc))
        return false;
      if (!this.columnDesc.equals(that.columnDesc))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumnDesc()) ? 131071 : 524287);
    if (isSetColumnDesc())
      hashCode = hashCode * 8191 + columnDesc.hashCode();

    hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
    if (isSetComment())
      hashCode = hashCode * 8191 + comment.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TColumnDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumnDesc(), other.isSetColumnDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnDesc, other.columnDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetComment(), other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TColumnDef(");
    boolean first = true;

    sb.append("columnDesc:");
    if (this.columnDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.columnDesc);
    }
    first = false;
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columnDesc == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columnDesc' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (columnDesc != null) {
      columnDesc.validate();
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

  private static class TColumnDefStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TColumnDefStandardScheme getScheme() {
      return new TColumnDefStandardScheme();
    }
  }

  private static class TColumnDefStandardScheme extends org.apache.thrift.scheme.StandardScheme<TColumnDef> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumnDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.columnDesc = new TColumnDesc();
              struct.columnDesc.read(iprot);
              struct.setColumnDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumnDef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columnDesc != null) {
        oprot.writeFieldBegin(COLUMN_DESC_FIELD_DESC);
        struct.columnDesc.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.comment != null) {
        if (struct.isSetComment()) {
          oprot.writeFieldBegin(COMMENT_FIELD_DESC);
          oprot.writeString(struct.comment);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnDefTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TColumnDefTupleScheme getScheme() {
      return new TColumnDefTupleScheme();
    }
  }

  private static class TColumnDefTupleScheme extends org.apache.thrift.scheme.TupleScheme<TColumnDef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumnDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.columnDesc.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetComment()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumnDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.columnDesc = new TColumnDesc();
      struct.columnDesc.read(iprot);
      struct.setColumnDescIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

