package behavior.iterator;

public interface ListIterator<T> {
    boolean hasNext();
    T next();
    T previous();
    boolean hasPrevious();
    void remove();
}
