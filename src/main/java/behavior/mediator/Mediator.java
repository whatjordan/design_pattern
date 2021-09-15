package behavior.mediator;

public interface Mediator {
    void addUser(String id, String user);

    void removeUser(String id);

    void handleComponent(Component component);
}
