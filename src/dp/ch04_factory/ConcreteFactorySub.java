package dp.ch04_factory;

/**
 *  2016/03/13.
 */
public class ConcreteFactorySub implements IfAbstractFactory {
    @Override
    public IfProductA createProductA() {
        return new ProductASub();
    }

    @Override
    public IfProductB createProductB() {
        return new ProductBSub();
    }
}
