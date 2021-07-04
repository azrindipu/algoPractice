package design_pattern.naimbhai.concreteclasses;


import design_pattern.naimbhai.interfaces.MyObject;

public class ClassB implements MyObject {
    private int field1; // Can not be 0
    private int field2; // Can not be 0

    public ClassB() {
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    @Override
    public void printFields() {
        System.out.println(field1);
        System.out.println(field2);
    }
}
