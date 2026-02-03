package LabUnit2;

public class BinaryTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print the starting '1'
            System.out.print("1 ");

            // Print the '0's in the middle
            // Row 0: 0 zeros, Row 1: 2 zeros, Row 2: 4 zeros...
            for (int j = 0; j < (i * 2); j++) {
                System.out.print("0 ");
            }

            // Print the closing '1' (except for the very first row if you want a single 1)
            if (i > 0) {
                System.out.print("1");
            }
            
            System.out.println();
        }
    }
}