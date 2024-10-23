package Houmwork;
// У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?

import java.util.*;

public class Shooter {

    public static void main(String[] args) {
        Random random = new Random();
        int totalPoints = 0; // Общее количество очков
        boolean tenner = false; // попадание в цель

        // Моделируем 10 выстрелов
        for (int i = 0; i < 10; i++) {
            int shot = random.nextInt(11); // Работа самого генератора сл. чис. от 0 до границы 11- те.  bound 10 (включительно)

            if (shot == 10) {
                totalPoints += 10; // Если попал в центр, добавляем 10 очков (+= добавть к или увеличить на
                tenner = true; // Устанавливаем флаг попадания в центр
            } else {
                totalPoints += shot; // Добавляем очки за попадание
            }

            // Выводим результат каждого выстрела
            System.out.println("Выстрел " + (i + 1) + ": " + shot + " очков");
        }

        // Выводим общий результат
        System.out.println("Общее количество очков: " + totalPoints);
        if (tenner) {
            System.out.println("Стрелок попал в центр мишени хотя бы раз!");
        } else {
            System.out.println("Стрелок не попал в центр мишени.");
        }


    } // end of main




} // End of class
