import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = new int[]{10, 20, 30, 40, 50};
        int [] myArray2 = new int[]{10, 20, 30, 40, 50};
        int [] myArray3 = new int[]{10, 20, 90, 40, 50};
        int [] desteny = Arrays.copyOfRange(myArray2, 0, 5);
        System.out.println(Arrays.toString(desteny));

        myArray[0] = 15;
        myArray[2] = myArray[2] + 11;
        myArray[3] = myArray[3] + 15;
        System.out.println(myArray[2]);
        System.out.println(myArray.length);
        boolean result1 = Arrays.equals(myArray, myArray2);
        boolean result2 = Arrays.equals(myArray3, myArray2);
        System.out.printf(Arrays.toString(myArray));
        System.out.println();

        System.out.println(result1);
        System.out.println(result2);

        int[] arrayForSorting = {50, 13, -2, 35, -10, 100};
        Arrays.sort(arrayForSorting);
        System.out.println(Arrays.toString(arrayForSorting));
        System.out.println("The sum of 50 and 2 is " +
                (50 + 2) + ".");
        int[] myInt = {21, 23, 34, 45, 56, 78, 99, 100};
        int foundIndex = Arrays.binarySearch(myInt, 100);
        System.out.println(foundIndex);
    }

}