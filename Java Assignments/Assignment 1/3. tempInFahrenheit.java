//Problem:- 3, Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.*;
public class tempInFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in Celsius: ");
        int cel = sc.nextInt();
        int Fahr = (9*cel/5)+32;
        System.out.println("Temperature in Fahrenheir: "+Fahr);
    }
}