package dp.ch11_compound;

/**
 * Created by SS on 2016/05/29.
 */
// �����тɖ��������W�v����@�\���ق������߁A���@�\���f�R���[�g���ďW�v�@�\��ǉ�
// ���@�\����������X�̃N���X�ɂ͏C��������Ȃ��B�������A���@�\�̌Ăяo�����́A���@�\�̐������W�b�N���f�R���[�^�Ńf�R���[�g������K�v������B
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
