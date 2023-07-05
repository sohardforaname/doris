/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class TDescriptorTable implements org.apache.thrift.TBase<TDescriptorTable, TDescriptorTable._Fields>, java.io.Serializable, Cloneable, Comparable<TDescriptorTable> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDescriptorTable");

  private static final org.apache.thrift.protocol.TField SLOT_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("slotDescriptors", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TUPLE_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("tupleDescriptors", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_DESCRIPTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("tableDescriptors", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDescriptorTableStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDescriptorTableTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TSlotDescriptor> slotDescriptors; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TTupleDescriptor> tupleDescriptors; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TTableDescriptor> tableDescriptors; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLOT_DESCRIPTORS((short)1, "slotDescriptors"),
    TUPLE_DESCRIPTORS((short)2, "tupleDescriptors"),
    TABLE_DESCRIPTORS((short)3, "tableDescriptors");

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
        case 1: // SLOT_DESCRIPTORS
          return SLOT_DESCRIPTORS;
        case 2: // TUPLE_DESCRIPTORS
          return TUPLE_DESCRIPTORS;
        case 3: // TABLE_DESCRIPTORS
          return TABLE_DESCRIPTORS;
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
  private static final _Fields optionals[] = {_Fields.SLOT_DESCRIPTORS,_Fields.TABLE_DESCRIPTORS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLOT_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("slotDescriptors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSlotDescriptor.class))));
    tmpMap.put(_Fields.TUPLE_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("tupleDescriptors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTupleDescriptor.class))));
    tmpMap.put(_Fields.TABLE_DESCRIPTORS, new org.apache.thrift.meta_data.FieldMetaData("tableDescriptors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableDescriptor.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDescriptorTable.class, metaDataMap);
  }

  public TDescriptorTable() {
  }

  public TDescriptorTable(
    java.util.List<TTupleDescriptor> tupleDescriptors)
  {
    this();
    this.tupleDescriptors = tupleDescriptors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDescriptorTable(TDescriptorTable other) {
    if (other.isSetSlotDescriptors()) {
      java.util.List<TSlotDescriptor> __this__slotDescriptors = new java.util.ArrayList<TSlotDescriptor>(other.slotDescriptors.size());
      for (TSlotDescriptor other_element : other.slotDescriptors) {
        __this__slotDescriptors.add(new TSlotDescriptor(other_element));
      }
      this.slotDescriptors = __this__slotDescriptors;
    }
    if (other.isSetTupleDescriptors()) {
      java.util.List<TTupleDescriptor> __this__tupleDescriptors = new java.util.ArrayList<TTupleDescriptor>(other.tupleDescriptors.size());
      for (TTupleDescriptor other_element : other.tupleDescriptors) {
        __this__tupleDescriptors.add(new TTupleDescriptor(other_element));
      }
      this.tupleDescriptors = __this__tupleDescriptors;
    }
    if (other.isSetTableDescriptors()) {
      java.util.List<TTableDescriptor> __this__tableDescriptors = new java.util.ArrayList<TTableDescriptor>(other.tableDescriptors.size());
      for (TTableDescriptor other_element : other.tableDescriptors) {
        __this__tableDescriptors.add(new TTableDescriptor(other_element));
      }
      this.tableDescriptors = __this__tableDescriptors;
    }
  }

  @Override
  public TDescriptorTable deepCopy() {
    return new TDescriptorTable(this);
  }

  @Override
  public void clear() {
    this.slotDescriptors = null;
    this.tupleDescriptors = null;
    this.tableDescriptors = null;
  }

  public int getSlotDescriptorsSize() {
    return (this.slotDescriptors == null) ? 0 : this.slotDescriptors.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TSlotDescriptor> getSlotDescriptorsIterator() {
    return (this.slotDescriptors == null) ? null : this.slotDescriptors.iterator();
  }

  public void addToSlotDescriptors(TSlotDescriptor elem) {
    if (this.slotDescriptors == null) {
      this.slotDescriptors = new java.util.ArrayList<TSlotDescriptor>();
    }
    this.slotDescriptors.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TSlotDescriptor> getSlotDescriptors() {
    return this.slotDescriptors;
  }

  public TDescriptorTable setSlotDescriptors(@org.apache.thrift.annotation.Nullable java.util.List<TSlotDescriptor> slotDescriptors) {
    this.slotDescriptors = slotDescriptors;
    return this;
  }

  public void unsetSlotDescriptors() {
    this.slotDescriptors = null;
  }

  /** Returns true if field slotDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetSlotDescriptors() {
    return this.slotDescriptors != null;
  }

  public void setSlotDescriptorsIsSet(boolean value) {
    if (!value) {
      this.slotDescriptors = null;
    }
  }

  public int getTupleDescriptorsSize() {
    return (this.tupleDescriptors == null) ? 0 : this.tupleDescriptors.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTupleDescriptor> getTupleDescriptorsIterator() {
    return (this.tupleDescriptors == null) ? null : this.tupleDescriptors.iterator();
  }

  public void addToTupleDescriptors(TTupleDescriptor elem) {
    if (this.tupleDescriptors == null) {
      this.tupleDescriptors = new java.util.ArrayList<TTupleDescriptor>();
    }
    this.tupleDescriptors.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTupleDescriptor> getTupleDescriptors() {
    return this.tupleDescriptors;
  }

  public TDescriptorTable setTupleDescriptors(@org.apache.thrift.annotation.Nullable java.util.List<TTupleDescriptor> tupleDescriptors) {
    this.tupleDescriptors = tupleDescriptors;
    return this;
  }

  public void unsetTupleDescriptors() {
    this.tupleDescriptors = null;
  }

  /** Returns true if field tupleDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleDescriptors() {
    return this.tupleDescriptors != null;
  }

  public void setTupleDescriptorsIsSet(boolean value) {
    if (!value) {
      this.tupleDescriptors = null;
    }
  }

  public int getTableDescriptorsSize() {
    return (this.tableDescriptors == null) ? 0 : this.tableDescriptors.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTableDescriptor> getTableDescriptorsIterator() {
    return (this.tableDescriptors == null) ? null : this.tableDescriptors.iterator();
  }

  public void addToTableDescriptors(TTableDescriptor elem) {
    if (this.tableDescriptors == null) {
      this.tableDescriptors = new java.util.ArrayList<TTableDescriptor>();
    }
    this.tableDescriptors.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTableDescriptor> getTableDescriptors() {
    return this.tableDescriptors;
  }

  public TDescriptorTable setTableDescriptors(@org.apache.thrift.annotation.Nullable java.util.List<TTableDescriptor> tableDescriptors) {
    this.tableDescriptors = tableDescriptors;
    return this;
  }

  public void unsetTableDescriptors() {
    this.tableDescriptors = null;
  }

  /** Returns true if field tableDescriptors is set (has been assigned a value) and false otherwise */
  public boolean isSetTableDescriptors() {
    return this.tableDescriptors != null;
  }

  public void setTableDescriptorsIsSet(boolean value) {
    if (!value) {
      this.tableDescriptors = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SLOT_DESCRIPTORS:
      if (value == null) {
        unsetSlotDescriptors();
      } else {
        setSlotDescriptors((java.util.List<TSlotDescriptor>)value);
      }
      break;

    case TUPLE_DESCRIPTORS:
      if (value == null) {
        unsetTupleDescriptors();
      } else {
        setTupleDescriptors((java.util.List<TTupleDescriptor>)value);
      }
      break;

    case TABLE_DESCRIPTORS:
      if (value == null) {
        unsetTableDescriptors();
      } else {
        setTableDescriptors((java.util.List<TTableDescriptor>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SLOT_DESCRIPTORS:
      return getSlotDescriptors();

    case TUPLE_DESCRIPTORS:
      return getTupleDescriptors();

    case TABLE_DESCRIPTORS:
      return getTableDescriptors();

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
    case SLOT_DESCRIPTORS:
      return isSetSlotDescriptors();
    case TUPLE_DESCRIPTORS:
      return isSetTupleDescriptors();
    case TABLE_DESCRIPTORS:
      return isSetTableDescriptors();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDescriptorTable)
      return this.equals((TDescriptorTable)that);
    return false;
  }

  public boolean equals(TDescriptorTable that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_slotDescriptors = true && this.isSetSlotDescriptors();
    boolean that_present_slotDescriptors = true && that.isSetSlotDescriptors();
    if (this_present_slotDescriptors || that_present_slotDescriptors) {
      if (!(this_present_slotDescriptors && that_present_slotDescriptors))
        return false;
      if (!this.slotDescriptors.equals(that.slotDescriptors))
        return false;
    }

    boolean this_present_tupleDescriptors = true && this.isSetTupleDescriptors();
    boolean that_present_tupleDescriptors = true && that.isSetTupleDescriptors();
    if (this_present_tupleDescriptors || that_present_tupleDescriptors) {
      if (!(this_present_tupleDescriptors && that_present_tupleDescriptors))
        return false;
      if (!this.tupleDescriptors.equals(that.tupleDescriptors))
        return false;
    }

    boolean this_present_tableDescriptors = true && this.isSetTableDescriptors();
    boolean that_present_tableDescriptors = true && that.isSetTableDescriptors();
    if (this_present_tableDescriptors || that_present_tableDescriptors) {
      if (!(this_present_tableDescriptors && that_present_tableDescriptors))
        return false;
      if (!this.tableDescriptors.equals(that.tableDescriptors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSlotDescriptors()) ? 131071 : 524287);
    if (isSetSlotDescriptors())
      hashCode = hashCode * 8191 + slotDescriptors.hashCode();

    hashCode = hashCode * 8191 + ((isSetTupleDescriptors()) ? 131071 : 524287);
    if (isSetTupleDescriptors())
      hashCode = hashCode * 8191 + tupleDescriptors.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableDescriptors()) ? 131071 : 524287);
    if (isSetTableDescriptors())
      hashCode = hashCode * 8191 + tableDescriptors.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDescriptorTable other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSlotDescriptors(), other.isSetSlotDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlotDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slotDescriptors, other.slotDescriptors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTupleDescriptors(), other.isSetTupleDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tupleDescriptors, other.tupleDescriptors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableDescriptors(), other.isSetTableDescriptors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableDescriptors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableDescriptors, other.tableDescriptors);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDescriptorTable(");
    boolean first = true;

    if (isSetSlotDescriptors()) {
      sb.append("slotDescriptors:");
      if (this.slotDescriptors == null) {
        sb.append("null");
      } else {
        sb.append(this.slotDescriptors);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("tupleDescriptors:");
    if (this.tupleDescriptors == null) {
      sb.append("null");
    } else {
      sb.append(this.tupleDescriptors);
    }
    first = false;
    if (isSetTableDescriptors()) {
      if (!first) sb.append(", ");
      sb.append("tableDescriptors:");
      if (this.tableDescriptors == null) {
        sb.append("null");
      } else {
        sb.append(this.tableDescriptors);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tupleDescriptors == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tupleDescriptors' was not present! Struct: " + toString());
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

  private static class TDescriptorTableStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TDescriptorTableStandardScheme getScheme() {
      return new TDescriptorTableStandardScheme();
    }
  }

  private static class TDescriptorTableStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDescriptorTable> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TDescriptorTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLOT_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list200 = iprot.readListBegin();
                struct.slotDescriptors = new java.util.ArrayList<TSlotDescriptor>(_list200.size);
                @org.apache.thrift.annotation.Nullable TSlotDescriptor _elem201;
                for (int _i202 = 0; _i202 < _list200.size; ++_i202)
                {
                  _elem201 = new TSlotDescriptor();
                  _elem201.read(iprot);
                  struct.slotDescriptors.add(_elem201);
                }
                iprot.readListEnd();
              }
              struct.setSlotDescriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TUPLE_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list203 = iprot.readListBegin();
                struct.tupleDescriptors = new java.util.ArrayList<TTupleDescriptor>(_list203.size);
                @org.apache.thrift.annotation.Nullable TTupleDescriptor _elem204;
                for (int _i205 = 0; _i205 < _list203.size; ++_i205)
                {
                  _elem204 = new TTupleDescriptor();
                  _elem204.read(iprot);
                  struct.tupleDescriptors.add(_elem204);
                }
                iprot.readListEnd();
              }
              struct.setTupleDescriptorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_DESCRIPTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list206 = iprot.readListBegin();
                struct.tableDescriptors = new java.util.ArrayList<TTableDescriptor>(_list206.size);
                @org.apache.thrift.annotation.Nullable TTableDescriptor _elem207;
                for (int _i208 = 0; _i208 < _list206.size; ++_i208)
                {
                  _elem207 = new TTableDescriptor();
                  _elem207.read(iprot);
                  struct.tableDescriptors.add(_elem207);
                }
                iprot.readListEnd();
              }
              struct.setTableDescriptorsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TDescriptorTable struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slotDescriptors != null) {
        if (struct.isSetSlotDescriptors()) {
          oprot.writeFieldBegin(SLOT_DESCRIPTORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.slotDescriptors.size()));
            for (TSlotDescriptor _iter209 : struct.slotDescriptors)
            {
              _iter209.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.tupleDescriptors != null) {
        oprot.writeFieldBegin(TUPLE_DESCRIPTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tupleDescriptors.size()));
          for (TTupleDescriptor _iter210 : struct.tupleDescriptors)
          {
            _iter210.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tableDescriptors != null) {
        if (struct.isSetTableDescriptors()) {
          oprot.writeFieldBegin(TABLE_DESCRIPTORS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tableDescriptors.size()));
            for (TTableDescriptor _iter211 : struct.tableDescriptors)
            {
              _iter211.write(oprot);
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

  private static class TDescriptorTableTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TDescriptorTableTupleScheme getScheme() {
      return new TDescriptorTableTupleScheme();
    }
  }

  private static class TDescriptorTableTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDescriptorTable> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDescriptorTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tupleDescriptors.size());
        for (TTupleDescriptor _iter212 : struct.tupleDescriptors)
        {
          _iter212.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSlotDescriptors()) {
        optionals.set(0);
      }
      if (struct.isSetTableDescriptors()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSlotDescriptors()) {
        {
          oprot.writeI32(struct.slotDescriptors.size());
          for (TSlotDescriptor _iter213 : struct.slotDescriptors)
          {
            _iter213.write(oprot);
          }
        }
      }
      if (struct.isSetTableDescriptors()) {
        {
          oprot.writeI32(struct.tableDescriptors.size());
          for (TTableDescriptor _iter214 : struct.tableDescriptors)
          {
            _iter214.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDescriptorTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list215 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.tupleDescriptors = new java.util.ArrayList<TTupleDescriptor>(_list215.size);
        @org.apache.thrift.annotation.Nullable TTupleDescriptor _elem216;
        for (int _i217 = 0; _i217 < _list215.size; ++_i217)
        {
          _elem216 = new TTupleDescriptor();
          _elem216.read(iprot);
          struct.tupleDescriptors.add(_elem216);
        }
      }
      struct.setTupleDescriptorsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list218 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.slotDescriptors = new java.util.ArrayList<TSlotDescriptor>(_list218.size);
          @org.apache.thrift.annotation.Nullable TSlotDescriptor _elem219;
          for (int _i220 = 0; _i220 < _list218.size; ++_i220)
          {
            _elem219 = new TSlotDescriptor();
            _elem219.read(iprot);
            struct.slotDescriptors.add(_elem219);
          }
        }
        struct.setSlotDescriptorsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list221 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.tableDescriptors = new java.util.ArrayList<TTableDescriptor>(_list221.size);
          @org.apache.thrift.annotation.Nullable TTableDescriptor _elem222;
          for (int _i223 = 0; _i223 < _list221.size; ++_i223)
          {
            _elem222 = new TTableDescriptor();
            _elem222.read(iprot);
            struct.tableDescriptors.add(_elem222);
          }
        }
        struct.setTableDescriptorsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

