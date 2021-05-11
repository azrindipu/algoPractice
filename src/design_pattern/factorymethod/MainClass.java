package design_pattern.factorymethod;

import design_pattern.factorymethod.factory.CarFactory;
import design_pattern.factorymethod.factoryobjects.Car;
import design_pattern.factorymethod.factoryobjects.CarType;
import design_pattern.factorymethod.factoryobjects.Color;

public class MainClass {
    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.createCar(CarType.TOYOTA.toString(), Color.BLACK.toString(), 120);
        toyota.sayMyName();

        Car corolla = carFactory.createCar(CarType.COROLLA.toString(), Color.RED.toString(), 100);
        corolla.sayMyName();

        Car randomCar = carFactory.creayeRandom();
        randomCar.sayMyName();
    }
}
