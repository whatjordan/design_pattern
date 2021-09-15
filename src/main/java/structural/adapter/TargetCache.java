package structural.adapter;

public interface TargetCache<T> {
    void put(String key, T value);
    T get(String key);
}
