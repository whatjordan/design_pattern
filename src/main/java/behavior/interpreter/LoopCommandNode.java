package behavior.interpreter;

import static behavior.interpreter.Constants.LOOP;

public class LoopCommandNode extends Node {

    private int loop;
    private Node expressionNode;

    @Override
    public void interpret(Context context) {
        context.skipFragment(LOOP);
        loop = Integer.valueOf(context.getCurrentFragment());
        context.nextFragment();
        expressionNode = new ExpressionCommandNode();
        expressionNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < loop; i++) {
            expressionNode.execute();
        }
    }

}
