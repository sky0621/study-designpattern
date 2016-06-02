package dp.ch11_compound;

import dp.Z;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by SS on 2016/06/03.
 */
// Quackable‚ğŠÄ‹‚·‚é‹@”\‚ğ‘ã—‚Å’S‚¤
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
