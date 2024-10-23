package Houmwork_07;

import java.util.*;

public class Milk {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word you want to repeat: ");
        String input = scanner.next(); // Ввод слова
        System.out.println("Your choice number: " + input + " ");

        System.out.print("Enter the numer for repeat: ");
        int n = scanner.nextInt(); // вод числа повторений

        System.out.println("Your choice: "  + n + " repeat the word: " + input);

        System.out.println(input.repeat(n));




    } // end of main

} //end of class
