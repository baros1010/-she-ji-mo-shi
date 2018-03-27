package Strategy;

public class Client {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MemberStrategy strategy = new AdvancedMemberStrategy();
		price p=new price(strategy);
		double quotes=p.quote(300);
		 System.out.println("图书的最终价格为：" + quotes);

	}

}
