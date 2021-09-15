package behavior.interpreter;

public abstract class Node {
    public abstract void interpret(Context context);
    public abstract void execute();
}
