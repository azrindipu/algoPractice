package design_pattern.factorymethod.factory;

import design_pattern.factorymethod.factoryobjects.*;

public class CarFactory implements Creator {

    @Override
    public Car createCar(String name, String color, double topSpeed) {
        if(name.equals(CarType.TOYOTA.toString())){
            return new Toyota(color, topSpeed);
        }
        else if(name.equals(CarType.COROLLA.toString())){
            return new Corolla(color, topSpeed);
        }
        return null;
    }

    @Override
    public Car creayeRandom() {
        int randomCarNumber = this.getRandomNumber(0, CarType.values().length);
        String carType = CarType.values()[randomCarNumber].toString();
        int randomColorNumber = this.getRandomNumber(0, Color.values().length);
        String color = Color.values()[randomColorNumber].toString();
        double toSpeed = this.getRandomNumber(0, 120);
        return this.createCar(carType, color, toSpeed);
    }

    @Override
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
