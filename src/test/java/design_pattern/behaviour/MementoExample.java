package design_pattern.behaviour;

import behavior.memento.TextBar;
import behavior.memento.TextBarMementoCaretaker;
import org.junit.Test;

public class MementoExample {
    @Test
    public void test() {
        TextBarMementoCaretaker caretaker = new TextBarMementoCaretaker();
        TextBar textBar = new TextBar();
        textBar.setText("1");
        caretaker.saveTextBarMemento(textBar.exportMemento());
        textBar.setText("2");
        caretaker.saveTextBarMemento(textBar.exportMemento());
        textBar.setText("3");
        textBar.restore(caretaker.undo());
        textBar.setText("10");
        caretaker.saveTextBarMemento(textBar.exportMemento());
        textBar.setText("100");
        textBar.restore(caretaker.redo());
    }
}
