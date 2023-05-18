/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TRangeValue implements org.apache.thrift.TBase<TRangeValue, TRangeValue._Fields>, java.io.Serializable, Cloneable, Comparable<TRangeValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRangeValue");

  private static final org.apache.thrift.protocol.TField VALUE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("value_list", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRangeValueStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRangeValueTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TValue> value_list; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE_LIST((short)1, "value_list");

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
        case 1: // VALUE_LIST
          return VALUE_LIST;
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
    tmpMap.put(_Fields.VALUE_LIST, new org.apache.thrift.meta_data.FieldMetaData("value_list", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TValue.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRangeValue.class, metaDataMap);
  }

  public TRangeValue() {
  }

  public TRangeValue(
    java.util.List<TValue> value_list)
  {
    this();
    this.value_list = value_list;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRangeValue(TRangeValue other) {
    if (other.isSetValueList()) {
      java.util.List<TValue> __this__value_list = new java.util.ArrayList<TValue>(other.value_list.size());
      for (TValue other_element : other.value_list) {
        __this__value_list.add(new TValue(other_element));
      }
      this.value_list = __this__value_list;
    }
  }

  @Override
  public TRangeValue deepCopy() {
    return new TRangeValue(this);
  }

  @Override
  public void clear() {
    this.value_list = null;
  }

  public int getValueListSize() {
    return (this.value_list == null) ? 0 : this.value_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TValue> getValueListIterator() {
    return (this.value_list == null) ? null : this.value_list.iterator();
  }

  public void addToValueList(TValue elem) {
    if (this.value_list == null) {
      this.value_list = new java.util.ArrayList<TValue>();
    }
    this.value_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TValue> getValueList() {
    return this.value_list;
  }

  public TRangeValue setValueList(@org.apache.thrift.annotation.Nullable java.util.List<TValue> value_list) {
    this.value_list = value_list;
    return this;
  }

  public void unsetValueList() {
    this.value_list = null;
  }

  /** Returns true if field value_list is set (has been assigned a value) and false otherwise */
  public boolean isSetValueList() {
    return this.value_list != null;
  }

  public void setValueListIsSet(boolean value) {
    if (!value) {
      this.value_list = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VALUE_LIST:
      if (value == null) {
        unsetValueList();
      } else {
        setValueList((java.util.List<TValue>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE_LIST:
      return getValueList();

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
    case VALUE_LIST:
      return isSetValueList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRangeValue)
      return this.equals((TRangeValue)that);
    return false;
  }

  public boolean equals(TRangeValue that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_value_list = true && this.isSetValueList();
    boolean that_present_value_list = true && that.isSetValueList();
    if (this_present_value_list || that_present_value_list) {
      if (!(this_present_value_list && that_present_value_list))
        return false;
      if (!this.value_list.equals(that.value_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetValueList()) ? 131071 : 524287);
    if (isSetValueList())
      hashCode = hashCode * 8191 + value_list.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRangeValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetValueList(), other.isSetValueList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value_list, other.value_list);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRangeValue(");
    boolean first = true;

    sb.append("value_list:");
    if (this.value_list == null) {
      sb.append("null");
    } else {
      sb.append(this.value_list);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (value_list == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value_list' was not present! Struct: " + toString());
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

  private static class TRangeValueStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TRangeValueStandardScheme getScheme() {
      return new TRangeValueStandardScheme();
    }
  }

  private static class TRangeValueStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRangeValue> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TRangeValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.value_list = new java.util.ArrayList<TValue>(_list8.size);
                @org.apache.thrift.annotation.Nullable TValue _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new TValue();
                  _elem9.read(iprot);
                  struct.value_list.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setValueListIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TRangeValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.value_list != null) {
        oprot.writeFieldBegin(VALUE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.value_list.size()));
          for (TValue _iter11 : struct.value_list)
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

  private static class TRangeValueTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TRangeValueTupleScheme getScheme() {
      return new TRangeValueTupleScheme();
    }
  }

  private static class TRangeValueTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRangeValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRangeValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.value_list.size());
        for (TValue _iter12 : struct.value_list)
        {
          _iter12.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRangeValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.value_list = new java.util.ArrayList<TValue>(_list13.size);
        @org.apache.thrift.annotation.Nullable TValue _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = new TValue();
          _elem14.read(iprot);
          struct.value_list.add(_elem14);
        }
      }
      struct.setValueListIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

