package TempleMethod;

public abstract class display {
	public abstract void open();

	public abstract void print();

	public abstract void close();

	public final void test() {
		open();
		for (int i = 0; i < 5; i++)
			print();
		close();
	}

}
