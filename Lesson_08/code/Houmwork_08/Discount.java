package Houmwork_08;

//  В кинотеатре есть разные типы билетов:
//  стандартный, студенческий (-10%)
//  для пенсионеров(-25%).
//  Каждый тип билета имеет свою стоимость.
//  Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
//  Создайте метод calculateTicketPrice,
//  который принимает возраст клиента, статус студента и флаг VIP-места,
//  а возвращает итоговую стоимость билета.
//  Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.*;

public class Discount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Привет! Выберите фильм для просмотра:");// список фильмов
        System.out.println("1. Сладкий ноябрь");
        System.out.println("2. DOOM");
        System.out.println("3. Гадкий я");


        System.out.print("Введите номер фильма (1-3): ");// Выбор фильма
        int movieOpt = scanner.nextInt();

        String movie = "";
        if (movieOpt == 1) {
            movie = "Сладкий ноябрь";
        } else if (movieOpt == 2) {
            movie = "ДУМ";
        } else if (movieOpt == 3) {
            movie = "Гадкий я";
        } else {
            System.out.println("Вы сделали не верный выбор, повторите ввод");
            return;
        }
        System.out.println("Вы выбрали фильм: " + movie);

        // Выбор типа билета
        System.out.println("Выберите вариант билета:");
        System.out.println("1. Обычный (30$)");
        System.out.println("2. VIP (45$)");
        System.out.print("Введите номер вашего выбора (1-2): ");
        int ticketOpt = scanner.nextInt();
        scanner.nextLine();  // Очищаем буфер

        double vip = (ticketOpt == 2) ? 45 : 30;

        System.out.println("Вы студент или пенсионер?");
        System.out.println("1. Студент");
        System.out.println("2. Пенсионер");
        System.out.println("3. Обычный посетитель");
        System.out.print("Введите номер вашего статуса (1-3): ");
        int Choice = scanner.nextInt();

        double discount; // 10% и 25% скидка
        if (Choice == 1) {
            discount = 0.10; // 10% скидка
        } else if (Choice == 2) {
            discount = 0.25; // 25% скидка
        } else {
            discount = 0; // Нет скидки
        }

        // рассчёт итогововй стоимости билета
        double price = vip * (1 - discount);

        // Вывод окончательной цены
        System.out.println("Стоимость вашего билета: " + price + " долларов.");
        System.out.println("Приятного просмотра!");


    } // end of main

} //end of class