package Prototype;

public class Main {

	public static void main(String[] args) {
		Manager manger=new Manager();
		UnderlinePen line=new UnderlinePen('-');
		MessageBox box=new MessageBox('*');
		MessageBox boxs=new MessageBox('/');
		manger.register("haha", line);
		manger.register("hehe", box);
		manger.register("xixi", boxs);
		Product p1=manger.create("haha");
		p1.user("hello world");
		Product p2=manger.create("hehe");
		p2.user("hello world");
		Product p3=manger.create("xixi");
		p3.user("hello world");

	}

}
