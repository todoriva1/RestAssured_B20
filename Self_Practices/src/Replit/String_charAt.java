package Replit;

import java.util.Scanner;
//print out 3rd letter in the string,then 5th and 6th letter in one line

public class String_charAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.print(""+txt.charAt(2)+txt.charAt(4)+txt.charAt(5));

    }
}

