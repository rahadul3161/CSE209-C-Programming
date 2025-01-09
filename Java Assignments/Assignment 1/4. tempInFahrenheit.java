//Problem:- 4, Write a Java program to change temperature from Fahrenheit to Celsius.

import java.util.*;
public class tempInFahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in Fahrenheit: ");
        int fahr = sc.nextInt();
        int cel = ((fahr-32)*5)/9;
        System.out.print("In Celsius: "+cel);
        
    }
}