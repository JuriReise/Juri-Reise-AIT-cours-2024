package Houmworck_22.Task_2;
/*  Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:

положительных чисел;
отрицательных чисел;
четных чисел;
    нулей. Реализуйте все подсчеты методами и напишите для них тесты.
*/


public class ArrayMethods100 {
    // Метод для положительных чисел cо счётчиком положительных чисел
    public static int positiveNumbers(int[] array) {
        int numbers = 0;
        for (int num : array) {
            if (num > 0) {
                numbers++;
            }
        }
        return numbers;
    }

    // Метод для отрицательных чисел cо счётчиком отрицательных чисел
    public static int negativeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для чётных чисел cо счётчиком
    public static int evenSum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчёта нулей + cчётчик нулей
    public static int nullSum(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}
