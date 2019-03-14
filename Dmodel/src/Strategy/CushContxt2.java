package Strategy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CushContxt2 {
	private static final String[] CUSH_CLASS_NAME = {  
	        "Strategy.CushNormal",  
	        "Strategy.CushRebate",  
	        "Strategy.CushReturn"
	    };
	Strategy strategy=null;
	public CushContxt2(String type,Class[] paramsType, Object[] parmas){
		int type2=Integer.parseInt(type);
		try {
			Class<?> clazz=Class.forName(CUSH_CLASS_NAME[type2]);
			Constructor<?> constructor=clazz.getConstructor(paramsType);
			this.strategy=(Strategy)constructor.newInstance(parmas);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	
	}
	public double getResult(double money){
		return strategy.attachMoney(money);
	}
}
