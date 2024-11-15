package homework_42.Continents.model;

import java.util.*;

public class ContinentSort {
    private List<Continents> continents;

    public ContinentSort(List<Continents> continents) {
        this.continents = continents;
    }

    // Метод для сортировки континентов по имени
    public List<Continents> getSortedContinents() {
        continents.sort(Comparator.comparing(Continents::getName));
        return continents;
    }

    // Метод для получения общего списка стран по алфавиту
    public List<String> getSortedCountries() {
        TreeSet<String> sortedCountries = new TreeSet<>();
        for (Continents continent : continents) {
            sortedCountries.addAll(continent.getCountries());
        }
        return new ArrayList<>(sortedCountries);
    }
}
