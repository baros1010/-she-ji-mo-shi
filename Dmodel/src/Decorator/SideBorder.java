package Decorator;

public class SideBorder extends Border{
private char borderChar;
	protected SideBorder(Display display,char ch) {
		super(display);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		borderChar =  ch;
	}

	@Override
	public int getColumns() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1+display.getColumns()+1;
	}

	@Override
	public int getRows() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1+display.getRows();
	}

	@Override
	public String GetRowText(int row) {

		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return borderChar+display.GetRowText(row)+borderChar;
	}

}
