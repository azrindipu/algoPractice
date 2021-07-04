package design_pattern.decorator.coffee;

public class HotCoffee extends Beverage{
    private final int COST=2;
    @Override
    public int cost() {
        return COST;
    }
}
