package Houmwork_12;

public class Factorial {
    public static void main(String[] args) {
        int n = 0; // Вводите значение n
        int factorial = 1;

        for (n = 0; n < 13; n++) { // 13 - это максимальное значение, при котором factorial не станет отрицательным
            factorial *= n > 0 ? n : 1; // Учитываем n = 0
            System.out.println("Факториал " + n + "! = " + factorial);
        }

        // Проверка переполнения
        n = 13;
        factorial = 1;
        while (true) {
            factorial *= n++;
            if (factorial < 0) {
                System.out.println("Переполнение произошло на n = " + (n - 1));
                break;
            }
            System.out.println("Факториал " + (n - 1) + "! = " + factorial);
        }
    }
}




