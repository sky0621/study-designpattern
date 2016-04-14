package dp.ch04_factory;

import dp.Z;

/**
 *  2016/03/13.
 */
public class ProductBSub implements IfProductB {
    @Override
    public void doSomething() {
        Z.p("ProductB Sub.");
    }
}
