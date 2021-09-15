package design_pattern.behaviour;

import behavior.command.*;
import org.junit.Test;

public class CommandExample {
    @Test
    public void test() {
        MarcoCommand marcoCommand = new MarcoCommand(" marco command");
        OpenCommand openCommand = new OpenCommand("open command",new Application("Java"));
        marcoCommand.addCommand(openCommand);
        PasteTextCommand pasteTextCommand = new PasteTextCommand("paste text command", new TextFile("test.txt"));
        pasteTextCommand.setArg("abc");
        marcoCommand.addCommand(pasteTextCommand);
        marcoCommand.execute();
    }
}
