package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class DecoratorA implements IfComponent {
    private IfComponent component;

    public DecoratorA(IfComponent component) {
        this.component = component;
    }

    @Override
    public void doMethodA() {
        Z.p("DecoratorA START");
        this.component.doMethodA();
        Z.p("DecoratorA END");
    }

    @Override
    public void doMethodB() {
        Z.p("DecoratorA START");
        this.component.doMethodB();
        Z.p("DecoratorA END");
    }
}
