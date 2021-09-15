package behavior.chain;

public class Manager extends Approver {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handlePurchase(Purchase purchase) {
        if (purchase.getAmount() < 5000) {
            System.out.println(getName() + " handle purchase: " + purchase);
        } else {
            doNextSuccessor(purchase);
        }
    }
}
