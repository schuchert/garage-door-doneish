package edu.designpatterns.state;

public class GarageDoor {
	String messageString = "Closed";
	String resumeState;
	private DoorState state = new DoorState();

	public void click() {
		state.click(this);
	}

	void setMessageString(String string) {
		messageString = string;
	}

	public String getMessageString() {
		return messageString;
	}

	public void sensor() {
		state.sensor(this);
	}
}
