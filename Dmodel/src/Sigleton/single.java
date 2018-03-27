package Sigleton;

public class single {
	public static single s = new single();

	private single() {
		System.out.println("only one");
	}
	public static single test(){
		return s;
	}
}
