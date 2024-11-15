package houmwork_39.student_choice;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStudentSetIterator<E> implements Iterator<E> {
    private LinkedList<E>[] buckets;
    private int bucketIndex;
    private Iterator<E> bucketIterator;
    private int size;
    private int totalCounter;

    public MyStudentSetIterator(LinkedList<E>[] buckets, int size) {
        this.buckets = buckets;
        this.size = size;
        bucketIndex = 0;
        bucketIterator = (buckets[bucketIndex] != null) ? buckets[bucketIndex].iterator() : null;
    }

    @Override
    public boolean hasNext() {
        while (bucketIterator == null || !bucketIterator.hasNext()) {
            if (++bucketIndex >= buckets.length) return false;
            bucketIterator = (buckets[bucketIndex] != null) ? buckets[bucketIndex].iterator() : null;
        }
        return bucketIterator != null && bucketIterator.hasNext();
    }

    @Override
    public E next() {
        totalCounter++;
        return bucketIterator.next();
    }
}
