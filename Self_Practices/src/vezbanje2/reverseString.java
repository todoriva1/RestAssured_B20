package vezbanje2;
// reverse string, i takodje dole remove duplicate
public class reverseString {
    public static void main(String[] args) {

        String s = "Moja Majka";

        String result = "";

        for(int i = s.length()-1; i>=0; i--){
           char ch = s.charAt(i);
           result += ch;

        }
        System.out.println(result);

        //remove duplicate

        String s1 = "Mississipi";
        //           0123456789
        String result1 = ""; //misp

        for(int i = 0; i<= s1.length()-1; i+=1){

            String s2 = ""+ s1.charAt(i) ;
           if(result1.contains(s2)) {
               continue;
           }else{
               result1+=s2;
           }

        }
        System.out.println(result1);
    }
}
