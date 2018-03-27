package Decorator;

public class StringDisplay extends Display{
	private String string;
	public StringDisplay(String string){
		this.string=string;
	}
	@Override
	public int getColumns() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return string.getBytes().length;
	}

	@Override
	public int getRows() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1;
	}

	@Override
	public String GetRowText(int row) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if(row==0){
			return string;
		}else{
			return null;
		}
		
	}

}
