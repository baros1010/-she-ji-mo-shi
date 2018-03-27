package Sigleton;

public class single3 implements Runnable{
	private int count=10;
	private static single3 s3=new single3();
	public static single3 getInStance(){
		return s3;
	}
	public synchronized int getTicket(){
		return count++;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			int c=getInStance().getTicket();//单例
			System.out.println(Thread.currentThread()+" " +c);
		}
		
	}

}
