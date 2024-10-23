package Classwork_05;

//**Задание 4:**
// Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {

    public static void main(String[] args) {

        int a = 34;
        int b = 17;

        boolean res = isDivided(a, b);
        System.out.println("a = " + a + ", b = " + b + " is divided: " + res);

    }

    public static boolean isDivided(int a, int b){
        return a % b == 0;
    }

}
