
package houmwork_29.car_garage.ait.cars.sortTest;

import houmwork_29.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarSortingTest {

    Car[] cars = {
            new Car("Number1", "Model1", "Company1", 1.5, "Red"),
            new Car("Number2", "Model2", "Company1", 2.5, "Green"),
            new Car("Number3", "Model1", "Company2", 1.5, "Red"),
            new Car("Number4", "Model4", "Company2", 2.0, "Green")
    };

    @Test
    void sortCarsByModel() {
        System.out.println("----- Cars sorted by Model -----");
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars();
    }

    @Test
    void sortCarsByCompany() {
        System.out.println("----- Cars sorted by Company -----");
        Arrays.sort(cars, Comparator.comparing(Car::getCompany));
        printCars();
    }

    @Test
    void sortCarsByEngine() {
        System.out.println("----- Cars sorted by Engine -----");
        Arrays.sort(cars, Comparator.comparingDouble(Car::getEngine));
        printCars();
    }

    @Test
    void sortCarsByColor() {
        System.out.println("----- Cars sorted by Color -----");
        Arrays.sort(cars, Comparator.comparing(Car::getColor));
        printCars();
    }

    void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
