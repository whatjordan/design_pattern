package behavior.mediator;

public abstract class Component {
    protected Mediator mediator;
    private String userId;

    public Component(Mediator mediator, String userId) {
        this.mediator = mediator;
        this.userId = userId;
    }

    public void modify() {
        mediator.handleComponent(this);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
