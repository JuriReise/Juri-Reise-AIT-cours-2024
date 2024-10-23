package Houmwork;
//  Написать метод copyOfArray. *
//  Метод принимает на вход массив целых чисел и целое число  *
//  - длину нового массива newLength.
//  Метод должен создать новый массив длиной newLength.
//  В новый массив должны быть скопированы элементы из входящего массива:
//  Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class ArrayMethods_H {

    public static void main(String[] args) {
        // Так как всегда, нужно смастерить комод (массив),с семью ящиками

        int[] array = {0, 1, 2, 3, 4, 5, 6};

        // Надо скопировать три детали с предыдущего комода для нового комода
        // Но их надо уменьшить в размере
        // присвою гриф скопированным чертежам copyOfArray от старого комода  newArray

        int[] newArray = copyOfArray(array, 3);

        System.out.print(" : ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
    // Как будем копировать
    // Надо создать новое имя чертежам newLength
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength && i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }


} // end off class
