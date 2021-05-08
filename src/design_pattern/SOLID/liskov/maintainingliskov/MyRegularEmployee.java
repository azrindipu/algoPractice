package design_pattern.SOLID.liskov.maintainingliskov;

public class MyRegularEmployee extends EmployAbstruct {

    private String name;

    public MyRegularEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getBonus() {
        System.out.println("Get Bonus is called from regular employee");
    }

    @Override
    public void getSalary() {
        System.out.println("Get Salary is called from regular employee");
    }
}
