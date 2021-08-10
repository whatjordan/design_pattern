package creational.builder;

public abstract class PhoneBuilder {
    protected Phone phone = new Phone();

    abstract PhoneBuilder buildCamera();
    abstract PhoneBuilder buildChip();
    abstract PhoneBuilder buildOs();
    Phone build(){
        return phone;
    }
// We can put the construct method into the abstract builder for simplifying the system structure if necessary.
//    public Phone construct(PhoneBuilder builder){
//        // Arrange the build orders and steps.
//        builder.buildChip();
//        builder.buildCamera();
//        builder.buildOs();
//        return builder.build();
//    }
}
