package homework_42.Continents;


import homework_42.Continents.model.Continents;
import homework_42.Continents.model.ContinentSort;

import java.util.*;

public class ContinentsAppl {
    public static void main(String[] args) {
        // Список континентов и стран
        List<Continents> continents = Arrays.asList(
                new Continents("Africa", Arrays.asList("Nigeria", "Egypt", "South Africa")),
                new Continents("Asia", Arrays.asList("China", "India", "Japan", "Thailand")),
                new Continents("Europe", Arrays.asList("Germany", "France", "Italy", "Spain")),
                new Continents("North America", Arrays.asList("USA", "Canada", "Mexico")),
                new Continents("South America", Arrays.asList("Brazil", "Argentina", "Chile")),
                new Continents("Australia", Arrays.asList("Australia", "New Zealand")),
                new Continents("Antarctica", Collections.singletonList("Research Stations"))
        );

        // Создаём сервис для работы с континентами
        ContinentSort continentSort = new ContinentSort(continents);

        // Сортировка континентов
        System.out.println("Количество стран на каждом континенте:");
        for (Continents continent : continentSort.getSortedContinents()) {
            System.out.println(continent.getName() + ": " + continent.getCountryCount() + " стран(ы)");
        }

        // Вывод общего списка стран по алфавиту
        System.out.println("\nОбщий список стран по алфавиту:");
        for (String country : continentSort.getSortedCountries()) {
            System.out.println(country);
        }
    }
}