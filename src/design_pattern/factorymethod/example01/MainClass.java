package design_pattern.factorymethod.example01;

import design_pattern.factorymethod.example01.logisticfactory.LogisticFactory;
import design_pattern.factorymethod.example01.logisticfactory.LogisticFactoryImpl;
import design_pattern.factorymethod.example01.utils.TransportType;

public class MainClass {
    public static void main(String[] args){
        LogisticFactory logisticFactory = new LogisticFactoryImpl();
        logisticFactory.creator(TransportType.CAR.toString(), "car01", "12345");
        logisticFactory.creator(TransportType.TRUCK.toString(), "truck01", "12345");
        logisticFactory.creator(TransportType.SHIP.toString(), "ship01", "12345");
        logisticFactory.creator(TransportType.BOAT.toString(), "boat01", "12345");
    }
}
