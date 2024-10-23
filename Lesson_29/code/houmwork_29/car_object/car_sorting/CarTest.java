
package houmwork_29.car_object.car_sorting;


import houmwork_29.car_object.model.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CarTest {

    Car[] cars = {
            new Car("Toyota", 2010, 10000, "Red", false),
            new Car("Honda", 2015, 12000, "Blue", true),
            new Car("Ford", 2012, 8000, "Black", false),
            new Car("BMW", 2018, 25000, "White", true),
            new Car("Audi", 2011, 20000, "Silver", false)
    };

    @Test
    void sortCarByModel() {
        System.out.println("----- Cars sorted by Model -----");
        Arrays.sort(cars, Comparator.comparing(Car::getBrand));
        printCars();
    }

    @Test
    void sortCarByColor() {
        System.out.println("----- Cars sorted by Color -----");
        Arrays.sort(cars, Comparator.comparing(Car::getColor));
        printCars();
    }

    @Test
    void sortCarByPrice() {
        System.out.println("----- Cars sorted by Price -----");
        Arrays.sort(cars, Comparator.comparingDouble(Car::getPrice));
        printCars();
    }

    @Test
    void sortCarByYear() {
        System.out.println("----- Cars sorted by Year -----");
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        printCars();
    }

    void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
