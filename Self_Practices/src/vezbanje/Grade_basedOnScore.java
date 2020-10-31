package vezbanje;

public class Grade_basedOnScore {
    /*
    Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B
     */
    public static void main(String[] args) {

        int score = 55;
        if(score >= 90 && score <=100 ){
            System.out.println("Your grade is A");
        }
        if(score >=80 && score <90){
            System.out.println("Your grade is B");
        }
        if(score >=70 && score <80){
            System.out.println("Your grade is C");
        }
        if(score >=60 && score <70){
            System.out.println("Your score is D");
        }
        if(score <60){
            System.out.println("Your score is F");
        }
    }
}
