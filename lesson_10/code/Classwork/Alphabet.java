package Classwork;

public class Alphabet {

    public static void main(String[] args) {

        char[] charAlphabet = new char[26];  // длинна массивов, (но индексы от 0 до 25)
        // запоминаем что томмер ноль - это 1
        // а номер последнего значения -1
        // длинна массива = 20

        // вод и заполнения массива
        for (int i = 0; i < charAlphabet.length; i++) {

        charAlphabet[i] = (char) (65 + i);


        } // end of array daten

        // печать массива
        for (int i = 0; i < charAlphabet.length; i++) {
            System.out.print(charAlphabet[i] + " ");

        } // end print array

       
    } // end of main

} // end of class
