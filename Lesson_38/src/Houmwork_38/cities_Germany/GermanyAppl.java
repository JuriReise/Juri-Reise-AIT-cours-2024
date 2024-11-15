package Houmwork_38.cities_Germany;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {
        LinkedList<City> cities = new LinkedList<>();

        // Земли Германии
        cities.add(new City("Штутгарт", "Баден-Вюртемберг"));
        cities.add(new City("Мюнхен", "Бавария"));
        cities.add(new City("Берлин", "Берлин"));
        cities.add(new City("Потсдам", "Бранденбург"));
        cities.add(new City("Бремен", "Бремен"));
        cities.add(new City("Гамбург", "Гамбург"));
        cities.add(new City("Висбаден", "Гессен"));
        cities.add(new City("Ганновер", "Нижняя Саксония"));
        cities.add(new City("Шверин", "Мекленбург-Передняя Померания"));
        cities.add(new City("Дюссельдорф", "Северный Рейн-Вестфалия"));
        cities.add(new City("Майнц", "Рейнланд-Пфальц"));
        cities.add(new City("Саарбрюккен", "Саар"));
        cities.add(new City("Дрезден", "Саксония"));
        cities.add(new City("Магдебург", "Саксония-Анхальт"));
        cities.add(new City("Киль", "Шлезвиг-Гольштейн"));
        cities.add(new City("Эрфурт", "Тюрингия"));

        // Добавление Гамбурга в разные позиции
        City hamburg = new City("Гамбург", "Гамбург");
        // В начало списка
        cities.addFirst(hamburg);
        // В середину списка
        cities.add(cities.size() / 2, hamburg);
        // В конец списка
        cities.addLast(hamburg);

        // Вывод после добавлений
        System.out.println("Список после добавления Гамбурга:");
        cities.forEach(System.out::println);

        // Сортировка по алфавиту
        cities.sort(Comparator.comparing(City::getName));
        System.out.println("\nСписок по алфавиту:");
        cities.forEach(System.out::println);

        // Сортировка в обратном порядке
        cities.sort(Comparator.comparing(City::getName).reversed());
        System.out.println("\nСписок в обратном порядке:");
        cities.forEach(System.out::println);

        // Методы LinkedList
        System.out.println("\nДополнительные методы LinkedList:");
        // Первый элемент
        System.out.println("Первый элемент: " + cities.getFirst());
        // Последний элемент
        System.out.println("Последний элемент: " + cities.getLast());
        // Удаление первого элемента
        System.out.println("Удаление первого элемента: " + cities.removeFirst());
        // Удаление последнего элемента
        System.out.println("Удаление последнего элемента: " + cities.removeLast());
        // Список после удаления
        System.out.println("Список после удалений:");
        cities.forEach(System.out::println);
    }
}
