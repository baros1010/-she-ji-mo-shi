package Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Display b1=new StringDisplay("I am your father!");
		Display b2=new SideBorder(b1,'#');
		Display b3=new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		Display b4=new SideBorder(new FullBorder(new FullBorder(new SideBorder(new StringDisplay("Hello World"),'*'))),'+');
		b4.show();
	}

}
