package Houmwork_07;

import java.util.*;

public class Tiket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ticket number: ");
        int number = scanner.nextInt();

        int step = 1;
        int count = 0;
        int sum = 0;
        while (number != 0) {
            sum += step * (number % 10);
            number /= 10;
            if (++count == 3) {
                step = -step;
            }
        }
        if (count == 6 && sum == 0) {
            System.out.println("Congratulations, your ticket is a winner: ");
        } else if (count != 6) {
            System.out.println("You have entered an incorrect ticket number: ");
        } else {
            System.out.println("We're sorry, but your ticket is not a lucky one, see you soon: ");

        } // end of main
    } // end of class
}
