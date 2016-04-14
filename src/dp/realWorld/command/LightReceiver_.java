package dp.realWorld.command;

import dp.Z;

/**
 *  2016/03/22.
 */
public class LightReceiver_ implements Receiver_ {
    @Override
    public void action() {
        Z.p(" I'm a light. ");
    }
}
