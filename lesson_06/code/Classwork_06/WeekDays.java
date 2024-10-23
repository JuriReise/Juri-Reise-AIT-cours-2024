package Classwork_06;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");

        int weekDay = scanner;

        switch (weekDay)
            case 1 -> {
                System.out.println("This is Monday .");
            }
        case 2 -> {
            System.out.println("This is Tuesday .");
        }
        case 3 -> {
            System.out.println("This is Wednesday .");
        }
        case 4 -> {
            System.out.println("This is Thursday .");
        }
        case 5 -> {
            System.out.println("This is Friday.");
        }
        case 6 -> {
            System.out.println("This is Saturday .");
        }
        case 7 -> {
            System.out.println("This is Sunday .");
        }
        default: {
            System.out.println("Wrong input");

switch (weekDay){
case 1,2,3,4,5 -> {
    System.out.println("This is working day");
}
case 6,7 ->{
    System.out.println("This is wohenende!");
}
    default: {
        System.out.println("Wrong input");
}
        }

    }

} // end of case
