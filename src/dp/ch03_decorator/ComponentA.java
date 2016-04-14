package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class ComponentA implements IfComponent {
    @Override
    public void doMethodA() {
        Z.p("    "+ComponentA.class.getName()+"#doMethodA()");
    }

    @Override
    public void doMethodB() {
        Z.p("    "+ComponentA.class.getName()+"#doMethodB()");
    }
}
