package Replit5;
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */

public class PrintVowels {
    public static void main(String[] args) {

        String word = "wirueruqowiedjcxnsmwefe".toLowerCase();


        String vowels = "";
        for(int i = 0; i<=word.length()-1; i+=1){

            char ch = word.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
             vowels+=ch;
            }
        }
        System.out.println(vowels);


        String word1 = "Word";
        String separator = "pr";
        int count  = 3;

    }
}
