package Replit5;
/*
Given an array nums with 7 integers every element is repeated twice - except one.
 Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */

public class Arrays_FindNonDupl {
    public static void main(String[] args) {

        int[] arr = {1, 2, 33, 4, 55, 4, 55, 1,};


        for (int each : arr) {
            int count = 0;
            for(int num : arr ){
                if(each == num){
                    count++;
                }
            }

            if(count ==1){
                System.out.println(each);
            }

        }


    }
}

