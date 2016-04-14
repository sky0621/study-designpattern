package dp.ch04_factory;

import dp.Z;

/**
 *  2016/03/06.
 */
public class Main {
    // Factory Method
    // �I�u�W�F�N�g�쐬�̂��߂̃C���^�t�F�[�X���`�B�ǂ̃N���X���C���X�^���X�����邩�̓T�u�N���X�Ɍ��肳����B
    //
    // Abstract Factory
    // ��ۃN���X���w�肷�邱�ƂȂ��A��A�̊֘A�I�u�W�F�N�g��ˑ��I�u�W�F�N�g���쐬���邽�߂̃C���^�[�t�F�[�X���
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
