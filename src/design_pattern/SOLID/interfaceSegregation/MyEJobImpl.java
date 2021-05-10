package design_pattern.SOLID.interfaceSegregation;

public class MyEJobImpl implements MyEJob{

    @Override
    public void ejob(String content) {
        System.out.println(content);
    }
}
