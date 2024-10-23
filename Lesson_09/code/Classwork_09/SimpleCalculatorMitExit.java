package Classwork_09;

import java.util.Scanner;

public class SimpleCalculatorMitExit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число или выход
        System.out.println("Введите первое число (или 'exit' для выхода): ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Выход из программы.");
            return;
        }

        double num1 = Double.parseDouble(input); // Преобразуем строку в число

        // Запрашиваем операцию
        System.out.println("Введите операцию (+, -, *, /) или 'exit' для выхода: ");
        input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Выход из программы.");
            return;
        }

        char operation = input.charAt(0); // Получаем символ операции

        // Запрашиваем второе число или выход
        System.out.println("Введите второе число (или 'exit' для выхода): ");
        input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Выход из программы.");
            return;
        }

        double num2 = Double.parseDouble(input); // Преобразуем строку в число

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
}
