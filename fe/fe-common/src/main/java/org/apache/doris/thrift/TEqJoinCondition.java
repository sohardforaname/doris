/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-11")
public class TEqJoinCondition implements org.apache.thrift.TBase<TEqJoinCondition, TEqJoinCondition._Fields>, java.io.Serializable, Cloneable, Comparable<TEqJoinCondition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TEqJoinCondition");

  private static final org.apache.thrift.protocol.TField LEFT_FIELD_DESC = new org.apache.thrift.protocol.TField("left", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("right", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OPCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("opcode", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TEqJoinConditionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TEqJoinConditionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr left; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr right; // required
  /**
   * 
   * @see org.apache.doris.thrift.TExprOpcode
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExprOpcode opcode; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LEFT((short)1, "left"),
    RIGHT((short)2, "right"),
    /**
     * 
     * @see org.apache.doris.thrift.TExprOpcode
     */
    OPCODE((short)3, "opcode");

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
        case 1: // LEFT
          return LEFT;
        case 2: // RIGHT
          return RIGHT;
        case 3: // OPCODE
          return OPCODE;
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
  private static final _Fields optionals[] = {_Fields.OPCODE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LEFT, new org.apache.thrift.meta_data.FieldMetaData("left", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)));
    tmpMap.put(_Fields.RIGHT, new org.apache.thrift.meta_data.FieldMetaData("right", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)));
    tmpMap.put(_Fields.OPCODE, new org.apache.thrift.meta_data.FieldMetaData("opcode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TExprOpcode.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TEqJoinCondition.class, metaDataMap);
  }

  public TEqJoinCondition() {
  }

  public TEqJoinCondition(
    org.apache.doris.thrift.TExpr left,
    org.apache.doris.thrift.TExpr right)
  {
    this();
    this.left = left;
    this.right = right;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TEqJoinCondition(TEqJoinCondition other) {
    if (other.isSetLeft()) {
      this.left = new org.apache.doris.thrift.TExpr(other.left);
    }
    if (other.isSetRight()) {
      this.right = new org.apache.doris.thrift.TExpr(other.right);
    }
    if (other.isSetOpcode()) {
      this.opcode = other.opcode;
    }
  }

  @Override
  public TEqJoinCondition deepCopy() {
    return new TEqJoinCondition(this);
  }

  @Override
  public void clear() {
    this.left = null;
    this.right = null;
    this.opcode = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TExpr getLeft() {
    return this.left;
  }

  public TEqJoinCondition setLeft(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr left) {
    this.left = left;
    return this;
  }

  public void unsetLeft() {
    this.left = null;
  }

  /** Returns true if field left is set (has been assigned a value) and false otherwise */
  public boolean isSetLeft() {
    return this.left != null;
  }

  public void setLeftIsSet(boolean value) {
    if (!value) {
      this.left = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TExpr getRight() {
    return this.right;
  }

  public TEqJoinCondition setRight(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr right) {
    this.right = right;
    return this;
  }

  public void unsetRight() {
    this.right = null;
  }

  /** Returns true if field right is set (has been assigned a value) and false otherwise */
  public boolean isSetRight() {
    return this.right != null;
  }

  public void setRightIsSet(boolean value) {
    if (!value) {
      this.right = null;
    }
  }

  /**
   * 
   * @see org.apache.doris.thrift.TExprOpcode
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TExprOpcode getOpcode() {
    return this.opcode;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TExprOpcode
   */
  public TEqJoinCondition setOpcode(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExprOpcode opcode) {
    this.opcode = opcode;
    return this;
  }

  public void unsetOpcode() {
    this.opcode = null;
  }

  /** Returns true if field opcode is set (has been assigned a value) and false otherwise */
  public boolean isSetOpcode() {
    return this.opcode != null;
  }

  public void setOpcodeIsSet(boolean value) {
    if (!value) {
      this.opcode = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LEFT:
      if (value == null) {
        unsetLeft();
      } else {
        setLeft((org.apache.doris.thrift.TExpr)value);
      }
      break;

    case RIGHT:
      if (value == null) {
        unsetRight();
      } else {
        setRight((org.apache.doris.thrift.TExpr)value);
      }
      break;

    case OPCODE:
      if (value == null) {
        unsetOpcode();
      } else {
        setOpcode((org.apache.doris.thrift.TExprOpcode)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LEFT:
      return getLeft();

    case RIGHT:
      return getRight();

    case OPCODE:
      return getOpcode();

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
    case LEFT:
      return isSetLeft();
    case RIGHT:
      return isSetRight();
    case OPCODE:
      return isSetOpcode();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TEqJoinCondition)
      return this.equals((TEqJoinCondition)that);
    return false;
  }

  public boolean equals(TEqJoinCondition that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_left = true && this.isSetLeft();
    boolean that_present_left = true && that.isSetLeft();
    if (this_present_left || that_present_left) {
      if (!(this_present_left && that_present_left))
        return false;
      if (!this.left.equals(that.left))
        return false;
    }

    boolean this_present_right = true && this.isSetRight();
    boolean that_present_right = true && that.isSetRight();
    if (this_present_right || that_present_right) {
      if (!(this_present_right && that_present_right))
        return false;
      if (!this.right.equals(that.right))
        return false;
    }

    boolean this_present_opcode = true && this.isSetOpcode();
    boolean that_present_opcode = true && that.isSetOpcode();
    if (this_present_opcode || that_present_opcode) {
      if (!(this_present_opcode && that_present_opcode))
        return false;
      if (!this.opcode.equals(that.opcode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLeft()) ? 131071 : 524287);
    if (isSetLeft())
      hashCode = hashCode * 8191 + left.hashCode();

    hashCode = hashCode * 8191 + ((isSetRight()) ? 131071 : 524287);
    if (isSetRight())
      hashCode = hashCode * 8191 + right.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpcode()) ? 131071 : 524287);
    if (isSetOpcode())
      hashCode = hashCode * 8191 + opcode.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TEqJoinCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLeft(), other.isSetLeft());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeft()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.left, other.left);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRight(), other.isSetRight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.right, other.right);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOpcode(), other.isSetOpcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opcode, other.opcode);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TEqJoinCondition(");
    boolean first = true;

    sb.append("left:");
    if (this.left == null) {
      sb.append("null");
    } else {
      sb.append(this.left);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("right:");
    if (this.right == null) {
      sb.append("null");
    } else {
      sb.append(this.right);
    }
    first = false;
    if (isSetOpcode()) {
      if (!first) sb.append(", ");
      sb.append("opcode:");
      if (this.opcode == null) {
        sb.append("null");
      } else {
        sb.append(this.opcode);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (left == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'left' was not present! Struct: " + toString());
    }
    if (right == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'right' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (left != null) {
      left.validate();
    }
    if (right != null) {
      right.validate();
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

  private static class TEqJoinConditionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TEqJoinConditionStandardScheme getScheme() {
      return new TEqJoinConditionStandardScheme();
    }
  }

  private static class TEqJoinConditionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TEqJoinCondition> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TEqJoinCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LEFT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.left = new org.apache.doris.thrift.TExpr();
              struct.left.read(iprot);
              struct.setLeftIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.right = new org.apache.doris.thrift.TExpr();
              struct.right.read(iprot);
              struct.setRightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opcode = org.apache.doris.thrift.TExprOpcode.findByValue(iprot.readI32());
              struct.setOpcodeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TEqJoinCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.left != null) {
        oprot.writeFieldBegin(LEFT_FIELD_DESC);
        struct.left.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.right != null) {
        oprot.writeFieldBegin(RIGHT_FIELD_DESC);
        struct.right.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.opcode != null) {
        if (struct.isSetOpcode()) {
          oprot.writeFieldBegin(OPCODE_FIELD_DESC);
          oprot.writeI32(struct.opcode.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TEqJoinConditionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TEqJoinConditionTupleScheme getScheme() {
      return new TEqJoinConditionTupleScheme();
    }
  }

  private static class TEqJoinConditionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TEqJoinCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TEqJoinCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.left.write(oprot);
      struct.right.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOpcode()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOpcode()) {
        oprot.writeI32(struct.opcode.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TEqJoinCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.left = new org.apache.doris.thrift.TExpr();
      struct.left.read(iprot);
      struct.setLeftIsSet(true);
      struct.right = new org.apache.doris.thrift.TExpr();
      struct.right.read(iprot);
      struct.setRightIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.opcode = org.apache.doris.thrift.TExprOpcode.findByValue(iprot.readI32());
        struct.setOpcodeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

