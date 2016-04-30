package dp.ch07_adaptor;

/**
 *  2016/03/27.
 */
public class Main {
    // 使うInterfaceが固定されているが、別のInterfaceを持つ処理を流用したい場合に
    // Interfaceを変えずに解決する方法
    //
    // Adapter・・・使うことが決まっているInterfaceを実装したクラス
    // Adaptee・・・本来使いたい別のInterfaceを実装したクラス
    public static void main(String... args){
        Adapter adapter = new Adapter(new Adaptee());
        adapter.doSomething();
    }
}
