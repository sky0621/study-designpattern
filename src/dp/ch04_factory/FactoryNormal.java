package dp.ch04_factory;

/**
 *  2016/03/12.
 */
public class FactoryNormal implements IfFactory {
    @Override
    public IfProduct createProduct() {
        return new ProductNormal();
    }
}
