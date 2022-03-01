package edu.designpatterns.state;

class OpenState extends DoorState {
    public String getMessage() {
        return "Open";
    }

    public void click(GarageDoor context) {
        context.state = new ClosingState();
    }
}
