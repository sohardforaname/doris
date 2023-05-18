/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-05-18")
public class TMergeJoinNode implements org.apache.thrift.TBase<TMergeJoinNode, TMergeJoinNode._Fields>, java.io.Serializable, Cloneable, Comparable<TMergeJoinNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMergeJoinNode");

  private static final org.apache.thrift.protocol.TField CMP_CONJUNCTS_FIELD_DESC = new org.apache.thrift.protocol.TField("cmp_conjuncts", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField OTHER_JOIN_CONJUNCTS_FIELD_DESC = new org.apache.thrift.protocol.TField("other_join_conjuncts", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMergeJoinNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMergeJoinNodeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TEqJoinCondition> cmp_conjuncts; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> other_join_conjuncts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CMP_CONJUNCTS((short)1, "cmp_conjuncts"),
    OTHER_JOIN_CONJUNCTS((short)2, "other_join_conjuncts");

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
        case 1: // CMP_CONJUNCTS
          return CMP_CONJUNCTS;
        case 2: // OTHER_JOIN_CONJUNCTS
          return OTHER_JOIN_CONJUNCTS;
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
  private static final _Fields optionals[] = {_Fields.OTHER_JOIN_CONJUNCTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CMP_CONJUNCTS, new org.apache.thrift.meta_data.FieldMetaData("cmp_conjuncts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TEqJoinCondition.class))));
    tmpMap.put(_Fields.OTHER_JOIN_CONJUNCTS, new org.apache.thrift.meta_data.FieldMetaData("other_join_conjuncts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMergeJoinNode.class, metaDataMap);
  }

  public TMergeJoinNode() {
  }

  public TMergeJoinNode(
    java.util.List<TEqJoinCondition> cmp_conjuncts)
  {
    this();
    this.cmp_conjuncts = cmp_conjuncts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMergeJoinNode(TMergeJoinNode other) {
    if (other.isSetCmpConjuncts()) {
      java.util.List<TEqJoinCondition> __this__cmp_conjuncts = new java.util.ArrayList<TEqJoinCondition>(other.cmp_conjuncts.size());
      for (TEqJoinCondition other_element : other.cmp_conjuncts) {
        __this__cmp_conjuncts.add(new TEqJoinCondition(other_element));
      }
      this.cmp_conjuncts = __this__cmp_conjuncts;
    }
    if (other.isSetOtherJoinConjuncts()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__other_join_conjuncts = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.other_join_conjuncts.size());
      for (org.apache.doris.thrift.TExpr other_element : other.other_join_conjuncts) {
        __this__other_join_conjuncts.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.other_join_conjuncts = __this__other_join_conjuncts;
    }
  }

  @Override
  public TMergeJoinNode deepCopy() {
    return new TMergeJoinNode(this);
  }

  @Override
  public void clear() {
    this.cmp_conjuncts = null;
    this.other_join_conjuncts = null;
  }

  public int getCmpConjunctsSize() {
    return (this.cmp_conjuncts == null) ? 0 : this.cmp_conjuncts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TEqJoinCondition> getCmpConjunctsIterator() {
    return (this.cmp_conjuncts == null) ? null : this.cmp_conjuncts.iterator();
  }

  public void addToCmpConjuncts(TEqJoinCondition elem) {
    if (this.cmp_conjuncts == null) {
      this.cmp_conjuncts = new java.util.ArrayList<TEqJoinCondition>();
    }
    this.cmp_conjuncts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TEqJoinCondition> getCmpConjuncts() {
    return this.cmp_conjuncts;
  }

  public TMergeJoinNode setCmpConjuncts(@org.apache.thrift.annotation.Nullable java.util.List<TEqJoinCondition> cmp_conjuncts) {
    this.cmp_conjuncts = cmp_conjuncts;
    return this;
  }

  public void unsetCmpConjuncts() {
    this.cmp_conjuncts = null;
  }

  /** Returns true if field cmp_conjuncts is set (has been assigned a value) and false otherwise */
  public boolean isSetCmpConjuncts() {
    return this.cmp_conjuncts != null;
  }

  public void setCmpConjunctsIsSet(boolean value) {
    if (!value) {
      this.cmp_conjuncts = null;
    }
  }

  public int getOtherJoinConjunctsSize() {
    return (this.other_join_conjuncts == null) ? 0 : this.other_join_conjuncts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getOtherJoinConjunctsIterator() {
    return (this.other_join_conjuncts == null) ? null : this.other_join_conjuncts.iterator();
  }

  public void addToOtherJoinConjuncts(org.apache.doris.thrift.TExpr elem) {
    if (this.other_join_conjuncts == null) {
      this.other_join_conjuncts = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.other_join_conjuncts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getOtherJoinConjuncts() {
    return this.other_join_conjuncts;
  }

  public TMergeJoinNode setOtherJoinConjuncts(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> other_join_conjuncts) {
    this.other_join_conjuncts = other_join_conjuncts;
    return this;
  }

  public void unsetOtherJoinConjuncts() {
    this.other_join_conjuncts = null;
  }

  /** Returns true if field other_join_conjuncts is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherJoinConjuncts() {
    return this.other_join_conjuncts != null;
  }

  public void setOtherJoinConjunctsIsSet(boolean value) {
    if (!value) {
      this.other_join_conjuncts = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CMP_CONJUNCTS:
      if (value == null) {
        unsetCmpConjuncts();
      } else {
        setCmpConjuncts((java.util.List<TEqJoinCondition>)value);
      }
      break;

    case OTHER_JOIN_CONJUNCTS:
      if (value == null) {
        unsetOtherJoinConjuncts();
      } else {
        setOtherJoinConjuncts((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CMP_CONJUNCTS:
      return getCmpConjuncts();

    case OTHER_JOIN_CONJUNCTS:
      return getOtherJoinConjuncts();

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
    case CMP_CONJUNCTS:
      return isSetCmpConjuncts();
    case OTHER_JOIN_CONJUNCTS:
      return isSetOtherJoinConjuncts();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMergeJoinNode)
      return this.equals((TMergeJoinNode)that);
    return false;
  }

  public boolean equals(TMergeJoinNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cmp_conjuncts = true && this.isSetCmpConjuncts();
    boolean that_present_cmp_conjuncts = true && that.isSetCmpConjuncts();
    if (this_present_cmp_conjuncts || that_present_cmp_conjuncts) {
      if (!(this_present_cmp_conjuncts && that_present_cmp_conjuncts))
        return false;
      if (!this.cmp_conjuncts.equals(that.cmp_conjuncts))
        return false;
    }

    boolean this_present_other_join_conjuncts = true && this.isSetOtherJoinConjuncts();
    boolean that_present_other_join_conjuncts = true && that.isSetOtherJoinConjuncts();
    if (this_present_other_join_conjuncts || that_present_other_join_conjuncts) {
      if (!(this_present_other_join_conjuncts && that_present_other_join_conjuncts))
        return false;
      if (!this.other_join_conjuncts.equals(that.other_join_conjuncts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCmpConjuncts()) ? 131071 : 524287);
    if (isSetCmpConjuncts())
      hashCode = hashCode * 8191 + cmp_conjuncts.hashCode();

    hashCode = hashCode * 8191 + ((isSetOtherJoinConjuncts()) ? 131071 : 524287);
    if (isSetOtherJoinConjuncts())
      hashCode = hashCode * 8191 + other_join_conjuncts.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMergeJoinNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCmpConjuncts(), other.isSetCmpConjuncts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmpConjuncts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmp_conjuncts, other.cmp_conjuncts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOtherJoinConjuncts(), other.isSetOtherJoinConjuncts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherJoinConjuncts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.other_join_conjuncts, other.other_join_conjuncts);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMergeJoinNode(");
    boolean first = true;

    sb.append("cmp_conjuncts:");
    if (this.cmp_conjuncts == null) {
      sb.append("null");
    } else {
      sb.append(this.cmp_conjuncts);
    }
    first = false;
    if (isSetOtherJoinConjuncts()) {
      if (!first) sb.append(", ");
      sb.append("other_join_conjuncts:");
      if (this.other_join_conjuncts == null) {
        sb.append("null");
      } else {
        sb.append(this.other_join_conjuncts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (cmp_conjuncts == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cmp_conjuncts' was not present! Struct: " + toString());
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

  private static class TMergeJoinNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMergeJoinNodeStandardScheme getScheme() {
      return new TMergeJoinNodeStandardScheme();
    }
  }

  private static class TMergeJoinNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMergeJoinNode> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMergeJoinNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CMP_CONJUNCTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list498 = iprot.readListBegin();
                struct.cmp_conjuncts = new java.util.ArrayList<TEqJoinCondition>(_list498.size);
                @org.apache.thrift.annotation.Nullable TEqJoinCondition _elem499;
                for (int _i500 = 0; _i500 < _list498.size; ++_i500)
                {
                  _elem499 = new TEqJoinCondition();
                  _elem499.read(iprot);
                  struct.cmp_conjuncts.add(_elem499);
                }
                iprot.readListEnd();
              }
              struct.setCmpConjunctsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OTHER_JOIN_CONJUNCTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list501 = iprot.readListBegin();
                struct.other_join_conjuncts = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list501.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem502;
                for (int _i503 = 0; _i503 < _list501.size; ++_i503)
                {
                  _elem502 = new org.apache.doris.thrift.TExpr();
                  _elem502.read(iprot);
                  struct.other_join_conjuncts.add(_elem502);
                }
                iprot.readListEnd();
              }
              struct.setOtherJoinConjunctsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMergeJoinNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cmp_conjuncts != null) {
        oprot.writeFieldBegin(CMP_CONJUNCTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.cmp_conjuncts.size()));
          for (TEqJoinCondition _iter504 : struct.cmp_conjuncts)
          {
            _iter504.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.other_join_conjuncts != null) {
        if (struct.isSetOtherJoinConjuncts()) {
          oprot.writeFieldBegin(OTHER_JOIN_CONJUNCTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.other_join_conjuncts.size()));
            for (org.apache.doris.thrift.TExpr _iter505 : struct.other_join_conjuncts)
            {
              _iter505.write(oprot);
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

  private static class TMergeJoinNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMergeJoinNodeTupleScheme getScheme() {
      return new TMergeJoinNodeTupleScheme();
    }
  }

  private static class TMergeJoinNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMergeJoinNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMergeJoinNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.cmp_conjuncts.size());
        for (TEqJoinCondition _iter506 : struct.cmp_conjuncts)
        {
          _iter506.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOtherJoinConjuncts()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOtherJoinConjuncts()) {
        {
          oprot.writeI32(struct.other_join_conjuncts.size());
          for (org.apache.doris.thrift.TExpr _iter507 : struct.other_join_conjuncts)
          {
            _iter507.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMergeJoinNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list508 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.cmp_conjuncts = new java.util.ArrayList<TEqJoinCondition>(_list508.size);
        @org.apache.thrift.annotation.Nullable TEqJoinCondition _elem509;
        for (int _i510 = 0; _i510 < _list508.size; ++_i510)
        {
          _elem509 = new TEqJoinCondition();
          _elem509.read(iprot);
          struct.cmp_conjuncts.add(_elem509);
        }
      }
      struct.setCmpConjunctsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list511 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.other_join_conjuncts = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list511.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem512;
          for (int _i513 = 0; _i513 < _list511.size; ++_i513)
          {
            _elem512 = new org.apache.doris.thrift.TExpr();
            _elem512.read(iprot);
            struct.other_join_conjuncts.add(_elem512);
          }
        }
        struct.setOtherJoinConjunctsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

