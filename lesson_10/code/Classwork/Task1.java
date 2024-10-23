package Classwork;

public class Task1 {

    public static void main(String[] args) {

        int[] intNumbers = new int[20];  // длинна массивов, (но индексы от 0 до 19)
        // запоминаем что томмер ноль - это 1
        // а номер последнего значения -1
        // длинна массива = 20

        // вод и заполнения массива
        for (int i = 0; i < intNumbers.length; i++) {

        intNumbers[i] = i +1;


        } // end of array daten

        // печать массива
        for (int i = 0; i < intNumbers.length; i++) {
            System.out.print(intNumbers[i] + " ");

        } // end print array


    } // end of main

} // end of class
