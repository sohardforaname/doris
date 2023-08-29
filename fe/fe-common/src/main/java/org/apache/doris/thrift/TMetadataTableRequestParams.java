/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-08-29")
public class TMetadataTableRequestParams implements org.apache.thrift.TBase<TMetadataTableRequestParams, TMetadataTableRequestParams._Fields>, java.io.Serializable, Cloneable, Comparable<TMetadataTableRequestParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMetadataTableRequestParams");

  private static final org.apache.thrift.protocol.TField METADATA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ICEBERG_METADATA_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("iceberg_metadata_params", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BACKENDS_METADATA_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("backends_metadata_params", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField COLUMNS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("columns_name", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField FRONTENDS_METADATA_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("frontends_metadata_params", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField CURRENT_USER_IDENT_FIELD_DESC = new org.apache.thrift.protocol.TField("current_user_ident", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMetadataTableRequestParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMetadataTableRequestParamsTupleSchemeFactory();

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TIcebergMetadataParams iceberg_metadata_params; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TBackendsMetadataParams backends_metadata_params; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns_name; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TFrontendsMetadataParams frontends_metadata_params; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.doris.thrift.TMetadataType
     */
    METADATA_TYPE((short)1, "metadata_type"),
    ICEBERG_METADATA_PARAMS((short)2, "iceberg_metadata_params"),
    BACKENDS_METADATA_PARAMS((short)3, "backends_metadata_params"),
    COLUMNS_NAME((short)4, "columns_name"),
    FRONTENDS_METADATA_PARAMS((short)5, "frontends_metadata_params"),
    CURRENT_USER_IDENT((short)6, "current_user_ident");

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
        case 1: // METADATA_TYPE
          return METADATA_TYPE;
        case 2: // ICEBERG_METADATA_PARAMS
          return ICEBERG_METADATA_PARAMS;
        case 3: // BACKENDS_METADATA_PARAMS
          return BACKENDS_METADATA_PARAMS;
        case 4: // COLUMNS_NAME
          return COLUMNS_NAME;
        case 5: // FRONTENDS_METADATA_PARAMS
          return FRONTENDS_METADATA_PARAMS;
        case 6: // CURRENT_USER_IDENT
          return CURRENT_USER_IDENT;
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
  private static final _Fields optionals[] = {_Fields.METADATA_TYPE,_Fields.ICEBERG_METADATA_PARAMS,_Fields.BACKENDS_METADATA_PARAMS,_Fields.COLUMNS_NAME,_Fields.FRONTENDS_METADATA_PARAMS,_Fields.CURRENT_USER_IDENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("metadata_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TMetadataType.class)));
    tmpMap.put(_Fields.ICEBERG_METADATA_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("iceberg_metadata_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TIcebergMetadataParams.class)));
    tmpMap.put(_Fields.BACKENDS_METADATA_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("backends_metadata_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TBackendsMetadataParams.class)));
    tmpMap.put(_Fields.COLUMNS_NAME, new org.apache.thrift.meta_data.FieldMetaData("columns_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.FRONTENDS_METADATA_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("frontends_metadata_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TFrontendsMetadataParams.class)));
    tmpMap.put(_Fields.CURRENT_USER_IDENT, new org.apache.thrift.meta_data.FieldMetaData("current_user_ident", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUserIdentity.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMetadataTableRequestParams.class, metaDataMap);
  }

  public TMetadataTableRequestParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMetadataTableRequestParams(TMetadataTableRequestParams other) {
    if (other.isSetMetadataType()) {
      this.metadata_type = other.metadata_type;
    }
    if (other.isSetIcebergMetadataParams()) {
      this.iceberg_metadata_params = new org.apache.doris.thrift.TIcebergMetadataParams(other.iceberg_metadata_params);
    }
    if (other.isSetBackendsMetadataParams()) {
      this.backends_metadata_params = new org.apache.doris.thrift.TBackendsMetadataParams(other.backends_metadata_params);
    }
    if (other.isSetColumnsName()) {
      java.util.List<java.lang.String> __this__columns_name = new java.util.ArrayList<java.lang.String>(other.columns_name);
      this.columns_name = __this__columns_name;
    }
    if (other.isSetFrontendsMetadataParams()) {
      this.frontends_metadata_params = new org.apache.doris.thrift.TFrontendsMetadataParams(other.frontends_metadata_params);
    }
    if (other.isSetCurrentUserIdent()) {
      this.current_user_ident = new org.apache.doris.thrift.TUserIdentity(other.current_user_ident);
    }
  }

  @Override
  public TMetadataTableRequestParams deepCopy() {
    return new TMetadataTableRequestParams(this);
  }

  @Override
  public void clear() {
    this.metadata_type = null;
    this.iceberg_metadata_params = null;
    this.backends_metadata_params = null;
    this.columns_name = null;
    this.frontends_metadata_params = null;
    this.current_user_ident = null;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TMetadataType getMetadataType() {
    return this.metadata_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public TMetadataTableRequestParams setMetadataType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type) {
    this.metadata_type = metadata_type;
    return this;
  }

  public void unsetMetadataType() {
    this.metadata_type = null;
  }

  /** Returns true if field metadata_type is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataType() {
    return this.metadata_type != null;
  }

  public void setMetadataTypeIsSet(boolean value) {
    if (!value) {
      this.metadata_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TIcebergMetadataParams getIcebergMetadataParams() {
    return this.iceberg_metadata_params;
  }

  public TMetadataTableRequestParams setIcebergMetadataParams(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TIcebergMetadataParams iceberg_metadata_params) {
    this.iceberg_metadata_params = iceberg_metadata_params;
    return this;
  }

  public void unsetIcebergMetadataParams() {
    this.iceberg_metadata_params = null;
  }

  /** Returns true if field iceberg_metadata_params is set (has been assigned a value) and false otherwise */
  public boolean isSetIcebergMetadataParams() {
    return this.iceberg_metadata_params != null;
  }

  public void setIcebergMetadataParamsIsSet(boolean value) {
    if (!value) {
      this.iceberg_metadata_params = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TBackendsMetadataParams getBackendsMetadataParams() {
    return this.backends_metadata_params;
  }

  public TMetadataTableRequestParams setBackendsMetadataParams(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TBackendsMetadataParams backends_metadata_params) {
    this.backends_metadata_params = backends_metadata_params;
    return this;
  }

  public void unsetBackendsMetadataParams() {
    this.backends_metadata_params = null;
  }

  /** Returns true if field backends_metadata_params is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendsMetadataParams() {
    return this.backends_metadata_params != null;
  }

  public void setBackendsMetadataParamsIsSet(boolean value) {
    if (!value) {
      this.backends_metadata_params = null;
    }
  }

  public int getColumnsNameSize() {
    return (this.columns_name == null) ? 0 : this.columns_name.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnsNameIterator() {
    return (this.columns_name == null) ? null : this.columns_name.iterator();
  }

  public void addToColumnsName(java.lang.String elem) {
    if (this.columns_name == null) {
      this.columns_name = new java.util.ArrayList<java.lang.String>();
    }
    this.columns_name.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumnsName() {
    return this.columns_name;
  }

  public TMetadataTableRequestParams setColumnsName(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns_name) {
    this.columns_name = columns_name;
    return this;
  }

  public void unsetColumnsName() {
    this.columns_name = null;
  }

  /** Returns true if field columns_name is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnsName() {
    return this.columns_name != null;
  }

  public void setColumnsNameIsSet(boolean value) {
    if (!value) {
      this.columns_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TFrontendsMetadataParams getFrontendsMetadataParams() {
    return this.frontends_metadata_params;
  }

  public TMetadataTableRequestParams setFrontendsMetadataParams(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TFrontendsMetadataParams frontends_metadata_params) {
    this.frontends_metadata_params = frontends_metadata_params;
    return this;
  }

  public void unsetFrontendsMetadataParams() {
    this.frontends_metadata_params = null;
  }

  /** Returns true if field frontends_metadata_params is set (has been assigned a value) and false otherwise */
  public boolean isSetFrontendsMetadataParams() {
    return this.frontends_metadata_params != null;
  }

  public void setFrontendsMetadataParamsIsSet(boolean value) {
    if (!value) {
      this.frontends_metadata_params = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUserIdentity getCurrentUserIdent() {
    return this.current_user_ident;
  }

  public TMetadataTableRequestParams setCurrentUserIdent(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident) {
    this.current_user_ident = current_user_ident;
    return this;
  }

  public void unsetCurrentUserIdent() {
    this.current_user_ident = null;
  }

  /** Returns true if field current_user_ident is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentUserIdent() {
    return this.current_user_ident != null;
  }

  public void setCurrentUserIdentIsSet(boolean value) {
    if (!value) {
      this.current_user_ident = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case METADATA_TYPE:
      if (value == null) {
        unsetMetadataType();
      } else {
        setMetadataType((org.apache.doris.thrift.TMetadataType)value);
      }
      break;

    case ICEBERG_METADATA_PARAMS:
      if (value == null) {
        unsetIcebergMetadataParams();
      } else {
        setIcebergMetadataParams((org.apache.doris.thrift.TIcebergMetadataParams)value);
      }
      break;

    case BACKENDS_METADATA_PARAMS:
      if (value == null) {
        unsetBackendsMetadataParams();
      } else {
        setBackendsMetadataParams((org.apache.doris.thrift.TBackendsMetadataParams)value);
      }
      break;

    case COLUMNS_NAME:
      if (value == null) {
        unsetColumnsName();
      } else {
        setColumnsName((java.util.List<java.lang.String>)value);
      }
      break;

    case FRONTENDS_METADATA_PARAMS:
      if (value == null) {
        unsetFrontendsMetadataParams();
      } else {
        setFrontendsMetadataParams((org.apache.doris.thrift.TFrontendsMetadataParams)value);
      }
      break;

    case CURRENT_USER_IDENT:
      if (value == null) {
        unsetCurrentUserIdent();
      } else {
        setCurrentUserIdent((org.apache.doris.thrift.TUserIdentity)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_TYPE:
      return getMetadataType();

    case ICEBERG_METADATA_PARAMS:
      return getIcebergMetadataParams();

    case BACKENDS_METADATA_PARAMS:
      return getBackendsMetadataParams();

    case COLUMNS_NAME:
      return getColumnsName();

    case FRONTENDS_METADATA_PARAMS:
      return getFrontendsMetadataParams();

    case CURRENT_USER_IDENT:
      return getCurrentUserIdent();

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
    case METADATA_TYPE:
      return isSetMetadataType();
    case ICEBERG_METADATA_PARAMS:
      return isSetIcebergMetadataParams();
    case BACKENDS_METADATA_PARAMS:
      return isSetBackendsMetadataParams();
    case COLUMNS_NAME:
      return isSetColumnsName();
    case FRONTENDS_METADATA_PARAMS:
      return isSetFrontendsMetadataParams();
    case CURRENT_USER_IDENT:
      return isSetCurrentUserIdent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMetadataTableRequestParams)
      return this.equals((TMetadataTableRequestParams)that);
    return false;
  }

  public boolean equals(TMetadataTableRequestParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metadata_type = true && this.isSetMetadataType();
    boolean that_present_metadata_type = true && that.isSetMetadataType();
    if (this_present_metadata_type || that_present_metadata_type) {
      if (!(this_present_metadata_type && that_present_metadata_type))
        return false;
      if (!this.metadata_type.equals(that.metadata_type))
        return false;
    }

    boolean this_present_iceberg_metadata_params = true && this.isSetIcebergMetadataParams();
    boolean that_present_iceberg_metadata_params = true && that.isSetIcebergMetadataParams();
    if (this_present_iceberg_metadata_params || that_present_iceberg_metadata_params) {
      if (!(this_present_iceberg_metadata_params && that_present_iceberg_metadata_params))
        return false;
      if (!this.iceberg_metadata_params.equals(that.iceberg_metadata_params))
        return false;
    }

    boolean this_present_backends_metadata_params = true && this.isSetBackendsMetadataParams();
    boolean that_present_backends_metadata_params = true && that.isSetBackendsMetadataParams();
    if (this_present_backends_metadata_params || that_present_backends_metadata_params) {
      if (!(this_present_backends_metadata_params && that_present_backends_metadata_params))
        return false;
      if (!this.backends_metadata_params.equals(that.backends_metadata_params))
        return false;
    }

    boolean this_present_columns_name = true && this.isSetColumnsName();
    boolean that_present_columns_name = true && that.isSetColumnsName();
    if (this_present_columns_name || that_present_columns_name) {
      if (!(this_present_columns_name && that_present_columns_name))
        return false;
      if (!this.columns_name.equals(that.columns_name))
        return false;
    }

    boolean this_present_frontends_metadata_params = true && this.isSetFrontendsMetadataParams();
    boolean that_present_frontends_metadata_params = true && that.isSetFrontendsMetadataParams();
    if (this_present_frontends_metadata_params || that_present_frontends_metadata_params) {
      if (!(this_present_frontends_metadata_params && that_present_frontends_metadata_params))
        return false;
      if (!this.frontends_metadata_params.equals(that.frontends_metadata_params))
        return false;
    }

    boolean this_present_current_user_ident = true && this.isSetCurrentUserIdent();
    boolean that_present_current_user_ident = true && that.isSetCurrentUserIdent();
    if (this_present_current_user_ident || that_present_current_user_ident) {
      if (!(this_present_current_user_ident && that_present_current_user_ident))
        return false;
      if (!this.current_user_ident.equals(that.current_user_ident))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetadataType()) ? 131071 : 524287);
    if (isSetMetadataType())
      hashCode = hashCode * 8191 + metadata_type.getValue();

    hashCode = hashCode * 8191 + ((isSetIcebergMetadataParams()) ? 131071 : 524287);
    if (isSetIcebergMetadataParams())
      hashCode = hashCode * 8191 + iceberg_metadata_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetBackendsMetadataParams()) ? 131071 : 524287);
    if (isSetBackendsMetadataParams())
      hashCode = hashCode * 8191 + backends_metadata_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumnsName()) ? 131071 : 524287);
    if (isSetColumnsName())
      hashCode = hashCode * 8191 + columns_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetFrontendsMetadataParams()) ? 131071 : 524287);
    if (isSetFrontendsMetadataParams())
      hashCode = hashCode * 8191 + frontends_metadata_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetCurrentUserIdent()) ? 131071 : 524287);
    if (isSetCurrentUserIdent())
      hashCode = hashCode * 8191 + current_user_ident.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMetadataTableRequestParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMetadataType(), other.isSetMetadataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata_type, other.metadata_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIcebergMetadataParams(), other.isSetIcebergMetadataParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcebergMetadataParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iceberg_metadata_params, other.iceberg_metadata_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBackendsMetadataParams(), other.isSetBackendsMetadataParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendsMetadataParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backends_metadata_params, other.backends_metadata_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnsName(), other.isSetColumnsName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnsName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns_name, other.columns_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFrontendsMetadataParams(), other.isSetFrontendsMetadataParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrontendsMetadataParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frontends_metadata_params, other.frontends_metadata_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCurrentUserIdent(), other.isSetCurrentUserIdent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentUserIdent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_user_ident, other.current_user_ident);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMetadataTableRequestParams(");
    boolean first = true;

    if (isSetMetadataType()) {
      sb.append("metadata_type:");
      if (this.metadata_type == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata_type);
      }
      first = false;
    }
    if (isSetIcebergMetadataParams()) {
      if (!first) sb.append(", ");
      sb.append("iceberg_metadata_params:");
      if (this.iceberg_metadata_params == null) {
        sb.append("null");
      } else {
        sb.append(this.iceberg_metadata_params);
      }
      first = false;
    }
    if (isSetBackendsMetadataParams()) {
      if (!first) sb.append(", ");
      sb.append("backends_metadata_params:");
      if (this.backends_metadata_params == null) {
        sb.append("null");
      } else {
        sb.append(this.backends_metadata_params);
      }
      first = false;
    }
    if (isSetColumnsName()) {
      if (!first) sb.append(", ");
      sb.append("columns_name:");
      if (this.columns_name == null) {
        sb.append("null");
      } else {
        sb.append(this.columns_name);
      }
      first = false;
    }
    if (isSetFrontendsMetadataParams()) {
      if (!first) sb.append(", ");
      sb.append("frontends_metadata_params:");
      if (this.frontends_metadata_params == null) {
        sb.append("null");
      } else {
        sb.append(this.frontends_metadata_params);
      }
      first = false;
    }
    if (isSetCurrentUserIdent()) {
      if (!first) sb.append(", ");
      sb.append("current_user_ident:");
      if (this.current_user_ident == null) {
        sb.append("null");
      } else {
        sb.append(this.current_user_ident);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (iceberg_metadata_params != null) {
      iceberg_metadata_params.validate();
    }
    if (backends_metadata_params != null) {
      backends_metadata_params.validate();
    }
    if (frontends_metadata_params != null) {
      frontends_metadata_params.validate();
    }
    if (current_user_ident != null) {
      current_user_ident.validate();
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

  private static class TMetadataTableRequestParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetadataTableRequestParamsStandardScheme getScheme() {
      return new TMetadataTableRequestParamsStandardScheme();
    }
  }

  private static class TMetadataTableRequestParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMetadataTableRequestParams> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TMetadataTableRequestParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
              struct.setMetadataTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ICEBERG_METADATA_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.iceberg_metadata_params = new org.apache.doris.thrift.TIcebergMetadataParams();
              struct.iceberg_metadata_params.read(iprot);
              struct.setIcebergMetadataParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BACKENDS_METADATA_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.backends_metadata_params = new org.apache.doris.thrift.TBackendsMetadataParams();
              struct.backends_metadata_params.read(iprot);
              struct.setBackendsMetadataParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLUMNS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list324 = iprot.readListBegin();
                struct.columns_name = new java.util.ArrayList<java.lang.String>(_list324.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem325;
                for (int _i326 = 0; _i326 < _list324.size; ++_i326)
                {
                  _elem325 = iprot.readString();
                  struct.columns_name.add(_elem325);
                }
                iprot.readListEnd();
              }
              struct.setColumnsNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FRONTENDS_METADATA_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.frontends_metadata_params = new org.apache.doris.thrift.TFrontendsMetadataParams();
              struct.frontends_metadata_params.read(iprot);
              struct.setFrontendsMetadataParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CURRENT_USER_IDENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
              struct.current_user_ident.read(iprot);
              struct.setCurrentUserIdentIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TMetadataTableRequestParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata_type != null) {
        if (struct.isSetMetadataType()) {
          oprot.writeFieldBegin(METADATA_TYPE_FIELD_DESC);
          oprot.writeI32(struct.metadata_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.iceberg_metadata_params != null) {
        if (struct.isSetIcebergMetadataParams()) {
          oprot.writeFieldBegin(ICEBERG_METADATA_PARAMS_FIELD_DESC);
          struct.iceberg_metadata_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.backends_metadata_params != null) {
        if (struct.isSetBackendsMetadataParams()) {
          oprot.writeFieldBegin(BACKENDS_METADATA_PARAMS_FIELD_DESC);
          struct.backends_metadata_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.columns_name != null) {
        if (struct.isSetColumnsName()) {
          oprot.writeFieldBegin(COLUMNS_NAME_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns_name.size()));
            for (java.lang.String _iter327 : struct.columns_name)
            {
              oprot.writeString(_iter327);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.frontends_metadata_params != null) {
        if (struct.isSetFrontendsMetadataParams()) {
          oprot.writeFieldBegin(FRONTENDS_METADATA_PARAMS_FIELD_DESC);
          struct.frontends_metadata_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.current_user_ident != null) {
        if (struct.isSetCurrentUserIdent()) {
          oprot.writeFieldBegin(CURRENT_USER_IDENT_FIELD_DESC);
          struct.current_user_ident.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMetadataTableRequestParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TMetadataTableRequestParamsTupleScheme getScheme() {
      return new TMetadataTableRequestParamsTupleScheme();
    }
  }

  private static class TMetadataTableRequestParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMetadataTableRequestParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMetadataTableRequestParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetadataType()) {
        optionals.set(0);
      }
      if (struct.isSetIcebergMetadataParams()) {
        optionals.set(1);
      }
      if (struct.isSetBackendsMetadataParams()) {
        optionals.set(2);
      }
      if (struct.isSetColumnsName()) {
        optionals.set(3);
      }
      if (struct.isSetFrontendsMetadataParams()) {
        optionals.set(4);
      }
      if (struct.isSetCurrentUserIdent()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMetadataType()) {
        oprot.writeI32(struct.metadata_type.getValue());
      }
      if (struct.isSetIcebergMetadataParams()) {
        struct.iceberg_metadata_params.write(oprot);
      }
      if (struct.isSetBackendsMetadataParams()) {
        struct.backends_metadata_params.write(oprot);
      }
      if (struct.isSetColumnsName()) {
        {
          oprot.writeI32(struct.columns_name.size());
          for (java.lang.String _iter328 : struct.columns_name)
          {
            oprot.writeString(_iter328);
          }
        }
      }
      if (struct.isSetFrontendsMetadataParams()) {
        struct.frontends_metadata_params.write(oprot);
      }
      if (struct.isSetCurrentUserIdent()) {
        struct.current_user_ident.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMetadataTableRequestParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
        struct.setMetadataTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.iceberg_metadata_params = new org.apache.doris.thrift.TIcebergMetadataParams();
        struct.iceberg_metadata_params.read(iprot);
        struct.setIcebergMetadataParamsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.backends_metadata_params = new org.apache.doris.thrift.TBackendsMetadataParams();
        struct.backends_metadata_params.read(iprot);
        struct.setBackendsMetadataParamsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list329 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.columns_name = new java.util.ArrayList<java.lang.String>(_list329.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem330;
          for (int _i331 = 0; _i331 < _list329.size; ++_i331)
          {
            _elem330 = iprot.readString();
            struct.columns_name.add(_elem330);
          }
        }
        struct.setColumnsNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.frontends_metadata_params = new org.apache.doris.thrift.TFrontendsMetadataParams();
        struct.frontends_metadata_params.read(iprot);
        struct.setFrontendsMetadataParamsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
        struct.current_user_ident.read(iprot);
        struct.setCurrentUserIdentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

