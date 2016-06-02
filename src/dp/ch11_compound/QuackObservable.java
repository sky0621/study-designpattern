package dp.ch11_compound;

import java.util.Observer;

/**
 * Created by SS on 2016/06/03.
 */
// 鴨が鳴いたらオブザーバに通知する機能を持つ
public interface QuackObservable {
    public void registerObserver(QuackObserver observer);
    public void notifyObservers();
}
