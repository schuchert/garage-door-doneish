package edu.designpatterns.state;

abstract class DoorState {
    public abstract void click(GarageDoor context);
    public abstract String getMessage();

    public void sensor(GarageDoor context) {
        context.state = new ClosedState();
    }
}
