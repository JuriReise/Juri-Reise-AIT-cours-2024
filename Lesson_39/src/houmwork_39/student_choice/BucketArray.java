package houmwork_39.student_choice;

import java.util.LinkedList;

public class BucketArray<E> {
    private LinkedList<E>[] buckets;
    private int capacity;

    public BucketArray(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];
    }

    public LinkedList<E>[] getBuckets() {
        return buckets;
    }

    public int getCapacity() {
        return capacity;
    }

    public void rebuild() {
        capacity *= 2;
        LinkedList<E>[] newBuckets = new LinkedList[capacity];
        for (LinkedList<E> bucket : buckets) {
            if (bucket != null) {
                for (E element : bucket) {
                    int index = getIndex(element);
                    if (newBuckets[index] == null) {
                        newBuckets[index] = new LinkedList<>();
                    }
                    newBuckets[index].add(element);
                }
            }
        }
        buckets = newBuckets;
    }

    public int getIndex(Object o) {
        int hashcode = o.hashCode();
        hashcode = hashcode >= 0 ? hashcode : -hashcode;
        return hashcode % capacity;
    }
}
