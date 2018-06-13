package SimpleFactory;

public class Client {
	
public static void main(String[] args){
	Factory fac = new Factory();
	Product p=fac.getProduct("1");
	p.getProduct();
	
}
}
