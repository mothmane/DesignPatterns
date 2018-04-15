package ma.oth.designpatterns.behavioral.state.dp;

import ma.oth.designpatterns.behavioral.state.dp.State;

public class Machine {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
	public void showMessage() {
		state.showMessage();
	}
	

}
