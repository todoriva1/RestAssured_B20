package Replit4;
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

import java.util.Arrays;

public class Array_findMaxLengthString {
    public static void main(String[] args) {

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String longest = "";
        int max = 0;

        for(String each:words){
            if(each.length()>max){
                max=each.length();

                longest = each;

            }
        }
        System.out.println(longest);
    }
}
