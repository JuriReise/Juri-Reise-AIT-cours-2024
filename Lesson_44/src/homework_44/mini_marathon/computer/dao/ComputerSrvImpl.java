package homework_44.mini_marathon.computer.dao;

import homework_44.mini_marathon.computer.model.Computer;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerSrvImpl implements ComputerSrv {

    @Override
    public void displayAll(List<Computer> computers) {
        computers.forEach(System.out::println);
    }

    @Override
    public List<Computer> filterByFormFactor(List<Computer> computers, String formFactor) {
        return computers.stream()
                .filter(computer -> computer.getFormFactor().equalsIgnoreCase(formFactor))
                .collect(Collectors.toList());
    }

    @Override
    public List<Computer> filterByPrice(List<Computer> computers, double price) {
        return computers.stream()
                .filter(computer -> computer.getPrice() == price)
                .collect(Collectors.toList());
    }

    @Override
    public List<Computer> filterByRam(List<Computer> computers, int ram) {
        return computers.stream()
                .filter(computer -> computer.getRam() == ram)
                .collect(Collectors.toList());
    }

    @Override
    public List<Computer> filterBySsd(List<Computer> computers, int ssd) {
        return computers.stream()
                .filter(computer -> computer.getSsd() == ssd)
                .collect(Collectors.toList());
    }

    @Override
    public List<Computer> sortByDescendingPrice(List<Computer> computers) {
        return computers.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .collect(Collectors.toList());
    }

    @Override
    public double calculateAveragePrice(List<Computer> computers) {
        return computers.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0);
    }
}
