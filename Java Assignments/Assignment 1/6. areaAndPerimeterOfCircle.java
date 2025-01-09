//Write a Java program to find the area and perimeter of a circle.

import java.util.*;
public class areaAndPerimeterOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius = sc.nextDouble();
        double area = (radius*radius)*Math.PI;
        double perimeter = 2*Math.PI*radius;
        System.out.println("The area of a circle is: "+area);
        System.out.println("The perimeter of a circle is: "+perimeter);
    }
}
