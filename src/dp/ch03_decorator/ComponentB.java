package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class ComponentB implements IfComponent {
    @Override
    public void doMethodA() {
        Z.p("    "+ComponentB.class.getName() + "#doMethodA()");
    }

    @Override
    public void doMethodB() {
        Z.p("    "+ComponentB.class.getName() + "#doMethodB()");
    }
}
