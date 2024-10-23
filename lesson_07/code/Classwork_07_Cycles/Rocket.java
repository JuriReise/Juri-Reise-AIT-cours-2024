package Classwork_07_Cycles;

// Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        int countDown = 10;
        int count = 0;
        int startCount = 1;

        System.out.println("We have " + countDown+ " sec before START ");

        while (countDown > 0) {
            countDown --;
            System.out.println("We have " + countDown+ " till START ");

        }
        System.out.println("Here we ga!");

    } // end of main

} // end of class
