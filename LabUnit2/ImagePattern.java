package LabUnit2;
public class ImagePattern {
    public static void main(String[] args) {
        // Outer loop runs from 5 down to 0
        for (int i = 5; i >= 0; i--) {
            
            // Optional: Add leading spaces for right-alignment
            for (int s = 0; s < i; s++) {
                System.out.print("  "); 
            }

            // Inner loop starts at current i and goes up to 5
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}