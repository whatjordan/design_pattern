package design_pattern.behaviour;

import behavior.strategy.Bill;
import behavior.strategy.VipDiscountStrategy;
import org.junit.Test;

public class StrategyExample {
    @Test
    public void test() {
        Bill bill = new Bill();
        bill.setTotal(100);
        bill.setDiscountStrategy(new VipDiscountStrategy());
        System.out.println(bill.checkout());
    }
}
