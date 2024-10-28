package Houmwork_07;

public class Zuruck {
    public static void main(String[] args) {
        int n = 1234; // Заданное число
        int reversed = 0; // Переменная для хранения перевёрнутого числа

        while (n != 0) {
            int lastDigit = n % 10; // Получаем последнюю цифру
            reversed = reversed * 10 + lastDigit; // Добавляем её к перевёрнутому числу
            n = n / 10; // Удаляем последнюю цифру из числа
        }

        System.out.println("Число в обратном порядке: " + reversed);
    }
}
