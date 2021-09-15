package creational.builder;

public class DefaultPhoneDirector {
    public static Phone construct(PhoneBuilder builder){
        // Arrange the build orders and steps.
        builder.buildChip();
        builder.buildCamera();
        builder.buildOs();
        return builder.build();
    }
}
