package Replit;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
         */
        System.out.println("Enter your name");
        String name = scan.next();
        int leng = name.length();
        System.out.println(leng);
    }
}
