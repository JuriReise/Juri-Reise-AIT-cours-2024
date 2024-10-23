package Houmwork;

public class MaximusIfUndElse {
    public static void main(String[] args) {

        // Нужно три параметра
        int a = 18;
        int b = 31;
        int c = 25;

        int max;

        // Отношение переменных

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }


        System.out.println("Максимальное число: " + max);


    } // end om main


} // end of main
