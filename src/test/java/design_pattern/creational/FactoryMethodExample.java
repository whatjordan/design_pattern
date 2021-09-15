package design_pattern.creational;

import creational.factory_method.PadFactory;
import creational.factory_method.PhoneFactory;
import creational.factory_method.ProductFactory;
import org.junit.Test;

public class FactoryMethodExample {
    @Test
    public void test(){
        ProductFactory factory1 = new PhoneFactory();
        ProductFactory factory2 = new PadFactory();
        factory1.createProduct().work();
        factory2.createProduct().work();
    }
}
