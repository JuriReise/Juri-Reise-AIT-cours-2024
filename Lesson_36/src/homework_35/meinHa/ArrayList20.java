package homework_35.meinHa;
//Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10. Удалите из полученного списка дубликаты.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayList20 {

        public static void main(String[] args) {
            ArrayList<Integer> numberList = new ArrayList<>();
            Random random = new Random();

            // Заполняем ArrayList 20-ю случайными числами от 1 до 10
            for (int i = 0; i < 20; i++) {
                numberList.add(random.nextInt(10) + 1); // Генерация числа от 1 до 10
            }

            System.out.println("Исходный список: " + numberList);

            // Удаляем дубликаты, используя Set
            Set<Integer> uniqueNumbers = new HashSet<>(numberList);
            numberList = new ArrayList<>(uniqueNumbers);

            System.out.println("Список без дубликатов: " + numberList);
        }
    }

