package behavior.strategy;

public class NormalMemberDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double money) {
        return money * 0.9;
    }
}
