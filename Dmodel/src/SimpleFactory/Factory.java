package SimpleFactory;

public class Factory {
public Product getProduct(String s){
	if("1".equals(s)){
		return new Product1();	
	}else{
		return new Product2();		
	}
	
}
}
