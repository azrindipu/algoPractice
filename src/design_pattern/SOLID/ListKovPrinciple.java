package design_pattern.SOLID;

import design_pattern.SOLID.liskov.IEmployee;
import design_pattern.SOLID.liskov.RegularEmployee;
import design_pattern.SOLID.liskov.TemporaryEmployee;
import design_pattern.SOLID.liskov.maintainingliskov.*;

import java.util.ArrayList;
import java.util.List;

public class ListKovPrinciple {
    public static void main(String[] args){

        //not maintaining liskov
        List<IEmployee> list = new ArrayList<>();
        list.add(new RegularEmployee("x"));
        //list.add(new TemporaryEmployee("y"));
        // this object will throw exception.
        for(IEmployee employee : list){
            employee.getSalary();
            employee.getBonus();
        }

        List<EmployAbstruct> listSalaryAndBonus = new ArrayList<>();
        listSalaryAndBonus.add(new MyRegularEmployee("x"));
        listSalaryAndBonus.add(new MyRegularEmployee("y"));
        for(EmployAbstruct salary:listSalaryAndBonus){
            salary.getSalary();
            salary.getBonus();
        }
        List<ISalary> listSalary = new ArrayList<>();
        listSalary.add(new MyTemporaryEmployee("x"));
        listSalary.add(new MyTemporaryEmployee("y"));
        for(ISalary iSalary: listSalary){
            iSalary.getSalary();
        }
    }
}
