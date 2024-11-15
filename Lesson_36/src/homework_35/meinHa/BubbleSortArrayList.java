package homework_35.meinHa;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSortArrayList {
    public static int bubbleSort(ArrayList<Integer> list) {
        // Счетчик операций
        int operationsCount = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                // Считаем операцию сравнения
                operationsCount++;
                if (list.get(j) > list.get(j + 1)) {
                    // Обмен элементов
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    // Считаем операцию обмена
                    operationsCount++;
                }
            }
        }
        // Возвращаем количество операций
        return operationsCount;
    }

    public static void main(String[] args) {
        // Размеры ArrayList для тестирования
        int[] sizes = {10, 100, 1000};
        Random random = new Random();

        for (int size : sizes) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // Заполняем числами от 0 до 1000
                list.add(random.nextInt(1001));
            }

            // Создаем копию ArrayList, чтобы не изменять оригинальный список
            ArrayList<Integer> listCopy = new ArrayList<>(list);

            int operationsCount = bubbleSort(listCopy);

            System.out.println("Размер ArrayList: " + size + ", операций сортировки: " + operationsCount);
        }
    }
}

