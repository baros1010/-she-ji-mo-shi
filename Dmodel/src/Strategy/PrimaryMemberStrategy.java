package Strategy;

public class PrimaryMemberStrategy implements MemberStrategy{

	@Override
	public double calcprice(double bookprice) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("初期会员没打折");
		return bookprice;
	}

}
