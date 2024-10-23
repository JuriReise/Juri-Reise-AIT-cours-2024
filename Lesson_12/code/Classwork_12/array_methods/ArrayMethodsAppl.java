package Classwork_12.array_methods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);

        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + " is in array: " + isInArray);

        // Тестовый массив остатков на счетах пользователей
        double[] bankAccounts = {1000.50, 2000.75, 3000.20, 4000.40, 5000.00};

        // Печатаем исходный массив остатков
        ArrayMethods.printArrayDouble(bankAccounts);

        // Начисляем проценты
        double[] updatedAccounts = ArrayMethods.calculatePercent(bankAccounts, 5.0);

        // Печатаем массив после начисления процентов
        ArrayMethods.printArrayDouble(updatedAccounts);

        // Вызываем метод для суммирования элементов массива
        int sum = ArrayMethods.sumArray(myArray);
        System.out.println("Sum of array elements: " + sum);

        // Вызываем метод для нахождения среднего значения
        double average = ArrayMethods.averageValue(bankAccounts);
        System.out.println("Average of bank account values: " + average);
    }
}
