package Houmwork;

import java.util.*;

public class Exchange {

    public static void main(String[] args) {
        int view;
        double summ;
        double dollar, yuan, euro, funt;

        Scanner scann = new Scanner(System.in);

        System.out.println("Types of available currencies:"); // Виды Валют
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Yuan");
        System.out.println("Enter 3: Euro");
        System.out.println("Enter 4: Funt");


        System.out.println("\nChoose your option: "); // Выбор Валюты
        view = scann.nextInt();
        System.out.println("Your choice number: " + view);

        System.out.println("Enter the amount you want to convert:"); // выбор суммы выбранной алюты
        summ = scann.nextFloat();
        System.out.println("Your convertible amount is: " + view);

        switch (view) {
            case 1: // Dollar Conversion
                yuan = summ * 7.09;
                System.out.println(summ + " Your amount in Dollar = " + yuan + " Yuan");
                euro = summ * 0.90;
                System.out.println(summ + " Your amount in Dollar = " + euro + " Euro");
                funt = summ * 0.76;
                System.out.println(summ + " Your amount in Dollar = " + funt + " Funt");
                break;

            case 2: // Yuan Conversion
                dollar = summ * 0.14;
                System.out.println(summ + " Your amount in Yuan = " + dollar + " Dollar");
                euro = summ * 0.13;
                System.out.println(summ + " Your amount in Yuan = " + euro + " Euro");
                funt = summ * 0.11;
                System.out.println(summ + " Your amount in Yuan = " + funt + " Funt");
                break;

            case 3: // Euro Conversion
                dollar = summ * 1.11;
                System.out.println(summ + " Your amount in Euro = " + dollar + " Dollar");
                yuan = summ * 7.89;
                System.out.println(summ + " Your amount in Euro = " + yuan + " Yuan");
                funt = summ * 0.84;
                System.out.println(summ + " Your amount in Euro = " + funt + " Funt");
                break;

            case 4: // Funt Conversion
                dollar = summ * 1.32;
                System.out.println(summ + " Your amount in Funt = " + dollar + " Dollar");
                yuan = summ * 9.37;
                System.out.println(summ + " Your amount in Funt = " + yuan + " Yuan");
                euro = summ * 1.19;
                System.out.println(summ + " Your amount in Funt = " + euro + " Euro");
                break;

            } // end of case
    } // end of main

} //end of class
