package design_pattern.adapter;

public class AdapteeImpl implements Adaptee{
    @Override
    public void specificRequest() {
        System.out.println("I am from specific request method");
    }
}
