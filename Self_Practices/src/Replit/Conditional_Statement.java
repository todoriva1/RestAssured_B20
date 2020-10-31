package Replit;

import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {
        /*
          The variable "name" holds a String user input

Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        String result = "";

        if(name.equals("Chen")){
           result = "teacher";
        }else{
            result = "student";
        }
        System.out.println(result);
    }

}
