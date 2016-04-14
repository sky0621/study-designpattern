package dp.ch06_command;

/**
 *  2016/03/20.
 */
public interface IfCommand {
    public void setReceiver(IfReceiver receiver);

    public void execute();

    public void undo();
}
