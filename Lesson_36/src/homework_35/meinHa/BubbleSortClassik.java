package homework_35.meinHa;
// bubble sort
//  - сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
//  - цикл должен идти слева направо
//  - упорядоченные элементы выключаются из цикла
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
//public static void bubbleSort(int[] array){
//
//    for (int i = 0; i < array.length; i++) {
//        for (int j = 0; j < array.length - 1 - i; j++) {
//            if(array[j] > array[j + 1]) { // compare 2 elements of array, if left > right => swap
//                //swapping
//                int temp = array[j];
//                array[j] = array[j + 1];
//                array[j + 1] = temp;
//            }
//        }
//    }
//}


import java.util.Random;

public class BubbleSortClassik {

    public static int bubbleSort(int[] array) {
        int operationsCount = 0; // Счётчик операций

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Считаем операцию сравнения
                operationsCount++;
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // Считаем операцию обмена
                    operationsCount++;
                }
            }
        }
        // Возвращаем количество операций
        return operationsCount;
    }

    public static void main(String[] args) {
        // Размеры массивов для тестирования
        int[] sizes = {10, 100, 1000};
        Random random = new Random();

        for (int size : sizes) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                // Заполняем числами от 0 до 1000
                array[i] = random.nextInt(1001);
            }

            // Копируем массив для сохранения оригинальных данных для разных тестов
            int[] arrayCopy = array.clone();

            int operationsCount = bubbleSort(arrayCopy);

            System.out.println("Размер массива: " + size + ", операций сортировки: " + operationsCount);
        }
    }
}
