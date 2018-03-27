package Prototype;

public class UnderlinePen implements Product{
private char unchar ;
public UnderlinePen(char unchar){
	this.unchar=unchar;
}
	@Override
	public void user(String name) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int length=name.getBytes().length;
		System.out.println("\""+name+"\"");
		System.out.print("");
		for(int i=0;i<length;i++){
			System.out.print(unchar);
			
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p=null;
		try {
			p=(Product)clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return p;
	
	}

}
