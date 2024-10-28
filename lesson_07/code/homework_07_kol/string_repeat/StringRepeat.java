package homework_07_kol.string_repeat;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        System.out.println("Input number of repetition: ");
        int rep = scanner.nextInt();

        while ( rep > 0 ){
            System.out.print(str + " , " + rep);
            rep--;
            System.out.println();
        }
    }
}
