/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-20")
public class TMetricDef implements org.apache.thrift.TBase<TMetricDef, TMetricDef._Fields>, java.io.Serializable, Cloneable, Comparable<TMetricDef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMetricDef");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KIND_FIELD_DESC = new org.apache.thrift.protocol.TField("kind", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField UNITS_FIELD_DESC = new org.apache.thrift.protocol.TField("units", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CONTEXTS_FIELD_DESC = new org.apache.thrift.protocol.TField("contexts", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("label", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMetricDefStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMetricDefTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String key; // optional
  /**
   * 
   * @see org.apache.doris.thrift.TMetricKind
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetricKind kind; // optional
  /**
   * 
   * @see org.apache.doris.thrift.TUnit
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUnit units; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> contexts; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String label; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String description; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    /**
     * 
     * @see org.apache.doris.thrift.TMetricKind
     */
    KIND((short)2, "kind"),
    /**
     * 
     * @see org.apache.doris.thrift.TUnit
     */
    UNITS((short)3, "units"),
    CONTEXTS((short)4, "contexts"),
    LABEL((short)5, "label"),
    DESCRIPTION((short)6, "description");

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
        case 1: // KEY
          return KEY;
        case 2: // KIND
          return KIND;
        case 3: // UNITS
          return UNITS;
        case 4: // CONTEXTS
          return CONTEXTS;
        case 5: // LABEL
          return LABEL;
        case 6: // DESCRIPTION
          return DESCRIPTION;
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
  private static final _Fields optionals[] = {_Fields.KEY,_Fields.KIND,_Fields.UNITS,_Fields.CONTEXTS,_Fields.LABEL,_Fields.DESCRIPTION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KIND, new org.apache.thrift.meta_data.FieldMetaData("kind", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TMetricKind.class)));
    tmpMap.put(_Fields.UNITS, new org.apache.thrift.meta_data.FieldMetaData("units", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TUnit.class)));
    tmpMap.put(_Fields.CONTEXTS, new org.apache.thrift.meta_data.FieldMetaData("contexts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.LABEL, new org.apache.thrift.meta_data.FieldMetaData("label", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMetricDef.class, metaDataMap);
  }

  public TMetricDef() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMetricDef(TMetricDef other) {
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetKind()) {
      this.kind = other.kind;
    }
    if (other.isSetUnits()) {
      this.units = other.units;
    }
    if (other.isSetContexts()) {
      java.util.List<java.lang.String> __this__contexts = new java.util.ArrayList<java.lang.String>(other.contexts);
      this.contexts = __this__contexts;
    }
    if (other.isSetLabel()) {
      this.label = other.label;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
  }

  @Override
  public TMetricDef deepCopy() {
    return new TMetricDef(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.kind = null;
    this.units = null;
    this.contexts = null;
    this.label = null;
    this.description = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getKey() {
    return this.key;
  }

  public TMetricDef setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetricKind
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TMetricKind getKind() {
    return this.kind;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetricKind
   */
  public TMetricDef setKind(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetricKind kind) {
    this.kind = kind;
    return this;
  }

  public void unsetKind() {
    this.kind = null;
  }

  /** Returns true if field kind is set (has been assigned a value) and false otherwise */
  public boolean isSetKind() {
    return this.kind != null;
  }

  public void setKindIsSet(boolean value) {
    if (!value) {
      this.kind = null;
    }
  }

  /**
   * 
   * @see org.apache.doris.thrift.TUnit
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUnit getUnits() {
    return this.units;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TUnit
   */
  public TMetricDef setUnits(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUnit units) {
    this.units = units;
    return this;
  }

  public void unsetUnits() {
    this.units = null;
  }

  /** Returns true if field units is set (has been assigned a value) and false otherwise */
  public boolean isSetUnits() {
    return this.units != null;
  }

  public void setUnitsIsSet(boolean value) {
    if (!value) {
      this.units = null;
    }
  }

  public int getContextsSize() {
    return (this.contexts == null) ? 0 : this.contexts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getContextsIterator() {
    return (this.contexts == null) ? null : this.contexts.iterator();
  }

  public void addToContexts(java.lang.String elem) {
    if (this.contexts == null) {
      this.contexts = new java.util.ArrayList<java.lang.String>();
    }
    this.contexts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getContexts() {
    return this.contexts;
  }

  public TMetricDef setContexts(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> contexts) {
    this.contexts = contexts;
    return this;
  }

  public void unsetContexts() {
    this.contexts = null;
  }

  /** Returns true if field contexts is set (has been assigned a value) and false otherwise */
  public boolean isSetContexts() {
    return this.contexts != null;
  }

  public void setContextsIsSet(boolean value) {
    if (!value) {
      this.contexts = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLabel() {
    return this.label;
  }

  public TMetricDef setLabel(@org.apache.thrift.annotation.Nullable java.lang.String label) {
    this.label = label;
    return this;
  }

  public void unsetLabel() {
    this.label = null;
  }

  /** Returns true if field label is set (has been assigned a value) and false otherwise */
  public boolean isSetLabel() {
    return this.label != null;
  }

  public void setLabelIsSet(boolean value) {
    if (!value) {
      this.label = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDescription() {
    return this.description;
  }

  public TMetricDef setDescription(@org.apache.thrift.annotation.Nullable java.lang.String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((java.lang.String)value);
      }
      break;

    case KIND:
      if (value == null) {
        unsetKind();
      } else {
        setKind((org.apache.doris.thrift.TMetricKind)value);
      }
      break;

    case UNITS:
      if (value == null) {
        unsetUnits();
      } else {
        setUnits((org.apache.doris.thrift.TUnit)value);
      }
      break;

    case CONTEXTS:
      if (value == null) {
        unsetContexts();
      } else {
        setContexts((java.util.List<java.lang.String>)value);
      }
      break;

    case LABEL:
      if (value == null) {
        unsetLabel();
      } else {
        setLabel((java.lang.String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case KIND:
      return getKind();

    case UNITS:
      return getUnits();

    case CONTEXTS:
      return getContexts();

    case LABEL:
      return getLabel();

    case DESCRIPTION:
      return getDescription();

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
    case KEY:
      return isSetKey();
    case KIND:
      return isSetKind();
    case UNITS:
      return isSetUnits();
    case CONTEXTS:
      return isSetContexts();
    case LABEL:
      return isSetLabel();
    case DESCRIPTION:
      return isSetDescription();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMetricDef)
      return this.equals((TMetricDef)that);
    return false;
  }

  public boolean equals(TMetricDef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_kind = true && this.isSetKind();
    boolean that_present_kind = true && that.isSetKind();
    if (this_present_kind || that_present_kind) {
      if (!(this_present_kind && that_present_kind))
        return false;
      if (!this.kind.equals(that.kind))
        return false;
    }

    boolean this_present_units = true && this.isSetUnits();
    boolean that_present_units = true && that.isSetUnits();
    if (this_present_units || that_present_units) {
      if (!(this_present_units && that_present_units))
        return false;
      if (!this.units.equals(that.units))
        return false;
    }

    boolean this_present_contexts = true && this.isSetContexts();
    boolean that_present_contexts = true && that.isSetContexts();
    if (this_present_contexts || that_present_contexts) {
      if (!(this_present_contexts && that_present_contexts))
        return false;
      if (!this.contexts.equals(that.contexts))
        return false;
    }

    boolean this_present_label = true && this.isSetLabel();
    boolean that_present_label = true && that.isSetLabel();
    if (this_present_label || that_present_label) {
      if (!(this_present_label && that_present_label))
        return false;
      if (!this.label.equals(that.label))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((isSetKind()) ? 131071 : 524287);
    if (isSetKind())
      hashCode = hashCode * 8191 + kind.getValue();

    hashCode = hashCode * 8191 + ((isSetUnits()) ? 131071 : 524287);
    if (isSetUnits())
      hashCode = hashCode * 8191 + units.getValue();

    hashCode = hashCode * 8191 + ((isSetContexts()) ? 131071 : 524287);
    if (isSetContexts())
      hashCode = hashCode * 8191 + contexts.hashCode();

    hashCode = hashCode * 8191 + ((isSetLabel()) ? 131071 : 524287);
    if (isSetLabel())
      hashCode = hashCode * 8191 + label.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMetricDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetKey(), other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetKind(), other.isSetKind());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKind()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kind, other.kind);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUnits(), other.isSetUnits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.units, other.units);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetContexts(), other.isSetContexts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContexts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contexts, other.contexts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLabel(), other.isSetLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.label, other.label);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDescription(), other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMetricDef(");
    boolean first = true;

    if (isSetKey()) {
      sb.append("key:");
      if (this.key == null) {
        sb.append("null");
      } else {
        sb.append(this.key);
      }
      first = false;
    }
    if (isSetKind()) {
      if (!first) sb.append(", ");
      sb.append("kind:");
      if (this.kind == null) {
        sb.append("null");
      } else {
        sb.append(this.kind);
      }
      first = false;
    }
    if (isSetUnits()) {
      if (!first) sb.append(", ");
      sb.append("units:");
      if (this.units == null) {
        sb.append("null");
      } else {
        sb.append(this.units);
      }
      first = false;
    }
    if (isSetContexts()) {
      if (!first) sb.append(", ");
      sb.append("contexts:");
      if (this.contexts == null) {
        sb.append("null");
      } else {
        sb.append(this.contexts);
      }
      first = false;
    }
    if (isSetLabel()) {
      if (!first) sb.append(", ");
      sb.append("label:");
      if (this.label == null) {
        sb.append("null");
      } else {
        sb.append(this.label);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
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

  private static class TMetricDefStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetricDefStandardScheme getScheme() {
      return new TMetricDefStandardScheme();
    }
  }

  private static class TMetricDefStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMetricDef> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMetricDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KIND
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.kind = org.apache.doris.thrift.TMetricKind.findByValue(iprot.readI32());
              struct.setKindIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UNITS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.units = org.apache.doris.thrift.TUnit.findByValue(iprot.readI32());
              struct.setUnitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTEXTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.contexts = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.contexts.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setContextsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.label = iprot.readString();
              struct.setLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMetricDef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        if (struct.isSetKey()) {
          oprot.writeFieldBegin(KEY_FIELD_DESC);
          oprot.writeString(struct.key);
          oprot.writeFieldEnd();
        }
      }
      if (struct.kind != null) {
        if (struct.isSetKind()) {
          oprot.writeFieldBegin(KIND_FIELD_DESC);
          oprot.writeI32(struct.kind.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.units != null) {
        if (struct.isSetUnits()) {
          oprot.writeFieldBegin(UNITS_FIELD_DESC);
          oprot.writeI32(struct.units.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.contexts != null) {
        if (struct.isSetContexts()) {
          oprot.writeFieldBegin(CONTEXTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.contexts.size()));
            for (java.lang.String _iter3 : struct.contexts)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.label != null) {
        if (struct.isSetLabel()) {
          oprot.writeFieldBegin(LABEL_FIELD_DESC);
          oprot.writeString(struct.label);
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMetricDefTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetricDefTupleScheme getScheme() {
      return new TMetricDefTupleScheme();
    }
  }

  private static class TMetricDefTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMetricDef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMetricDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetKind()) {
        optionals.set(1);
      }
      if (struct.isSetUnits()) {
        optionals.set(2);
      }
      if (struct.isSetContexts()) {
        optionals.set(3);
      }
      if (struct.isSetLabel()) {
        optionals.set(4);
      }
      if (struct.isSetDescription()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetKey()) {
        oprot.writeString(struct.key);
      }
      if (struct.isSetKind()) {
        oprot.writeI32(struct.kind.getValue());
      }
      if (struct.isSetUnits()) {
        oprot.writeI32(struct.units.getValue());
      }
      if (struct.isSetContexts()) {
        {
          oprot.writeI32(struct.contexts.size());
          for (java.lang.String _iter4 : struct.contexts)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetLabel()) {
        oprot.writeString(struct.label);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMetricDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.key = iprot.readString();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.kind = org.apache.doris.thrift.TMetricKind.findByValue(iprot.readI32());
        struct.setKindIsSet(true);
      }
      if (incoming.get(2)) {
        struct.units = org.apache.doris.thrift.TUnit.findByValue(iprot.readI32());
        struct.setUnitsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.contexts = new java.util.ArrayList<java.lang.String>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.contexts.add(_elem6);
          }
        }
        struct.setContextsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.label = iprot.readString();
        struct.setLabelIsSet(true);
      }
      if (incoming.get(5)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

