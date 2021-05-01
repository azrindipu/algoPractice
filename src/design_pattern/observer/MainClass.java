package design_pattern.observer;


import design_pattern.observer.observerble.ObserverbleImpl;
import design_pattern.observer.observers.Iobserver;
import design_pattern.observer.observers.ObserverImpl;

public class MainClass {
    public static void main(String[] args){
        ObserverbleImpl observerble = ObserverbleImpl.getInstance();

        try {
            observerble.add(new ObserverImpl("observer01"));
            observerble.add(new ObserverImpl("observer02"));
            observerble.add(new ObserverImpl("observer03"));
            observerble.add(new ObserverImpl("observer04"));
            observerble.add(new ObserverImpl("observer05"));
            Iobserver iobserver = new ObserverImpl("observer06");
            observerble.add(iobserver);
            observerble.setData(20);
            observerble.remove(iobserver);
            observerble.setData(21);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
