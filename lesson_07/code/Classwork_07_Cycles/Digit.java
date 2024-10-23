package Classwork_07_Cycles;

// Задача 4. Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.*;

public class Digit {
    public static void main(String[] args) {
        // 5467
        //---------
        // 5467 % 10 = 7 это первая справа цифра числа
        // 5467 / 10 = 546
        // продолжим в цикле / на 10 пока результат не придёт к >0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer nummer: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0;

        while (number > 0) {

            number = number /10;  // параметр - это параметр цикла
            System.out.println(number);
            count++;

        }
        System.out.println("Digits ib number" + number1 + " are = " + count);

    } // end off main


} // end of class
