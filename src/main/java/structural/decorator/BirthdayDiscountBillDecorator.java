package structural.decorator;

public class BirthdayDiscountBillDecorator extends BillDecorator {
    public BirthdayDiscountBillDecorator(Bill bill) {
        super(bill);
    }

    @Override
    public double calculateAmount() {
        double amount = super.calculateAmount();
        return processBirthdayDiscount(amount);
    }

    private double processBirthdayDiscount(double amount) {
        return amount * 0.9;
    }
}
