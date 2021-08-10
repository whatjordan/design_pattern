package creational.singleton;

/**
 *  Initialization Demand Holder
 *  Thread-safe, lazy initialization (Inner class is loaded to JVM only when getInstance method is called.)
 */
public class SingletonUsingInnerStaticClass {
    private SingletonUsingInnerStaticClass() {
    }

    private static class InnerStaticClass {
        private static final SingletonUsingInnerStaticClass INSTANCE = new SingletonUsingInnerStaticClass();
    }

    public static SingletonUsingInnerStaticClass getInstance(){
        return InnerStaticClass.INSTANCE;
    }
}
