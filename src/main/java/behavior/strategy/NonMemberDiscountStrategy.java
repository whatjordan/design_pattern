package behavior.strategy;

public class NonMemberDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double money) {
        return money;
    }
}
