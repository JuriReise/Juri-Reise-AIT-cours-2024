package Houmwork_37.Galaxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<Planet> planets = new ArrayList<>();

        // Добавляем планеты в список
        planets.add(new Planet("Mercury", 57.9, 3.3011e23, 0, 1));
        planets.add(new Planet("Venus", 108.2, 4.8675e24, 0, 2));
        planets.add(new Planet("Earth", 149.6, 5.97237e24, 1, 3));
        planets.add(new Planet("Mars", 227.9, 6.4171e23, 2, 4));
        planets.add(new Planet("Jupiter", 778.3, 1.8982e27, 79, 5));
        planets.add(new Planet("Saturn", 1427, 5.6834e26, 83, 6));
        planets.add(new Planet("Uranus", 2871, 8.6810e25, 27, 7));
        planets.add(new Planet("Neptune", 4495, 1.02413e26, 14, 8));

        // Сортировка по порядку от Солнца
        Collections.sort(planets, Comparator.comparingInt(Planet::getOrderFromSun));
        System.out.println("Сортировка по порядку от Солнца:");
        planets.forEach(System.out::println);

        // Сортировка по алфавиту
        Collections.sort(planets, Comparator.comparing(Planet::getName));
        System.out.println("\nСортировка по алфавиту:");
        planets.forEach(System.out::println);

        // Сортировка по массе
        Collections.sort(planets, Comparator.comparingDouble(Planet::getMass));
        System.out.println("\nСортировка по массе:");
        planets.forEach(System.out::println);

        // Сортировка по количеству спутников
        Collections.sort(planets, Comparator.comparingInt(Planet::getSatelliteCount));
        System.out.println("\nСортировка по количеству спутников:");
        planets.forEach(System.out::println);
    }
}

