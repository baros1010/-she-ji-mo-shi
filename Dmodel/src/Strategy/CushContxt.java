package Strategy;

public class CushContxt {
 private Strategy strategy;
 public CushContxt(Strategy strategy){
	 this.strategy=strategy;
 }
  public double getResult(double money){
	 return strategy.attachMoney(money);
 }
}
