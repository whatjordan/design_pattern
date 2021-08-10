package creational.builder;

public class AndroidPhoneBuilder extends PhoneBuilder{

    @Override
    PhoneBuilder buildCamera() {
        phone.setCamera("1 glasses");
        return this;
    }

    @Override
    PhoneBuilder buildChip() {
        phone.setChip("SMSN");
        return this;
    }

    @Override
    PhoneBuilder buildOs() {
        phone.setChip("android");
        return this;
    }
}
