package design_pattern.singleton;

public class SingleTonClass {
    private static SingleTonClass singleTonClass = null;
    private SingleTonClass(){
    }

    public synchronized static SingleTonClass getInstance(){
        if(singleTonClass == null){
            singleTonClass = new SingleTonClass();
        }
        return singleTonClass;
    }

    public void doSomeThing(){
        System.out.println("Doing");
    }
}
