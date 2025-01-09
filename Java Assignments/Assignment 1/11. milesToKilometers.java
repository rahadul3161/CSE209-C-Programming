//Write a Java program to convert miles to kilometers.

import java.util.*;
public class milesToKilometers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double mile = sc.nextDouble();
        double kilo = mile*1.60934;
        System.out.println(mile+ " miles is equal to "+kilo+" Kilometers.");
    }
}
