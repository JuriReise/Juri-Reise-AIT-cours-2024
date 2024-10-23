package Houmwork;

import java.util.*;

public class Uhren {

    // В программе задаются часы, минуты и секунды.
    // Нужно вывести общее количество секунд, прошедших с начала суток.
    // Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

    // Создаём метод для подсчёта секунд. Расписываем время

    public static int sumSeconds(int hours, int minutes, int seconds) {

        return (hours * 3600) + (minutes * 60) + seconds;

    } // end of main int

        // Делаем приглашение для ввода времени

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод времени пользователем
        System.out.print("Введите пожалуйста количество часов: ");
        int hours = scanner.nextInt();

        System.out.print("Введите пожалуйста количество минут: ");
        int minutes = scanner.nextInt();

        System.out.print("Введите пожалуйста количество секунд: ");
        int seconds = scanner.nextInt();

        // Вызов метода для расчета и вывод результата
        int totalSeconds = sumSeconds(hours, minutes, seconds);
        System.out.println("С начала суток прошло: " + totalSeconds + " Секунд ");


    } // end of main void
} // end of class
