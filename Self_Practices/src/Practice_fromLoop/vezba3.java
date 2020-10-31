package Practice_fromLoop;
/*
write a program that can ask the user enter a number for five times
and the returns the sum of those five numbers

 */

import java.util.Scanner;

public class vezba3 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();
        System.out.println("Enter fourth number:");
        int num4 = scan.nextInt();
        System.out.println("Enter fifth number:");
        int num5 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("Sum of those number is: " +sum);

        */

        // moze ovako dole sa Loop-om

        Scanner scan = new Scanner(System.in);

        int sum= 0;
        for(int i = 1; i<=5; i++){
            System.out.println("Enter number: ");
            int num = scan.nextInt();
            sum+= num;
            System.out.println(sum);
        }



    }
}
