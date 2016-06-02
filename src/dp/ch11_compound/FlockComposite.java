package dp.ch11_compound;

import dp.Z;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/29.
 */
public class FlockComposite implements Quackable {

    private List<Quackable> quackableList = new ArrayList<>();

    public void add(Quackable quackable) {
        this.quackableList.add(quackable);
    }

    @Override
    public void quack() {
        quackableList.stream().forEach(quackable -> quackable.quack());
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        quackableList.stream().forEach(quackable -> quackable.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        quackableList.stream().forEach(quackable -> quackable.notifyObservers());
    }

}
