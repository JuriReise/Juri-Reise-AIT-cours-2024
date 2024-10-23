package Houmwork_20;
// Напишите программу, которая запрашивает у пользователя строку,
// содержащую целые числа, и выводит сумму всех этих введенных чисел.
// Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.math.BigInteger;
import java.util.Scanner;

public class CandyWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку с целыми числами, записанными подряд без пробелов:");
        String input = scanner.nextLine();

        BigInteger sum = new BigInteger("0"); // Инициализация суммы нулём
        String number = ""; // Строка для накопления цифр числа

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                number += currentChar; // Добавляем цифру к текущему числу
            } else {
                if (!number.isEmpty()) {
                    // Преобразуем накопленное число в BigInteger и добавляем его к сумме
                    sum = sum.add(new BigInteger(number));
                    number = ""; // Очищаем для следующего числа
                }
            }
        }

        // Обрабатываем последнее число, если оно есть
        if (!number.isEmpty()) {
            sum = sum.add(new BigInteger(number));
        }

        System.out.println("Сумма введенных чисел: " + sum);
    }
}
