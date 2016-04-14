package dp.ch01_strategy;

/**
 *  2016/02/28.
 */
public class StrategyA implements IfStrategy {
    @Override
    public void doSomething(String something) {
        System.out.println(something+" execute StrategyA");
    }
}
