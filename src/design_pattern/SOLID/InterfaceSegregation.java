package design_pattern.SOLID;

import design_pattern.SOLID.interfaceSegregation.*;

public class InterfaceSegregation {
    public static void main(String[] args){
        //without interface segregation
        Job ejob = new EJob();
        ejob.eJob("This is ejob");
        Job pJob = new PrintJob();
        pJob.printJob("This is print job");

        //maintaining interface segretation principle
        MyPjob myPJob=new MyPJonImpl();
        MyEJob myEJob=new MyEJobImpl();
        myPJob.pjob("This is maintaining isp p job");
        myEJob.ejob("This is maintaining isp e job");
    }
}
