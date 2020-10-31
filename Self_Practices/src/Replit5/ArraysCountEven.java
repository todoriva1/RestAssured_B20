package Replit5;
/*
Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */

public class ArraysCountEven {
    public static void main(String[] args) {

        int[] nums = {1,4,6,8,11,13,14};

        int count = 0;

        for(int each : nums){
            if(each%2 == 0){
            count+=1;
            }

        }
        System.out.println(count);
    }

}
