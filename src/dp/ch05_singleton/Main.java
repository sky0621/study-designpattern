package dp.ch05_singleton;

/**
 *  2016/03/13.
 */
public class Main {
    // Singleton
    // �N���X���C���X�^���X���ЂƂ��������Ȃ����Ƃ�ۏ�
    public static void main(String... args){
        Singleton instance = Singleton.getInstance();
        instance.doSomething();
    }
}
