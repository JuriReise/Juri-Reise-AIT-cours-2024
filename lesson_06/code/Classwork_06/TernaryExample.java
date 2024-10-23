package Classwork_06;

import java.util.*;

public class TernaryExample {

    public static void main(String[] args) {
        int a = 500;
        int b = 200;

        int min = (a < b) ? a : b; // ternary operator
        System.out.println("Min = " + min);

        int max = (a > b) ? a : b; // ternary operator
        System.out.println("Max = " + max);
        Scanner scaner = new Scanner(System.in);

        // input data on Keyboard
        System.out.println("Input 1st number: ");
        a = scaner.nextInt();
        System.out.println("Input 1st number: ");
        b = scaner.nextInt();

        min = minAB(a, b);
        System.out.println("Min = " + min);


    } // end of main

    public static int minAB(int a, int b) {
       return (a < b) ? a : b;
    }

} // end of class
