package behavior.strategy;

public class Bill {
    private double total;
    private DiscountStrategy discountStrategy = new NonMemberDiscountStrategy();

    public void setTotal(double total) {
        this.total = total;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout() {
        return discountStrategy.discount(total);
    }

}
