package Strategy;

public class price {
private MemberStrategy strategy;
public price(MemberStrategy strategy){
	this.strategy=strategy;
}
public double quote(double booksPrice){
	return this.strategy.calcprice(booksPrice);
}
}
