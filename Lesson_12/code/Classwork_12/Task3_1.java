package Classwork_12;

// Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань.
// Проверьте, равны ли вероятности выпадений граней кубика.

import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
        Random random = new Random();

        // Массив для хранения результатов 20 бросков
        int[] toss = new int[20];

        // Массив для подсчета количества выпадений каждой грани (от 1 до 6)
        int[] counts = new int[6];

        // Моделируем 20 бросков кубика
        for (int i = 0; i < toss.length; i++) {
            // Генерируем случайное число от 1 до 6
            int n = random.nextInt(6) + 1; // диапазон от 0 до 5 + 1 = от 1 до 6
            toss[i] = n; // Сохраняем результат броска
            counts[n - 1]++; // Увеличиваем счетчик для соответствующей грани
            System.out.print(n + " ");
        }

        System.out.println("\n");

        // Выводим результаты подсчета выпадений каждой грани
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Грань " + (i + 1) + " выпала " + counts[i] + " раз.");
        }

        // Проверка равенства вероятностей
        // Вычисляем среднее количество выпадений для каждой грани
        double average = 20.0 / 6.0;
        System.out.printf("\nОжидаемое количество выпадений для каждой грани: %.2f\n", average);

        // Сравниваем фактическое количество выпадений с ожидаемым
        for (int i = 0; i < counts.length; i++) {
            double difference = Math.abs(counts[i] - average);
            System.out.printf("Грань %d отклонение от среднего: %.2f\n", (i + 1), difference);
        }

    } // end of main
} // end of class
