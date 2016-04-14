package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class Main {
    // オブジェクトに付加的な責務を動的に付与
    //
    // 同一インタフェースを持つコンポーネントを保持するデコレータを作成
    // デコレータはコンポーネントと同じメソッドを持ち、内部処理でコンポーネントの同一メソッドをデコレート（装飾）する
    public static void main(String... args){
        IfComponent decoratorA = new DecoratorA(new Decorator(new ComponentA()));
        decoratorA.doMethodA();
        Z.l();
        decoratorA.doMethodB();
        Z.l();
        IfComponent decoratorB = new DecoratorB(new Decorator(new ComponentB()));
        decoratorB.doMethodA();
        Z.l();
        decoratorB.doMethodB();
        Z.l();
    }
}
