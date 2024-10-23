
package houmwork_30.person_city;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double weight;
    private City city;

    public Person(String name, int age, double weight, City city) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public City getCity() {
        return city;
    }

    // Сортировка по умолчанию (по возрасту)
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", weight=" + weight + ", city=" + city + '}';
    }

    public static void main(String[] args) {
        City city1 = new City("New York", 8000000, 468.9);
        City city2 = new City("Los Angeles", 4000000, 503);
        City city3 = new City("Chicago", 2700000, 234);

        Person[] people = {
            new Person("Alice", 30, 65.0, city1),
            new Person("Bob", 25, 70.5, city2),
            new Person("Charlie", 35, 80.0, city3),
            new Person("David", 28, 75.5, city1)
        };

        // Сортировка по умолчанию (по возрасту)
        Arrays.sort(people);
        System.out.println("Sorted by age (default): " + Arrays.toString(people));

        // Сортировка по имени
        Arrays.sort(people, Comparator.comparing(p -> p.getName()));
        System.out.println("Sorted by name: " + Arrays.toString(people));

        // Сортировка по весу
        Arrays.sort(people, Comparator.comparingDouble(p -> p.getWeight()));
        System.out.println("Sorted by weight: " + Arrays.toString(people));

        // Поиск с использованием binarySearch по возрасту
        Arrays.sort(people);  // Для поиска массив должен быть отсортирован по нужному критерию
        int index = Arrays.binarySearch(people, new Person("", 28, 0, null));
        if (index >= 0) {
            System.out.println("Person found: " + people[index]);
        } else {
            System.out.println("Person not found.");
        }
    }
}
