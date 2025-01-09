//Write a Java program to find a maximum of three numbers.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers below.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("Largest number: " +largest);
    }
}
