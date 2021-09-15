package structural.adapter;

// We might not able to get the source code
public interface ThirdPartyCacheLibrary<T> {
    T retrieveData(String key);

    void setData(String key, T data);

    void methodThatWeDoNotUse();
}
