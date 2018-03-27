package Sigleton;

public class single2 {
	private static single2 s2 = null;

	public synchronized static single2 getSingle() throws InterruptedException {
		if (s2 == null) {
		Thread.sleep(200);
		s2=new single2();
		}
		return s2;
	}
}
