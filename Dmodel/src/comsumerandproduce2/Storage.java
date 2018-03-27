package comsumerandproduce2;

import java.util.LinkedList;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
	public static final int SIZE = 100;
	private LinkedList<Object> list = new LinkedList<Object>();
	public Lock lock = new ReentrantLock();
	public Condition full = lock.newCondition();
	public Condition empty = lock.newCondition();

	public void produce(int num) {
		lock.lock();
		while (list.size() + num > SIZE) {
			System.out.println("【要生产的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行生产任务!");
			try {
				full.await();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		for (int i = 0; i < num; ++i) {
			list.add(new Object());
		}
		System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());
		full.signalAll();
		empty.signalAll();
		lock.unlock();
	}

	public void conmuse(int num) {
		lock.lock();
		while (list.size() < num) {
			System.out.println("【要消费的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行生产任务!");

			try {
				empty.await();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		for (int i = 0; i < num; ++i) {
			list.remove();
		}
		System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());
		full.signalAll();
		empty.signalAll();
		lock.unlock();
	}

	public int getMAX_SIZE() {
		return SIZE;
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

}
