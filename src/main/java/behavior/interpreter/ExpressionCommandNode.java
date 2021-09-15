package behavior.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static behavior.interpreter.Constants.END;

public class ExpressionCommandNode extends Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true) {
            if (context.getCurrentFragment() == null) {
                break;
            } else if (context.getCurrentFragment().equals(END)) {
                context.skipFragment(END);
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }

        }
    }

    @Override
    public void execute() {
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            ((Node) iterator.next()).execute();
        }
    }
}
