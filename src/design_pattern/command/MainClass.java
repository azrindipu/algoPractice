package design_pattern.command;

import design_pattern.command.concreteclasses.CommandImplLight;
import design_pattern.command.concreteclasses.Invoker;
import design_pattern.command.concreteclasses.Light;
import design_pattern.command.interfaces.Command;
import design_pattern.command.interfaces.Receiver;

public class MainClass {
    public static void main(String[] args){
        Receiver receiver = new Light();
        Command command = new CommandImplLight(receiver);
        Invoker invoker = new Invoker(command);
        invoker.turnOnLight();
        invoker.turnOnLight();
        invoker.turnOffLight();
        invoker.turnOffLight();
    }
}
