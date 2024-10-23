package Classwork_19.compare_string;
// равенство строк - как понять?
public class CampareStringAppl {
    public static void main(String[] args) {

        int x =5;
        int y =5;

        boolean chekeer = (x == y); // Campare Steck
        System.out.println(chekeer); // check

        String str1 = " Europe "; // str1 - Steck ----> (Link) Europe - Heap
        String str2 = " Europe "; // str2 - Steck ----> (Link) Europe - Heap
        System.out.println("----------------------------------------------");

        chekeer = (str1 == str2); // Campare String (Heap)
        System.out.println(chekeer); // check

        String str3 = new String(" Europe "); // create new object
        chekeer = (str1 == str3);
        System.out.println("-----------------------------------------------");
        System.out.println(chekeer); // false, because links NOT equals!
        System.out.println("-----------------------------------------------");

        chekeer = str1.equals(str3); // compare String with metod equals
        System.out.println(chekeer);
        System.out.println("------------------------------------------------");


    }  // end of main
} // end of class
