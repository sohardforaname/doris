/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-06-29")
public class EncryptionWithColumnKey implements org.apache.thrift.TBase<EncryptionWithColumnKey, EncryptionWithColumnKey._Fields>, java.io.Serializable, Cloneable, Comparable<EncryptionWithColumnKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EncryptionWithColumnKey");

  private static final org.apache.thrift.protocol.TField PATH_IN_SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("path_in_schema", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("key_metadata", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EncryptionWithColumnKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EncryptionWithColumnKeyTupleSchemeFactory();

  /**
   * Column path in schema *
   */
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> path_in_schema; // required
  /**
   * Retrieval metadata of column encryption key *
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer key_metadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Column path in schema *
     */
    PATH_IN_SCHEMA((short)1, "path_in_schema"),
    /**
     * Retrieval metadata of column encryption key *
     */
    KEY_METADATA((short)2, "key_metadata");

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
        case 1: // PATH_IN_SCHEMA
          return PATH_IN_SCHEMA;
        case 2: // KEY_METADATA
          return KEY_METADATA;
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
  private static final _Fields optionals[] = {_Fields.KEY_METADATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH_IN_SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("path_in_schema", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.KEY_METADATA, new org.apache.thrift.meta_data.FieldMetaData("key_metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EncryptionWithColumnKey.class, metaDataMap);
  }

  public EncryptionWithColumnKey() {
  }

  public EncryptionWithColumnKey(
    java.util.List<java.lang.String> path_in_schema)
  {
    this();
    this.path_in_schema = path_in_schema;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EncryptionWithColumnKey(EncryptionWithColumnKey other) {
    if (other.isSetPathInSchema()) {
      java.util.List<java.lang.String> __this__path_in_schema = new java.util.ArrayList<java.lang.String>(other.path_in_schema);
      this.path_in_schema = __this__path_in_schema;
    }
    if (other.isSetKeyMetadata()) {
      this.key_metadata = org.apache.thrift.TBaseHelper.copyBinary(other.key_metadata);
    }
  }

  @Override
  public EncryptionWithColumnKey deepCopy() {
    return new EncryptionWithColumnKey(this);
  }

  @Override
  public void clear() {
    this.path_in_schema = null;
    this.key_metadata = null;
  }

  public int getPathInSchemaSize() {
    return (this.path_in_schema == null) ? 0 : this.path_in_schema.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPathInSchemaIterator() {
    return (this.path_in_schema == null) ? null : this.path_in_schema.iterator();
  }

  public void addToPathInSchema(java.lang.String elem) {
    if (this.path_in_schema == null) {
      this.path_in_schema = new java.util.ArrayList<java.lang.String>();
    }
    this.path_in_schema.add(elem);
  }

  /**
   * Column path in schema *
   */
  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPathInSchema() {
    return this.path_in_schema;
  }

  /**
   * Column path in schema *
   */
  public EncryptionWithColumnKey setPathInSchema(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> path_in_schema) {
    this.path_in_schema = path_in_schema;
    return this;
  }

  public void unsetPathInSchema() {
    this.path_in_schema = null;
  }

  /** Returns true if field path_in_schema is set (has been assigned a value) and false otherwise */
  public boolean isSetPathInSchema() {
    return this.path_in_schema != null;
  }

  public void setPathInSchemaIsSet(boolean value) {
    if (!value) {
      this.path_in_schema = null;
    }
  }

  /**
   * Retrieval metadata of column encryption key *
   */
  public byte[] getKeyMetadata() {
    setKeyMetadata(org.apache.thrift.TBaseHelper.rightSize(key_metadata));
    return key_metadata == null ? null : key_metadata.array();
  }

  public java.nio.ByteBuffer bufferForKeyMetadata() {
    return org.apache.thrift.TBaseHelper.copyBinary(key_metadata);
  }

  /**
   * Retrieval metadata of column encryption key *
   */
  public EncryptionWithColumnKey setKeyMetadata(byte[] key_metadata) {
    this.key_metadata = key_metadata == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(key_metadata.clone());
    return this;
  }

  public EncryptionWithColumnKey setKeyMetadata(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer key_metadata) {
    this.key_metadata = org.apache.thrift.TBaseHelper.copyBinary(key_metadata);
    return this;
  }

  public void unsetKeyMetadata() {
    this.key_metadata = null;
  }

  /** Returns true if field key_metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyMetadata() {
    return this.key_metadata != null;
  }

  public void setKeyMetadataIsSet(boolean value) {
    if (!value) {
      this.key_metadata = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PATH_IN_SCHEMA:
      if (value == null) {
        unsetPathInSchema();
      } else {
        setPathInSchema((java.util.List<java.lang.String>)value);
      }
      break;

    case KEY_METADATA:
      if (value == null) {
        unsetKeyMetadata();
      } else {
        if (value instanceof byte[]) {
          setKeyMetadata((byte[])value);
        } else {
          setKeyMetadata((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH_IN_SCHEMA:
      return getPathInSchema();

    case KEY_METADATA:
      return getKeyMetadata();

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
    case PATH_IN_SCHEMA:
      return isSetPathInSchema();
    case KEY_METADATA:
      return isSetKeyMetadata();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof EncryptionWithColumnKey)
      return this.equals((EncryptionWithColumnKey)that);
    return false;
  }

  public boolean equals(EncryptionWithColumnKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_path_in_schema = true && this.isSetPathInSchema();
    boolean that_present_path_in_schema = true && that.isSetPathInSchema();
    if (this_present_path_in_schema || that_present_path_in_schema) {
      if (!(this_present_path_in_schema && that_present_path_in_schema))
        return false;
      if (!this.path_in_schema.equals(that.path_in_schema))
        return false;
    }

    boolean this_present_key_metadata = true && this.isSetKeyMetadata();
    boolean that_present_key_metadata = true && that.isSetKeyMetadata();
    if (this_present_key_metadata || that_present_key_metadata) {
      if (!(this_present_key_metadata && that_present_key_metadata))
        return false;
      if (!this.key_metadata.equals(that.key_metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPathInSchema()) ? 131071 : 524287);
    if (isSetPathInSchema())
      hashCode = hashCode * 8191 + path_in_schema.hashCode();

    hashCode = hashCode * 8191 + ((isSetKeyMetadata()) ? 131071 : 524287);
    if (isSetKeyMetadata())
      hashCode = hashCode * 8191 + key_metadata.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(EncryptionWithColumnKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPathInSchema(), other.isSetPathInSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPathInSchema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path_in_schema, other.path_in_schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetKeyMetadata(), other.isSetKeyMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key_metadata, other.key_metadata);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EncryptionWithColumnKey(");
    boolean first = true;

    sb.append("path_in_schema:");
    if (this.path_in_schema == null) {
      sb.append("null");
    } else {
      sb.append(this.path_in_schema);
    }
    first = false;
    if (isSetKeyMetadata()) {
      if (!first) sb.append(", ");
      sb.append("key_metadata:");
      if (this.key_metadata == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.key_metadata, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (path_in_schema == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'path_in_schema' was not present! Struct: " + toString());
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

  private static class EncryptionWithColumnKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public EncryptionWithColumnKeyStandardScheme getScheme() {
      return new EncryptionWithColumnKeyStandardScheme();
    }
  }

  private static class EncryptionWithColumnKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<EncryptionWithColumnKey> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, EncryptionWithColumnKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATH_IN_SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.path_in_schema = new java.util.ArrayList<java.lang.String>(_list32.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = iprot.readString();
                  struct.path_in_schema.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setPathInSchemaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key_metadata = iprot.readBinary();
              struct.setKeyMetadataIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, EncryptionWithColumnKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.path_in_schema != null) {
        oprot.writeFieldBegin(PATH_IN_SCHEMA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.path_in_schema.size()));
          for (java.lang.String _iter35 : struct.path_in_schema)
          {
            oprot.writeString(_iter35);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.key_metadata != null) {
        if (struct.isSetKeyMetadata()) {
          oprot.writeFieldBegin(KEY_METADATA_FIELD_DESC);
          oprot.writeBinary(struct.key_metadata);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EncryptionWithColumnKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public EncryptionWithColumnKeyTupleScheme getScheme() {
      return new EncryptionWithColumnKeyTupleScheme();
    }
  }

  private static class EncryptionWithColumnKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<EncryptionWithColumnKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EncryptionWithColumnKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.path_in_schema.size());
        for (java.lang.String _iter36 : struct.path_in_schema)
        {
          oprot.writeString(_iter36);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKeyMetadata()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetKeyMetadata()) {
        oprot.writeBinary(struct.key_metadata);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EncryptionWithColumnKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list37 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.path_in_schema = new java.util.ArrayList<java.lang.String>(_list37.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = iprot.readString();
          struct.path_in_schema.add(_elem38);
        }
      }
      struct.setPathInSchemaIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.key_metadata = iprot.readBinary();
        struct.setKeyMetadataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

