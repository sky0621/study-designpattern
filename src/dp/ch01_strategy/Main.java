package dp.ch01_strategy;

/**
 *  2016/02/28.
 */
public class Main {
    // 一連のアルゴリズムを定義し、それぞれをカプセル化してそれらを交換可能にする。
    public static void main(String... args){
        IfUser userA = new UserA();
        userA.setStrategy(new StrategyA());
        userA.execStrategy();

        userA.setStrategy(new StrategyB());
        userA.execStrategy();

        IfUser userB = new UserB();
        userB.setStrategy(new StrategyA());
        userB.execStrategy();

        userB.setStrategy(new StrategyB());
        userB.execStrategy();
    }
}
