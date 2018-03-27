package AbstractFactory;

/**
 * 
 * 工厂实现类
 *
 */
public class Factory implements IFactory {
	@Override
	/**
	 * 产品1工厂实现
	 */
	public IProduct1 createFactory1() {
		// TODO 自動生成されたメソッド・スタブ
		return new Product1();
	}

	/**
	 * 产品2工厂实现
	 */
	@Override
	public IProduct2 createFactory2() {
		// TODO 自動生成されたメソッド・スタブ
		return new Product2();
	}

}
