package Replit5;
/*
Print out the number of times that the string "hi" appears anywhere
in the given string.

Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

 */

public class CountHI {
    public static void main(String[] args) {


        String str = "I hi to like hihiki hi".toLowerCase();

        int count = 0;

        while(str.contains("hi")){
            count+=1;
            str = str.replaceFirst("hi","");
        }
        System.out.println(count);
    }
}
