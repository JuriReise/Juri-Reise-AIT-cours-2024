package Classwork_03;

public class Rectangle {

    public static void main(String[] args){

        double a = 125.37d;
        double b = 35.0;

        // solution 1
        double area = a * b;
        System.out.println("Area of rectangle: " + area);

        // solution with metod

        area = areaOffRectangle(a, b);
        System.out.println(area);


    } // end of main

    public static double areaOffRectangle(double x, double y){
        double res = x * y;
        return res;
    }

} // end of class
