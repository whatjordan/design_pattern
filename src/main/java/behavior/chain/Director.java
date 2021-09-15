package behavior.chain;

public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handlePurchase(Purchase purchase) {
        if (purchase.getAmount() < 10000) {
            System.out.println(getName() + " handle purchase: " + purchase);
        } else {
            doNextSuccessor(purchase);
        }

    }
}
