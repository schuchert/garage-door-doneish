package edu.designpatterns.state;

class OpeningState extends DoorState {
    public String getMessage() {
        return "Opening";
    }

    public void click(GarageDoor context) {
        context.resumeState = "Closing";
        context.state = new StoppedState();
    }

    public void sensor(GarageDoor context) {
        context.state = new OpenState();
    }
}
