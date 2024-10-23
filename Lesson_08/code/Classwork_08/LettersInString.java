package Classwork_08;

// Задача 1.
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.

import java.util.*;

public class LettersInString {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); // шаг алг
            System.out.println("Input string: "); // шаг алг
            String str = scanner.nextLine(); // шаг алг

            System.out.println(str);

            int l = str.length(); // шаг алг
            System.out.println(l); // шаг алг
            int i =0;

            // сереневенькая бесперспективация
            // 012345

            while ( i < l) {
                System.out.println(str.charAt(i));
                i++; // i= i + 1;


            } // end of loop

    } // end of main

} // end of class
