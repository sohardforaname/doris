/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TMiniLoadEtlFunction implements org.apache.thrift.TBase<TMiniLoadEtlFunction, TMiniLoadEtlFunction._Fields>, java.io.Serializable, Cloneable, Comparable<TMiniLoadEtlFunction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMiniLoadEtlFunction");

  private static final org.apache.thrift.protocol.TField FUNCTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("function_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAM_COLUMN_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("param_column_index", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMiniLoadEtlFunctionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMiniLoadEtlFunctionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String function_name; // required
  public int param_column_index; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FUNCTION_NAME((short)1, "function_name"),
    PARAM_COLUMN_INDEX((short)2, "param_column_index");

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
        case 1: // FUNCTION_NAME
          return FUNCTION_NAME;
        case 2: // PARAM_COLUMN_INDEX
          return PARAM_COLUMN_INDEX;
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
  private static final int __PARAM_COLUMN_INDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUNCTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("function_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAM_COLUMN_INDEX, new org.apache.thrift.meta_data.FieldMetaData("param_column_index", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMiniLoadEtlFunction.class, metaDataMap);
  }

  public TMiniLoadEtlFunction() {
  }

  public TMiniLoadEtlFunction(
    java.lang.String function_name,
    int param_column_index)
  {
    this();
    this.function_name = function_name;
    this.param_column_index = param_column_index;
    setParamColumnIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMiniLoadEtlFunction(TMiniLoadEtlFunction other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFunctionName()) {
      this.function_name = other.function_name;
    }
    this.param_column_index = other.param_column_index;
  }

  @Override
  public TMiniLoadEtlFunction deepCopy() {
    return new TMiniLoadEtlFunction(this);
  }

  @Override
  public void clear() {
    this.function_name = null;
    setParamColumnIndexIsSet(false);
    this.param_column_index = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFunctionName() {
    return this.function_name;
  }

  public TMiniLoadEtlFunction setFunctionName(@org.apache.thrift.annotation.Nullable java.lang.String function_name) {
    this.function_name = function_name;
    return this;
  }

  public void unsetFunctionName() {
    this.function_name = null;
  }

  /** Returns true if field function_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFunctionName() {
    return this.function_name != null;
  }

  public void setFunctionNameIsSet(boolean value) {
    if (!value) {
      this.function_name = null;
    }
  }

  public int getParamColumnIndex() {
    return this.param_column_index;
  }

  public TMiniLoadEtlFunction setParamColumnIndex(int param_column_index) {
    this.param_column_index = param_column_index;
    setParamColumnIndexIsSet(true);
    return this;
  }

  public void unsetParamColumnIndex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARAM_COLUMN_INDEX_ISSET_ID);
  }

  /** Returns true if field param_column_index is set (has been assigned a value) and false otherwise */
  public boolean isSetParamColumnIndex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARAM_COLUMN_INDEX_ISSET_ID);
  }

  public void setParamColumnIndexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARAM_COLUMN_INDEX_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FUNCTION_NAME:
      if (value == null) {
        unsetFunctionName();
      } else {
        setFunctionName((java.lang.String)value);
      }
      break;

    case PARAM_COLUMN_INDEX:
      if (value == null) {
        unsetParamColumnIndex();
      } else {
        setParamColumnIndex((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FUNCTION_NAME:
      return getFunctionName();

    case PARAM_COLUMN_INDEX:
      return getParamColumnIndex();

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
    case FUNCTION_NAME:
      return isSetFunctionName();
    case PARAM_COLUMN_INDEX:
      return isSetParamColumnIndex();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMiniLoadEtlFunction)
      return this.equals((TMiniLoadEtlFunction)that);
    return false;
  }

  public boolean equals(TMiniLoadEtlFunction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_function_name = true && this.isSetFunctionName();
    boolean that_present_function_name = true && that.isSetFunctionName();
    if (this_present_function_name || that_present_function_name) {
      if (!(this_present_function_name && that_present_function_name))
        return false;
      if (!this.function_name.equals(that.function_name))
        return false;
    }

    boolean this_present_param_column_index = true;
    boolean that_present_param_column_index = true;
    if (this_present_param_column_index || that_present_param_column_index) {
      if (!(this_present_param_column_index && that_present_param_column_index))
        return false;
      if (this.param_column_index != that.param_column_index)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFunctionName()) ? 131071 : 524287);
    if (isSetFunctionName())
      hashCode = hashCode * 8191 + function_name.hashCode();

    hashCode = hashCode * 8191 + param_column_index;

    return hashCode;
  }

  @Override
  public int compareTo(TMiniLoadEtlFunction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFunctionName(), other.isSetFunctionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunctionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.function_name, other.function_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParamColumnIndex(), other.isSetParamColumnIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamColumnIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.param_column_index, other.param_column_index);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMiniLoadEtlFunction(");
    boolean first = true;

    sb.append("function_name:");
    if (this.function_name == null) {
      sb.append("null");
    } else {
      sb.append(this.function_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("param_column_index:");
    sb.append(this.param_column_index);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (function_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'function_name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'param_column_index' because it's a primitive and you chose the non-beans generator.
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

  private static class TMiniLoadEtlFunctionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMiniLoadEtlFunctionStandardScheme getScheme() {
      return new TMiniLoadEtlFunctionStandardScheme();
    }
  }

  private static class TMiniLoadEtlFunctionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMiniLoadEtlFunction> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMiniLoadEtlFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUNCTION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.function_name = iprot.readString();
              struct.setFunctionNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAM_COLUMN_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.param_column_index = iprot.readI32();
              struct.setParamColumnIndexIsSet(true);
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
      if (!struct.isSetParamColumnIndex()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'param_column_index' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMiniLoadEtlFunction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.function_name != null) {
        oprot.writeFieldBegin(FUNCTION_NAME_FIELD_DESC);
        oprot.writeString(struct.function_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PARAM_COLUMN_INDEX_FIELD_DESC);
      oprot.writeI32(struct.param_column_index);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMiniLoadEtlFunctionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMiniLoadEtlFunctionTupleScheme getScheme() {
      return new TMiniLoadEtlFunctionTupleScheme();
    }
  }

  private static class TMiniLoadEtlFunctionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMiniLoadEtlFunction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMiniLoadEtlFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.function_name);
      oprot.writeI32(struct.param_column_index);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMiniLoadEtlFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.function_name = iprot.readString();
      struct.setFunctionNameIsSet(true);
      struct.param_column_index = iprot.readI32();
      struct.setParamColumnIndexIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

