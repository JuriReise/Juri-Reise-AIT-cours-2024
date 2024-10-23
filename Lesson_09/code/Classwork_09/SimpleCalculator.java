package Classwork_09;

import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Метод для ввода числа с проверкой
        double num1 = getNumber(scanner, "Введите первое число (или 'exit' для выхода): ");
        if (Double.isNaN(num1)) {
            return;
        }

        // Запрашиваем операцию
        System.out.println("Введите операцию (+, -, *, /) или 'exit' для выхода: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Выход из программы.");
            return;
        }

        char operation = input.charAt(0); // Получаем символ операции

        // Метод для ввода второго числа с проверкой
        double num2 = getNumber(scanner, "Введите второе число (или 'exit' для выхода): ");
        if (Double.isNaN(num2)) {
            return;
        }

        // Выполняем операцию
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка! Деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка! Неверная операция.");
                return;
        }

        // Выводим результат
        System.out.println("Результат: " + result);
    }

    // Метод для получения числа с проверкой ввода
    private static double getNumber(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                return Double.NaN; // Возвращаем специальное значение для выхода
            }

            try {
                return Double.parseDouble(input); // Преобразуем строку в число
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите корректное число.");
            }
        }
    }
}
