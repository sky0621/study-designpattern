package dp.ch06_command;

import dp.Z;

/**
 *  2016/03/20.
 */
public class ReceiverB implements IfReceiver {
    @Override
    public void action() {
        Z.p("ReceiverB action!");
    }
}
