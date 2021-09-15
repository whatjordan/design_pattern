package behavior.command;

public class OpenCommand extends Command {
    private Application application;

    public OpenCommand(String name, Application application) {
        super(name);
        this.application = application;
    }

    @Override
    public void execute() {
        application.open();
    }
}
