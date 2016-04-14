package dp.ch04_factory;

import dp.Z;

/**
 *  2016/03/13.
 */
public class ProductANormal implements IfProductA {
    @Override
    public void doSomething() {
        Z.p("ProductA Normal.");
    }
}
