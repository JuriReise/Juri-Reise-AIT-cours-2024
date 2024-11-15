package homework_44.mini_marathon.computer;


import homework_44.mini_marathon.computer.dao.ComputerSrv;
import homework_44.mini_marathon.computer.dao.ComputerSrvImpl;
import homework_44.mini_marathon.computer.model.Computer;

import java.util.Arrays;
import java.util.List;

public class ComputerAppl {
    public static void main(String[] args) {
        ComputerSrv computerService = new ComputerSrvImpl();

        // Create a list of computers
        List<Computer> computers = Arrays.asList(
                new Computer(16, 512, "RTX 3080", "i9-11900K", "BrandA", 2000, "ATX"),
                new Computer(8, 256, "GTX 1650", "i5-10400F", "BrandB", 800, "miniATX"),
                new Computer(32, 1024, "RTX 4090", "Ryzen 9 7950X", "BrandC", 3500, "Slim")
        );

        // Display all computers
        System.out.println("All computers:");
        computerService.displayAll(computers);

        // Filter computers by form factor
        System.out.println("\nComputers with form factor 'ATX':");
        computerService.filterByFormFactor(computers, "ATX").forEach(System.out::println);

        // Filter computers by RAM
        System.out.println("\nComputers with 16GB RAM:");
        computerService.filterByRam(computers, 16).forEach(System.out::println);

        // Sort computers by descending price
        System.out.println("\nComputers sorted by descending price:");
        computerService.sortByDescendingPrice(computers).forEach(System.out::println);

        // Calculate average price
        System.out.println("\nAverage price of computers:");
        System.out.println(computerService.calculateAveragePrice(computers));
    }
}
