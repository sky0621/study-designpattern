package dp.ch06_command;

/**
 *  2016/03/13.
 */
public class Main {
    // Command
    // リクエストをオブジェクトとしてカプセル化
    //
    // Client・・・Commandを作成
    // Command・・・execute()でコマンドを実行。undo()でコマンドを取り消し？
    // Invoker・・・set[add]Command()でCommandを保持（複数）し、invoke()により保持したコマンドを実行
    // Receiver・・・Commandが処理実行時の操作を移譲
    public static void main(String... args){
        Client client = new Client();
        Invoker invoker = new Invoker();
        for(CommandKindEnum commandKind : CommandKindEnum.values()){
            invoker.addCommand(client.createCommand(commandKind, new ReceiverA()));
        }
        for(CommandKindEnum commandKind : CommandKindEnum.values()){
            invoker.addCommand(client.createCommand(commandKind, new ReceiverB()));
        }
        invoker.invoke();
    }
}
