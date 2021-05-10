package design_pattern.SOLID.interfaceSegregation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PrintJob implements Job{
    @Override
    public void printJob(String content) {
        System.out.println(content);
    }

    @Override
    public void eJob(String content) {
        throw new NotImplementedException();
    }
}
