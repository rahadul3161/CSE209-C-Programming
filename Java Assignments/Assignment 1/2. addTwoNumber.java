//Problem-2: Write a Java program to add two numbers.

import java.util.*;
public class addTwoNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values below.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" value:"+sum);
    }
    
}
