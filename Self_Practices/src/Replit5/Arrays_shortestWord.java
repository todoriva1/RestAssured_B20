package Replit5;
/*
Write a program that will print the shortest word in the given array str.

nput: java, cable, red, vivid, remedy, grace
output: red
 */

public class Arrays_shortestWord {
    public static void main(String[] args) {

        String[] arr = {"javffa","cafffle","Lffepffa","fkj"};

        String shortest = "";
        int min = 999999999;

        for(String each : arr){
            if(each.length()<min){
                min=each.length();
                shortest=each;
            }
        }
        System.out.println(shortest);
    }

}
