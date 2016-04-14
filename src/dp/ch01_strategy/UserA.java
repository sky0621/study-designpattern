package dp.ch01_strategy;

/**
 *  2016/02/28.
 */
public class UserA implements IfUser {
    private IfStrategy strategy;
    @Override
    public void setStrategy(IfStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void execStrategy() {
        this.strategy.doSomething("UserA");
    }
}
