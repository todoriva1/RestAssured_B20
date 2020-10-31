package vezbanje2;
/*
Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
 */

import java.util.Scanner;

public class StringCharFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.next();
        System.out.println("Enter Char:");
        String str2 = scan.next();

        String whole = str.substring(0);
        String ch = str2.substring(0,1);

        int result = 0;

        for (int i=0; i<5; i+=1){

            if(whole.contains(ch)){
        }

// nije reseno,ne znam ovaj task




        }
    }
}
