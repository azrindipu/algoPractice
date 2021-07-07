package design_pattern.command.concreteclasses;

import design_pattern.command.interfaces.Command;
import design_pattern.command.interfaces.Receiver;

public class CommandImplLight implements Command {

    private Receiver receiver;

    public CommandImplLight(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.rutnOn();
    }

    @Override
    public void unExecute() {
        receiver.turnOff();
    }
}
