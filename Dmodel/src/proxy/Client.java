package proxy;

public class Client {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		subject sj=new RealSubject();
		Proxy px=new Proxy(sj);
		px.operateion();
	}

}
