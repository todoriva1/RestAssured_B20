package Replit;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
        Write a program that will help me to buy something and display leftover balance after purchase.
         If item is not in the list, display message: "Invalid item!".
         If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items
*/
        String item = scan.next();
        String item2 = "Charger";
        int giftCard = 100;
        int itemPrice = 40;
        int carrentBalance = giftCard - itemPrice;
        boolean largerthen100 = giftCard > 100;

        if(item.equals ("USB cable") && itemPrice == 10) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+carrentBalance);
        }else if (item.equals("Blanket") && itemPrice == 60) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("Socks") && itemPrice == 5) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("Hat") && itemPrice == 25) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("Pants") && itemPrice == 50) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("HeadPhones") && itemPrice == 30) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("Charger") && itemPrice == 15) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if (item.equals("Pillow") && itemPrice == 40) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + carrentBalance);
        }else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item");
        }




    }
}
