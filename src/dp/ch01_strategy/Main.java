package dp.ch01_strategy;

/**
 *  2016/02/28.
 */
public class Main {
    // ��A�̃A���S���Y�����`���A���ꂼ����J�v�Z�������Ă����������\�ɂ���B
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
