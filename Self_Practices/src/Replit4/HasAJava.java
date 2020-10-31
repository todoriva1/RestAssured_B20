package Replit4;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
 The string may be any length, including 0word = .

Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */

public class HasAJava {
    public static void main(String[] args) {

        String word = "dddJavajkjk".toLowerCase();
        boolean exists = false;

       String str = word.substring(1);

        if(word.startsWith("java")) {
            System.out.println(true);
        }else if(str.startsWith("java")){
            System.out.println(true);
        }else{
            System.out.println(exists);
        }
    }
}
