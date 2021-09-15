package design_pattern.structural;

import org.junit.Test;
import structural.decorator.*;

public class DecoratorExample {
    @Test
    public void test() {
        Bill shoppingBill = new ShoppingBill(100);
        BillDecorator billDecorator = new ShippingBillDecorator(new BirthdayDiscountBillDecorator(shoppingBill));
        System.out.println(billDecorator.calculateAmount());
    }

}
