package behavior.state.cycle;

public class ClosedDoorState extends DoorState {

    @Override
    public void action() {
        System.out.println("close door");
    }
}
