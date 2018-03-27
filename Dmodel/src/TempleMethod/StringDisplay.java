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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		printline();

	}

	@Override
	public void print() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
System.out.println("|"+string+"|");
	}

	@Override
	public void close() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		printline();
	}

	public void printline() {
		System.out.println("+");
		for (int i = 0; i < width; i++)
			System.out.print("-");
		System.out.println("+");
	}
}
