package homework_07_kol.sum_of_digits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = scanner.nextInt();
        int count = 0;
        int sumOfDigit = 0;
        int digit = 0;

        while (num > 0){
            digit = num % 10;
            num /= 10;
            sumOfDigit += digit;
            count ++;
        }
        System.out.println("Sum of digits = " + sumOfDigit);
    }
}
