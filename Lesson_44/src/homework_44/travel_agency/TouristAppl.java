package homework_44.travel_agency;

import homework_44.travel_agency.model.Tourist;

import java.util.List;
import java.util.Map;

public class TouristAppl {
    public static void main(String[] args) {
        TouristImpl touristService = new TouristImpl();

        List<Tourist> tourists = touristService.getTourists();

        // 1. Страны по популярности
        Map<String, Long> popularCountries = touristService.getPopularCountries(tourists);
        System.out.println("Наиболее популярные страны:");
        popularCountries.forEach((country, count) ->
                System.out.println(country + ": " + count)
        );

        // 2. Клиент, посетивший наибольшее количество стран
        touristService.getMostTravelledTourist(tourists)
                .ifPresent(t -> System.out.println("\nСамым путешествующим клиентом является: " + t.getName()));
    }
}
