package creational.abstract_factory;

public class AppleFactory extends TechnologyFactory{
    @Override
    public Pad createPad() {
        return new Ipad();
    }

    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
