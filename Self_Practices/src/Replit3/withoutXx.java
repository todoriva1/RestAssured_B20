package Replit3;
/*
Given a string word, if the first or last chars are 'x' or 'X',
 print the string without those 'x' or 'X' chars,
  otherwise print the string unchanged.


Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */

import java.util.Scanner;

public class withoutXx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


            char ch1 = word.charAt(0);
            char ch2 = word.charAt(word.length()-1);

        if((ch1 == 'x' || ch1 =='X') && (ch2 == 'X' || ch2 == 'x')){
            System.out.println(word.substring(1,word.length()-1));
        }else if(ch1 == 'x' || ch1 == 'X'){
            System.out.println(word.substring(1));
        }else if(ch2 == 'X' || ch2 == 'x'){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }

    }
}
