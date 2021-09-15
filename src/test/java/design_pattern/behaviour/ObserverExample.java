package design_pattern.behaviour;

import behavior.observer.*;
import org.junit.Test;

public class ObserverExample {
    @Test
    public void test() {
        EventHandler handler = new EventHandler();
        StringEventListener stringEventListener = new StringEventListener();
        handler.addListener(stringEventListener);
        handler.addListener(new IntegerEventListener());
        handler.addListener(new TextEventListener());
        handler.dispatch(new StringEvent(" Hi"));
        System.out.println("-----------------");
        handler.dispatch(new IntegerEvent(5));
        handler.removeListener(stringEventListener);
        System.out.println("-----------------");
        handler.dispatch(new StringEvent(" Bye"));
    }
}
