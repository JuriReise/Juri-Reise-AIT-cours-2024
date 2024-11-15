package homework_44.travel_agency;



import homework_44.travel_agency.model.Tourist;

import java.util.*;
import java.util.stream.Collectors;

public class TouristImpl {
    private static final List<String> MEDITERRANEAN_COUNTRIES = List.of(
            "Spain", "France", "Italy", "Greece", "Turkey", "Tunis"
    );

    // Метод для получения списка туристов
    public List<Tourist> getTourists() {
        return List.of(
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }

    public Map<String, Long> getPopularCountries(List<Tourist> tourists) {
        return tourists.stream()
                .flatMap(t -> t.getCountries().stream())
                .filter(MEDITERRANEAN_COUNTRIES::contains)
                .collect(Collectors.groupingBy(country -> country, Collectors.counting()));
    }

    public Optional<Tourist> getMostTravelledTourist(List<Tourist> tourists) {
        return tourists.stream()
                .map(t -> new AbstractMap.SimpleEntry<>(t, t.getCountries().stream()
                        .filter(MEDITERRANEAN_COUNTRIES::contains)
                        .distinct()
                        .count()))
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}
