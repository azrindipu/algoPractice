package design_pattern.adapter;

public class MainClass {
    public static void main(String[] args){
        Target target = new Adapter(new AdapteeImpl());
        target.request();
    }
}
