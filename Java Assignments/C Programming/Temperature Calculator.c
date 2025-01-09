#include <stdio.h>
int main() {
    int choice;
    float temp, ans1, ans2;
    printf("This is a Temperature Calculator. Please, enter your choices from (1-3) which types of temperature you want to input to get the another two output temperatures:\n");
    printf("\t1. Celsius\n");
    printf("\t2. Fahrenheit\n");
    printf("\t3. Kelvin\n");
    printf("Please, select any of the temperature types: ");
    scanf("%d", &choice);
    
    switch (choice) {
        case 1: // calculation from celsius
            printf("\n\nPlease, enter temperature in Celsius: \n");
            scanf("%f", &temp);
            ans1=(temp*9/5)+32;//for fahrenheit
            ans2=temp+273.15;//for kelvin
            printf("\nFahrenheit: %.2f\n",ans1);
            printf("Kelvin: %.2f\n",ans2);
            break;
        case 2: //calculation from fahrenheit
            printf("Please, enter temperature in Fahrenheit: \n");
            scanf("%f",&temp);
            ans1=(temp-32)*5/9;//for celsius
            ans2=ans1+273.15;//for celvin
            printf("\nCelsius: %.2f\n",ans1);
            printf("Kelvin: %.2f\n",ans2);
            break;
        case 3: // Kelvin
            printf("Please, enter temperature in Kelvin: \n");
            scanf("%f", &temp);
            ans1=temp-273.15;//for celsius
            ans2=(ans1* 9 / 5) + 32;//for fahrenheit
            printf("Celsius: %.2f\n",ans1);
            printf("Fahrenheit: %.2f\n",ans2);
            break;
        default:
            printf("Your choice is nvalid. Please select from 1, 2 or 3.\n");
            break;
    }
    return 0;
}
