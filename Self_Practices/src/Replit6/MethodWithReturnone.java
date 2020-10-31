package Replit6;
/*
Create a method that gets an array of strings and a string, the method returns an int.
It counts how many times a string appears in the array and returns the count.

for example (pseudo code):
some_array = ["a","foo","bar","foo","bla"]
some_string = "foo"
count_appearance(some_array ,some_string )
will return 2 because some_array  has 2 appearances of "foo" string.

 */

public class MethodWithReturnone {
    public static void main(String[] args) {
        String[] arr1 = {"ana","ivana","peca","maja","petar","ana","maja"};
        String str = "maja";
       int c = count_appearance(arr1,str);
        System.out.println(c);



    }

    public static int  count_appearance(String[] arr,String t){
        String[] arr1 = {"ana","ivana","peca","maja","petar","ana","maja"};
        String str = "maja";

        int count = 0;
        for(String each: arr1){
            if(each.equals("maja")){
                count+=1;
            }
        }
         return count;
    }
}
