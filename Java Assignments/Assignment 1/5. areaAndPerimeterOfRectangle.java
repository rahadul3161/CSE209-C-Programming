//Write a Java program to find the area and perimeter of a rectangle.

import java.util.*;
public class areaAndPerimeterOfRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l=sc.nextInt();
    int w=sc.nextInt();
    int area = l*w;
    System.out.println("Area of the rectangle is: "+area);
    int perimeter = (l+w)*2;
    System.out.println("Perimeter of the rectangle is: "+perimeter);
  }
}
