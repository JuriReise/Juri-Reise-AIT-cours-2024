package Houmwork_06;

import java.util.*;

public class TimeOfYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number:");
        int month = scanner.nextInt();
        String res;
        switch (month) {
            case 1:
            case 2:
            case 3:
                res = "Это Ночь ";
                break;
            case 4:
            case 5:
            case 6:
                res = "Это Ранне Утро";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                res = "Это Нормальное Утро";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                res = "Это День";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                res = "Это вечер";
                break;
            case 22:
            case 23:
            case 24:
                res = "Это поздний вечер";
                break;
            default:
                res = "falsh";
        }
        System.out.println(res);
    } // end of main

} // end of class
