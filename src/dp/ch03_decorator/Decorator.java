package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class Decorator implements IfComponent {
    private IfComponent component;

    public Decorator(IfComponent component) {
        this.component = component;
    }

    @Override
    public void doMethodA() {
        Z.p("  Decorator START");
        this.component.doMethodA();
        Z.p("  Decorator END");
    }

    @Override
    public void doMethodB() {
        Z.p("  Decorator START");
        this.component.doMethodB();
        Z.p("  Decorator END");
    }
}
