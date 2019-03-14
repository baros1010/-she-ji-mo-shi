package Command;

public class TVCommond implements Command{
	private TV tv;
	public TVCommond(TV tv){
		this.tv=tv;
	}
	
	public void execute() {
		tv.on();
		
	}

	
	public void undo() {
		tv.off();
		
	}

}
