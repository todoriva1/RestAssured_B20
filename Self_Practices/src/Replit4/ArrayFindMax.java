package Replit4;
/*
Given an array num, get the max number in nums and print out to console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33


hint:
create a variable called max and before you start searching assume the first item value is the max.
loop through each and every item and check for whether the value max is less than the item value.
if so assign the value to the max to overwrite existing max.
you will get the max value when you are done with the loop
 */

public class ArrayFindMax {
    public static void main(String[] args) {

        int[] num = {1,3,5,7,8,10,23,4,55,6,1,5,7};

            int max = num[0];
            for(int i = 0; i<=num.length-1; i+=1){
                if(num[i]>max){
                    max = num[i];
                }
            }
            System.out.println(max);



    }
}
