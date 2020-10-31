package Replit6;
/*
Given a string, print out true if the number of appearances of "java"
anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */

import java.util.Scanner;

public class vezba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String java = sentence.replace("java","");
        String python = sentence.replace("python","  ");
        System.out.println(java.length()==python.length());





    }
}

