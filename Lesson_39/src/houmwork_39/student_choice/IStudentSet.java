package houmwork_39.student_choice;

public interface IStudentSet<E> extends Iterable<E> {
    boolean addElement(E element);
    boolean contains(Object o);
    boolean remove(Object o);
    int size();

    // Добавляем методы для операций над множествами
    IStudentSet<E> intersection(IStudentSet<E> otherSet); // Пересечение
    IStudentSet<E> difference(IStudentSet<E> otherSet);   // Разность
    IStudentSet<E> union(IStudentSet<E> otherSet);        // Объединение
}
