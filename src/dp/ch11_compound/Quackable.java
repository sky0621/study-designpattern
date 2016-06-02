package dp.ch11_compound;

/**
 * Created by SS on 2016/05/23.
 */
// 鳴く機能を担うインタフェース
// 鳴いたらオブザーバに通知もする
public interface Quackable extends QuackObservable {

    // 鳴くことだけを機能として持つ
    public void quack();

}
