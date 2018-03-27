package Decorator;

public class FullBorder extends Border {

	protected FullBorder(Display display) {
		super(display);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	@Override
	public int getColumns() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1 + display.getRows() + 1;
	}

	@Override
	public String GetRowText(int row) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else
			return "|" + display.GetRowText(row - 1) + "|";
	}

	private String makeLine(char c, int count) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(c);
		}
		return buf.toString();
	}

}
