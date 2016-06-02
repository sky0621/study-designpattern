package dp.ch11_compound;

import dp.Z;

/**
 * Created by SS on 2016/06/03.
 */
public class Quackologist implements QuackObserver {
    @Override
    public void update(QuackObservable duck) {
        Z.p("Yes, " + duck + " called!");
    }
}
