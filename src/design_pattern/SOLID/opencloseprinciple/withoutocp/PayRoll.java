package design_pattern.SOLID.opencloseprinciple.withoutocp;

public class PayRoll {
    public void calculateSalary(Employee employee){
        if(employee.getSalaryType().equals("monthly")){
            System.out.println("Employee name: "+employee.getName());
            System.out.println("Calculating monthly salary");
        }
        else if(employee.getSalaryType().equals("hourly")){
            System.out.println("Employee name: "+employee.getName());
            System.out.println("Calculating hourly salary");
        }
    }
}
