package Classwork_11;

// Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] toss = new  int[20];
        for (int i = 0; i < toss.length; i++) {
            // нужно вставить датчик случа  ных чисел
            // вызываем его
            int n = random.nextInt(6) + 1; // диапазон от 0 до 5 +1 =6
            System.out.print(n + " ");

        }
        System.out.println();


    } // end of main



} // end of class
