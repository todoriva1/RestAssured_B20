package Replit;

import java.util.Scanner;
/*
using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"
use print not println.
 */
public class String_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word2 = word.substring(0,2);
        System.out.println(word2);

    }
}
