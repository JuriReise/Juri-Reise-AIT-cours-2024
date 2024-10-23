package Classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        int k = 123456789;
        System.out.println(k);
        System.out.println("------------------------------------");

        Integer integer = Integer.parseInt("123456789");
        System.out.println(integer);
        integer = integer +15;
        System.out.println(integer);

        int value1=123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("------------------------------------");

        //автоупаковка
        Integer x = 5;
        System.out.println(x * 10);

        // автораспаковка
        integer =7;
        int z = x + integer;
        System.out.println(z);
        System.out.println("------------------------------------");

        BigInteger bigInteger = new BigInteger("1234567890123456789012345678901234567890");
                System.out.println(bigInteger);
        System.out.println("------------------------------------");

        //кол-во цифр в числе, 2я версия решения
        int b = 1234567890;
        Integer bInt = b; // упаковка Int в Intiger
        // смена типа
        String str = bInt.toString(); // число изменили на Стринг
        int l = str.length();
        System.out.println("Nubber: " + b + " contains " + l + " digits");
        System.out.println("------------------------------------");
        System.out.println("Max value of int: " + bInt.MAX_VALUE);
        System.out.println("Max value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of dounle: " + d.MAX_VALUE);
        System.out.println("Max value of double: " + d.MIN_VALUE);
        System.out.println("------------------------------------");

        // атематические вычисления
        int n = 20;
        Integer m = 10;
        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);
        System.out.printf(" Lenth of circle: %.2f ", circleLenth);
        System.out.println();
        System.out.println("------------------------------------");

        // NaN и Infinite
        double p = 20 / 0.0; //можно поменять на Double
        if (Double.isNaN(p) || Double.isInfinite(p)){
        System.out.println(" Wrong operation, division by Zero ");
        }else System.out.println(p);

        System.out.println("------------------------------------");

        // Перевод String в число
        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);

        System.out.println("------------------------------------");







    }

}
