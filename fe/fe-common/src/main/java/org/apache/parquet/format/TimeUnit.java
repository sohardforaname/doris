/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)", date = "2023-07-19")
public class TimeUnit extends org.apache.thrift.TUnion<TimeUnit, TimeUnit._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimeUnit");
  private static final org.apache.thrift.protocol.TField MILLIS_FIELD_DESC = new org.apache.thrift.protocol.TField("MILLIS", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MICROS_FIELD_DESC = new org.apache.thrift.protocol.TField("MICROS", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NANOS_FIELD_DESC = new org.apache.thrift.protocol.TField("NANOS", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MILLIS((short)1, "MILLIS"),
    MICROS((short)2, "MICROS"),
    NANOS((short)3, "NANOS");

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
        case 1: // MILLIS
          return MILLIS;
        case 2: // MICROS
          return MICROS;
        case 3: // NANOS
          return NANOS;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MILLIS, new org.apache.thrift.meta_data.FieldMetaData("MILLIS", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MilliSeconds.class)));
    tmpMap.put(_Fields.MICROS, new org.apache.thrift.meta_data.FieldMetaData("MICROS", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MicroSeconds.class)));
    tmpMap.put(_Fields.NANOS, new org.apache.thrift.meta_data.FieldMetaData("NANOS", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NanoSeconds.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimeUnit.class, metaDataMap);
  }

  public TimeUnit() {
    super();
  }

  public TimeUnit(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TimeUnit(TimeUnit other) {
    super(other);
  }
  @Override
  public TimeUnit deepCopy() {
    return new TimeUnit(this);
  }

  public static TimeUnit MILLIS(MilliSeconds value) {
    TimeUnit x = new TimeUnit();
    x.setMILLIS(value);
    return x;
  }

  public static TimeUnit MICROS(MicroSeconds value) {
    TimeUnit x = new TimeUnit();
    x.setMICROS(value);
    return x;
  }

  public static TimeUnit NANOS(NanoSeconds value) {
    TimeUnit x = new TimeUnit();
    x.setNANOS(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case MILLIS:
        if (value instanceof MilliSeconds) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type MilliSeconds for field 'MILLIS', but got " + value.getClass().getSimpleName());
      case MICROS:
        if (value instanceof MicroSeconds) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type MicroSeconds for field 'MICROS', but got " + value.getClass().getSimpleName());
      case NANOS:
        if (value instanceof NanoSeconds) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type NanoSeconds for field 'NANOS', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case MILLIS:
          if (field.type == MILLIS_FIELD_DESC.type) {
            MilliSeconds MILLIS;
            MILLIS = new MilliSeconds();
            MILLIS.read(iprot);
            return MILLIS;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MICROS:
          if (field.type == MICROS_FIELD_DESC.type) {
            MicroSeconds MICROS;
            MICROS = new MicroSeconds();
            MICROS.read(iprot);
            return MICROS;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NANOS:
          if (field.type == NANOS_FIELD_DESC.type) {
            NanoSeconds NANOS;
            NANOS = new NanoSeconds();
            NANOS.read(iprot);
            return NANOS;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case MILLIS:
        MilliSeconds MILLIS = (MilliSeconds)value_;
        MILLIS.write(oprot);
        return;
      case MICROS:
        MicroSeconds MICROS = (MicroSeconds)value_;
        MICROS.write(oprot);
        return;
      case NANOS:
        NanoSeconds NANOS = (NanoSeconds)value_;
        NANOS.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case MILLIS:
          MilliSeconds MILLIS;
          MILLIS = new MilliSeconds();
          MILLIS.read(iprot);
          return MILLIS;
        case MICROS:
          MicroSeconds MICROS;
          MICROS = new MicroSeconds();
          MICROS.read(iprot);
          return MICROS;
        case NANOS:
          NanoSeconds NANOS;
          NANOS = new NanoSeconds();
          NANOS.read(iprot);
          return NANOS;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case MILLIS:
        MilliSeconds MILLIS = (MilliSeconds)value_;
        MILLIS.write(oprot);
        return;
      case MICROS:
        MicroSeconds MICROS = (MicroSeconds)value_;
        MICROS.write(oprot);
        return;
      case NANOS:
        NanoSeconds NANOS = (NanoSeconds)value_;
        NANOS.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case MILLIS:
        return MILLIS_FIELD_DESC;
      case MICROS:
        return MICROS_FIELD_DESC;
      case NANOS:
        return NANOS_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public MilliSeconds getMILLIS() {
    if (getSetField() == _Fields.MILLIS) {
      return (MilliSeconds)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MILLIS' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMILLIS(MilliSeconds value) {
    setField_ = _Fields.MILLIS;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.MILLIS");
  }

  public MicroSeconds getMICROS() {
    if (getSetField() == _Fields.MICROS) {
      return (MicroSeconds)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'MICROS' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMICROS(MicroSeconds value) {
    setField_ = _Fields.MICROS;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.MICROS");
  }

  public NanoSeconds getNANOS() {
    if (getSetField() == _Fields.NANOS) {
      return (NanoSeconds)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'NANOS' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNANOS(NanoSeconds value) {
    setField_ = _Fields.NANOS;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.NANOS");
  }

  public boolean isSetMILLIS() {
    return setField_ == _Fields.MILLIS;
  }


  public boolean isSetMICROS() {
    return setField_ == _Fields.MICROS;
  }


  public boolean isSetNANOS() {
    return setField_ == _Fields.NANOS;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TimeUnit) {
      return equals((TimeUnit)other);
    } else {
      return false;
    }
  }

  public boolean equals(TimeUnit other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TimeUnit other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
