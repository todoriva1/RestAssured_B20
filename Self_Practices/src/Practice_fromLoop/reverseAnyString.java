package Practice_fromLoop;
// write a program that can reverse any string
public class reverseAnyString {
    public static void main(String[] args) {

        String s1 = "Ivan Todorovski";

        int lastIndex = s1.length()-1;
        String result = "";

        for(int i = lastIndex; i>=0; i--){
            result+=s1.charAt(i);
        }

        System.out.println(result);
    }
}
