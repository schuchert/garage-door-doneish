package edu.designpatterns.state;

class ClosedState extends DoorState {
    public String getMessage() {
        return "Closed";
    }

    public void click(GarageDoor context) {
        context.state = new OpeningState();
    }
}
