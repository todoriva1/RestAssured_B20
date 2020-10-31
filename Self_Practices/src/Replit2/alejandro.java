package Replit2;

import java.util.Scanner;
/*
a = "dear alejandro.....alot of text"

outputs: "read this mail"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "dont read"

 */

public class alejandro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        boolean aleja = a.contains("alejandro");
        if(aleja){
            System.out.println("read this email");
        }else{
            System.out.println("dont read");
        }

    }
}
