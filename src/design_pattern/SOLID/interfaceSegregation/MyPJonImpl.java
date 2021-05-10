package design_pattern.SOLID.interfaceSegregation;

public class MyPJonImpl implements MyPjob{

    @Override
    public void pjob(String content) {
        System.out.println(content);
    }
}
