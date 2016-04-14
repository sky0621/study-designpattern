package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class DecoratorB implements IfComponent {
    private IfComponent component;

    public DecoratorB(IfComponent component) {
        this.component = component;
    }

    @Override
    public void doMethodA() {
        Z.p("DecoratorB START");
        this.component.doMethodA();
        Z.p("DecoratorB END");
    }

    @Override
    public void doMethodB() {
        Z.p("DecoratorB START");
        this.component.doMethodB();
        Z.p("DecoratorB END");
    }
}
