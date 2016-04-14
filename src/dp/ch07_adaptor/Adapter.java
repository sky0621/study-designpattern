package dp.ch07_adaptor;

import dp.Z;

/**
 *  2016/03/27.
 */
public class Adapter implements Target {

    private AdapteeIF adaptee;

    public Adapter(AdapteeIF adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        String s = this.adaptee.doAnything();
        Z.p(s);
    }
}
