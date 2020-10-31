package Replit4;

import java.util.Arrays;

/*
Given a String array words, iterate through each word and print first and last letter
of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */
public class Array_printFirstAndLAstLEtter {
    public static void main(String[] args) {

        String[] words = {"Kiro","Branko","Daria","Lepa","Ivan"};

        for(String each : words){
            char ch = each.charAt(0);
            char ch1 = each.charAt(each.length()-1);
            System.out.println(""+ch+ch1);
        }


    }
}
