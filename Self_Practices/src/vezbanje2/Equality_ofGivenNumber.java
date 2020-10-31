package vezbanje2;
/*
. write a program that can check the equality of the three given numberrs
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal and not equal to n3  => n1&n2 are equal
            if n2 and n3 are equal and not equal to n1==> n2&n3 are equal
            if n3 and n1 are qual and not equal to n2 ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
 */

public class Equality_ofGivenNumber {
    public static void main(String[] args) {

        int n1 = 8;
        int n2 = 6;
        int n3 = 8;

        boolean equal1 = n1 == n2 && n1!=n3;
        boolean equal2 = n2 == n3 && n2!=n1;
        boolean equal3 = n3 == n1 && n3!=n2;
        boolean allEqual = n1 == n2 && n2 == n3 & n1 == n3;
        boolean nonAllEqual = n1 != n2 && n2 != n3 && n1 != n3;
        String equal = "";

        if (equal1){
            equal = "n1 & n2 are equal";
        }else if (equal2) {
            equal = "n2 & n3 are equal";
        }else if (equal3){
            equal = "n3 & n1 are equal";
        }else if (allEqual){
            equal = "all equal";
        }else if( nonAllEqual){
            equal = "none of them are equal";
        }
        System.out.println(equal+ " ");
    }
}

