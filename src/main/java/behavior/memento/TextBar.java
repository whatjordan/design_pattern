package behavior.memento;

public class TextBar {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextBarMemento exportMemento() {
        return new TextBarMemento(text);
    }

    public void restore(TextBarMemento textBarMemento) {
        if (textBarMemento != null) {
            this.text = textBarMemento.getText();
        }
    }

    class TextBarMemento {
        private String text;

        TextBarMemento(String text) {
            this.text = text;
        }

        String getText() {
            return text;
        }

        void setText(String text) {
            this.text = text;
        }
    }
}
