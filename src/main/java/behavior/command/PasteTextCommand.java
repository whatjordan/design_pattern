package behavior.command;

public class PasteTextCommand extends Command {
    private TextFile textFile;

    public PasteTextCommand(String name, TextFile textFile) {
        super(name);
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.pasteText(arg);
    }
}
