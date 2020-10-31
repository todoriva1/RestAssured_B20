package Replit3;
/*
In this task, you need to swap first name with last name in the email.
 If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */


import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {

        String firstName = "";
        String lastname = "";
        String theEnd = "";
        int atCharac;
        int underscore;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = scan.next();
        //              012345678910 11 12 13 14
        if(! email.contains("_")){
            System.out.println(email);
        }else{


        atCharac = email.indexOf("@");
        underscore = email.indexOf("_");

        firstName = email.substring(0, underscore);
        lastname = email.substring(underscore+1,atCharac);
        theEnd = email.substring(atCharac+1);


            System.out.println(lastname+"_"+firstName+"@"+theEnd);
        }



    }

}
