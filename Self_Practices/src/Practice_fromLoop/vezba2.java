package Practice_fromLoop;
/*
write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it

 */

public class vezba2 {
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++){
            if(i%3 == 0){
                System.out.print("");
            }else{
                System.out.print(i+ " ");
            }
        }
    }
}
