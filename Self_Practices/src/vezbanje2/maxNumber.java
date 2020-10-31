package vezbanje2;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999999;

        for (int i = 1; i <= 5; i += 1) {
            System.out.println("enter numbers:");
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }

        }
        System.out.println("minumum number is: "+ min);
    }

}
