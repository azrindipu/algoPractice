package design_pattern.SOLID.opencloseprinciple.withoutocp;

public class Employee {
    private String name;
    private String salaryType;

    public Employee(String name, String salaryType) {
        this.name = name;
        this.salaryType = salaryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }
}
