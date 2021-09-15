package behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class TextBarMementoCaretaker {
    //need to be enhanced
    int index = -1;
    List<TextBar.TextBarMemento> list = new ArrayList<>();

    private TextBar.TextBarMemento getTextBarMemento(int index) {
        return list.get(index);
    }

    public TextBar.TextBarMemento undo() {
        if (index < 0) {
            return null;
        }
        return getTextBarMemento(index--);
    }

    public TextBar.TextBarMemento redo() {
        if (index >= list.size() - 1) {
            return null;
        }
        return getTextBarMemento(++index);
    }

    public void saveTextBarMemento(TextBar.TextBarMemento memento) {
        if (list.size() > index + 1) {
            list = list.subList(0, index + 1);
        }
        list.add(memento);
        index++;
    }
}
