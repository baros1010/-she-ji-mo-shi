package zerenlian;

public class manager extends Handler{

	public manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void handerRequest(request req) {
		if(req.getDay()<10){
			System.out.println("ͬ��");
		}else{
			System.out.println("�ȴ��ύ�ϼ�");
			this.nextHander.handerRequest(req);
		}
		
	}

}
