package zerenlian;

public class Main {

	public static void main(String[] args) {
		request req=new request();
		req.setDay(1);
		req.setName("chinrai");
		Handler sun=new manager("sun");
		
		Handler xx=new PM("sun");
		sun.setNextHander(xx);
		sun.handerRequest(req);

	}

}
