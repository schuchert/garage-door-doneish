package edu.designpatterns.state;

class ClosingState extends DoorState {
    public String getMessage() {
        return "Closing";
    }

    public void click(GarageDoor context) {
        context.resumeState = "Opening";
        context.state = new StoppedState();
    }
}
