package behavior.interpreter;

import static behavior.interpreter.Constants.LOOP;

public class CommandNode extends Node {
    private Node node;

    @Override
    public void interpret(Context context) {
        if (context.getCurrentFragment().equals(LOOP)) {
            node = new LoopCommandNode();
            node.interpret(context);
        } else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
