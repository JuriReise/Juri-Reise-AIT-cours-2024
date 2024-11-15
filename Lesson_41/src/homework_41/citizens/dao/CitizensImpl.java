package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O(1)
    @Override
    public boolean add(Person person) {
        // что проверяем?
        //А: Проверяем, на неравенство person с null
        if (person == null) {
            return false;
        }
        // что делает этот код?
        //А: проверяем находится ли person в idList, и если находим персону, то возвращаем фальщ
        int index = Collections.binarySearch(idList, person); // что делаем?
                  // А: бинарный поиск по делаем по idList
        if (index >= 0) { // что делаем, если index >= 0?
                          //А: возвращаем фальщ

            return false;
        }
        // что делаем с index? зачем?
        //А: Корректируем значение ИНДЕКСпри поиске ПЕРСОН в  idList
        index = -index - 1;
        // что делаем? А: Добавляем ПЕРСОН в idList на позицию ИНДЕКСА
        idList.add(index, person);
        // что делается в методе далее?
        // А: Если вообщем кратко, то добавляем РЕСОНу в списки с сортировкой по ID и ФИ
        index = Collections.binarySearch(ageList, person, ageComparator);
        // сохранятем в ИНДЕКС результат бинарного поиска в ageList для ПЕРСОН с использованием компаратора
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        // Снова бинарный поиск, но по фамилии для вставки в лист
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);

        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);

        return true;
    }

    // O(1)
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O(log(n))
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
