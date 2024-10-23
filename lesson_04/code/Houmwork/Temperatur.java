package Houmwork;

import java.util.*;

public class Temperatur {

    public static void main(String[] args) {
        int view;
        double summ;
        double celsius, fahrenheit;

        Scanner scann = new Scanner(System.in);

        System.out.println("Select the desired option:"); // Варианты температур
        System.out.println("Enter 1: Degrees Celsius to Fahrenheit");
        System.out.println("Enter 2: Fahrenheit to Degrees Celsius");



        System.out.println("\nChoose your option: "); // Выбор Валюты
        view = scann.nextInt();
        System.out.println("Your choice number: " + view);

        System.out.println("Enter the temperature value:"); // выбор уровня температуры
        summ = scann.nextFloat();
        System.out.println("Temperature = " + view);

        switch (view) {
            case 1: // Celsius to Fahrenheit
                celsius = (summ * 1.8) + 32;
                System.out.println(summ + " Current temperature = " + celsius + " Fahrenheit");
                break;

            case 2: // Fahrenheit to Celsius
                fahrenheit = (summ -32) /1.8;
                System.out.println(summ + " Current temperature = " + fahrenheit + " Celsius");
                break;


        } // end of case
    } // end of main

} // end of class
