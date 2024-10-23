package Houmworck;
// Задание 2. Напишите программу, которая запрашивает строку от пользователя и затем:
//    сообщает сколько слов в строке *
//    сообщает сколько букв (символов) в строке
//    печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // вводим сканер для запроса строки

        Scanner scann = new Scanner(System.in);
        System.out.println("Please input your string: ");
        String inputLn = scann.nextLine();

        // Сколько слов в предложении

        String[] wordsSplit = inputLn.split("\\s+");
        int wordsQuantity = wordsSplit.length;
        System.out.println("Количество слов в Вашей строке: " + inputLn + " составляет :");
        System.out.println(+wordsQuantity);
        System.out.println();

        // сколько букв (символов) в строке
        int lettersQuantity = 0;
        for (char l : inputLn.toCharArray()) {
            if (Character.isLetter(l)) { // Проверяем, является ли символ буквой
                lettersQuantity++;

            } // end of if

        } // end of for

        System.out.println("Количество букв (символов) в Вашей строке составляет: " + lettersQuantity);
        System.out.println();


        // Строка задом наперед (начиная с последнего слова)
        System.out.print("Ваша строка задом наперед выглядит так: ");
        for (int i = wordsSplit.length - 1; i >= 0; i--) {
        System.out.print(wordsSplit[i] + " ");

        } // end pf for


    } // end of main

} // end of class
