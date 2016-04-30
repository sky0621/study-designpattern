package dp.ch06_command;

/**
 *  2016/03/13.
 */
public class Main {
    // Command
    // ���N�G�X�g���I�u�W�F�N�g�Ƃ��ăJ�v�Z����
    //
    // Client�E�E�ECommand���쐬
    // Command�E�E�Eexecute()�ŃR�}���h�����s�Bundo()�ŃR�}���h���������H
    // Invoker�E�E�Eset[add]Command()��Command��ێ��i�����j���Ainvoke()�ɂ��ێ������R�}���h�����s
    // Receiver�E�E�ECommand���������s���̑�����ڏ�
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
