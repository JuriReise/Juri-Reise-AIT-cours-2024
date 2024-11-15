package homework_43.boat.dao;


import homework_43.boat.model.Boat;

import java.util.*;
import java.util.stream.Collectors;

public class BoatSrvImpl implements BoatSrv {

    @Override
    public void displayAll(List<Boat> boats) {
        boats.forEach(System.out::println);
    }

    @Override
    public List<Boat> filterByMaterial(List<Boat> boats, String material) {
        return boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(material))
                .collect(Collectors.toList());
    }

    @Override
    public List<Boat> filterByPrice(List<Boat> boats, double minPrice) {
        return boats.stream()
                .filter(boat -> boat.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    @Override
    public List<Boat> filterByYearRange(List<Boat> boats, int startYear, int endYear) {
        return boats.stream()
                .filter(boat -> boat.getYear() >= startYear && boat.getYear() <= endYear)
                .collect(Collectors.toList());
    }

    @Override
    public List<Boat> sortByDescendingPrice(List<Boat> boats) {
        return boats.stream()
                .sorted((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()))
                .collect(Collectors.toList());
    }

    @Override
    public double calculateAveragePrice(List<Boat> boats) {
        return boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0.0);
    }

    @Override
    public void countBoatsByCountry(List<Boat> boats) {
        Map<String, Long> boatsByCountry = boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry, Collectors.counting()));
        boatsByCountry.forEach((country, count) ->
                System.out.println(country + ": " + count + " boat(s)"));
    }
}
