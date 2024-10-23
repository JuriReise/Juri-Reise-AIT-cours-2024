package Classwork_11;
// Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

public class Task1 {

    public static void main(String[] args) {
        // Заданный массив
        int[] array = { 75, 34, -15, -123, 57, 86, -145, 77, 145, 48, -59, -145 };

        // Переменные для хранения минимального и максимального значений и их индексов
        int minOfarray = array[0]; // Изначально предположим, что первый элемент минимальный
        int minOfIndex = 0; // Индекс минимального элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOfarray){
                minOfarray = array[i];
                minOfIndex = i;
            }

        }

        System.out.println("Min element of Array = " + minOfarray + " , index of min = " + minOfIndex);

        // Переменные для хранения минимального и максимального значений и их индексов
        int maxOfarray = array[0]; // Изначально предположим, что первый элемент минимальный
        int maxOfIndex = 0; // Индекс минимального элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfarray){
                maxOfarray = array[i];
                maxOfIndex = i;
            }

        }

        System.out.println("Min element of Array = " + maxOfarray + " , index of min = " + maxOfIndex);

        int temp = array[minOfIndex];
        array[minOfIndex] = array[maxOfIndex];
        array[maxOfIndex] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();




    } // end of main


} // end of class
