package Classwork_08;

// Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0; // parametrs of Cikle
        int y = 101; //

        while (i < y) {
            if (i % 7 == 0) { // 26 % 5 = * 5 +1
                System.out.print(i + " ");

            } // end of IF
            i++;

        } // end of loop

    } // end of main

} // end of class
