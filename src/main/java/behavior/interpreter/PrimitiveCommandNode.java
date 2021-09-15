package behavior.interpreter;

import static behavior.interpreter.Constants.*;

public class PrimitiveCommandNode extends Node {
    private String primitive;
    private String content;

    @Override
    public void interpret(Context context) {
        primitive = context.getCurrentFragment();
        context.skipFragment(primitive);
        if (!primitive.equals(PRINT) && !primitive.equals(BREAK) && !primitive.equals(SPACE)) {
            throw new IllegalArgumentException();
        }
        if (primitive.equals(PRINT)) {
            content = context.getCurrentFragment();
            context.nextFragment();
        }
    }

    @Override
    public void execute() {
        switch (primitive) {
            case PRINT:
                System.out.print(content);
                break;
            case SPACE:
                System.out.print(" ");
                break;
            case BREAK:
                System.out.println();
                break;
        }
    }
}
