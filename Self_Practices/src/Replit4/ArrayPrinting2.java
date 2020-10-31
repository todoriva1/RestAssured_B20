package Replit4;
/*
The code provided in your main method will take in eight Strings and
save them into an array called arr.
Print out the 4 lines using for loop:
each line should contain a pair of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
 prints:  apple , banana
          kiwi , grape
          milk, "soda"
          juice, coffee
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrinting2 {
    public static void main(String[] args) {

        String[] arr = {"ghfgf","dfd","gfh","sr","uy","ghg","tfy","uoi"};
        /*
        String arr1 = arr[0]+" , "+arr[1];
        String arr2 = arr[2]+" , "+arr[3];
        String arr3 = arr[4]+" , "+arr[5];
        String arr4 = arr[6]+" , "+arr[7];
        */

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println( arr[i] + " , " + arr[i+=1] );

        }




    }
}
