package Houmwork_37.computers;

import java.util.ArrayList;
import java.util.Comparator;

public class ComputerSort {

    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        // Добавление компьютеров в ArrayList
        computers.add(new Computer("i7", 16, 512, "Dell", 1200, 2048));
        computers.add(new Computer("i5", 8, 256, "HP", 800, 1024));
        computers.add(new Computer("Ryzen 5", 16, 1024, "Asus", 1100, 4096));
        computers.add(new Computer("i3", 4, 128, "Acer", 500, 512));
        computers.add(new Computer("Ryzen 7", 32, 2048, "MSI", 1500, 8192));
        computers.add(new Computer("i9", 64, 1024, "Dell", 2000, 4096));

        // Сортировка по бренду, RAM, SSD и GPU
        computers.sort(Comparator
                .comparing(Computer::getBrand)
                .thenComparing(Computer::getRam)
                .thenComparing(Computer::getSsd)
                .thenComparing(Computer::getGpuSize));

        // Вывод отсортированного списка
        System.out.println("Отсортированный список компьютеров:");
        for (Computer computer : computers) {
            System.out.println(computer);
        }

        // Подсчет общего и среднего объема SSD
        int totalSSD = computers.stream().mapToInt(Computer::getSsd).sum();
        double averageSSD = totalSSD / (double) computers.size();

        System.out.println("\nОбщий объем SSD: " + totalSSD + " GB");
        System.out.println("Средний объем SSD: " + averageSSD + " GB");
    }
}