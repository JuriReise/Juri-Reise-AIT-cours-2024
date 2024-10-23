package Houmwork;

public class Maximus {
    public static void main(String[] args) {

        // Нужно три параметра
        int a = 18;
        int b = 31;
        int c = 25;

        // отношение переменных
        // если Если a >= b, то переходим к a>= c то, иначе всравниваем Б и С

        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);


        System.out.println("Максимальное число: " + max);


    } // end om main


} // end of main
