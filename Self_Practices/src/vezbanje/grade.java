package vezbanje;
//write a program that can calculate the grade.
//        1. if grade is bigger then 90 output "Excellent"
//        2. if the grade is bigger then 70 and smaller then 90 output "Good"
//        3. if grade is bigger then 60 and smaller then 70 output "Pass"
//        4. if grade is smaller then 60 output "Fail"
//        ex: score = 75
//            output:
//                Good
//        HINT: you will need && logic

public class grade {

    public static void main(String[] args) {

        int grade = 455;

        if ( grade >=90){
            System.out.println("Your grade is Excellent");
        }
        if ( grade >= 70 && grade < 90){
            System.out.println("Yoiur grade is Good");
        }
        if ( grade >= 60 && grade < 70){
            System.out.println("Your grade is Pass");
        }
        if (grade < 60){
            System.out.println("You fail");
        }

    }
}
