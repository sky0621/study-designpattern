package dp.ch04_factory;

/**
 *  2016/03/12.
 */
public class FactoryBuilder {

    public static IfFactory createFactory(FactoryKindEnum factoryKind) {
        switch(factoryKind){
            case NORMAL:
                return new FactoryNormal();
            default:
                return null;
        }
    }

    public static IfAbstractFactory createAbstractFactory(ProductKindEnum productNormal) {
        switch (productNormal){
            case PRODUCT_NORMAL:
                return new ConcreteFactoryNormal();
            case PRODUCT_SUB:
                return new ConcreteFactorySub();
            default:
                return null;
        }
    }
}
