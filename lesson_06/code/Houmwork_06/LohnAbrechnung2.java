package Houmwork_06;

// 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$.
// За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class LohnAbrechnung2 {

    public static void main(String[] args) {
        int view;
        double summ = 500;
        double years0,years3, years5, years10, years15;


        Scanner scann = new Scanner(System.in);

        String res;

        System.out.println("Hello. You are in the menu for calculating bonuses based on the number of years of work.");
        System.out.println("TTo continue, please select 1 of 5 options:");
        System.out.println("Enter 1: less than 36 months");
        System.out.println("Enter 2: 3 Years");
        System.out.println("Enter 3: 5 Years");
        System.out.println("Enter 4: 10 Years");
        System.out.println("Enter 5: 15 Years");

        // char ch = scanner.next().charAt(0)  // позволяет вводить символы
        // тогда кейс  так `+` ->

        System.out.println("\nChoose your option: ");
        view = scann.nextInt();
        System.out.println("Your choice number: " + view);


        // case ->

        switch (view) {
            case 1:
                years0 = summ * 0;
                System.out.println("Unfortunately, you are not entitled to a bonus, see you soon!");
                break;
            case 2:
                years3 = summ * 1.1;
                System.out.println(" Your bonus including premium is: " + years3 + " Euro");
                break;
            case 3:
                years5 = summ * 1.5;
                System.out.println(" Your bonus including premium is: " + years5 + " Euro");
                break;
            case 4:
                years10 = summ * 2;
                System.out.println(" Your bonus including premium is: " + years10 + " Euro");
                break;
            case 5:
                years15 = summ * 2.5;
                System.out.println(" Your bonus including premium is: " + years15 + " Euro");
                break;
            default:

        } // end of swich
    } // end of main

} //end of class