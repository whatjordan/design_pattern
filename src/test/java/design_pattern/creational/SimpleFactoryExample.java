package design_pattern.creational;

import creational.simple_factory.Product;
import creational.simple_factory.ProductFactory;
import creational.simple_factory.ProductType;
import org.junit.Test;

public class SimpleFactoryExample {
    @Test
    public void test(){
        Product phone = ProductFactory.getProduct(ProductType.Phone);
        Product pad = ProductFactory.getProduct(ProductType.PAD);
        phone.work();
        pad.work();
    }
}
