package Sigleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exec=Executors.newCachedThreadPool();
		
		for(int i=0;i<3;i++)
			exec.execute(new single3());
		
	}

}
