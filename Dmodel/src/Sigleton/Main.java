package Sigleton;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		single s1=single.test();
		single s2=single.test();
		if(s1==s2)
			System.out.println("yes");
	}

}
