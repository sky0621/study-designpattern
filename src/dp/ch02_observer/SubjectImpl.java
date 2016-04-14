package dp.ch02_observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  2016/03/06.
 */
public class SubjectImpl implements IfSubject {
    private List<IfObserver> observerList = new ArrayList<>();

    @Override
    public void update() {
        this.observerList.forEach(ob -> ob.doSomething());
    }

    @Override
    public void addObserver(IfObserver observer) {
        this.observerList.add(observer);
    }
}
