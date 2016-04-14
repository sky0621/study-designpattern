package dp.ch04_factory;

import dp.Z;

/**
 *  2016/03/06.
 */
public class Main {
    // Factory Method
    // オブジェクト作成のためのインタフェースを定義。どのクラスをインスタンス化するかはサブクラスに決定させる。
    //
    // Abstract Factory
    // 具象クラスを指定することなく、一連の関連オブジェクトや依存オブジェクトを作成するためのインターフェースを提供
    //
    public static void main(String... args){
        // Factory Method
        IfFactory factory = FactoryBuilder.createFactory(FactoryKindEnum.NORMAL);
        IfProduct product = factory.createProduct();
        product.doSomething();

        Z.l();

        // Abstract Factory
        IfAbstractFactory factoryNormal = FactoryBuilder.createAbstractFactory(ProductKindEnum.PRODUCT_NORMAL);
        IfProductA productANormal = factoryNormal.createProductA();
        IfProductB productBNormal = factoryNormal.createProductB();
        productANormal.doSomething();
        productBNormal.doSomething();

        IfAbstractFactory factorySub = FactoryBuilder.createAbstractFactory(ProductKindEnum.PRODUCT_SUB);
        IfProductA productASub = factorySub.createProductA();
        IfProductB productBSub = factorySub.createProductB();
        productASub.doSomething();
        productBSub.doSomething();

    }
}
