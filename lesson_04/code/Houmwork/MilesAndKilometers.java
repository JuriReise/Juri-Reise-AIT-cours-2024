package Houmwork;

import java.util.*;

public class MilesAndKilometers {

    public static void main(String[] args) {
        int view;
        double summ;
        double nauticalMile, landMile, kilometers;

        Scanner scann = new Scanner(System.in);

        System.out.println("Please select the types of calculations:"); // Виды растояний
        System.out.println("Enter 1: Nautical Mile - 1 852 метров ");
        System.out.println("Enter 2: Land Mile - 1 609 метров");
        System.out.println("Enter 3: Kilometers - 1000 метров");


        System.out.println("\nChoose your option: "); // Выбор растояний
        view = scann.nextInt();
        System.out.println("Your choice number: " + view);

        System.out.println("Please enter the number of kilometers:"); // выбор суммы выбранной алюты
        summ = scann.nextFloat();
        System.out.println("Your distance: " + view);

        switch (view) {
            case 1: // nauticalMile
                landMile = summ / 0.868;
                System.out.println(summ + " Your distance in Nautical Mile = " + landMile + " Land Mile");
                kilometers = summ * 1.852;
                System.out.println(summ + " Your distance in Nautical Mile = " + kilometers + " Kilometers");
                break;

            case 2: // landMile
                nauticalMile = summ * 0.86897;
                System.out.println(summ + " Your distance in Land Mile = " + nauticalMile + " Nautical Mile");
                kilometers = summ * 1.609;
                System.out.println(summ + " Your distance in Land Mile = " + kilometers + " Kilometers");
                break;

            case 3: // Kilometers
                landMile = summ * 1.150;
                System.out.println(summ + " Your distance in Kilometers = " + landMile + " Land Mile");
                nauticalMile = summ * 1.852;
                System.out.println(summ + " Your distance in Kilometers = " + nauticalMile + " Nautical Mile");
                break;


        } // end of case
    } // end of main

} // end of class
