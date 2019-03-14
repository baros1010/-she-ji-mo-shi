package zerenlian;

public abstract class Handler {
	protected String name;
	Handler nextHander;

	public Handler(String name) {
		this.name = name;
	}

	public Handler getNextHander() {
		return nextHander;
	}

	public void setNextHander(Handler nextHander) {
		this.nextHander = nextHander;
	}

	abstract void handerRequest(request req);
}
