package design_pattern.strategy_pattern.strategy.catagoryImpl;

import design_pattern.strategy_pattern.strategy.catagoryInterface.IQuack;

public class QuackStrategySweet implements IQuack {
    @Override
    public void quack() {
        System.out.println("============> I can quack sweetly");
    }
}
