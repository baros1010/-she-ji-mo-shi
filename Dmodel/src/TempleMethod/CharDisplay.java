package TempleMethod;

public class CharDisplay extends display{
	char ch;
	public CharDisplay(char ch){
		this.ch=ch;
	} 
	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(ch);
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(">>");
	}

}
