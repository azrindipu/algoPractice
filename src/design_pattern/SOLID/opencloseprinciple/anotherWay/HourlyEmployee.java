package design_pattern.SOLID.opencloseprinciple.anotherWay;

public class HourlyEmployee implements Myemployee{

    private String name;
    private int age;
    private String fatherName;

    public HourlyEmployee(String name, int age, String fatherName) {
        this.name = name;
        this.age = age;
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFatherName() {
        return fatherName;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Father Name: "+this.fatherName);
        System.out.println("Calculating hourly salary");

    }
}
