package design_pattern.decorator.coffeedecorator;

import design_pattern.decorator.coffee.Beverage;

public class MilkDecorator extends AddOns{
    private final int COST=2;

    public MilkDecorator(Beverage beverage){
        super.setBeverage(beverage);
    }
    @Override
    public int cost() {
        return super.getBeverage().cost()+COST;
    }
}
