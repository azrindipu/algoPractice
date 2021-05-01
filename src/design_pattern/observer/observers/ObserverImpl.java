package design_pattern.observer.observers;

import design_pattern.observer.observerble.ObserverbleImpl;

public class ObserverImpl implements Iobserver {

    private String name = null;
    private ObserverbleImpl observerble= null;

    public ObserverImpl(String name){
        this.observerble = ObserverbleImpl.getInstance();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        int data = observerble.getData();
        System.out.println("I am from "+name+" and data from observerble is "+data);
    }
}
