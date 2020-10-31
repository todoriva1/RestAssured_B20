package Replit2;
/*

Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.
 */

import java.util.Scanner;

public class vending_Machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();
        int dimes = 5;
        int nickels = 5;
        int quarter = 5;

        int change = 100 -itemPrice;
        quarter = change /25;

        int remainingCentsAfterQuarter = change % 25;
        dimes = remainingCentsAfterQuarter /10;

        int remainingCentsAfterDime = remainingCentsAfterQuarter %10;
        nickels = remainingCentsAfterDime /5;



        boolean acceptPrice = itemPrice%5 == 0;
        boolean priceRange = itemPrice > 25 && itemPrice <100;


        if(!priceRange){
            System.out.println("Invalid price");
        }else if(!acceptPrice){
            System.out.println("Invalid price");
        }else if(acceptPrice && priceRange){
            System.out.println("Your change is "+quarter+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");

        }

    }
}
