package Houmwork_08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GutenMorgenOderNachtMitIf {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текушее время (0-24): ");
        int hour = scanner.nextInt();

        if (hour < 0 || hour > 24) {
            System.out.println("Неверное число. Введите пожалуйста время от 0 до 24.");
        } else {
            // Определение времени суток
            if (hour >= 5 && hour <= 11) {
                System.out.println("Говорим: Good Morning");
            } else if (hour >= 12 && hour <= 17) {
                System.out.println("Говорим: Good Day");
            } else if (hour >= 18 && hour <= 21) {
                System.out.println("Говорим: Good Morning");
            } else {
                System.out.println("Говорим: Good Night!");
            }
        }


    } // end of main

} // end of class
