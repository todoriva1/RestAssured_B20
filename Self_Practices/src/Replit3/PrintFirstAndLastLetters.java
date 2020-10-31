package Replit3;
/*
Write a program that will print out first and last letters together.
ex:
adobe
ae
 */

public class PrintFirstAndLastLetters {
    public static void main(String[] args) {
        String str = "Todorovski";
        //            0123456789
        int lastIndex = str.length()-1;

        char ch = str.charAt(str.length()-1);
        String str1 = str.substring(0,1);

        System.out.println(str1+ch);




    }
}
