package dp.ch05_singleton;

/**
 *  2016/03/13.
 */
public class Main {
    // Singleton
    // クラスがインスタンスをひとつしか持たないことを保証
    public static void main(String... args){
        Singleton instance = Singleton.getInstance();
        instance.doSomething();
    }
}
