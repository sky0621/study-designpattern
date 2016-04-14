package dp.ch06_command;

import java.util.ArrayList;
import java.util.List;

/**
 *  2016/03/20.
 */
public class Invoker {
    private List<IfCommand> commandList;

    public Invoker(){
        this.commandList = new ArrayList<>();
    }

    public void addCommand(IfCommand command){
        this.commandList.add(command);
    }

    public void removeCommand(IfCommand command){
        this.commandList.remove(command);
    }

    public void invoke(){
        this.commandList.stream().forEach( command -> command.execute() );
    }
}
