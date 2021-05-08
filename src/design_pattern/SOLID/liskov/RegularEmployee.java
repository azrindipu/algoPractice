package design_pattern.SOLID.liskov;

public class RegularEmployee implements IEmployee{

    private String name;

    public RegularEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getSalary() {
        System.out.println("Get Salary is called from regular employee");
    }

    @Override
    public void getBonus() {
        System.out.println("Get Bonus is called from regular employee");
    }

}
