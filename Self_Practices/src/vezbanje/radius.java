package vezbanje;
//1. Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas:
//perimeter = 2 * radius * 𝜋 area = radius * radius * 𝜋
public class radius {
    public static void main(String[] args) {


        double radius = 5.5;

        double perimeter = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;

        System.out.println(perimeter);
        System.out.println(area);


    }

}
