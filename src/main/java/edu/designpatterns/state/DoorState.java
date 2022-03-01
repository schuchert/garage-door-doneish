package edu.designpatterns.state;

abstract class DoorState {
    public abstract void click(GarageDoor context);
    public abstract String getMessage();

    public void sensor(GarageDoor context) {
        context.state = new ClosedState();
    }
}

class ClosedState extends DoorState {
    public String getMessage() {
        return "Closed";
    }

    public void click(GarageDoor context) {
        context.state = new OpeningState();
    }
}

class ClosingState extends DoorState {
    public String getMessage() {
        return "Closing";
    }

    public void click(GarageDoor context) {
        context.resumeState = "Opening";
        context.state = new StoppedState();
    }
}

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

class OpenState extends DoorState {
    public String getMessage() {
        return "Open";
    }

    public void click(GarageDoor context) {
        context.state = new ClosingState();
    }
}
