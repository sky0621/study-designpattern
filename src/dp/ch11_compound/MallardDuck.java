package dp.ch11_compound;

import dp.Z;

/**
 * Created by SS on 2016/05/23.
 */
public class MallardDuck implements Quackable {

    // �����Ď�����@�\�̊Ǘ���㗝�N���X�ɈϏ�
    private QuackObservable observableProxy;

    public MallardDuck(){
        observableProxy = new QuackObservableProxy(this);
    }

    @Override
    public void quack() {
        System.out.println("GarGar");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observableProxy.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observableProxy.notifyObservers();
    }

}
