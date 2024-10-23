package Classwork_09;

import java.util.*;

public class Calkulator {
    static int num1, num2, action;
    static int result;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // повтор работы

        boolean flag = true;

        while (true) {

            System.out.println("Continue? Y/N");
            char ch = scanner.next().charAt(0);
            if (ch == 'y') {


                //Scanner scanner = new Scanner(System.in);
                System.out.println("Input 1st number : ");
                num1 = scanner.nextInt();

                System.out.println("Input 2st number : ");
                num2 = scanner.nextInt();
                System.out.println("input action : ");
                System.out.println("1=> '+' ");
                System.out.println("2=> '-' ");
                System.out.println("3=> '*' ");
                System.out.println("4=> '/' ");
                System.out.println("5=> '%' ");
                System.out.println("0=> exit");


                action = scanner.nextInt();

                switch (action) {
                    case 1 -> result = sum(num1, num2);
                    case 2 -> result = deduct(num1, num2);
                    case 3 -> result = multiplay(num1, num2);
                    case 4 -> result = division(num1, num2);
                    case 5 -> result = restOfdivision(num1, num2);
                    case 0 -> flag = false;
                    default -> System.out.println("Wrong! Incorrect input");


                } //end of switch

                System.out.println("Resoult = " + result);
                System.out.println("hallo again");
                // начать заного работу калькулятора
            }

        //} else{
            flag = false;
        }


    } // end of main 1

    private static int sum(int num1, int num2) {
        return num1 + num2;

    } // end of main sum

    private static int deduct(int num1, int num2) {
        return num1 - num2;

    } // end of main deduct

    private static int multiplay(int num1, int num2) {
        return num1 * num2;

    } // end of main multiplay

    private static int division(int num1, int num2) {
        return num1 / num2;

    } // end of main division

    private static int restOfdivision(int num1, int num2) {
        return num1 % num2;

    } // end of main restOfdivision


} // end of class

