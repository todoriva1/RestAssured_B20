package vezbanje2;
/*
Write a program that asks user to enter a string.
 If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */

import java.util.Scanner;

public class UpperCaseMinCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str = scan.next();
        char ch = scan.next().charAt(0);

        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){

            char each = str.charAt(i);// a b a b c

            if(each == ch){
                count+=1;
            }


        }
        System.out.println(count);
    }
}
