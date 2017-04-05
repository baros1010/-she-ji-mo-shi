package proxy;

public class Client {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		subject sj=new RealSubject();
		Proxy px=new Proxy(sj);
		px.operateion();
	}

}
