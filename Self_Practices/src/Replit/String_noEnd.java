package Replit;

public class String_noEnd {
    public static void main(String[] args) {
        /*
        in this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

hint
use substring() and length() togather to solve this.
substring will start at 0 and will end at txt length -1

         */
        String word = "Ivan Todorovski";
        int leng = word.length()-1;
        String word2 = word.substring(0,leng);
        System.out.println(word2);





    }
}
