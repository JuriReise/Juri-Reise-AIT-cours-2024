package Classwork_12.array_methods;
//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
// - поиск элемента

public class ArrayMethods {




    // fill array random numbers
    // a - left border, b - right border, n - quantity
    // Этот метод Заполняет массив случайными целыми числами в диапазоне от a до b.
    // Количество элементов в массиве равно n
    public static int[] fillArray(int a, int b, int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random()*(b - a + 1) + a); //
        }
        return res;
    }

    // print array
    // Этот метод Выводит массив целых чисел на экран.
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // search in array
    // этот метод - Ищет элемент n в массиве целых чисел и возвращает true,
    // если элемент найден, или false в противном случае.
    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return true;
            }
        }
        return false;
    } // end of method

    // Метод для начисления X процентов к каждому элементу массива accounts
    // И Возвращает новый массив с измененными значениями.
    public static double[] calculatePercent(double[] accounts, double percent){
        double[] result = new double[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            result[i] = accounts[i] + (accounts[i] * percent / 100);
        }
        return result;
    }

    // Метод для печати массива данных типа double
    public static void printArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // Метод Вычисляет и возвращает сумму всех элементов массива целых чисел.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Метод Вычисляет среднее арифметическое всех элементов массива чисел с плавающей запятой
    // и возвращает это значение.
    public static double averageValue(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    // Цель класса ArrayMethods — предоставить функциональность,
    // которая может быть многократно использована при работе с массивами.
    // Это как библиотека функций для различных операций над массивами.


}
