package dp.ch02_observer;

/**
 *  2016/03/06.
 */
public interface IfSubject {
    public void update();

    public void addObserver(IfObserver observer);
}
