package Replit;

public class MergeThem {
    public static void main(String[] args) {
        /*
        You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge
hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
         */

        String word1 = "Iva";
        String word2 = "Lea";

        int lengthword1 = word1.length();
        int lengthword2 = word2.length();

        char ch11 = word1.charAt(0);
        char ch12 = word1.charAt(1);
        char ch13 = word1.charAt(2);
        char ch21 = word2.charAt(0);
        char ch22 = word2.charAt(1);
        char ch23 = word2.charAt(2);

        if(lengthword1 == 3 && lengthword2 == 3 ){
            System.out.println(""+ch11+ch21+ch12+ch22+ch13+ch23);
        }else{
            System.out.println("cannot merge");
        }

    }
}
