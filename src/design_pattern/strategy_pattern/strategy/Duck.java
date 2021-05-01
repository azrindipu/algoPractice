package design_pattern.strategy_pattern.strategy;

import design_pattern.strategy_pattern.strategy.catagoryInterface.IQuack;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Idisplay;
import design_pattern.strategy_pattern.strategy.catagoryInterface.Ifly;

public class Duck {
    private Idisplay display;
    private Ifly fly;
    private IQuack quack;

    public Duck(Idisplay display, Ifly fly, IQuack quack){
        this.display=display;
        this.fly=fly;
        this.quack=quack;
    }

    public void display(){
        this.display.display();
    }

    public void fly(){
        this.fly.fly();
    }

    public void quack(){
        this.quack.quack();
    }
}
