package Replit2;

import java.util.Scanner;
/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
String txt = "foo bar";
 */

public class String_indexOf {
    public static void main(String[] args) {

     String txt = "foo bar";
    // int b = txt.indexOf(" b"); // moze bez int, samo print statement
        System.out.println(txt.indexOf(" b")+1);
        System.out.println(txt.indexOf("foo"));


    }
}
