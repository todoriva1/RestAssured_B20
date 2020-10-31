package Replit3;
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>.
From Number:[202-123-3456].
Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */

import java.util.Scanner;

public class smsMassage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        /*
        Sender:<Mike Smith>.
        From Number:[202-123-3456].
        Message:{I love programing and problem solving}

         */
       int o1 = 0;
       int c1 = 0;
       int o2 = 0;
       int c2 = 0;
       int o3 = 0;
       int c3 = 0;

        o1 = message.indexOf("<");
        c1 = message.indexOf(">");

        o2 = message.indexOf("[");
        c2 = message.indexOf("]");

        o3 = message.indexOf("{");
        c3 = message.indexOf("}");

        sender = message.substring(o1+1,c1);
        phoneNumber = message.substring(o2+1,c2);
        messageBody = message.substring(o3+1,c3);

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message: "+messageBody);





    }
}
