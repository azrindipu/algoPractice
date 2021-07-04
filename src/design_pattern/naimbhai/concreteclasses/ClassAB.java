package design_pattern.naimbhai.concreteclasses;

import design_pattern.naimbhai.interfaces.MyObject;

public class ClassAB implements MyObject {
    private ClassA field1;
    private ClassB field2;

    public ClassAB() {
    }

    public ClassA getField1() {
        return field1;
    }

    public void setField1(ClassA field1) {
        this.field1 = field1;
    }

    public ClassB getField2() {
        return field2;
    }

    public void setField2(ClassB field2) {
        this.field2 = field2;
    }

    @Override
    public void printFields() {
        field1.printFields();
        field2.printFields();
    }
}
