//Problem-1: Write a Java program to print your name.

import java.util.*;
public class printName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.next();
        System.out.println("Your Name is:"+name);
    }
    
}
