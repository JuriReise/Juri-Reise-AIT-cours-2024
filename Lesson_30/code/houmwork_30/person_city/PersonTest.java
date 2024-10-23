
package houmwork_30.person_city;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void testSortByAge() {
        Person[] people = createPeopleArray();
        
        Arrays.sort(people);
        System.out.println("Sorted by age (default):");
        printArray(people);
    }

    @Test
    public void testSortByName() {
        Person[] people = createPeopleArray();

        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted by name:");
        printArray(people);
    }

    @Test
    public void testSortByWeight() {
        Person[] people = createPeopleArray();

        Arrays.sort(people, Comparator.comparingDouble(Person::getWeight));
        System.out.println("Sorted by weight:");
        printArray(people);
    }

    @Test
    public void testBinarySearchByAge() {
        Person[] people = createPeopleArray();

        Arrays.sort(people);
        int index = Arrays.binarySearch(people, new Person("", 28, 0, null));
        if (index >= 0) {
            System.out.println("Person found: " + people[index]);
        } else {
            System.out.println("Person not found.");
        }
    }

    private Person[] createPeopleArray() {
        City city1 = new City("New York", 8000000, 468.9);
        City city2 = new City("Los Angeles", 4000000, 503);
        City city3 = new City("Chicago", 2700000, 234);

        return new Person[] {
            new Person("Alice", 30, 65.0, city1),
            new Person("Bob", 25, 70.5, city2),
            new Person("Charlie", 35, 80.0, city3),
            new Person("David", 28, 75.5, city1)
        };
    }

    private void printArray(Person[] array) {
        for (Person person : array) {
            System.out.println(person);
        }
    }
}
