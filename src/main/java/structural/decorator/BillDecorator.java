package structural.decorator;

public class BillDecorator extends Bill {
    private Bill bill;

    public BillDecorator(Bill bill) {
        super(bill.getTotal());
        this.bill = bill;
    }

    @Override
    public double calculateAmount() {
        return bill.calculateAmount();
    }
}
