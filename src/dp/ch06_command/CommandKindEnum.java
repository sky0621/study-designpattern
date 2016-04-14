package dp.ch06_command;

/**
 *  2016/03/20.
 */
public enum CommandKindEnum {
    COMMAND_A("dp.ch06_command.CommandA"), COMMAND_B("dp.ch06_command.CommandB");

    private String commandClassName;

    CommandKindEnum(String commandClassName) {
        this.commandClassName = commandClassName;
    }

    public String clz() {
        return this.commandClassName;
    }
}
