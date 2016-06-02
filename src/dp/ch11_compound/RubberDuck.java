package dp.ch11_compound;

/**
 * Created by SS on 2016/05/23.
 */
public class RubberDuck implements Quackable {

    // �����Ď�����@�\�̊Ǘ���㗝�N���X�ɈϏ�
    private QuackObservable observableProxy;

    public RubberDuck(){
        observableProxy = new QuackObservableProxy(this);
    }

    @Override
    public void quack() {
        System.out.println("QuuQuu");
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
