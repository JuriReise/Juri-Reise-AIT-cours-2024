package homework_43.boat.model;

public class Boat {
    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String hullMaterial; // "wood", "plastic", "metal"
    private double price;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    // Getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Boat[%s, %s, %d, %.2f m, %s, %.2f USD]",
                manufacturer, country, year, length, hullMaterial, price);
    }
}
