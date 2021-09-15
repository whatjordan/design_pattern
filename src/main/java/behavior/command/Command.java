package behavior.command;

import java.util.Objects;

public abstract class Command {
    protected String arg;

    protected String name;

    public String getName() {
        return name;
    }

    public Command(String name){
        this.name = name;
    }

    public abstract void execute();

    public void execute(String arg) {
        this.arg = arg;
        execute();
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return Objects.equals(name, command.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
