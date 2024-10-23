package Houmwork;
// Написать метод copyOfArray.
// Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
// Метод должен создать новый массив длиной newLength.
// В новый массив должны быть скопированы элементы из входящего массива:
// Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

import java.util.Arrays;

public class MethodArraysCopyOf {

    public static int[] copyOfArray(int[] array, int newLength) {
        // Используем Arrays.copyOf для копирования
        return Arrays.copyOf(array, newLength);
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(array, 3);

        // Печатаем новый массив
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
