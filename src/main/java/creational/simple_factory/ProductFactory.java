package creational.simple_factory;

public class ProductFactory {

    public static Product getProduct(ProductType type) {
        switch (type) {
            case Phone:
                return new Phone();
            case PAD:
                return new Pad();
            default:
                return null;
        }
    }
}
