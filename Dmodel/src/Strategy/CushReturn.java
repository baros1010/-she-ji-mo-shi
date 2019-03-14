package Strategy;

public class CushReturn implements Strategy{

	private double cushContidion=0d;
	private double cushReturn=0;
	public CushReturn(String cushContidion,String cushReturn) {
		this.cushContidion=Double.parseDouble(cushContidion);
		this.cushReturn=Double.parseDouble(cushReturn);
	}
	
	/*
	 * <p>满减收费 </p>   
	 * @param money
	 * @return   
	 */
	@Override
	public double attachMoney(double money) {
		double result=money-Math.floor(money/cushContidion)*cushReturn;
		return result;
	}

}
