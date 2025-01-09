// 7. Write a Java program to find the sum of even numbers in an integer array.

public class Rahadul_7 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int length = array.length;
        int sum = 0;
        for (int i=0; i<=length; i++) {
            if (i%2==0) {
                sum=sum+i;
        }};
        System.out.println("Sum of even numbers in an integer array is: "+sum);
    }
}