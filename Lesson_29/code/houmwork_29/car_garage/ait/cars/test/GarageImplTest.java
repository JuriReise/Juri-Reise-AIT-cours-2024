
package houmwork_29.car_garage.ait.cars.test;

import houmwork_29.car_garage.ait.cars.dao.Garage;
import houmwork_29.car_garage.ait.cars.dao.GarageImpl;
import houmwork_29.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void sortCarsByModelTest(){
        Arrays.sort(cars);
        System.out.println("---------- Cars sorted by model --------------");
        printCars();
    }

    @Test
    void sortCarsByColorTest(){
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getColor().compareTo(c2.getColor());
            }
        };
        Arrays.sort(cars, comparatorByColor);
        System.out.println("---------- Cars sorted by color --------------");
        printCars();
    }

    @Test
    void printCars(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

}// end of class
