package Replit;



public class word_character {
    /*
    You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi


     */

    public static void main(String[] args) {

        String word = "it";
        int c = word.length();

        if(c%2 != 0 ) {
            if (c >= 3) {
                System.out.println(word.charAt(c / 2));
            } else if (c == 1) {
                System.out.println(word+word+word);
            }
        }
        if(c%2 == 0){
            if(c>=4){
                System.out.println(""+word.charAt(c/2-1)+word.charAt(c/2));
            }else if(c <=2){
                System.out.println(""+word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1));
            }
        }





    }
}
