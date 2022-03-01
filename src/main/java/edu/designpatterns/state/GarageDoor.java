package edu.designpatterns.state;

public class GarageDoor {
	String resumeState;
	DoorState state;

	public GarageDoor() {
		state = new ClosedState();
	}

	public void click() {
		state.click(this);
	}

	public void sensor() {
		state.sensor(this);
	}

	public String getMessage() {
		return state.getMessage();
	}
}
