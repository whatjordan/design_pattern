package structural.decorator;

public class ShoppingBill extends Bill {
    public ShoppingBill(double total) {
        super(total);
    }

    @Override
    public double calculateAmount() {
        return total;
    }
}
