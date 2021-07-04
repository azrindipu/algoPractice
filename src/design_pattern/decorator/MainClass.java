package design_pattern.decorator;

import design_pattern.decorator.coffee.Beverage;
import design_pattern.decorator.coffee.HotCoffee;
import design_pattern.decorator.coffeedecorator.MilkDecorator;
import design_pattern.decorator.coffeedecorator.SugarDecorator;

public class MainClass {
    public static void main(String[] args){
        Beverage beverage = new HotCoffee();
        System.out.println("Pure hot coffee COST: "+beverage.cost());
        beverage = new MilkDecorator(beverage);
        System.out.println("After adding milk the COST is: "+beverage.cost());
        beverage = new SugarDecorator(beverage);
        System.out.println("After adding sugar the COST is: "+beverage.cost());
    }
}
