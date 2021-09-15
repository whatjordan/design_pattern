package structural.decorator;

public class AnniversaryDiscountBillDecorator extends BillDecorator {
    public AnniversaryDiscountBillDecorator(Bill bill) {
        super(bill);
    }

    @Override
    public double calculateAmount() {
        double amount = super.calculateAmount();
        return processAnniversaryDiscount(amount);
    }

    private double processAnniversaryDiscount(double amount) {
        return amount * 0.85;
    }
}
