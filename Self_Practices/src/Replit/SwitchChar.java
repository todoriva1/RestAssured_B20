package Replit;
import java.util.Scanner;
/*
Write a switch statement that tests the value of the char variable response and performs the following actions:
if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed

Create Scanner object.
Use charAt() method, in order to get the char value at the specified index.

Example:

-Display prompt: "Enter command:"
input: y
-Display prompt: "Your request is being processed"
 */

public class SwitchChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command");
        String command = scan.next();
        char ch1= command.charAt(0);


        switch (ch1){
            case 'y':
                System.out.println("Your request is being processed is printed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'h':
                System.out.println("Sorry, no help is currently available is printed");
                break;
            default:
                System.out.println("Invalid entry, please try again!");



        }


    }



}
