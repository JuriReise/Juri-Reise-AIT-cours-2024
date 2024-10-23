package Classwork_13.array_methods;


public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = {50, 40, 30, 20, 10};
        System.out.println(ArrayMethods.linearCearch(myArray, 10));
        System.out.println(ArrayMethods.linearCearch(myArray, 100));

        System.out.println("--------------------------------------------------");

        int inex = ArrayMethods.binarySearch(myArray, 10);
        System.out.println(inex);

    }


}
