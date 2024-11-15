package homework_45.exception_probe;

import java.util.Scanner;

public class ExceptionProbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
                System.out.println("Введите число:");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input); // Может выбросить NumberFormatException
                int result = 100 / number; // Может выбросить ArithmeticException

                System.out.println("Результат: 100 / " + number + " = " + result);
                success = true; // Если всё прошло успешно, выходим из цикла
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: нельзя делить на ноль. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число.");
            }
        }

        System.out.println("Программа завершена.");
    }
}
