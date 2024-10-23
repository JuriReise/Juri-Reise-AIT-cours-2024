package Classwork_07_Cycles;

public class Apples {

    public static void main(String[] args) {

    int apples = 30;  // начальные данные
    int count = 0; // параметр цикла в переводе счётчик
    int startApples = 30;

                        // apples можно заменить на startApples или количество яблок по заданию 30
        while (count < 30){

            System.out.println("Take one apples from the basket.");
            apples = apples - 1;
            count = count + 1;
            System.out.println("Now we haven only " + apples + " apples in the basket");
        }

        System.out.println("The job is done!" + count + " apples added in the pie");

    } // end of main

} // end of class
