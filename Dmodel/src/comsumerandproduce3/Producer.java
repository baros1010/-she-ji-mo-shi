package comsumerandproduce3;

public class Producer extends Thread{
	public int num;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Storage storage;

	public Producer(Storage storage) {
		this.storage = storage;

	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		produce(num);
	}

	void produce(int num) {
		storage.produce(num);
	}

}
