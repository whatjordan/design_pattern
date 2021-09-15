package behavior.strategy;

public class VipDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double money) {
        return money * 0.8;
    }
}
