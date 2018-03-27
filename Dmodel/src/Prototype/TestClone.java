package Prototype;

public class TestClone implements Cloneable {
	public String str;

	public TestClone()
	{}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone t1 = new TestClone();
		t1.setStr("1");
		System.out.println(t1.getStr());

		TestClone t2 = new TestClone();
		//t2 = t1;
		t2=(TestClone) t1.clone();
		t1.setStr("222");
		System.out.println(t1.getStr());
		System.out.println(t2.getStr());

	}
}
