package design_pattern.behaviour;

import behavior.interpreter.Context;
import behavior.interpreter.ExpressionCommandNode;
import behavior.interpreter.Node;
import org.junit.Test;

public class InterpreterExample {
    @Test
    public void test() {
        Context context = new Context("LOOP 2 LOOP 3 PRINT Jordan BREAK END SPACE SPACE PRINT Unicorn BREAK END PRINT TEAM!");
        Node node = new ExpressionCommandNode();
        node.interpret(context);
        node.execute();
    }
}
