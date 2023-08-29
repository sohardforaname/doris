/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TPipelineFragmentParamsList implements org.apache.thrift.TBase<TPipelineFragmentParamsList, TPipelineFragmentParamsList._Fields>, java.io.Serializable, Cloneable, Comparable<TPipelineFragmentParamsList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPipelineFragmentParamsList");

  private static final org.apache.thrift.protocol.TField PARAMS_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("params_list", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPipelineFragmentParamsListStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPipelineFragmentParamsListTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TPipelineFragmentParams> params_list; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARAMS_LIST((short)1, "params_list");

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
        case 1: // PARAMS_LIST
          return PARAMS_LIST;
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
  private static final _Fields optionals[] = {_Fields.PARAMS_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARAMS_LIST, new org.apache.thrift.meta_data.FieldMetaData("params_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPipelineFragmentParams.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPipelineFragmentParamsList.class, metaDataMap);
  }

  public TPipelineFragmentParamsList() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPipelineFragmentParamsList(TPipelineFragmentParamsList other) {
    if (other.isSetParamsList()) {
      java.util.List<TPipelineFragmentParams> __this__params_list = new java.util.ArrayList<TPipelineFragmentParams>(other.params_list.size());
      for (TPipelineFragmentParams other_element : other.params_list) {
        __this__params_list.add(new TPipelineFragmentParams(other_element));
      }
      this.params_list = __this__params_list;
    }
  }

  @Override
  public TPipelineFragmentParamsList deepCopy() {
    return new TPipelineFragmentParamsList(this);
  }

  @Override
  public void clear() {
    this.params_list = null;
  }

  public int getParamsListSize() {
    return (this.params_list == null) ? 0 : this.params_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TPipelineFragmentParams> getParamsListIterator() {
    return (this.params_list == null) ? null : this.params_list.iterator();
  }

  public void addToParamsList(TPipelineFragmentParams elem) {
    if (this.params_list == null) {
      this.params_list = new java.util.ArrayList<TPipelineFragmentParams>();
    }
    this.params_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TPipelineFragmentParams> getParamsList() {
    return this.params_list;
  }

  public TPipelineFragmentParamsList setParamsList(@org.apache.thrift.annotation.Nullable java.util.List<TPipelineFragmentParams> params_list) {
    this.params_list = params_list;
    return this;
  }

  public void unsetParamsList() {
    this.params_list = null;
  }

  /** Returns true if field params_list is set (has been assigned a value) and false otherwise */
  public boolean isSetParamsList() {
    return this.params_list != null;
  }

  public void setParamsListIsSet(boolean value) {
    if (!value) {
      this.params_list = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARAMS_LIST:
      if (value == null) {
        unsetParamsList();
      } else {
        setParamsList((java.util.List<TPipelineFragmentParams>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARAMS_LIST:
      return getParamsList();

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
    case PARAMS_LIST:
      return isSetParamsList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPipelineFragmentParamsList)
      return this.equals((TPipelineFragmentParamsList)that);
    return false;
  }

  public boolean equals(TPipelineFragmentParamsList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_params_list = true && this.isSetParamsList();
    boolean that_present_params_list = true && that.isSetParamsList();
    if (this_present_params_list || that_present_params_list) {
      if (!(this_present_params_list && that_present_params_list))
        return false;
      if (!this.params_list.equals(that.params_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetParamsList()) ? 131071 : 524287);
    if (isSetParamsList())
      hashCode = hashCode * 8191 + params_list.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPipelineFragmentParamsList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetParamsList(), other.isSetParamsList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamsList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params_list, other.params_list);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPipelineFragmentParamsList(");
    boolean first = true;

    if (isSetParamsList()) {
      sb.append("params_list:");
      if (this.params_list == null) {
        sb.append("null");
      } else {
        sb.append(this.params_list);
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

  private static class TPipelineFragmentParamsListStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPipelineFragmentParamsListStandardScheme getScheme() {
      return new TPipelineFragmentParamsListStandardScheme();
    }
  }

  private static class TPipelineFragmentParamsListStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPipelineFragmentParamsList> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPipelineFragmentParamsList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARAMS_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list316 = iprot.readListBegin();
                struct.params_list = new java.util.ArrayList<TPipelineFragmentParams>(_list316.size);
                @org.apache.thrift.annotation.Nullable TPipelineFragmentParams _elem317;
                for (int _i318 = 0; _i318 < _list316.size; ++_i318)
                {
                  _elem317 = new TPipelineFragmentParams();
                  _elem317.read(iprot);
                  struct.params_list.add(_elem317);
                }
                iprot.readListEnd();
              }
              struct.setParamsListIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPipelineFragmentParamsList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.params_list != null) {
        if (struct.isSetParamsList()) {
          oprot.writeFieldBegin(PARAMS_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.params_list.size()));
            for (TPipelineFragmentParams _iter319 : struct.params_list)
            {
              _iter319.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPipelineFragmentParamsListTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPipelineFragmentParamsListTupleScheme getScheme() {
      return new TPipelineFragmentParamsListTupleScheme();
    }
  }

  private static class TPipelineFragmentParamsListTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPipelineFragmentParamsList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPipelineFragmentParamsList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetParamsList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetParamsList()) {
        {
          oprot.writeI32(struct.params_list.size());
          for (TPipelineFragmentParams _iter320 : struct.params_list)
          {
            _iter320.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPipelineFragmentParamsList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list321 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.params_list = new java.util.ArrayList<TPipelineFragmentParams>(_list321.size);
          @org.apache.thrift.annotation.Nullable TPipelineFragmentParams _elem322;
          for (int _i323 = 0; _i323 < _list321.size; ++_i323)
          {
            _elem322 = new TPipelineFragmentParams();
            _elem322.read(iprot);
            struct.params_list.add(_elem322);
          }
        }
        struct.setParamsListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

