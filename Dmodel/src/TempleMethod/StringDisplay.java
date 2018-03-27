package TempleMethod;

public class StringDisplay extends display {
	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		printline();

	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
System.out.println("|"+string+"|");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		printline();
	}

	public void printline() {
		System.out.println("+");
		for (int i = 0; i < width; i++)
			System.out.print("-");
		System.out.println("+");
	}
}
