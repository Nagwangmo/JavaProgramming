package day03_Variables;

public class Circle {
    public static void main(String[] args) {
        //pi, RADIUS, DIAMETER, AREA, PERIMETER
        double PI = 3.14;
        double radius = 3.5;
        double diameter = radius *2;
        double area = radius * radius * PI;
        double perimeter = diameter * PI;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + area);

    }


}
/* Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
        Hints:  PI = 3.14
        area = radius * radius * PI
        Perimeter = 2 * radius * PI

 */