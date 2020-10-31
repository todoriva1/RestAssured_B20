package Replit6;
/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char

 */

import java.util.Arrays;

public class Method_SplitPerson {
    public static void main(String[] args) {


        String info = "Ivan,Todorovski,41";
                                                //   0        1        2
        String[] arr = info.split(","); // { Ivan, Todorovski, 41}

        System.out.print("person name: " + arr[0]);
        System.out.print(" last name: "+ arr[1]);
        System.out.print(" age: "+arr[2]);


    }
}