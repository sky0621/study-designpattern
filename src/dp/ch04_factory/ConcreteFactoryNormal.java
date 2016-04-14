package dp.ch04_factory;

/**
 *  2016/03/13.
 */
public class ConcreteFactoryNormal implements IfAbstractFactory {
    @Override
    public IfProductA createProductA() {
        return new ProductANormal();
    }

    @Override
    public IfProductB createProductB() {
        return new ProductBNormal();
    }
}
