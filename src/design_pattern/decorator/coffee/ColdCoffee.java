package design_pattern.decorator.coffee;

public class ColdCoffee extends Beverage{
    private final int COST=1;
    @Override
    public int cost() {
        return COST;
    }
}
