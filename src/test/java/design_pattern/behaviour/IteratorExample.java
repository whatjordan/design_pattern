package design_pattern.behaviour;

import behavior.iterator.Aggregation;
import behavior.iterator.AggregationImpl;
import behavior.iterator.ListIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class IteratorExample {
    @Test
    public void test() {
        Aggregation<Integer> aggregation = new AggregationImpl<>();
        aggregation.add(1);
        aggregation.add(2);
        aggregation.add(3);
        ListIterator<Integer> iterator = aggregation.listIterator();
        Assert.assertEquals(1, (int) iterator.next());
        Assert.assertEquals(1, (int) iterator.previous());
        iterator.next();
        iterator.remove();
        iterator.previous();
        iterator.remove();
    }
}
