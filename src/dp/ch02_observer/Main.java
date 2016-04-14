package dp.ch02_observer;

/**
 *  2016/02/28.
 */
public class Main {
    // �I�u�W�F�N�g�Ԃ̂P�Α��̈ˑ��֌W���`���A����I�u�W�F�N�g�̏�Ԃ��ω�����ƁA
    // ����Ɉˑ����Ă��邷�ׂẴI�u�W�F�N�g�������I�ɒʒm����X�V�����悤�ɂ���B
    //
    // Subject(=Publisher=���s��)�E�E�E�f�[�^���Ǘ����A�f�[�^�̕ύX��Observer�ɒʒm(�u���[�h�L���X�g)
    // Observer(=Subscriber=�w�ǎ�)�E�E�E�f�[�^�̕ύX��Subject����ʒm���Ă��炢�A����ɉ������������s��
    public static void main(String... args) {
        IfSubject subject = new SubjectImpl();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverC());
        subject.addObserver(new ObserverB());

        subject.update();
    }
}
