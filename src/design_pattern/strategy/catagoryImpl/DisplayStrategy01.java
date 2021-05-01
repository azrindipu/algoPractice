package design_pattern.strategy.catagoryImpl;

import design_pattern.strategy.catagoryInterface.Idisplay;

public class DisplayStrategy01 implements Idisplay {
    @Override
    public void display() {
        System.out.println("============> display strategy 01");
    }
}
