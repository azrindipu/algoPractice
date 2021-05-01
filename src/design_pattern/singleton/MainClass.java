package design_pattern.singleton;

public class MainClass {
    public static void main(String[] args){
        SingleTonClass singleTonClass01 = SingleTonClass.getInstance();
        singleTonClass01.doSomeThing();

        SingleTonClass singleTonClass02 = SingleTonClass.getInstance();
        singleTonClass02.doSomeThing();
    }
}
