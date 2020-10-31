package Replit6;
/*
Create a method called plus_minus that gets an array of ints (int[]),
 it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1

 */

import java.util.Arrays;

public class Method_plusMinus {
    public static void main(String[] args) {


    }

    public static void plus_minus(int[] arr){

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int each : arr){
            if( each > 0){
                positives+=1;
            }else if(each < 0){
                negatives+=1;
            }else{
                zeros+=1;
            }
        }
        System.out.println("positives:"+positives+", "+"negatives:"+negatives+", "+"zeros:"+", "+zeros);


    }
}
