package LabUnit2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;

        // Use while loop to extract digits
        while (num != 0) {
            int lastDigit = num % 10; // Gets the last digit
            sum += lastDigit;         // Adds digit to sum
            num = num / 10;           // Removes the last digit
        }

        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
        sc.close();
    }
}