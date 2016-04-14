package dp.ch01_strategy;

/**
 *  2016/02/28.
 */
public interface IfUser {
    public void setStrategy(IfStrategy strategy);
    public void execStrategy();
}
