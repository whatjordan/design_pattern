package structural.decorator;

public class ShippingBillDecorator extends BillDecorator {

    public ShippingBillDecorator(Bill bill) {
        super(bill);
    }

    @Override
    public double calculateAmount() {
        return super.calculateAmount() + 80;
    }
}
