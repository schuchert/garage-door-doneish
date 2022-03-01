package edu.designpatterns.state;

public class DoorState {

    public void click(GarageDoor context) {
        if ("Closed".equals(context.messageString)) {
            context.setMessageString("Opening");
        } else if ("Opening".equals(context.messageString)) {
            context.resumeState = "Closing";
            context.setMessageString("Stopped");
        } else if ("Closing".equals(context.messageString)) {
            context.resumeState = "Opening";
            context.setMessageString("Stopped");
        } else if ("Stopped".equals(context.messageString)) {
            context.setMessageString(context.resumeState);
        } else {
            context.setMessageString("Closing");
        }
    }

    public void sensor(GarageDoor context) {
        if ("Opening".equals(context.messageString)) {
            context.setMessageString("Open");
        } else {
            context.setMessageString("Closed");
        }
    }
}
