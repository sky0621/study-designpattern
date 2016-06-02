package dp.ch11_compound;

/**
 * Created by SS on 2016/05/29.
 */
// 鳴くたびに鳴いた数を集計する機能がほしいため、鳴く機能をデコレートして集計機能を追加
// 鳴く機能を実装する個々のクラスには修正が入らない。ただし、鳴く機能の呼び出し元は、鳴く機能の生成ロジックをデコレータでデコレートさせる必要がある。
public class QuackCountDecorator implements Quackable {

    private Quackable quackable;
    private static int numberOfQuacks;

    public QuackCountDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        this.quackable.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        this.quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.quackable.notifyObservers();
    }


}
