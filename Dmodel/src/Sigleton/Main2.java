package Sigleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 implements Runnable{
	public void run() {   
        try {
			System.out.println(single2.getSingle().hashCode());
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}  
    }  
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			exec.execute(new Main2());
	}
}
