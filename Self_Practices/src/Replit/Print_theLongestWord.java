package Replit;

public class Print_theLongestWord {
    public static void main(String[] args) {
        /*
        Write a program that will print out the longest word.
         */
        String word1 = "Ivan";
        String word2 = "Leposava";

        int lengWord1 = word1.length();
        int lengWord2 = word2.length();

        if(lengWord1>lengWord2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }


    }
}
