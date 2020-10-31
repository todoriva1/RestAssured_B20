package Replit;

import java.util.Scanner;
/*
Write a program that will reverse a string.
 Your program should reverse a string only 5 characters long.
 If word is shorter, display message: "Too short!".
  If word is longer, display message: "Too long!".
   Otherwise, reverse this word and print out result into the console.
Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa
 */
/*
public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();
        int wordLength = word.length();
        char c1 = word.charAt(0);
        char c2 = word.charAt(1);
        char c3 = word.charAt(2);
        char c4 = word.charAt(4);
        char c5 = word.charAt(5);
        */

/*
        if (wordLength < 5) {
            System.out.println("Too short!");
        } else if (wordLength > 5) {
            System.out.println("Too long!");
        } else{
            System.out.println(c5 + c4 + c3 + c2 + c1);
        }
*/
public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();

        int reserve = word.length () ;

        if (reserve == 5) {
            char ch0 = word.charAt(0);
            char ch1 = word.charAt(1);
            char ch2 = word.charAt(2);
            char ch3 = word.charAt(3);
            char ch4 = word.charAt(4);
            String result = "" + ch4 + ch3 + ch2 + ch1 + ch0;
            System.out.println(result);

        } else if (reserve > 5) {
            System.out.println ("Too long!") ;
        } else {
            System.out.println("Too short!");


        }
        }
}