package homework_43.boat;


import homework_43.boat.model.Boat;
import homework_43.boat.dao.BoatSrv;
import homework_43.boat.dao.BoatSrvImpl;

import java.util.Arrays;
import java.util.List;

public class BoatAppl {
    public static void main(String[] args) {
        BoatSrv boatService = new BoatSrvImpl();

        // Создаем список яхт
        List<Boat> boats = Arrays.asList(
                new Boat("YachtMaker", "USA", 2020, 15.5, "plastic", 500000),
                new Boat("SeaCraft", "Germany", 2018, 18.0, "metal", 750000),
                new Boat("Oceanic", "France", 2019, 12.0, "wood", 300000),
                new Boat("WaveRider", "Italy", 2021, 14.0, "plastic", 400000),
                new Boat("BlueWater", "USA", 2015, 16.5, "metal", 600000)
        );

        // Выполнение задач
        System.out.println("All boats:");
        boatService.displayAll(boats);

        System.out.println("\nBoats made of plastic:");
        boatService.filterByMaterial(boats, "plastic").forEach(System.out::println);

        System.out.println("\nBoats more expensive than $500,000:");
        boatService.filterByPrice(boats, 500000).forEach(System.out::println);

        System.out.println("\nBoats manufactured between 2015 and 2020:");
        boatService.filterByYearRange(boats, 2015, 2020).forEach(System.out::println);

        System.out.println("\nBoats sorted by descending price:");
        boatService.sortByDescendingPrice(boats).forEach(System.out::println);

        System.out.println("\nAverage boat price:");
        System.out.println(boatService.calculateAveragePrice(boats) + " USD");

        System.out.println("\nBoats by country:");
        boatService.countBoatsByCountry(boats);
    }
}
