package Houmworck_22.Task_1;
/*
 Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:

    сумма всех элементов массива с нечетными индексами;
    поиск 5-го элемента в массиве. Разработайте тесты для этих методов.

 */

public class ArrayMethodsTest {
    public static void main(String[] args) {

        // Вод массива целых чисел
        int[] testArray = {10, 20, 30, 40, 50, 60};

        // Используем метод для суммы элементов с нечётными индексами
        int sum = ArrayMethods.indexedElementsSum(testArray);
        System.out.println("Сумма элементов с нечётными индексами: " + sum); // Ожидается 20 + 40 + 60 = 120

        // Используем метод для поиска 5-го элемента
        int element5 = ArrayMethods.searchElement5(testArray);
        if (element5 != -1) {
            System.out.println("5-й элемент массива: " + element5); // Ожидается 50
        } else {
            System.out.println("В массиве меньше 5 элементов.");
        }
    }

}
