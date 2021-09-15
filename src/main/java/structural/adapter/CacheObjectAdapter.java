package structural.adapter;

//Object Adapter
public class CacheObjectAdapter<T> implements TargetCache<T> {
    ThirdPartyCacheLibrary<T> cacheLibrary;

    public CacheObjectAdapter(ThirdPartyCacheLibrary<T> cacheLibrary) {
        this.cacheLibrary = cacheLibrary;
    }

    @Override
    public void put(String key, T value) {
        cacheLibrary.setData(key, value);
    }

    @Override
    public T get(String key) {
        return cacheLibrary.retrieveData(key);
    }
}
