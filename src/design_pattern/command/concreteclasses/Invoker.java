package design_pattern.command.concreteclasses;

import design_pattern.command.interfaces.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void turnOnLight(){
        command.execute();
    }

    public void turnOffLight(){
        command.unExecute();
    }
}
