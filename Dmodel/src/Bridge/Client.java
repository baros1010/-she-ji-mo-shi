package Bridge;

public class Client {

	public static void main(String[] args) {
		Display d1=new Display(new StringDisplayImp("katoumegumi"));
		Display d2=new CountDisplay(new StringDisplayImp("kayano"));
		CountDisplay d3=new CountDisplay(new StringDisplayImp("voilet"));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(6);

	}

}
