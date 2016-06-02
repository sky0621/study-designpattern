package dp.ch11_compound;

import dp.Z;

/**
 * Created by SS on 2016/05/23.
 */
public class DuckCall implements Quackable {

    // �����Ď�����@�\�̊Ǘ���㗝�N���X�ɈϏ�
    private QuackObservable observableProxy;

    public DuckCall(){
        observableProxy = new QuackObservableProxy(this);
    }

    @Override
    public void quack() {
        System.out.println("GaaGaa");
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
