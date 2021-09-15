package behavior.observer;

public class Event<T> {
    private T subject;

    public Event(T subject) {
        this.subject = subject;
    }

    public T getSubject() {
        return subject;
    }

    ;
}
