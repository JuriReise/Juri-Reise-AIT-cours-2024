package Houmworck_22.Task_2;
/*  Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:

положительных чисел;
отрицательных чисел;
четных чисел;
    нулей. Реализуйте все подсчеты методами и напишите для них тесты.
*/

import java.util.Random;

public class ArrayMethods100Test {
    public static void main(String[] args) {
        Random random = new Random();
        // Создаём массив из 100 элементов и Заполняем массив случайными числами от -10 до 10
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        // Проверка методов
        int positiveCount = ArrayMethods100.positiveNumbers(array);
        int negativeCount = ArrayMethods100.negativeNumbers(array);
        int evenCount = ArrayMethods100.evenSum(array);
        int zeroCount = ArrayMethods100.nullSum(array);

        // Итоги
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество чётных чисел: " + evenCount);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
