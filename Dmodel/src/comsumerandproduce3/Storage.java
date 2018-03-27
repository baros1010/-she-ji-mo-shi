package comsumerandproduce3;

import java.util.concurrent.LinkedBlockingQueue;

public class Storage {
	// 仓库最大存储量
	private final int MAX_SIZE = 100;
	LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<Object>(MAX_SIZE);

	public void produce(int num) {
		if (queue.size() == MAX_SIZE) {
			System.out.println("【库存量】:" + MAX_SIZE + "/t暂时不能执行生产任务!");
		}
		for (int i = 0; i < num; i++) {
			try {
				queue.put(new Object());
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}
		System.out.println("【现仓储量为】:" + queue.size());
	}

	public void conmuse(int num) {
		if (queue.size() == 0) {
			System.out.println("【库存量】:0/t暂时不能执行生产任务!");
		}
		for (int i = 0; i < num; i++) {
			try {
				queue.take();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		System.out.println("【现仓储量为】:" + queue.size());
	}
    // set/get方法  
    public LinkedBlockingQueue<Object> getList()  
    {  
        return queue;  
    }  
  
    public void setList(LinkedBlockingQueue<Object> queue)  
    {  
        this.queue = queue;  
    }  
  
    public int getMAX_SIZE()  
    {  
        return MAX_SIZE;  
    }  
}
