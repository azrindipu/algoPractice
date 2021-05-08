package design_pattern.SOLID.liskov;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TemporaryEmployee implements IEmployee{

    private String name;

    public TemporaryEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getSalary() {
        System.out.println("Get Salary is called from temporary employee");
    }

    @Override
    public void getBonus() {
        throw new NotImplementedException();
    }
}
