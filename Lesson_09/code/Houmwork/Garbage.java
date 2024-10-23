package Houmwork;


import java.util.Scanner;

public class Garbage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Garbage;

        System.out.println("Добро пожаловать в GarbageBot!");
        System.out.println("Пожалуйста, выберите тип отходов:");
        System.out.println("1. Упаковки - Gelb (желтый бак)");
        System.out.println("2. Пищевые отходы - BIO Müll (коричневый бак)");
        System.out.println("3. Бумага - Papier (зеленый бак)");
        System.out.println("4. Прочие отходы - Rest (черный бак)");
        System.out.println("0. Выход");

        do {
            System.out.print("Вы выбрали: ");
            Garbage = scanner.nextInt();

            switch (Garbage) {
                case 1:
                    System.out.println("бросьте упаковки в желтый бак.");
                    break;
                case 2:
                    System.out.println("Это пищевые отходы бросьте мусор коричневый бак.");
                    break;
                case 3:
                    System.out.println("Бросьте бумагу в зеленый бак.");
                    break;
                case 4:
                    System.out.println("Это отходы для уничтожения, бросьте в черный бак.");
                    break;
                case 0:
                    System.out.println("Выход из программы. Спасибо!");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }

        } while (Garbage != 0);


    } // end of main

} // end of class


