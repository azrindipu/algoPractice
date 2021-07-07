package design_pattern.command.concreteclasses;

import design_pattern.command.interfaces.Receiver;

public class Light implements Receiver {
    private boolean lightState=false;

    @Override
    public void rutnOn() {
        if(!this.lightState){
            this.lightState=true;
            System.out.println("Light is ON");
        }
        else{
            System.out.println("Light is already ON");
        }
    }

    @Override
    public void turnOff() {
        if(this.lightState){
            this.lightState=false;
            System.out.println("Light is OFF");
        }
        else{
            System.out.println("Light is already OFF");
        }
    }
}
