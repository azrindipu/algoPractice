package design_pattern.decorator.coffeedecorator;

import design_pattern.decorator.coffee.Beverage;

public class SugarDecorator extends AddOns{
    private final int COST=3;

    public SugarDecorator(Beverage beverage){
        super.setBeverage(beverage);
    }
    @Override
    public int cost() {
        return super.getBeverage().cost()+COST;
    }
}
