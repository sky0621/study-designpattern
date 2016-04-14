package dp.ch06_command;

import dp.Z;

/**
 *  2016/03/20.
 */
public class CommandA implements IfCommand {
    private IfReceiver receiver;

    @Override
    public void setReceiver(IfReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.print("CommandA - ");
        this.receiver.action();
        Z.l();
    }

    @Override
    public void undo() {
        Z.p("CommandA undo()");
    }
}
