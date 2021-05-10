package design_pattern.SOLID.interfaceSegregation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class EJob implements Job{
    @Override
    public void printJob(String content) {
        throw new NotImplementedException();
    }

    @Override
    public void eJob(String content) {
        System.out.println(content);
    }
}
