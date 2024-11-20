package objectorienteddemo;

import java.util.PrimitiveIterator;

public class Staff {

    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    public void printMessage(){
        System.out.println("Calculating Pay…");

    }
    public int calculatePay(){
        printMessage();
        int staffPay;
        staffPay = hoursWorked * hourlyRate ;
        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }

}
