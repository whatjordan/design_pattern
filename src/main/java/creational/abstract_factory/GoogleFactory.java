package creational.abstract_factory;

public class GoogleFactory extends TechnologyFactory{
    @Override
    public Pad createPad() {
        return new AndroidPad();
    }

    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}
