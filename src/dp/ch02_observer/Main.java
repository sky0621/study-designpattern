package dp.ch02_observer;

/**
 *  2016/02/28.
 */
public class Main {
    // オブジェクト間の１対多の依存関係を定義し、あるオブジェクトの状態が変化すると、
    // それに依存しているすべてのオブジェクトが自動的に通知され更新されるようにする。
    //
    // Subject(=Publisher=発行者)・・・データを管理し、データの変更をObserverに通知(ブロードキャスト)
    // Observer(=Subscriber=購読者)・・・データの変更をSubjectから通知してもらい、それに応じた処理を行う
    public static void main(String... args) {
        IfSubject subject = new SubjectImpl();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverC());
        subject.addObserver(new ObserverB());

        subject.update();
    }
}
