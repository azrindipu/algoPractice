package design_pattern.factorymethod.factory;

import design_pattern.factorymethod.factoryobjects.Car;

public interface Creator {
    Car createCar(String name, String color, double topSpeed);
    Car creayeRandom();
    int getRandomNumber(int min, int max);
}
