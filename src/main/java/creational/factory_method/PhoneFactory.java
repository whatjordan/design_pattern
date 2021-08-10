package creational.factory_method;

public class PhoneFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new Phone();
    }
}
