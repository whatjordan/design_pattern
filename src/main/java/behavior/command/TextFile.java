package behavior.command;

import java.text.MessageFormat;

public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void pasteText(String text) {
        if(text == null){
            System.out.println("nothing to paste!");
            return;
        }
        System.out.println(MessageFormat.format("paste \"{0}\" to {1}", text, name));
    }
}
