package behavior.state.cycle;

public class OpenDoorState extends DoorState{

    @Override
    public void action() {
        System.out.println("open door");
    }
}
