//Write a Java program to change temperature from Celsius to Fahrenheit and Kelvin.

#include<stdio.h>
int main() {
    int c, F, k;
    printf("You can convert temperature from Celsius to Fahrenheit and Kelvin. So,\n");
    printf(" enter the temperature in Celsius: ");
    scanf("%d",&c);

    F = (c*9/5)+32;
    k = c+273.15;
    
    printf("\nThe temperature in Fahrenheit is  : %d",F);
    printf("\nThe temperature in Kelvin is      : %d",k);
    printf("\n\n(Thanks)");


}