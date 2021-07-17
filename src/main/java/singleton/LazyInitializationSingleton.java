package singleton;

/**
 * Double checked locking without volatile keyword might be broken in critical situation.
 *
 * @see <a href = "http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html"></a>
 */
public class LazyInitializationSingleton {
    private volatile static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitializationSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializationSingleton();
                }
            }
        }
        return instance;
    }
}
