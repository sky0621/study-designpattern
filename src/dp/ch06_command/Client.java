package dp.ch06_command;

/**
 *  2016/03/13.
 */
public class Client {
    public IfCommand createCommand(CommandKindEnum commandKind, IfReceiver receiver){
        try {
            IfCommand command = (IfCommand)Class.forName(commandKind.clz()).newInstance();
            command.setReceiver(receiver);
            return command;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
