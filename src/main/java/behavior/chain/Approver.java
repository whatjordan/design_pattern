package behavior.chain;

public abstract class Approver {
    private Approver successor;
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void handlePurchase(Purchase purchase);

    protected void doNextSuccessor(Purchase purchase) {
        if (successor != null) {
            successor.handlePurchase(purchase);
        }
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
}
