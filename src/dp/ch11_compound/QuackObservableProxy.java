package dp.ch11_compound;

import dp.Z;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by SS on 2016/06/03.
 */
// Quackableを監視する機能を代理で担う
public class QuackObservableProxy implements QuackObservable {

    private List<QuackObserver> observers = new ArrayList<>();
    private QuackObservable duck;

    public QuackObservableProxy(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach( observer -> observer.update(duck));
    }

}
