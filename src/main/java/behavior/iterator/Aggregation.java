package behavior.iterator;

public interface Aggregation<T> {

    void add(T ele);

    void remove(T ele);

    void remove(int index);

    void get(int index);

    void contains(T ele);

    ListIterator listIterator();
}
