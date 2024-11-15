package homework_42.Continents.model;

import java.util.List;

public class Continents {
    private String name;
    private List<String> countries;

    public Continents(String name, List<String> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    public int getCountryCount() {
        return countries.size();
    }
}
