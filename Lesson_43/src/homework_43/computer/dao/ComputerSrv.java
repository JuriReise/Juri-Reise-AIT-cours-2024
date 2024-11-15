package homework_43.computer.dao;

import computer.model.Computer;
import java.util.List;

public interface ComputerSrv {
    void displayAll(List<Computer> computers);
    List<Computer> filterByFormFactor(List<Computer> computers, String formFactor);
    List<Computer> filterByPrice(List<Computer> computers, double price);
    List<Computer> filterByRam(List<Computer> computers, int ram);
    List<Computer> filterBySsd(List<Computer> computers, int ssd);
    List<Computer> sortByDescendingPrice(List<Computer> computers);
    double calculateAveragePrice(List<Computer> computers);
}
