package behavior.chain;

public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void handlePurchase(Purchase purchase) {
        System.out.println(getName() + " handle purchase: " + purchase);
    }
}
