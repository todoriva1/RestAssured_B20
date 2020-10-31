package Replit5;
/*
Write a program that will print out first and last letters together.

adobe
ae
 */
public class PrintFirstAndLastLetter {
    public static void main(String[] args) {

        String str = "Ivan";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(str.length()-1);

        System.out.println(""+ch1+ch2);

    }
}
