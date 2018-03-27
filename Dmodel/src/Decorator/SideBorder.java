package Decorator;

public class SideBorder extends Border{
private char borderChar;
	protected SideBorder(Display display,char ch) {
		super(display);
		// TODO 自動生成されたコンストラクター・スタブ
		borderChar =  ch;
	}

	@Override
	public int getColumns() {
		// TODO 自動生成されたメソッド・スタブ
		return 1+display.getColumns()+1;
	}

	@Override
	public int getRows() {
		// TODO 自動生成されたメソッド・スタブ
		return 1+display.getRows();
	}

	@Override
	public String GetRowText(int row) {

		// TODO 自動生成されたメソッド・スタブ
		return borderChar+display.GetRowText(row)+borderChar;
	}

}
