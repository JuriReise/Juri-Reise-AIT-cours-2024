package Houmworck_22.Task_1;
/*
 Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:

    сумма всех элементов массива с нечетными индексами;
    поиск 5-го элемента в массиве. Разработайте тесты для этих методов.

 */

public class ArrayMethods {

    // Организация Метода для суммы элементов с нечётными индексами
    public static int indexedElementsSum(int[] array) {
        int sum = 0;

        for (int i = 1; i < array.length; i += 2) { // шаг поиска через 1.
            sum += array[i];
        }
        return sum;
    }

    // Организуем метод для поиска элемента № 5
    public static int searchElement5(int[] array) {
        // Мы знаем что элемент в массиве имеет индекс -1
        // Тогда если: 5 то 4
        if (array.length >= 5) {
            return array[4];
        } else {
            return -1;
        }
    }

} // end of class
