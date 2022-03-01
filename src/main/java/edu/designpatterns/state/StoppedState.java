package edu.designpatterns.state;

class StoppedState extends DoorState {
    public String getMessage() {
        return "Stopped";
    }

    public void click(GarageDoor context) {
        if (context.resumeState.equals("Opening")) {
            context.state = new OpeningState();
        } else {
            context.state = new ClosingState();
        }
    }
}
