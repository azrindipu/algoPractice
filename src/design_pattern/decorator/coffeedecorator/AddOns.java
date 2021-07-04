package design_pattern.decorator.coffeedecorator;

import design_pattern.decorator.coffee.Beverage;

public abstract class AddOns extends Beverage{
    private Beverage beverage;

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
