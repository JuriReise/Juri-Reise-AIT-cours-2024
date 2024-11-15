package homework_44.travel_agency.model;

import java.util.List;

public class Tourist {
    private String name;
    private List<String> countries;

    public Tourist(String name, String... countries) {
        this.name = name;
        this.countries = List.of(countries);
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Tourist{name='" + name + "', countries=" + countries + "}";
    }
}