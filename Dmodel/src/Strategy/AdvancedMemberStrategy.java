package Strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcprice(double bookprice) {
		// TODO 自動生成されたメソッド・スタブ
		  System.out.println("对于高级会员的折扣为20%");
		return bookprice*0.8;
	}

}
