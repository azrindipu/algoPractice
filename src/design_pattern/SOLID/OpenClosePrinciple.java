package design_pattern.SOLID;

import design_pattern.SOLID.opencloseprinciple.anotherWay.HourlyEmployee;
import design_pattern.SOLID.opencloseprinciple.anotherWay.MonthlyEmployee;
import design_pattern.SOLID.opencloseprinciple.anotherWay.MyPayRoll;
import design_pattern.SOLID.opencloseprinciple.anotherWay.Myemployee;
import design_pattern.SOLID.opencloseprinciple.withocp.EmployeWithOcp;
import design_pattern.SOLID.opencloseprinciple.withocp.HourlySalary;
import design_pattern.SOLID.opencloseprinciple.withocp.MonthlySalary;
import design_pattern.SOLID.opencloseprinciple.withocp.PayRollWithOcp;
import design_pattern.SOLID.opencloseprinciple.withoutocp.Employee;
import design_pattern.SOLID.opencloseprinciple.withoutocp.PayRoll;

import java.util.ArrayList;
import java.util.List;

public class OpenClosePrinciple {
    public static void main(String[] args){

        //not maintaining ocp
        PayRoll payRoll=new PayRoll();
        Employee employee1=new Employee("x", "monthly");
        payRoll.calculateSalary(employee1);

        Employee employee2=new Employee("y", "hourly");
        payRoll.calculateSalary(employee2);

        //maintaining ocp
        EmployeWithOcp employee3=new EmployeWithOcp(new MonthlySalary(), "xx");
        EmployeWithOcp employee4=new EmployeWithOcp(new HourlySalary(), "YY");
        PayRollWithOcp payRollWithOcp=new PayRollWithOcp();
        payRollWithOcp.calculateSalary(employee3);
        payRollWithOcp.calculateSalary(employee4);

        //another way
        // I personally prefer this solution
        Myemployee myemployee1=new MonthlyEmployee("xxx", 10);
        Myemployee myemployee2=new HourlyEmployee("yyy", 20, "zzz");
        MyPayRoll myPayRoll=new MyPayRoll();
        myPayRoll.calculateSalary(myemployee1);
        myPayRoll.calculateSalary(myemployee2);
    }
}
