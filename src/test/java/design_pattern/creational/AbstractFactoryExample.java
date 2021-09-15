package design_pattern.creational;

import creational.abstract_factory.AppleFactory;
import creational.abstract_factory.GoogleFactory;
import creational.abstract_factory.TechnologyFactory;
import org.junit.Test;

public class AbstractFactoryExample {
    @Test
    public void test(){
        TechnologyFactory factory1 = new GoogleFactory();
        factory1.createPad().work();
        factory1.createPhone().work();
        TechnologyFactory factory2 = new AppleFactory();
        factory2.createPad().work();
        factory2.createPhone().work();
    }
}
