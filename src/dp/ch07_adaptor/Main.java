package dp.ch07_adaptor;

/**
 *  2016/03/27.
 */
public class Main {
    // �g��Interface���Œ肳��Ă��邪�A�ʂ�Interface���������𗬗p�������ꍇ��
    // Interface��ς����ɉ���������@
    //
    // Adapter�E�E�E�g�����Ƃ����܂��Ă���Interface�����������N���X
    // Adaptee�E�E�E�{���g�������ʂ�Interface�����������N���X
    public static void main(String... args){
        Adapter adapter = new Adapter(new Adaptee());
        adapter.doSomething();
    }
}
