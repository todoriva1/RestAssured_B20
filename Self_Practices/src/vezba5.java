import java.util.Scanner;

public class vezba5 {
    /*
    Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 1;
        System.out.println("Enter number:");
        int number  = scan.nextInt();
        for( int i = number; i>=1; i--){
            sum *=i;
            System.out.println(sum);
        }

    }
}
