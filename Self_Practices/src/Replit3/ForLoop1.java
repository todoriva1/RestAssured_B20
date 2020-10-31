package Replit3;
/*
Inputs:
String word;

Write a for loop that will loop through every character of a word and print out each character, each on a separate line

 Sample inputs/outputs:
In: hello
h
e
l
l
o
 */

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int str=(word.length()-1);

        for(int i=0; i<= str; i++){
            String result=""+word.charAt(i);
            System.out.println(result);
        }
    }
}
