package behavior.mediator;

public class TextBarComponent extends Component {
    private String text;

    public TextBarComponent(Mediator mediator, String userId) {
        super(mediator, userId);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
