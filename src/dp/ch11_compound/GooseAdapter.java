package dp.ch11_compound;

/**
 * Created by SS on 2016/05/29.
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    // �����Ď�����@�\�̊Ǘ���㗝�N���X�ɈϏ�
    private QuackObservable observableProxy;

    public GooseAdapter(){
        observableProxy = new QuackObservableProxy(this);
    }

    public GooseAdapter(Goose goose) {
        this();
        this.goose = goose;
    }

    @Override
    public void quack() {
        this.goose.honk();
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
