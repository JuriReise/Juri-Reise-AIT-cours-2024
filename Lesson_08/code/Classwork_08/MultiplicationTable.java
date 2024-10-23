package Classwork_08;

// Распечатать в консоли таблицу умножения от 1 до 10.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // цикл в цикле

        Scanner scanner = new Scanner(System.in);

        int i = 1, j = 1;

        while ( i < 10){
            while ( j < 11){

                System.out.print(i + " x " + j + " " + (i*j) + " | ");
                j++;

            } // end of loop J

            j = 1;
            i ++;
            System.out.println(); // next line


        } // end of loop i


    } // end of main

} // end of class
