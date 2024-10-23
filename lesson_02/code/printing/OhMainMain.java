package printing;

public class OhMainMain {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        System.out.println("Method 1 is Start");
        method2();
        System.out.println("Method 1 Ende");
    }
    public static void method2(){
        System.out.println("Method 2 Start");
        method3();
        System.out.println("Method 2 Ende");
    }
    public static void method3(){
        System.out.println("Method 3 Start");
        System.out.println("Method 3 Ende");

    }
}
