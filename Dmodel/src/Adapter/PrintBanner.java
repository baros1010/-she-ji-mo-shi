package Adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	@Override
	public void printWeak() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		showWithParen();
	}

	@Override
	public void printString() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		showWithAster();
	}

}
