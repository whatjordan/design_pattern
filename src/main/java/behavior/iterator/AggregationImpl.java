package behavior.iterator;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class AggregationImpl<T> implements Aggregation<T> {

    protected List<T> elements = new LinkedList<>();

    private int modCount = 0;

    @Override
    public void add(T ele) {
        elements.add(ele);
        modCount++;
    }

    @Override
    public void remove(T ele) {
        elements.remove(ele);
        modCount++;
    }

    @Override
    public void remove(int index) {
        elements.remove(index);
        modCount++;
    }

    @Override
    public void get(int index) {
        elements.get(index);
    }

    @Override
    public void contains(T ele) {
        elements.contains(ele);
    }

    @Override
    public ListIterator<T> listIterator() {
        return new AggregationListIterator<>();
    }

    private class AggregationListIterator<E> implements ListIterator<E> {
        private int cur;
        private int expectedModCount;
        private boolean okToRemove;


        public AggregationListIterator() {
            cur = 0;
            okToRemove = false;
            expectedModCount = modCount;
        }

        @Override
        public boolean hasNext() {
            return cur < elements.size();
        }

        @Override
        public E next() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T result = elements.get(cur);
            cur++;
            okToRemove = true;
            return (E) result;
        }

        @Override
        public E previous() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            cur--;
            T result = elements.get(cur);
            okToRemove = true;
            return (E) result;
        }

        @Override
        public boolean hasPrevious() {
            return cur > -1;
        }

        @Override
        public void remove() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            if (!okToRemove) {
                throw new IllegalStateException();
            }
            AggregationImpl.this.remove(cur);
            okToRemove = false;
            expectedModCount++;
        }
    }
}
