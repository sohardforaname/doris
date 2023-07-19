/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TTablet implements org.apache.thrift.TBase<TTablet, TTablet._Fields>, java.io.Serializable, Cloneable, Comparable<TTablet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTablet");

  private static final org.apache.thrift.protocol.TField TABLET_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_infos", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TTabletInfo> tablet_infos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_INFOS((short)1, "tablet_infos");

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
        case 1: // TABLET_INFOS
          return TABLET_INFOS;
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
    tmpMap.put(_Fields.TABLET_INFOS, new org.apache.thrift.meta_data.FieldMetaData("tablet_infos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletInfo.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTablet.class, metaDataMap);
  }

  public TTablet() {
  }

  public TTablet(
    java.util.List<TTabletInfo> tablet_infos)
  {
    this();
    this.tablet_infos = tablet_infos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTablet(TTablet other) {
    if (other.isSetTabletInfos()) {
      java.util.List<TTabletInfo> __this__tablet_infos = new java.util.ArrayList<TTabletInfo>(other.tablet_infos.size());
      for (TTabletInfo other_element : other.tablet_infos) {
        __this__tablet_infos.add(new TTabletInfo(other_element));
      }
      this.tablet_infos = __this__tablet_infos;
    }
  }

  @Override
  public TTablet deepCopy() {
    return new TTablet(this);
  }

  @Override
  public void clear() {
    this.tablet_infos = null;
  }

  public int getTabletInfosSize() {
    return (this.tablet_infos == null) ? 0 : this.tablet_infos.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTabletInfo> getTabletInfosIterator() {
    return (this.tablet_infos == null) ? null : this.tablet_infos.iterator();
  }

  public void addToTabletInfos(TTabletInfo elem) {
    if (this.tablet_infos == null) {
      this.tablet_infos = new java.util.ArrayList<TTabletInfo>();
    }
    this.tablet_infos.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTabletInfo> getTabletInfos() {
    return this.tablet_infos;
  }

  public TTablet setTabletInfos(@org.apache.thrift.annotation.Nullable java.util.List<TTabletInfo> tablet_infos) {
    this.tablet_infos = tablet_infos;
    return this;
  }

  public void unsetTabletInfos() {
    this.tablet_infos = null;
  }

  /** Returns true if field tablet_infos is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletInfos() {
    return this.tablet_infos != null;
  }

  public void setTabletInfosIsSet(boolean value) {
    if (!value) {
      this.tablet_infos = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLET_INFOS:
      if (value == null) {
        unsetTabletInfos();
      } else {
        setTabletInfos((java.util.List<TTabletInfo>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_INFOS:
      return getTabletInfos();

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
    case TABLET_INFOS:
      return isSetTabletInfos();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTablet)
      return this.equals((TTablet)that);
    return false;
  }

  public boolean equals(TTablet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tablet_infos = true && this.isSetTabletInfos();
    boolean that_present_tablet_infos = true && that.isSetTabletInfos();
    if (this_present_tablet_infos || that_present_tablet_infos) {
      if (!(this_present_tablet_infos && that_present_tablet_infos))
        return false;
      if (!this.tablet_infos.equals(that.tablet_infos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTabletInfos()) ? 131071 : 524287);
    if (isSetTabletInfos())
      hashCode = hashCode * 8191 + tablet_infos.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTablet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletInfos(), other.isSetTabletInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_infos, other.tablet_infos);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTablet(");
    boolean first = true;

    sb.append("tablet_infos:");
    if (this.tablet_infos == null) {
      sb.append("null");
    } else {
      sb.append(this.tablet_infos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tablet_infos == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablet_infos' was not present! Struct: " + toString());
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

  private static class TTabletStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletStandardScheme getScheme() {
      return new TTabletStandardScheme();
    }
  }

  private static class TTabletStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTablet> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TTablet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.tablet_infos = new java.util.ArrayList<TTabletInfo>(_list58.size);
                @org.apache.thrift.annotation.Nullable TTabletInfo _elem59;
                for (int _i60 = 0; _i60 < _list58.size; ++_i60)
                {
                  _elem59 = new TTabletInfo();
                  _elem59.read(iprot);
                  struct.tablet_infos.add(_elem59);
                }
                iprot.readListEnd();
              }
              struct.setTabletInfosIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TTablet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tablet_infos != null) {
        oprot.writeFieldBegin(TABLET_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tablet_infos.size()));
          for (TTabletInfo _iter61 : struct.tablet_infos)
          {
            _iter61.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTabletTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TTabletTupleScheme getScheme() {
      return new TTabletTupleScheme();
    }
  }

  private static class TTabletTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTablet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTablet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tablet_infos.size());
        for (TTabletInfo _iter62 : struct.tablet_infos)
        {
          _iter62.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTablet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list63 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.tablet_infos = new java.util.ArrayList<TTabletInfo>(_list63.size);
        @org.apache.thrift.annotation.Nullable TTabletInfo _elem64;
        for (int _i65 = 0; _i65 < _list63.size; ++_i65)
        {
          _elem64 = new TTabletInfo();
          _elem64.read(iprot);
          struct.tablet_infos.add(_elem64);
        }
      }
      struct.setTabletInfosIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

