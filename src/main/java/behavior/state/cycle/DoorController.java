package behavior.state.cycle;

public class DoorController {
    private DoorState state;

    public DoorController() {
        this.state = new ClosedDoorState();
    }

    public void clickButton() {
        long now = System.currentTimeMillis();
        if (state instanceof ClosedDoorState) {
            this.state = new OpenDoorState();
        } else if (state instanceof OpenDoorState) {
            this.state = new ClosedDoorState();
        }
        this.state.action();
    }
}
