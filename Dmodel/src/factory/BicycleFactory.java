package factory;

public class BicycleFactory implements CycleFactory{

	@Override
	public Cycle getFactory() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new Bicycle();
	}

}
