package structural.adapter;

//Class Adapter. Both Target and Adaptee can use this Adapter
public class CacheClassAdapter<T> implements TargetCache<T>, ThirdPartyCacheLibrary<T> {

    private ThirdPartyCacheLibrary<T> cacheLibrary;
    private TargetCache<T> cache;

    public CacheClassAdapter(ThirdPartyCacheLibrary<T> cacheLibrary, TargetCache<T> cache) {
        this.cacheLibrary = cacheLibrary;
        this.cache = cache;
    }

    @Override
    public void put(String key, T value) {
        cache.put(key, value);
    }

    @Override
    public T get(String key) {
        return cache.get(key);
    }

    @Override
    public T retrieveData(String key) {
        return cacheLibrary.retrieveData(key);
    }

    @Override
    public void setData(String key, T data) {
        cacheLibrary.setData(key, data);
    }

    @Override
    public void methodThatWeDoNotUse() {
        cacheLibrary.methodThatWeDoNotUse();
        //If we don't need this method, do nothing.
    }
}
