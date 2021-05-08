package design_pattern.SOLID.opencloseprinciple.anotherWay;

public class MonthlyEmployee implements Myemployee{

    private String name;
    private int age;

    public MonthlyEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Calculating monthly salary");
    }
}
