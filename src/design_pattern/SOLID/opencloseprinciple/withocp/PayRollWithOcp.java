package design_pattern.SOLID.opencloseprinciple.withocp;

public class PayRollWithOcp {

    public void calculateSalary(EmployeWithOcp employe){
        employe.getPaymentType().calculateSalary();
    }
}
