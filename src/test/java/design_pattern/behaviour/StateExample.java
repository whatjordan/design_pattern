package design_pattern.behaviour;

import behavior.state.context.Account;
import behavior.state.cycle.DoorController;
import org.junit.Test;

public class StateExample {
    @Test
    public void testContext() {
        Account account = new Account("j");
        account.withdraw(100);
        account.deposit(100);
        account.withdraw(200);
        account.withdraw(100);
    }

    @Test
    public void testCycle() {
        DoorController doorController = new DoorController();
        doorController.clickButton();
        doorController.clickButton();
        doorController.clickButton();
    }
}
