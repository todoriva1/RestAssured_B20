package Replit3;
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels.
 Sample input/outputs

In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */

import java.util.Scanner;

public class ForLoops_Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In:");

        String str = scan.nextLine();

        String result = ""; //aoooi

        for(int i = 0; i <=str.length()-1; i++){

           char ch = str.charAt(i);

           String added = ""+ch;


            if(added.contains("a") || added.contains("e") || added.contains("i") || added.contains("o") || added.contains("u")){
               result+=added;
            }else {
                continue;
            }

        }
            System.out.println(result);
    }
}
