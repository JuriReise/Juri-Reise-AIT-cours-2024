package Classwork_03;
// Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
// -какие переменные участвовали;
// -какие действия с ними выполнялись;
// -что получилось в резульате;
public class MathOperations {
    public static void main(String[] args){
        int x = 38;
        int y = 63;

        System.out.println(x+y);

        int res = x + y;

        System.out.println("x = " + x + " складываем с y = " + y +  " получаем= " + res);
        int res2 = x - y;
        System.out.println("x = " + x + " вычитаем с  y = " + y +  " получаем=  " + res2);
        int res3 = x / y;
        System.out.println("y = " + y + " / x = " + x +" = " + res3);
        // деленик % целых чисель, даёт остаток от деления
        int res4 = y % x;
        System.out.println("y = " + y + " % x = " + x +" = " + res4);

    } // end of main


} // end of Class
