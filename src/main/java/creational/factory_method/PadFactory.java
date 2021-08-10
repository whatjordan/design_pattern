package creational.factory_method;

public class PadFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new Pad();
    }
}
