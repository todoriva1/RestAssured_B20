package Replit5;
/*
Return the number of times
 that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */

public class CountJava {

    public static void main(String[] args) {

        String word = "JavamisleJavahdjfjavaJAVA".toLowerCase();

        int count = 0;

        while(word.contains("java")){
            word = word.replaceFirst("java","");
            count+=1;

        }
        System.out.println(count);

    }

}
