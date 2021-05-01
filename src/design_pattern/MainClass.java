package design_pattern;


import design_pattern.strategy_pattern.Duck;
import design_pattern.strategy_pattern.strategy.catagoryImpl.*;
import design_pattern.strategy_pattern.strategy.catagoryInterface.IQuack;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Idisplay;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Ifly;

public class MainClass {
    public static void main(String[] args){

        Idisplay idisplay = new DisplayStrategy01();
        Ifly ifly = new FlyStrategyQuick();
        IQuack iQuack = new QuackStrategySweet();

        System.out.println("Chill duck");
        Duck chillDuck = new Duck(idisplay, ifly, iQuack);
        chillDuck.display();
        chillDuck.fly();
        chillDuck.quack();

        System.out.println();
        System.out.println();
        System.out.println("Dumb duck");
        ifly= new FlyStrategySlow();
        iQuack=new QuackStrategyLoud();
        Duck dumbDuck = new Duck(idisplay, ifly, iQuack);
        dumbDuck.display();
        dumbDuck.fly();
        dumbDuck.quack();
    }
}
