package Decorator;

public class FullBorder extends Border {

	protected FullBorder(Display display) {
		super(display);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getColumns() {
		// TODO 自動生成されたメソッド・スタブ
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// TODO 自動生成されたメソッド・スタブ
		return 1 + display.getRows() + 1;
	}

	@Override
	public String GetRowText(int row) {
		// TODO 自動生成されたメソッド・スタブ
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else
			return "|" + display.GetRowText(row - 1) + "|";
	}

	private String makeLine(char c, int count) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(c);
		}
		return buf.toString();
	}

}
