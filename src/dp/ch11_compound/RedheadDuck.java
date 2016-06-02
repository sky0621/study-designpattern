package dp.ch11_compound;

/**
 * Created by SS on 2016/05/23.
 */
public class RedheadDuck implements Quackable {

    // 鳴きを監視する機能の管理を代理クラスに委譲
    private QuackObservable observableProxy;

    public RedheadDuck(){
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
