package dp.ch07_adaptor;

/**
 *  2016/03/27.
 */
public class Main {
    public static void main(String... args){
        Adapter adapter = new Adapter(new Adaptee());
        adapter.doSomething();
    }
}
