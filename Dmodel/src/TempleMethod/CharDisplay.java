package TempleMethod;

public class CharDisplay extends display{
	char ch;
	public CharDisplay(char ch){
		this.ch=ch;
	} 
	@Override
	public void open() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print(ch);
	}

	@Override
	public void close() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print(">>");
	}

}
