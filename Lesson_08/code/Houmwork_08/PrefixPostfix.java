package Houmwork_08;

public class PrefixPostfix {
    // Чему равно значение выражения x-- + --x при x = 5?
    // Проверьте свое предположение с помощью кода.

    public static void main(String[] args) {
        int X = 5; // сумма X к которой я должен прийти
        int j = X--;
        int Z = --X;


        System.out.println(j);
        System.out.println(Z);
        System.out.println(j+Z);





    } // end of main

} // end of class
