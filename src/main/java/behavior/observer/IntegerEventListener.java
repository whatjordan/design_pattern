package behavior.observer;

public class IntegerEventListener implements EventListener<IntegerEvent> {
    @Override
    public void handle(IntegerEvent event) {
        System.out.println("Print Integer: " + event.getSubject());
    }
}
