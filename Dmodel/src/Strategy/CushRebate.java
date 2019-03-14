package Strategy;

public class CushRebate implements Strategy {
	private double cushRebate = 1d;

	public CushRebate(String moneyRebate) {
		this.cushRebate = Double.parseDouble(moneyRebate);
	}

	/*
	 * <p>折扣收费 </p>
	 * 
	 * @param money
	 * 
	 * @return
	 */
	@Override
	public double attachMoney(double money) {
		double result = money * cushRebate;
		return result;
	}
}
