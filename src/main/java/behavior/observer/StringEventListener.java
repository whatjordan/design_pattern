package behavior.observer;

public class StringEventListener implements EventListener<StringEvent> {
    @Override
    public void handle(StringEvent event) {
        System.out.println("Print String: " + event.getSubject());
    }
}
