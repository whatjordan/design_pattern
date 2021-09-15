package creational.builder;

public class IphoneBuilder extends PhoneBuilder {

    @Override
    PhoneBuilder buildCamera() {
        phone.setCamera("2 glasses");
        return this;
    }

    @Override
    PhoneBuilder buildChip() {
        phone.setChip("TSM");
        return this;
    }

    @Override
    PhoneBuilder buildOs() {
        phone.setOs("ios");
        return this;
    }
}
