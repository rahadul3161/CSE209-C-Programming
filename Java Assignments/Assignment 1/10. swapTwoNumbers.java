//Write a Java program to swap two numbers.

import java.util.*;
public class swapTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values at the below");
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println("Before Swap; A = "+A);       
        System.out.println("Before Swap; B = "+B);
        System.out.println("============================");

        int temp=A;
        A=B;
        B=temp;
        System.out.println("After Swap; A = "+A);
        System.out.println("After Swap; B = "+B);
    }
}