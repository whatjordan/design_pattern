package behavior.command;

import java.util.ArrayList;
import java.util.List;

public class MarcoCommand extends Command {
    private List<Command> commands = new ArrayList<>();

    public MarcoCommand(String name) {
        super(name);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
