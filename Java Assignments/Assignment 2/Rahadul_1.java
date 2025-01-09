//1. Write a Java program to check whether a number is Buzz or not.

public class Rahadul_1 {
    public static void main(String[] args) {
        int num = 48;
        if ((num%10==7) || (num%7==0)) {
            System.out.println("This is a Buzz.");}
        else {
            System.out.println("This is not a Buzz.");}
    }
}