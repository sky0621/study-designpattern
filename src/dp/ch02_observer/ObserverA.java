package dp.ch02_observer;

import dp.Z;

/**
 *  2016/03/06.
 */
public class ObserverA implements IfObserver {
    @Override
    public void doSomething() {
        Z.p(ObserverA.class.getName());
    }
}
