package singleton;

/**
 *  Thread-safe, lazy initialization (Inner class is created only when getInstance method is called.)
 */
public class SingletonUsingInnerStaticClass {
    private SingletonUsingInnerStaticClass() {
    }

    private static class InnerStaticClass {
        private static final SingletonUsingInnerStaticClass INSTANCE = new SingletonUsingInnerStaticClass();
    }

    private static SingletonUsingInnerStaticClass getInstance(){
        return InnerStaticClass.INSTANCE;
    }
}
