package dp.ch04_factory;

import dp.Z;

/**
 *  2016/03/13.
 */
public class ProductBNormal implements IfProductB {
    @Override
    public void doSomething() {
        Z.p("ProductB Normal.");
    }
}
