package houmwork_39.student_choice;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStudentHashSet<E> implements IStudentSet<E> {
    private BucketArray<E> bucketArray;
    private int size;
    private static final double LOAD_FACTOR = 0.75;

    public MyStudentHashSet(int capacity) {
        this.bucketArray = new BucketArray<>(capacity);
    }

    public MyStudentHashSet() {
        this(16);
    }

    @Override
    public boolean addElement(E element) {
        if (size >= LOAD_FACTOR * bucketArray.getCapacity()) {
            bucketArray.rebuild();
        }
        int index = bucketArray.getIndex(element);
        LinkedList<E>[] buckets = bucketArray.getBuckets();
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (buckets[index].contains(element)) {
            return false;
        }
        buckets[index].add(element);
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        int index = bucketArray.getIndex(o);
        LinkedList<E>[] buckets = bucketArray.getBuckets();
        return buckets[index] != null && buckets[index].contains(o);
    }

    @Override
    public boolean remove(Object o) {
        int index = bucketArray.getIndex(o);
        LinkedList<E>[] buckets = bucketArray.getBuckets();
        if (buckets[index] == null) {
            return false;
        }
        boolean removed = buckets[index].remove(o);
        if (removed) {
            size--;
        }
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyStudentSetIterator<>(bucketArray.getBuckets(), size);
    }

    @Override
    public IStudentSet<E> intersection(IStudentSet<E> otherSet) {
        MyStudentHashSet<E> resultSet = new MyStudentHashSet<>();
        for (E element : this) {
            if (otherSet.contains(element)) {
                resultSet.addElement(element);
            }
        }
        return resultSet;
    }

    @Override
    public IStudentSet<E> difference(IStudentSet<E> otherSet) {
        MyStudentHashSet<E> resultSet = new MyStudentHashSet<>();
        for (E element : this) {
            if (!otherSet.contains(element)) {
                resultSet.addElement(element);
            }
        }
        return resultSet;
    }

    @Override
    public IStudentSet<E> union(IStudentSet<E> otherSet) {
        MyStudentHashSet<E> resultSet = new MyStudentHashSet<>();

        // Добавляем все элементы из текущего множества
        for (E element : this) {
            resultSet.addElement(element);
        }

        // Добавляем все элементы из другого множества
        for (E element : otherSet) {
            resultSet.addElement(element);
        }

        return resultSet;
    }
}
