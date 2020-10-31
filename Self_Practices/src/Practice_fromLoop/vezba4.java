package Practice_fromLoop;

import java.util.Scanner;

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */
public class vezba4{
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for( int  i = 0; i<=5;){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter number:");
        num = scan.nextInt();
        sum+= num;
        if (num>0){
            System.out.println("Sum of numbers is: " + sum);
        }else{
            break;
        }

        }

    }
}
