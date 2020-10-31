package Replit2;
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */

public class Loop_Practice1 {
    public static void main(String[] args) {
        int a = 11;
        boolean b = a%2 != 0;

        for( a = 11; a <= 121; a++){
            if(b){
                System.out.print(a++ + " ");
          }
        }
    }
}
