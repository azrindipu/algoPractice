package design_pattern.strategy_pattern.observer;


import design_pattern.strategy_pattern.observer.observerble.ObserverbleImpl;
import design_pattern.strategy_pattern.observer.observers.Iobserver;
import design_pattern.strategy_pattern.observer.observers.ObserverImpl;
import design_pattern.strategy_pattern.strategy.Duck;
import design_pattern.strategy_pattern.strategy.catagoryImpl.*;
import design_pattern.strategy_pattern.strategy.catagoryInterface.IQuack;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Idisplay;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Ifly;

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
