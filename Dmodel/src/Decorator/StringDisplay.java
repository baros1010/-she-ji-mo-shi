package Decorator;

public class StringDisplay extends Display{
	private String string;
	public StringDisplay(String string){
		this.string=string;
	}
	@Override
	public int getColumns() {
		// TODO 自動生成されたメソッド・スタブ
		return string.getBytes().length;
	}

	@Override
	public int getRows() {
		// TODO 自動生成されたメソッド・スタブ
		return 1;
	}

	@Override
	public String GetRowText(int row) {
		// TODO 自動生成されたメソッド・スタブ
		if(row==0){
			return string;
		}else{
			return null;
		}
		
	}

}
