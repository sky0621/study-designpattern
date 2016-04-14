package dp.ch03_decorator;

import dp.Z;

/**
 *  2016/03/06.
 */
public class Main {
    // �I�u�W�F�N�g�ɕt���I�ȐӖ��𓮓I�ɕt�^
    //
    // ����C���^�t�F�[�X�����R���|�[�l���g��ێ�����f�R���[�^���쐬
    // �f�R���[�^�̓R���|�[�l���g�Ɠ������\�b�h�������A���������ŃR���|�[�l���g�̓��ꃁ�\�b�h���f�R���[�g�i�����j����
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
