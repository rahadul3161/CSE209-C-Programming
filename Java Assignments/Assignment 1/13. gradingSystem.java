/*Write a Java program for the following grading system.
Note: Percentage>=90% : Grade A
Percentage>=80% : Grade B
Percentage>=70% : Grade C
Percentage>=60% : Grade D
Percentage>=40% : Grade E
Percentage< 40% : Grade F */

import java.util.*;
public class gradingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark what you got: ");
        int mark=sc.nextInt();
        char grade;
        
        if (mark >= 90) {
            grade = 'A';
        } 
        else if (mark>= 80) {
            grade = 'B';
        } 
        else if (mark >= 70) {
            grade = 'C';
        } 
        else if (mark >= 60) {
            grade = 'D';
        } 
        else if (mark >= 40) {
            grade = 'E';
        } 
        else {
            grade = 'F';
        }
        System.out.println("The grade for mark "+mark+" is: " + grade);
    }
}


