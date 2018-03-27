package AbstractFactory;

public class Client {
/**
 * 主方法
 * @param args
 */
	public static void main(String[] args) {
		IFactory fac=new Factory();
		fac.createFactory1().show();
		fac.createFactory2().show();

	}

}
