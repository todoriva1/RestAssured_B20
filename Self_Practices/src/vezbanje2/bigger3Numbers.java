package vezbanje2;

public class bigger3Numbers {

    public static void main(String[] args) {

        int a = 40;
        int b = 20;
        int c = 30;

        boolean aBigger= a>b && a>c;
        boolean bBigger= !aBigger && b>c;
        boolean cBigger= !aBigger && !bBigger;

        String bigger = "";

        bigger = (aBigger)? a+" is bigger":(bBigger)? b+ " is bigger": (cBigger)? c+ " is bigger": "no one is bigger";
        System.out.println(bigger);



    }
}
