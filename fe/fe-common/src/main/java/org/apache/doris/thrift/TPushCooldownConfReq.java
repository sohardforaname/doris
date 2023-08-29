/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TPushCooldownConfReq implements org.apache.thrift.TBase<TPushCooldownConfReq, TPushCooldownConfReq._Fields>, java.io.Serializable, Cloneable, Comparable<TPushCooldownConfReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPushCooldownConfReq");

  private static final org.apache.thrift.protocol.TField COOLDOWN_CONFS_FIELD_DESC = new org.apache.thrift.protocol.TField("cooldown_confs", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPushCooldownConfReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPushCooldownConfReqTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TCooldownConf> cooldown_confs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COOLDOWN_CONFS((short)1, "cooldown_confs");

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
        case 1: // COOLDOWN_CONFS
          return COOLDOWN_CONFS;
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
    tmpMap.put(_Fields.COOLDOWN_CONFS, new org.apache.thrift.meta_data.FieldMetaData("cooldown_confs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCooldownConf.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPushCooldownConfReq.class, metaDataMap);
  }

  public TPushCooldownConfReq() {
  }

  public TPushCooldownConfReq(
    java.util.List<TCooldownConf> cooldown_confs)
  {
    this();
    this.cooldown_confs = cooldown_confs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPushCooldownConfReq(TPushCooldownConfReq other) {
    if (other.isSetCooldownConfs()) {
      java.util.List<TCooldownConf> __this__cooldown_confs = new java.util.ArrayList<TCooldownConf>(other.cooldown_confs.size());
      for (TCooldownConf other_element : other.cooldown_confs) {
        __this__cooldown_confs.add(new TCooldownConf(other_element));
      }
      this.cooldown_confs = __this__cooldown_confs;
    }
  }

  @Override
  public TPushCooldownConfReq deepCopy() {
    return new TPushCooldownConfReq(this);
  }

  @Override
  public void clear() {
    this.cooldown_confs = null;
  }

  public int getCooldownConfsSize() {
    return (this.cooldown_confs == null) ? 0 : this.cooldown_confs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TCooldownConf> getCooldownConfsIterator() {
    return (this.cooldown_confs == null) ? null : this.cooldown_confs.iterator();
  }

  public void addToCooldownConfs(TCooldownConf elem) {
    if (this.cooldown_confs == null) {
      this.cooldown_confs = new java.util.ArrayList<TCooldownConf>();
    }
    this.cooldown_confs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TCooldownConf> getCooldownConfs() {
    return this.cooldown_confs;
  }

  public TPushCooldownConfReq setCooldownConfs(@org.apache.thrift.annotation.Nullable java.util.List<TCooldownConf> cooldown_confs) {
    this.cooldown_confs = cooldown_confs;
    return this;
  }

  public void unsetCooldownConfs() {
    this.cooldown_confs = null;
  }

  /** Returns true if field cooldown_confs is set (has been assigned a value) and false otherwise */
  public boolean isSetCooldownConfs() {
    return this.cooldown_confs != null;
  }

  public void setCooldownConfsIsSet(boolean value) {
    if (!value) {
      this.cooldown_confs = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COOLDOWN_CONFS:
      if (value == null) {
        unsetCooldownConfs();
      } else {
        setCooldownConfs((java.util.List<TCooldownConf>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COOLDOWN_CONFS:
      return getCooldownConfs();

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
    case COOLDOWN_CONFS:
      return isSetCooldownConfs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPushCooldownConfReq)
      return this.equals((TPushCooldownConfReq)that);
    return false;
  }

  public boolean equals(TPushCooldownConfReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cooldown_confs = true && this.isSetCooldownConfs();
    boolean that_present_cooldown_confs = true && that.isSetCooldownConfs();
    if (this_present_cooldown_confs || that_present_cooldown_confs) {
      if (!(this_present_cooldown_confs && that_present_cooldown_confs))
        return false;
      if (!this.cooldown_confs.equals(that.cooldown_confs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCooldownConfs()) ? 131071 : 524287);
    if (isSetCooldownConfs())
      hashCode = hashCode * 8191 + cooldown_confs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPushCooldownConfReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCooldownConfs(), other.isSetCooldownConfs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCooldownConfs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cooldown_confs, other.cooldown_confs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPushCooldownConfReq(");
    boolean first = true;

    sb.append("cooldown_confs:");
    if (this.cooldown_confs == null) {
      sb.append("null");
    } else {
      sb.append(this.cooldown_confs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (cooldown_confs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cooldown_confs' was not present! Struct: " + toString());
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

  private static class TPushCooldownConfReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPushCooldownConfReqStandardScheme getScheme() {
      return new TPushCooldownConfReqStandardScheme();
    }
  }

  private static class TPushCooldownConfReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPushCooldownConfReq> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TPushCooldownConfReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COOLDOWN_CONFS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list202 = iprot.readListBegin();
                struct.cooldown_confs = new java.util.ArrayList<TCooldownConf>(_list202.size);
                @org.apache.thrift.annotation.Nullable TCooldownConf _elem203;
                for (int _i204 = 0; _i204 < _list202.size; ++_i204)
                {
                  _elem203 = new TCooldownConf();
                  _elem203.read(iprot);
                  struct.cooldown_confs.add(_elem203);
                }
                iprot.readListEnd();
              }
              struct.setCooldownConfsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TPushCooldownConfReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cooldown_confs != null) {
        oprot.writeFieldBegin(COOLDOWN_CONFS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.cooldown_confs.size()));
          for (TCooldownConf _iter205 : struct.cooldown_confs)
          {
            _iter205.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPushCooldownConfReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TPushCooldownConfReqTupleScheme getScheme() {
      return new TPushCooldownConfReqTupleScheme();
    }
  }

  private static class TPushCooldownConfReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPushCooldownConfReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPushCooldownConfReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.cooldown_confs.size());
        for (TCooldownConf _iter206 : struct.cooldown_confs)
        {
          _iter206.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPushCooldownConfReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list207 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.cooldown_confs = new java.util.ArrayList<TCooldownConf>(_list207.size);
        @org.apache.thrift.annotation.Nullable TCooldownConf _elem208;
        for (int _i209 = 0; _i209 < _list207.size; ++_i209)
        {
          _elem208 = new TCooldownConf();
          _elem208.read(iprot);
          struct.cooldown_confs.add(_elem208);
        }
      }
      struct.setCooldownConfsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

