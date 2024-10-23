package Houmwork_07;

import java.util.Scanner;

public class Milk2Final {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word you want to repeat: ");
        String string = scanner.nextLine();

        System.out.print("Enter the numer for repeat: ");
        int n = scanner.nextInt();

        System.out.println("Your choice: "     + n + " repeat the word: " + string);

        System.out.println(string.repeat(n));




    } // end of main

} //end of class
