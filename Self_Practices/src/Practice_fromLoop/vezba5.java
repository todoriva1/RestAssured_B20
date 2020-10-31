package Practice_fromLoop;
//opet isti zadatak vezbamo
/*
write a program that can ask the user enter a number for five times and the returns the sum of those five numbers

 */

import java.util.Scanner;

public class vezba5 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int sum = 0;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter number: ");
            int num = scan.nextInt();
            sum+=num;
        }

        System.out.println(sum);


    }
}
