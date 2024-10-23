package Houmwork;
// Подбросьте монетку 100 раз
// подсчитайте, сколько раз выпал орел и сколько решка.
// Запишите результаты в массив.
// Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class Coins {
    public static void main(String[] args) {

        int[] tossSumm = new int[100]; // массив с количеством бросков
        int Eagle = 0;
        int Tails = 0;
        Random random = new Random();

        // Бросаем
        // 1 - Eagle
        // 0 Tails
        for (int i = 0; i < tossSumm.length; i++) {
            tossSumm[i] = random.nextInt(2);
            if (tossSumm[i] == 1) {
                Eagle++;
            } else {
                Tails++;
            }
        }


        double eagleFalls = (double) Eagle / tossSumm.length;
        double tailsFalls = (double) Tails / tossSumm.length;

        System.out.printf("Вероятность выпадения орла: %.2f%%%n", eagleFalls * 100);
        System.out.printf("Вероятность выпадения решки: %.2f%%%n", tailsFalls * 100);

        System.out.println("Так как орел выпал: " + Eagle + " раз");
        System.out.println("Так как Решка выпала: " + Tails + " раз");

    }


} // end of class
