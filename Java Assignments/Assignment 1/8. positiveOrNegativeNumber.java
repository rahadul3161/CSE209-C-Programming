//Write a Java Program to check if a number is Positive or Negative.

import java.util.*;
public class positiveOrNegativeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (num>0){
            System.out.println("The number is Positive.");
        }
        else if (num<0) {
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("The number is 0.");
        }
    }
}
