package dp.ch11_compound;

import java.util.Observer;

/**
 * Created by SS on 2016/06/03.
 */
// ����������I�u�U�[�o�ɒʒm����@�\������
public interface QuackObservable {
    public void registerObserver(QuackObserver observer);
    public void notifyObservers();
}
