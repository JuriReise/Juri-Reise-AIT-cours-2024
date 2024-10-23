package Houmwork_08;

public class AlleMitWhile {

    public static void main(String[] args) {

        // while
        System.out.println(" Вариант с while:");
        int number = 13;
        while (number < 200) {
            System.out.println(number);
            number += 13;
        }

        // do-while
        System.out.println("Вариант с do-while:");
        number = 13;
        do {
            System.out.println(number);
            number += 13;
        } while (number < 200);

        
    } // end of main

} // end of class
