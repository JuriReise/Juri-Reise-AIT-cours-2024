package Classwork_20.application;

// объяснение public static void main(String[] args) {     }

public class ArgAppl {
    public static void main(String[] args) {
        // метод МАИН получает аргументы
        // Стринг [] args - это массив с именем массива args - это имя. Ну вот просто так назвали и приняли как есть!
        String str1 = args[0];
        // int n1 = Integer.parseInt(str1);

        String str2 = args[1];
        // int n2 = Integer.parseInt(str2);
        // System.out.println(n1 * n2);
        System.out.println(str1 + " and " + str2);

    }
}
