package Strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcprice(double bookprice) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("对于中级会员的折扣为10%");
		return bookprice*0.9;
	}

}
