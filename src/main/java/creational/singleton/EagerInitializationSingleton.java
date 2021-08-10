package creational.singleton;

/**
 * Thread-safe, but may lead to resource wastage.
 */
public class EagerInitializationSingleton {
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

}

/**
 * The same as EagerInitializationSingleton, but no need to implement getInstance method.
 */
class EagerInitializationSingletonUsingStaticBlock {
    public static EagerInitializationSingletonUsingStaticBlock instance;

    private EagerInitializationSingletonUsingStaticBlock() {
    }

    {
        instance = new EagerInitializationSingletonUsingStaticBlock();
    }
}