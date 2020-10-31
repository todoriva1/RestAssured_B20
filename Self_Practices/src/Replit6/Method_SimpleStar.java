package Replit6;
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
and an if that checks if its the last or first iteration
of the loop (so you will know whet to print "*" or " ")
 */

public class Method_SimpleStar {
    public static void main(String[] args) {

    printHoolowRect();

    }

    public static void printHoolowRect(){

        for(int i = 1; i<=5; i+=1){
            if(i == 2 || i==3 || i==4){
                System.out.println("*   *");
            }else{
                System.out.println("*****");
            }
        }




    }
}
