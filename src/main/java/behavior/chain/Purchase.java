package behavior.chain;

public class Purchase {
    private double amount;
    private String content;

    public Purchase(double amount, String content) {
        this.amount = amount;
        this.content = content;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
