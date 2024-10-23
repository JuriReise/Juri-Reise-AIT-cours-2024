package houmwork_30.double_array;

import java.util.Arrays;
import java.util.Comparator;

public class DoubleArray {
    public static void main(String[] args) {
        // Создаем массив Double на 10 элементов
        Double[] numbers = new Double[10];

        // Заполняем массив случайными числами в диапазоне от 0 до 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 10;
        }

        // Выводим исходный массив
        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        // Сортировка по возрастанию
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order:");
        System.out.println(Arrays.toString(numbers));

        // Сортировка по убыванию
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("Sorted array in descending order:");
        System.out.println(Arrays.toString(numbers));
    }
}
