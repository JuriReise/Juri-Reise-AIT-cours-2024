package Houmwork_38.cities_Germany;

public class City {
    private String name;
    private String land;

    public City(String name, String land) {
        this.name = name;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }

    @Override
    public String toString() {
        return name + " (" + land + ")";
    }
}
