package Houmwork;

public class MethodSystemArrayCopy {
    public static int[] copyOfArray(int[] array, int newLength) {
        // Создаем новый массив нужной длины
        int[] newArray = new int[newLength];

        // Копируем элементы с помощью System.arraycopy
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newLength));

        return newArray;
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

