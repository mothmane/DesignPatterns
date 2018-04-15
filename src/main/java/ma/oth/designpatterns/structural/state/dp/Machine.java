package ma.oth.designpatterns.structural.state.dp;

import ma.oth.designpatterns.structural.state.dp.State;

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
