package Practice_fromLoop;
/*
Write a program that will print out all letters in English alphabet in ascending order
 */

public class vezba6 {
    public static void main(String[] args) {

        for (char ch = 'Z'; ch>='A'; ch--){
            System.out.print(ch+ " ");
        }
        System.out.println();
        System.out.println("======================");
        //moze i ovako dole

        for(int i= 65; i<=90; i++){
            System.out.print( (char) i+ " ");
        }
    }
}
