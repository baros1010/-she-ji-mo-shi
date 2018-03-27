package factory;

public class BicycleFactory implements CycleFactory{

	@Override
	public Cycle getFactory() {
		// TODO 自動生成されたメソッド・スタブ
		return new Bicycle();
	}

}
