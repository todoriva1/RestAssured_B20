package Replit2;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        /*
        Write a program that will verify if word contains in the sentence.
        Print out the result as boolean value.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(word.contains(sentence));
    }
}
