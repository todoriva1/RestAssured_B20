package Replit6;
/*
Given a String array words,
iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Arrays_PrintfirstLastchar {
    public static void main(String[] args) {


        String[] words = {"hello", "majka", "branko", "daria", "cale"};

        String[] arr = new String[words.length];

        for(int i = 0; i<=words.length-1; i++){
            arr[i] = (words[i].charAt(0)+ ""+words[i].charAt(words[i].length()-1));

        }
        System.out.println(Arrays.toString(arr));







        /*
        String[]arr = new String[words.length];
        for(int i=0;i<=words.length-1;i++){
            arr[i] = (words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }
        System.out.print(Arrays.toString(arr));
        */


    }



}
