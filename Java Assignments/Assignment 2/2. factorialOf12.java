//Write a Java program to calculate factorial of 12.

public class factorialOf12 {
  public static void main(String[] args) {
    int fact=1, number=12;
    for(int i=1; i<=number; i++) {
      fact=fact*i;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
  }
}
