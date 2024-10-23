package Classwork_14;


public class ArrayMethodsAllAppl {

    public static void main(String[] args) {

        // create array with random numbers
        int[] myArray = ArrayMethodsAll.fillArray(0, 100, 10);

        // print array
        ArrayMethodsAll.printArray(myArray);

        // sort array
        ArrayMethodsAll.bubbleSort(myArray);

        // print array
        ArrayMethodsAll.printArray(myArray);

        int[] newArray = ArrayMethodsAll.fillArray(-100, 100, 20);
        ArrayMethodsAll.printArray(newArray);
        ArrayMethodsAll.reverseArray(newArray);
        ArrayMethodsAll.printArray(newArray);


//        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);
//
//        ArrayMethods.printArray(myArray);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number for searching: ");
//        int n = scanner.nextInt();
//
//        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isInArray);

//        int[] myArray = {10, 20, 30, 40, 50};
//        System.out.println(ArrayMethods.linearSearch(myArray, 10));
//        System.out.println(ArrayMethods.linearSearch(myArray, 100));
//
//        System.out.println("-------------------------------------------");
//
//        int index = ArrayMethods.binarySearch(myArray, 20);
//        System.out.println(index);

    }

}