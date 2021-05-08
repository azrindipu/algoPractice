package design_pattern.SOLID.opencloseprinciple.withocp;

public class MonthlySalary implements PaymentType{
    @Override
    public void calculateSalary() {
        System.out.println("Calculating monthly salary");
    }
}
