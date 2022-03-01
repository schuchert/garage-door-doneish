package edu.designpatterns.state;

public class GarageDoor {
	private String messageString = "Closed";
	private String resumeState;

	public void click() {
		if ("Closed".equals(messageString)) {
			setMessageString("Opening");
		} else if ("Opening".equals(messageString)) {
			resumeState = "Closing";
			setMessageString("Stopped");
		} else if ("Closing".equals(messageString)) {
			resumeState = "Opening";
			setMessageString("Stopped");
		} else if ("Stopped".equals(messageString)) {
			setMessageString(resumeState);
		} else {
			setMessageString("Closing");
		}
	}

	void setMessageString(String string) {
		messageString = string;
	}

	public String getMessageString() {
		return messageString;
	}

	public void sensor() {
		if ("Opening".equals(messageString)) {
			setMessageString("Open");
		} else {
			setMessageString("Closed");
		}
	}
}
