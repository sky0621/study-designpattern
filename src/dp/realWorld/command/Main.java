package dp.realWorld.command;

/**
 *  2016/03/22.
 */
public class Main {
    public static void main(String... args){
        // Clientがコマンドを生成し、そのコマンドに対するレシーバを設定する。
        // すべてのコマンドはインボーカにて保持する。
        Client_ client = new Client_();
        Receiver_ lightReceiver = new LightReceiver_();
        Command_ lightOnCommand = client.createCommand(CommandTypeEnum_.LIGHT_ON, lightReceiver);

        Invoker_ invoker = new Invoker_();


    }
}
