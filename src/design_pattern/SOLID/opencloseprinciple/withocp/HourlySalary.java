package design_pattern.SOLID.opencloseprinciple.withocp;

public class HourlySalary implements PaymentType{
    @Override
    public void calculateSalary() {
        System.out.println("Calculating hourly salary");
    }
}
