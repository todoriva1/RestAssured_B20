package Replit7;
/*
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */

import java.util.Arrays;

public class Method_addToArrays {
    public static void main(String[] args) {

        int[] p = {1,2,4,5,6};
        int p1 = 2;
        add_to_r(p,p1);


    }
    public static void add_to_r(int[] r,int n){

        int[] new_r = new int[r.length+1];

        int k = 0;

        for(int each : r){
            new_r[k] = each;
            k++;
        }
        new_r[new_r.length-1] = n;

        for( int each : new_r){
            System.out.print(each+" ");
        }





    }
}
