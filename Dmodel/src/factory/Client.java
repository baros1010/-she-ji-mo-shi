package factory;

public class Client {
public static void test(CycleFactory fac){
	Cycle c=fac.getFactory();
	c.method();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test(new BicycleFactory());
	}

}
