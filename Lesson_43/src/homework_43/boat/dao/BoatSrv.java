package homework_43.boat.dao;

import homework_43.boat.model.Boat;
import java.util.List;

public interface BoatSrv {
    void displayAll(List<Boat> boats);
    List<Boat> filterByMaterial(List<Boat> boats, String material);
    List<Boat> filterByPrice(List<Boat> boats, double minPrice);
    List<Boat> filterByYearRange(List<Boat> boats, int startYear, int endYear);
    List<Boat> sortByDescendingPrice(List<Boat> boats);
    double calculateAveragePrice(List<Boat> boats);
    void countBoatsByCountry(List<Boat> boats);
}
