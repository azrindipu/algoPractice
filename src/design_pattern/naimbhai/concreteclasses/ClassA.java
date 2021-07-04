package design_pattern.naimbhai.concreteclasses;


import design_pattern.naimbhai.interfaces.MyObject;

public class ClassA implements MyObject {
    private String field1;// Can not be null
    private String field2;// Can not be null

    public ClassA() {
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public void printFields() {
        System.out.println(field1);
        System.out.println(field2);
    }
}
