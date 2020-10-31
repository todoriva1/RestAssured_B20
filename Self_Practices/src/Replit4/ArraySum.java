package Replit4;
/*Given an array num, calculate the sum of all numbers in nums and print out to console.

        nums → [2, 1, 2, 3, 4]) → 12
        nums → [2, 2, 0, 3, 5]) → 12
        nums → [1, 3, 5, 7, 9]) → 25
*/
public class ArraySum {
    public static void main(String[] args) {

        int[] nums = {2,4,6,8,};
        int sum = 0;
       for(int each: nums){
           sum+=each;
       }
        System.out.println(sum);
    }
}
