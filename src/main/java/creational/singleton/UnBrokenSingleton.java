package creational.singleton;

import java.io.ObjectStreamException;

/**
 * @see <a href="https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/">link</a>
 */
public class UnBrokenSingleton {

    private UnBrokenSingleton(){}
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
    private static class InnerStaticClass {
        private static final UnBrokenSingleton INSTANCE = new UnBrokenSingleton();
    }

    private static UnBrokenSingleton getInstance() {
        return InnerStaticClass.INSTANCE;
    }
}
