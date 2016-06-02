package dp.ch11_compound;

/**
 * Created by SS on 2016/06/03.
 */
// 鴨の鳴きを監視（鳴いたら update() を呼んでもらう）する機能を持つ
public interface QuackObserver {
    public void update(QuackObservable duck);
}
