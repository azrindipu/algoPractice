package design_pattern.SOLID.liskov.maintainingliskov;

public class MyTemporaryEmployee implements ISalary {

    private String name;

    public MyTemporaryEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getSalary() {
        System.out.println("Get Salary is called from temporary employee");
    }
}
