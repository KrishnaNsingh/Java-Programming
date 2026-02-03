package LabUnit2;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Equation: ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Condition for real and different roots
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("Roots are real and different: %.2f and %.2f", r1, r2);
        }
        // Condition for real and equal roots
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.format("Roots are real and equal: %.2f", r1);
        }
        // Condition for complex roots
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("Roots are complex: %.2f + %.2fi and %.2f - %.2fi", 
                              realPart, imaginaryPart, realPart, imaginaryPart);
        }
        input.close();
    }
}
