package design_pattern.behaviour;

import behavior.chain.Approver;
import behavior.chain.Director;
import behavior.chain.Manager;
import behavior.chain.Purchase;
import org.junit.Test;

public class ChainExample {
    @Test
    public void test() {
        Approver manager = new Manager("manager");
        Approver director = new Director("director");
        Approver president = new Director("president");
        manager.setSuccessor(director);
        director.setSuccessor(president);
        manager.handlePurchase(new Purchase(8000, "computer"));
    }
}
