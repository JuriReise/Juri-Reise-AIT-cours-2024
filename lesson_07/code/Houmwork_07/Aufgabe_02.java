package Houmwork_07;

import java.util.Scanner;

public class Aufgabe_02 {

    public static void main(String[] args) {

        // Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15

        Scanner scanner = new Scanner(System.in);

        // Ввод положительного целого числа
        System.out.print("Input positive integer nmmer: ");
        int number = scanner.nextInt();

        // Переменная для хранения суммы цифр
        int number1 = 0;
        int count = 0;
        int temp = number; // Временная переменная для подсчета цифр в числе

        // Считаем количество цифр в числе
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Вычисляем сумму цифр
        while (count > 0) {
            number1 += number % 10;  // Добавляем последнюю цифру числа к сумме
            number /= 10;        // Убираем последнюю цифру числа
            count--;             // Уменьшаем счетчик цифр
        }

        // Вывод результата
        System.out.println("Sum of digits:" + number1 + " are = " + count);


    } // end of main

} // end of class
