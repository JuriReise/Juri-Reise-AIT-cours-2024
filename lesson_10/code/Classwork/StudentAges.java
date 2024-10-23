package Classwork;

// Создайте массив, который содержит возраст студентов группы.
//- какой возраст максимальный?
//- какой возраст минимальный?

public class StudentAges {
    public static void main(String[] args) {
        int [] age = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 35, 34, 41, 18, 43};
        int min = age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] < min){
                min = age[i];

            }

        }


    } // end of main


} // end of class
