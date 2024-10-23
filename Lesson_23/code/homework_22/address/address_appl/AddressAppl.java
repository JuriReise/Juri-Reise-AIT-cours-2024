package homework_22.address.address_appl;

import java.util.Scanner;

public class AddressAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Street: ");
        String street = scanner.nextLine();
        System.out.print("Enter house Nr.: ");
        int number = scanner.nextInt();
        System.out.print("Enter post code: ");
        scanner.nextLine();
        String postCode = scanner.nextLine();
        System.out.print("Enter name of the city: ");
        String city = scanner.nextLine();
        Address address1 = new Address(street, number, postCode, city);
        System.out.println(address1.toString());
    }
}
