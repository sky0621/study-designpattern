package dp.realWorld.command;

/**
 *  2016/03/22.
 */
public class Main {
    public static void main(String... args){
        // Client���R�}���h�𐶐����A���̃R�}���h�ɑ΂��郌�V�[�o��ݒ肷��B
        // ���ׂẴR�}���h�̓C���{�[�J�ɂĕێ�����B
        Client_ client = new Client_();
        Receiver_ lightReceiver = new LightReceiver_();
        Command_ lightOnCommand = client.createCommand(CommandTypeEnum_.LIGHT_ON, lightReceiver);

        Invoker_ invoker = new Invoker_();


    }
}
