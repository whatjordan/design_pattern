package design_pattern.creational;

import creational.builder.DefaultPhoneDirector;
import creational.builder.IphoneBuilder;
import org.junit.Test;

public class BuilderExample {
    @Test
    public void test() {
        System.out.println(DefaultPhoneDirector.construct(new IphoneBuilder()));
    }
}
