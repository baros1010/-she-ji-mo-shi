package proxy;

public class Proxy {
	private subject sj;

	public Proxy(subject sj) {
		this.sj = sj;
	}

	public void operateion() {
		System.out.println("before");
		sj.operateion();
		System.out.println("after");
	}
}
