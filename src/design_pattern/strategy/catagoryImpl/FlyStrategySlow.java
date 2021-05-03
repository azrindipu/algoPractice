package design_pattern.strategy.catagoryImpl;

import design_pattern.strategy.catagoryInterface.Ifly;

public class FlyStrategySlow implements Ifly {
    @Override
    public void fly() {
        System.out.println("============> I can fly slowly");
    }
}