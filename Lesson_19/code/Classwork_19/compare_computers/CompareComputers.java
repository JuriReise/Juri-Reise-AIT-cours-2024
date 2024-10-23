package Classwork_19.compare_computers;
// Сравнение двух объектов типа Computer.
// Использование метода equals для сравнения объектов.

import java.util.Scanner;

public class CompareComputers {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println(pc1);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Input CPU:");
//        String cpu = scanner.nextLine();
//        System.out.println("Input RAM:");
//        int ram = scanner.nextInt();
//        System.out.println("Input SSD:");
//        int ssd = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Input Brand:");
//        String brand = scanner.nextLine();
//        System.out.println("Input Price:");
//        double price = scanner.nextDouble();
//
//        // scanner.nextLine();

        Computer pc2 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println(pc2);

        boolean checker = (pc1 == pc2);
        System.out.println(checker); // false becouse Links
        System.out.println("---------------------------------------");
        checker = pc1.equals(pc2);
        System.out.println(checker);

    }
}
