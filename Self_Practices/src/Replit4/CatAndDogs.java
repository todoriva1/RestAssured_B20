package Replit4;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */

public class CatAndDogs {
    public static void main(String[] args) {

        String word = "catdogcatCatdogdogdog".toLowerCase();
        int countOfCats = 0;
        int countOfDogs = 0;

        while(word.contains("cat")){

          word =  word.replaceFirst("cat","");
            countOfCats+=1;
        }

        while(word.contains("dog")){

           word = word.replaceFirst("dog","");
            countOfDogs+=1;
        }

        System.out.println(countOfCats == countOfDogs);
    }
}
