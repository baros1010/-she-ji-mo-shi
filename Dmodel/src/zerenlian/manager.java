package zerenlian;

public class manager extends Handler{

	public manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void handerRequest(request req) {
		if(req.getDay()<10){
			System.out.println("同意");
		}else{
			System.out.println("等待提交上级");
			this.nextHander.handerRequest(req);
		}
		
	}

}
