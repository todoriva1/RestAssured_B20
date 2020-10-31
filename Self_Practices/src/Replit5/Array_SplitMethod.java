package Replit5;
/*
Given a String variable email, write code using split method
to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */

import java.util.Arrays;

public class Array_SplitMethod {
    public static void main(String[] args) {

        String email = "info@cybertekschool.com";

        if(email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@')){
            System.out.println("invalid email");
        }else{
            String[] res = email.split("@");
            System.out.println("Email id: "+res[0]);
            System.out.println("Email domain: "+res[1]);
        }





    }
}
