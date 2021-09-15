package design_pattern.behaviour;

import behavior.mediator.*;
import org.junit.Test;

public class MediatorExample {
    @Test
    public void test() {
        Mediator mediator= new StatusBarMediator();
        mediator.addUser("1", "jordan");
        mediator.addUser("2", "unicorn");
        mediator.addUser("3", "doggy");
        PhotoComponent photoComponent = new PhotoComponent(mediator, "1");
        photoComponent.setPhoto("Cool.jpg");
        photoComponent.modify();
        TextBarComponent textBarComponent = new TextBarComponent(mediator, "1");
        textBarComponent.setText("I am cool!");
        textBarComponent.modify();
    }
}
