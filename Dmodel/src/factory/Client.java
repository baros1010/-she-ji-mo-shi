package factory;

public class Client {
public static void test(CycleFactory fac){
	Cycle c=fac.getFactory();
	c.method();
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		test(new BicycleFactory());
	}

}
