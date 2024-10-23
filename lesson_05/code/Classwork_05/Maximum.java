package Classwork_05;

// Написать метод, возвращающий максимальное из двух целых чисел.

public class Maximum {

    public static void main(String[] args) {
        int a = 45;
        int b = 74;

        // здесь будет вызов метода
        int max = maximum(a, b);
        System.out.println("Maximum = " + max);

    }

    // здесь будет метод
    private static int maximum(int a, int b){
        int max;
        if(a >= b){
          max = a;
        } else {
            max = b;
        }
     return max;
    }

}
