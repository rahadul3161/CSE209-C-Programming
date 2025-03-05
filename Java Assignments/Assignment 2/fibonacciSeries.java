//Write a Java program for Fibonacci series.

public class fibonacciSeries {
  public static void main(String[] args) {
    int n=15, firstnum=0, secondnum=1;
    System.out.print(firstnum+ ", ");

    for (int i=0; i<=n; i++) {
      int nextnum=firstnum+secondnum;
      firstnum=secondnum;
      secondnum=nextnum;
      System.out.print(nextnum+", ");
    }
  }
}
