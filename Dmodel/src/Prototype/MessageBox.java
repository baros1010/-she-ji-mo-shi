package Prototype;

public class MessageBox implements Product {
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void user(String name) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int length = name.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + name + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();

		} catch (CloneNotSupportedException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return p;
	}

}
