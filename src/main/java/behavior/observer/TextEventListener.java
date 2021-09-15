package behavior.observer;

public class TextEventListener implements EventListener<StringEvent> {
    @Override
    public void handle(StringEvent event) {
        System.out.println("Print text: " + event.getSubject());
    }
}
