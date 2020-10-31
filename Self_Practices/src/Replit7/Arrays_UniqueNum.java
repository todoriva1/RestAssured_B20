package Replit7;

public class Arrays_UniqueNum {
    /*
Write a void method printUniqueNumbers that will print
unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */

        public static void main(String[] args) {

            int[] nums = {2,3,3,5,7,5,8,7,9};
            printUniqueNumbers(nums);


        }

        public static void printUniqueNumbers(int[] nums){

            for(int unique : nums){
                int count = 0;
                for(int each : nums){
                    if(each == unique){
                        count++;
                    }
                }
                if(count == 1){
                    System.out.println(unique);
                }

            }



        }
    }
    
