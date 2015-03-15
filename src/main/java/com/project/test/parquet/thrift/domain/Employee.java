/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.project.test.parquet.thrift.domain;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee implements org.apache.thrift.TBase<Employee, Employee._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Employee");

  private static final org.apache.thrift.protocol.TField EMP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("emp_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("first_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("last_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EmployeeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EmployeeTupleSchemeFactory());
  }

  public long emp_id; // required
  public String first_name; // required
  public String last_name; // required
  public String email; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EMP_ID((short)1, "emp_id"),
    FIRST_NAME((short)2, "first_name"),
    LAST_NAME((short)3, "last_name"),
    EMAIL((short)4, "email");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EMP_ID
          return EMP_ID;
        case 2: // FIRST_NAME
          return FIRST_NAME;
        case 3: // LAST_NAME
          return LAST_NAME;
        case 4: // EMAIL
          return EMAIL;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EMP_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.EMAIL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EMP_ID, new org.apache.thrift.meta_data.FieldMetaData("emp_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("first_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("last_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Employee.class, metaDataMap);
  }

  public Employee() {
  }

  public Employee(
    long emp_id,
    String first_name,
    String last_name)
  {
    this();
    this.emp_id = emp_id;
    setEmp_idIsSet(true);
    this.first_name = first_name;
    this.last_name = last_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Employee(Employee other) {
    __isset_bitfield = other.__isset_bitfield;
    this.emp_id = other.emp_id;
    if (other.isSetFirst_name()) {
      this.first_name = other.first_name;
    }
    if (other.isSetLast_name()) {
      this.last_name = other.last_name;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
  }

  public Employee deepCopy() {
    return new Employee(this);
  }

  @Override
  public void clear() {
    setEmp_idIsSet(false);
    this.emp_id = 0;
    this.first_name = null;
    this.last_name = null;
    this.email = null;
  }

  public long getEmp_id() {
    return this.emp_id;
  }

  public Employee setEmp_id(long emp_id) {
    this.emp_id = emp_id;
    setEmp_idIsSet(true);
    return this;
  }

  public void unsetEmp_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EMP_ID_ISSET_ID);
  }

  /** Returns true if field emp_id is set (has been assigned a value) and false otherwise */
  public boolean isSetEmp_id() {
    return EncodingUtils.testBit(__isset_bitfield, __EMP_ID_ISSET_ID);
  }

  public void setEmp_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EMP_ID_ISSET_ID, value);
  }

  public String getFirst_name() {
    return this.first_name;
  }

  public Employee setFirst_name(String first_name) {
    this.first_name = first_name;
    return this;
  }

  public void unsetFirst_name() {
    this.first_name = null;
  }

  /** Returns true if field first_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFirst_name() {
    return this.first_name != null;
  }

  public void setFirst_nameIsSet(boolean value) {
    if (!value) {
      this.first_name = null;
    }
  }

  public String getLast_name() {
    return this.last_name;
  }

  public Employee setLast_name(String last_name) {
    this.last_name = last_name;
    return this;
  }

  public void unsetLast_name() {
    this.last_name = null;
  }

  /** Returns true if field last_name is set (has been assigned a value) and false otherwise */
  public boolean isSetLast_name() {
    return this.last_name != null;
  }

  public void setLast_nameIsSet(boolean value) {
    if (!value) {
      this.last_name = null;
    }
  }

  public String getEmail() {
    return this.email;
  }

  public Employee setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMP_ID:
      if (value == null) {
        unsetEmp_id();
      } else {
        setEmp_id((Long)value);
      }
      break;

    case FIRST_NAME:
      if (value == null) {
        unsetFirst_name();
      } else {
        setFirst_name((String)value);
      }
      break;

    case LAST_NAME:
      if (value == null) {
        unsetLast_name();
      } else {
        setLast_name((String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMP_ID:
      return Long.valueOf(getEmp_id());

    case FIRST_NAME:
      return getFirst_name();

    case LAST_NAME:
      return getLast_name();

    case EMAIL:
      return getEmail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMP_ID:
      return isSetEmp_id();
    case FIRST_NAME:
      return isSetFirst_name();
    case LAST_NAME:
      return isSetLast_name();
    case EMAIL:
      return isSetEmail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Employee)
      return this.equals((Employee)that);
    return false;
  }

  public boolean equals(Employee that) {
    if (that == null)
      return false;

    boolean this_present_emp_id = true;
    boolean that_present_emp_id = true;
    if (this_present_emp_id || that_present_emp_id) {
      if (!(this_present_emp_id && that_present_emp_id))
        return false;
      if (this.emp_id != that.emp_id)
        return false;
    }

    boolean this_present_first_name = true && this.isSetFirst_name();
    boolean that_present_first_name = true && that.isSetFirst_name();
    if (this_present_first_name || that_present_first_name) {
      if (!(this_present_first_name && that_present_first_name))
        return false;
      if (!this.first_name.equals(that.first_name))
        return false;
    }

    boolean this_present_last_name = true && this.isSetLast_name();
    boolean that_present_last_name = true && that.isSetLast_name();
    if (this_present_last_name || that_present_last_name) {
      if (!(this_present_last_name && that_present_last_name))
        return false;
      if (!this.last_name.equals(that.last_name))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Employee other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Employee typedOther = (Employee)other;

    lastComparison = Boolean.valueOf(isSetEmp_id()).compareTo(typedOther.isSetEmp_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmp_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emp_id, typedOther.emp_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirst_name()).compareTo(typedOther.isSetFirst_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirst_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.first_name, typedOther.first_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLast_name()).compareTo(typedOther.isSetLast_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLast_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.last_name, typedOther.last_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, typedOther.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Employee(");
    boolean first = true;

    sb.append("emp_id:");
    sb.append(this.emp_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("first_name:");
    if (this.first_name == null) {
      sb.append("null");
    } else {
      sb.append(this.first_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("last_name:");
    if (this.last_name == null) {
      sb.append("null");
    } else {
      sb.append(this.last_name);
    }
    first = false;
    if (isSetEmail()) {
      if (!first) sb.append(", ");
      sb.append("email:");
      if (this.email == null) {
        sb.append("null");
      } else {
        sb.append(this.email);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'emp_id' because it's a primitive and you chose the non-beans generator.
    if (first_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'first_name' was not present! Struct: " + toString());
    }
    if (last_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'last_name' was not present! Struct: " + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EmployeeStandardSchemeFactory implements SchemeFactory {
    public EmployeeStandardScheme getScheme() {
      return new EmployeeStandardScheme();
    }
  }

  private static class EmployeeStandardScheme extends StandardScheme<Employee> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Employee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EMP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.emp_id = iprot.readI64();
              struct.setEmp_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.first_name = iprot.readString();
              struct.setFirst_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.last_name = iprot.readString();
              struct.setLast_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
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
      if (!struct.isSetEmp_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'emp_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Employee struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EMP_ID_FIELD_DESC);
      oprot.writeI64(struct.emp_id);
      oprot.writeFieldEnd();
      if (struct.first_name != null) {
        oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
        oprot.writeString(struct.first_name);
        oprot.writeFieldEnd();
      }
      if (struct.last_name != null) {
        oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
        oprot.writeString(struct.last_name);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        if (struct.isSetEmail()) {
          oprot.writeFieldBegin(EMAIL_FIELD_DESC);
          oprot.writeString(struct.email);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmployeeTupleSchemeFactory implements SchemeFactory {
    public EmployeeTupleScheme getScheme() {
      return new EmployeeTupleScheme();
    }
  }

  private static class EmployeeTupleScheme extends TupleScheme<Employee> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Employee struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.emp_id);
      oprot.writeString(struct.first_name);
      oprot.writeString(struct.last_name);
      BitSet optionals = new BitSet();
      if (struct.isSetEmail()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Employee struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.emp_id = iprot.readI64();
      struct.setEmp_idIsSet(true);
      struct.first_name = iprot.readString();
      struct.setFirst_nameIsSet(true);
      struct.last_name = iprot.readString();
      struct.setLast_nameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
    }
  }

}

