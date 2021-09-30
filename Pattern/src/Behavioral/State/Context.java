package Behavioral.State;

public class Context {
	
	private State state;
	public Context() {
		//this.state=null;//Default State
		this.state=new Stop();//Default State
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public void execute() {
		state.doAction();
	}

}
