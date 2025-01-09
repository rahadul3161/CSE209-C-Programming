//Write a Java program to change temperature from Celsius to Fahrenheit.
//Write a C program to add two numbers.

#include<stdio.h>
int main(){
    int a,b, c,d,e,f,g;
    printf("Only 2 number is allowed to use this calculator.\n\n");
    printf("Enter the 1st number: ");
    scanf("%d",&a);
    printf("Enter the 2nd number: ");
    scanf("%d",&b);
    c = a+b; 
    d = a-b;
    e = a*b;
    f = a/b;
    g = c/2;
    printf("\nAddition is        : %d\n",c);
    printf("Subtraction is     : %d\n",d);
    printf("Multiplication is  : %d\n",e);
    printf("Division is        : %d\n",f);
    printf("Average is         : %d\n",g);
    return 0;
}