package Bridge;

public class Display {
	private DisplayImp imp;

	public Display(DisplayImp imp) {
		this.imp = imp;
	}

	public void open() {
		imp.rawOpen();
	}

	public void print() {
		imp.rawPrint();
	}

	public void close() {
		imp.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
